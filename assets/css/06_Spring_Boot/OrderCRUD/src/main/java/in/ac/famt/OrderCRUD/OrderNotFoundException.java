package in.ac.famt.OrderCRUD;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6790682268231038421L;
	public OrderNotFoundException(String message) {
		super(message);
	}
}