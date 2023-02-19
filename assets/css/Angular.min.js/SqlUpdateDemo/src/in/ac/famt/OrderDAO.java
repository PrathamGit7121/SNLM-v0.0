package in.ac.famt;

import java.sql.Types;
import javax.sql.DataSource;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class OrderDAO {
	DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	}
	
	public void update(Integer ordId, Double ordAmt){
	      String sqlStr = "UPDATE OrderMst SET orderAmt = ? where orderId = ?";
	      
	      SqlUpdate sqlUpdate = new SqlUpdate(dataSource, sqlStr);
	      sqlUpdate.declareParameter(new SqlParameter("orderAmt", Types.DOUBLE));
	      sqlUpdate.declareParameter(new SqlParameter("orderId", Types.INTEGER));
	      sqlUpdate.compile();
	      
	      int noOfRowsAffected = sqlUpdate.update(ordAmt.doubleValue(),ordId.intValue());
	      if(noOfRowsAffected == 1)
	    	  System.out.println("Updated Record with ID = " + ordId);
	      else if(noOfRowsAffected > 1)
	    	  System.out.println("More than one row affected for ID = " + ordId);
	      else
	    	  System.out.println("No record found for ID = " + ordId);
	   }
}