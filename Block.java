class Block{

	//static block
	static{
		System.out.println("Static block");
	}
	
	//instance block
	{
		System.out.println("Instance block");
	}

	//constructor block
	public Block(){
		System.out.println("Constructor block");
	}
	
	public static void main(String [] args){
		System.out.println("main block");
		Block b = new Block();
	}
}