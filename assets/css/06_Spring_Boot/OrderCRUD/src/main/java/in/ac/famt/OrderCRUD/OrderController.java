package in.ac.famt.OrderCRUD;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class OrderController {
	
	@Autowired
	OrderDAO service;
	
	@GetMapping("/orders")
	public List<Order> displayAllOrders() {
		return service.displayAllOrders(); 
	}
	
	@GetMapping("/orders/{oid}")
	public Order displayOrderById(@PathVariable int oid) {
		Order ord = service.findOrderById(oid);
		if(ord == null)
			throw new OrderNotFoundException("OrderId = " + oid);
		return ord;
	}
	
	@PostMapping("/orders")
	public ResponseEntity<Object> createPerson(@RequestBody Order ord) {
		Order newOrder = service.saveOrder(ord);
		
		URI currentId = ServletUriComponentsBuilder
						.fromCurrentRequest()	//-> current resource created
						.path("/{pid}") 		//->/persons/{pid} id of created person
						.buildAndExpand(newOrder.getOrderId())	//get the id of new person
						.toUri();
		return ResponseEntity.created(currentId).build();
	}
	
	@DeleteMapping("/order/{oid}")
	public void deletePerson(@PathVariable int oid) {
		Order ord = service.deleteOrderById(oid);
		if(ord == null)
			throw new OrderNotFoundException("OrderId = " + oid);
	}
}