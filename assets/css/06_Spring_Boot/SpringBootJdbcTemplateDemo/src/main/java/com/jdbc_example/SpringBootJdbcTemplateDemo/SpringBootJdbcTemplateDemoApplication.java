package com.jdbc_example.SpringBootJdbcTemplateDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootJdbcTemplateDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootJdbcTemplateDemoApplication.class, args);
		
		ApplicationContext appCon = new ClassPathXmlApplicationContext("Appctx.xml");
		
		MovieDAO md1 = (MovieDAO)appCon.getBean("movieBean1");

		Movies mo1 = new Movies(11,"DJ","AA");
		//mo1.setMovid(10);
		//mo1.setTitle("Sddd");
		//mo1.setActor("AdddrR");
		
		
		/*
		int noOfRowsInserted = md1.saveMovie(mo1);
		if(noOfRowsInserted != 0)
			System.out.println("Movie record inserted successfully!");
		else
			System.out.println("Error in insert operation!"); */
		/*
		Movies mo2 = new Movies();
		mo2.setMovid(7);
		
		int noOfRowsDeteted = md1.deleteMovie(mo2);
		if(noOfRowsDeteted != 0)
			System.out.println("Movie record deleted successfully!");
		else
			System.out.println("Error in delete operation!"); */
		
		/* Movies mo3 = new Movies(1,"Iron Man","PQR");
		
		int noOfRowsUpdated = md1.updateMovie(mo3);
		if(noOfRowsUpdated != 0)
			System.out.println("Movie record updated successfully!");
		else
			System.out.println("Error in update operation!"); */
		
		/*
		//false then update cnt true if resultset
		if(md1.saveMoviePs(mo1))
			System.out.println("Movie data inserted successfully using Prepared Statement interface!");
		else
			System.out.println("Error in insert operation for PS!");
		
		md1.callCountProcedure(mo1); 
		
		System.out.println("Details of all Movies using ResultSetExtractor - ");
		System.out.println(md1.getAllMovies());
		
		md1.getAllMoviesinList();
		
		md1.getMovieRecord(); 
		md1.getActorsMovie(mo1); 
		 
		md1.getMovieByID(mo1);*/
		System.out.println("Details of all Movies using RowMapper - "); 
		//System.out.println(md1.getAllMoviesRowMapper()); 
		System.out.println(md1.getAllMoviesBPRowMapper()); 
		//System.out.println(md1.callCountProcedure(mo1)); 
		/*
		//Prepared Satement for insert record
		String status=md1.insertStoredProcedure(mo1).toString();
		System.out.println(status);	
		if (status=="false")
			System.out.println("Movie record inserted successfully!");
		else
			System.out.println("Error in insert operation!");
		
		//md1.printMovieNames(); */
	}

}
