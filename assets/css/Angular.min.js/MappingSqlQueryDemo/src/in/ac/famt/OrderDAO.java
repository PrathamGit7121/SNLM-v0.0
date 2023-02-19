package in.ac.famt;

import javax.sql.DataSource;

public class OrderDAO {
	private OrderMappingSqlQuery orderQuery;

	public void setDataSource(DataSource ds) {
		String sqlStr = "SELECT * FROM OrderMst WHERE orderId = ?";
	    this.orderQuery = new OrderMappingSqlQuery(ds, sqlStr);
	}
	
	public OrderMst getOrder(int id) {
	    return orderQuery.findObject(id);
	}
}