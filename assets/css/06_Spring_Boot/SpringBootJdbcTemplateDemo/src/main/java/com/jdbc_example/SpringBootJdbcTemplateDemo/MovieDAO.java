package com.jdbc_example.SpringBootJdbcTemplateDemo;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/*
DROP PROCEDURE `movieLst`; 
CREATE DEFINER=`root`@`localhost` PROCEDURE `movieLst`(OUT `movCnt` INT, IN `mvId` INT) 
	NOT DETERMINISTIC CONTAINS SQL SQL SECURITY DEFINER 
		BEGIN 
			SELECT COUNT(movid) AS movCnt FROM mymovies WHERE movid = mvId; 
		END
 
 * */

public class MovieDAO {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//Insert query
	public int saveMovie(Movies m1) {
		String sqlStr = "INSERT INTO myMovies VALUES(" + m1.getMovid() +",'" + m1.getTitle() + "','" + m1.getActor()  + "')";
		return jdbcTemplate.update(sqlStr);
	}
	
	
	//Delete query
	public int deleteMovie(Movies m2) {
		String sqlStr= "DELETE from myMovies WHERE movid=" + m2.getMovid() +"";
		return jdbcTemplate.update(sqlStr);
	}
	

	//Update query
	public int updateMovie(Movies m3) {
		String sqlStr= "UPDATE myMovies set title='" + m3.getTitle() + "',actor='" + m3.getActor() + "' WHERE movid=" + m3.getMovid() +"";
		return jdbcTemplate.update(sqlStr);
	}
	
