class ThrowsKey{
	public static void check() throws ArithmeticException{
		//throws only show the message it cant help in error handling
		System.out.println("Start");
		
		int a =10;
		int b = 0;
		int c = a/b;
		System.out.println(c);

		System.out.println("End");
	}	

	public static void main(String [] args){
		ThrowsKey.check();
	}
}