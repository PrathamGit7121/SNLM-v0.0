class Test<T> {
	T obj;
	
	Test(T obj) { this.obj = obj; } // constructor
	
	public T getObject() { 
		return obj; 
	}
}

 class GenericExample1 {
	public static void main(String[] args) {
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());

		Test<String> sObj = new Test<String>("FAMT");
		System.out.println(sObj.getObject());
	}
}