	//PreparedStatementCallback interface demonstration for insert record
			public Boolean saveMovPS(Movies m1)
			{
				String sqlStr = "INSERT INTO myMovies VALUES(?, ?, ?)";
			
			return jdbcTemplate.execute(sqlStr, new PreparedStatementCallback<Boolean>() {

				@Override
				public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
					ps.setInt(1, m1.getMovid());
					ps.setString(2, m1.getTitle());
					ps.setString(3, m1.getActor());
					
					return ps.execute();
				}
			});
		}
	
	
	
	//--------------------------------------------------------------------------------------------------
	//Query for Multiple Rows
	//RowMapper - use jdbcTemplate.queryForObject() to query a single row record from database, 
	//and convert the row into an object via row mapper
	public List<Movies> getAllMoviesRowMapper(){
		String sqlStr = "SELECT * FROM myMovies";
		return jdbcTemplate.query(sqlStr, new RowMapper<Movies>() {

			@Override
			public Movies mapRow(ResultSet rs, int arg1) throws SQLException {
				
				Movies movObj = new Movies();
				movObj.setMovid(rs.getInt(1));
				movObj.setTitle(rs.getString(2));
				movObj.setActor(rs.getString(3));
				
				return movObj;
			}});
	}
	
		//Query for Multiple Rows 
		//Using BeanPropertyRowMapper
		public List<Movies> getAllMoviesBPRowMapper(){
			String sqlStr = "SELECT * FROM myMovies";
			return jdbcTemplate.query(sqlStr,new BeanPropertyRowMapper<Movies>(Movies.class));
		}
		
		//Query for Multiple Rows
		//In Java 8 using Lambda expression
		public List<Movies> getAllMoviesJAVA8(){
			String sqlStr = "SELECT * FROM myMovies";
			return jdbcTemplate.query(sqlStr, (rs,rowNum)-> new Movies(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
	
		//Query for Multiple Rows
		//Using queryForList() method
		public List<Map<String, Object>> getAllMoviesInList() {
			String sqlStr = "SELECT * FROM myMovies";
			return jdbcTemplate.queryForList(sqlStr);
		}
		
		public List<Movies> getAllMoviesInList2() {
			String sqlStr = "SELECT * FROM myMovies";
			//Following code is used to process the individual record - 
			 List<Map<String,Object>> movList = jdbcTemplate.queryForList(sqlStr);
			List<Movies> movLst = new ArrayList<Movies>();
			movList.forEach((movElt) -> 
				{
					int mid = (int)movElt.get("movid");
					String mt = (String)movElt.get("title");
					String act = (String)movElt.get("actor");
					
					Movies movie = new Movies(mid, mt, act);
					movLst.add(movie);
				});
			return movLst;  
		}
		
		
		
		//Querying for multiple rows
		//ResultSetExtractor interface demonstration for retrieve all records
		public List<Movies> getAllMoviesRSE() {
			String sqlStr = "SELECT * FROM myMovies";
			
			return jdbcTemplate.query(sqlStr, new ResultSetExtractor<List<Movies>> () {

				@Override
				public List<Movies> extractData(ResultSet rs) throws SQLException, DataAccessException {
					
					List<Movies> movList = new ArrayList<Movies>();
					while(rs.next()) {
						Movies movObj = new Movies();
						movObj.setMovid(rs.getInt(1));
						movObj.setTitle(rs.getString(2));
						movObj.setActor(rs.getString(3));
						
						movList.add(movObj);
					}
					return movList;
				}});
			}
	//-------------------------------------------------------------------------------------	
	//querying for Single row 
		//queryForList
		public void getMovieRecord(Movies m) {
			
			String sqlStr = "SELECT * FROM myMovies WHERE actor = ?";
			List<Map<String,Object>> movRecord = jdbcTemplate.queryForList(sqlStr, m.getActor());
			System.out.println("Details of movie of actor " + m.getActor() + " are " + movRecord);
			
			/*List<Map<String,Object>> movList = jdbcTemplate.queryForList(sqlStr,actor);
			List<Movies> movLst = new ArrayList<Movies>();
			movList.forEach((movElt) -> 
				{
					Movies movie = new Movies((int)movElt.get("movid"),(String)movElt.get("title"),(String)movElt.get("actor"));
					movLst.add(movie);
				});
			System.out.println("Details of movies of actor " + m.getActor() + " are " + movLst);// return movLst*/
		}
		
		//querying for Single row 
		//queryForObject
		public Movies getMovieDetailsByID(Movies m) {
			
			String sqlStr = "SELECT title FROM myMovies WHERE movid = ?";
			return jdbcTemplate.queryForObject(sqlStr,Movies.class,m.getMovid());
				
		}
		
		
		//--------------------------------------------------------------------------------------------------
		
		//query for single value
		//queryForObject
			public void getMovieByID(Movies m) {
				
				String sqlStr = "SELECT title FROM myMovies WHERE movid = ?";
				String movName= jdbcTemplate.queryForObject(sqlStr,String.class,m.getMovid());
				
				System.out.println("Movie ID = " + m.getMovid() + " Movie Name = " + movName);	
			}
		
		
	
		//--------------------------------------------------------------------------------------------
		public void getActorsMovie(Movies m) {
			
			String sqlStr = "SELECT title FROM myMovies WHERE actor = ?";
			List<String> movNm = jdbcTemplate.queryForList(sqlStr, String.class, m.getActor());
			System.out.println("Actor " + m.getActor() + " played role in Movie - " + movNm);	
		}
		
		//Print all movie names
				public void printMovieNames() {
					String sqlStr = "SELECT title FROM myMovies";//where movid = 1
					List<String> movNmList = jdbcTemplate.queryForList(sqlStr, String.class);
					System.out.println("Names of Movie/s - " + movNmList);	
				}
	
	//PreparedStatementCallback interface demonstration for insert record
	/* public Boolean saveMoviePS(Movies m1) {
		//Executing prepared stmt
		String sqlStr = "INSERT INTO myMovies VALUES(?, ?, ?)";
		return jdbcTemplate.execute(sqlStr, new PreparedStatementCallback<Boolean>(){
			@Override
			public Boolean doInPreparedStatement(java.sql.PreparedStatement ps) 
					throws SQLException, DataAccessException {
				ps.setInt(1, m1.getMovid());
				ps.setString(2, m1.getTitle());
				ps.setString(3, m1.getActor());
				Boolean bVal = ps.execute();
				if(ps.getUpdateCount() == 1) {
					//System.out.println("Data inserted sucessfully...");
					return true;
				}
				else {
					//System.out.println("Error.....");
					return false;
				}
				//return ps.execute();
			}
		});
	}*/
		
		
		
	//Stored Procedure to insert record
	
	public Boolean insertStoredProcedure(Movies m1)
	{
		String callSP = "{call moviedb.insertStoredProc(?, ?, ?)}";
		
		return jdbcTemplate.execute(callSP, new CallableStatementCallback<Boolean>() {

			@Override
			public Boolean doInCallableStatement(CallableStatement callStmt) throws SQLException, DataAccessException {
				callStmt.setInt("mID",m1.getMovid());
				callStmt.setString("mTitle",m1.getTitle());
				callStmt.setString("mActor", m1.getActor());
				
				return callStmt.execute();
			}
		});
	}
	
		
	
	
	//CallableStatementCallback interface demonstration for movie count with specific id
	public Boolean callCountProcedure(Movies m1) {
		String callStr = "{call moviedb.movieLst(?, ?)}";
		return jdbcTemplate.execute(callStr, new CallableStatementCallback<Boolean>(){
			@Override
			public Boolean doInCallableStatement(java.sql.CallableStatement cs) 
					throws SQLException, DataAccessException {
				
				cs.setInt("mvId", m1.getMovid());
				cs.registerOutParameter("movCnt", Types.INTEGER);
				cs.execute();

			    boolean hasResults = false;
			    ResultSet rs = cs.getResultSet();
			    while (rs.next()) {
			    	System.out.println("Total movie/s with id = " + m1.getMovid() + " are - " + rs.getInt(1));
		            hasResults = true;
		        }
				return hasResults;
			}
		});
	}
	
		
	
	
	
}