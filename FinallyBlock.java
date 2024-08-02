class FinallyBlock{
	public static void main(String [] args){
		try{
			System.out.println("Try Block");
		}
		catch(Exception e){
			System.out.println("Catch Block" + e);
		}
		finally{
			System.out.println("Finally Block");
		}
	}
}