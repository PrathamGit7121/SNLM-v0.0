package in.ac.famt.OrderCRUD;

public class Order {
	int orderId;
	String SupplierNm;
	double orderAmt;
	
	Order() {
		super();
	}

	Order(int orderId, String supplierNm, double orderAmt) {
		super();
		this.orderId = orderId;
		SupplierNm = supplierNm;
		this.orderAmt = orderAmt;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getSupplierNm() {
		return SupplierNm;
	}

	public void setSupplierNm(String supplierNm) {
		SupplierNm = supplierNm;
	}

	public double getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(double orderAmt) {
		this.orderAmt = orderAmt;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", SupplierNm=" + SupplierNm + ", orderAmt=" + orderAmt + "]";
	}
}