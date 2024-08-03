import java.util.Scanner;

class Main{
	public static void main(String [] args){
        int a = 10;
        int b = 10;
        int c = 10;
                
        if(a>b){
            if(a>c){
                System.out.println("a is greater number");
            }
            else{
                System.out.println("c is greater number");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println("c is greater");
            }
        }
 
    }
}