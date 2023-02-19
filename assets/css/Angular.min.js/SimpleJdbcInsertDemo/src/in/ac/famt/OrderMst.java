package in.ac.famt;


public class OrderMst {
	int orderId;
	String supplierNm;
	double orderAmt;
	
	public OrderMst() {
		super();
	}

	public OrderMst(int orderId, String supplierNm, double orderAmt) {
		super();
		this.orderId = orderId;
		this.supplierNm = supplierNm;
		this.orderAmt = orderAmt;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getSupplierNm() {
		return supplierNm;
	}

	public void setSupplierNm(String supplierNm) {
		this.supplierNm = supplierNm;
	}

	public double getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(double orderAmt) {
		this.orderAmt = orderAmt;
	}

	@Override
	public String toString() {
		return "OrderMst [orderId=" + orderId + ", supplierNm=" + supplierNm + ", orderAmt=" + orderAmt + "]";
	}
}