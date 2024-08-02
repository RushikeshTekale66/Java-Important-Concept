class ThrowKey{

	public static void checkAge(int age){
		System.out.println("Start");

		if(age<18){
			throw new AgeException("Your age is less than 18");
		}
		else{
			System.out.println("You can vote");
		}
		
		System.out.println("End");
	}

	public static void main(String [] args){
		ThrowKey.checkAge(11);
	}
}


//creating exception user defined exception
class AgeException extends RuntimeException{
	public AgeException(String msg){
		super(msg);
	}
}