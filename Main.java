import java.util.Scanner;

class Main{
	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();

        if(marks>75){
            System.out.println("First class with distinction");
        }
        else if(marks>50){
            System.out.println("first class");
        }
        else if (marks>35){
            System.out.println("Second class");
        }
        else{
            System.out.println("Fail");
        }
    }
}