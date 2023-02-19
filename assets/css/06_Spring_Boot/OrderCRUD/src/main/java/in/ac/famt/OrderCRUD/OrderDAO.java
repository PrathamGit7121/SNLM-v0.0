package in.ac.famt.OrderCRUD;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDAO {
	/*@Autowired
	List<Order> orderList;

	OrderDAO() {
		orderList = new ArrayList<>();
		
		orderList.add(new Order(1,"HCL Tech", 550005.00));
		orderList.add(new Order(2,"Pleximus Ltd", 95325.00));
		orderList.add(new Order(3,"KoneSoft Ltd", 359687.00));
		orderList.add(new Order(4,"AjayTech td", 128953.00));
		orderList.add(new Order(5,"Byte Tech", 987512.00));
	}*/
	
	private static List<Order> orderList = new ArrayList<>();
	//private static int cnt = 4;
	
	static {
		orderList.add(new Order(1,"HCL Tech", 550005.00));
		orderList.add(new Order(2,"Pleximus Ltd", 95325.00));
		orderList.add(new Order(3,"KoneSoft Ltd", 359687.00));
		orderList.add(new Order(4,"AjayTech td", 128953.00));
		orderList.add(new Order(5,"Byte Tech", 987512.00));
	}
	
	public List<Order> displayAllOrders() {
		return orderList;
	}
	
	public Order saveOrder(Order ordParam) {
		orderList.add(ordParam);
		return ordParam;
	}
	
	public Order findOrderById(int orderId) {
		for(Order ord:orderList) {
			if(ord.getOrderId() == orderId)
				return ord;
		}
		return null;
	}
	
	public Order deleteOrderById(int orderId) {
		for(Order ord:orderList) {
			if(ord.getOrderId() == orderId) {
				orderList.remove(ord);
				return ord;
			}
		}
		return null;
	}
}