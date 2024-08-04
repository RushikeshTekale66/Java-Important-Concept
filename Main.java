import java.util.Scanner;

class Main {

    public void JavaExceptions() {
        //Create a new Scanner with specified String Object
        Scanner sc = new Scanner("Hello Geeks");

        //Print the line
        System.out.println(sc.nextLine());

        //Check if there is an IO exception
        System.out.println("Exception Occure is : "+ sc.ioException());

        sc.close();
    }

    public static void main(String[] args) {
        Main E = new Main();
        E.JavaExceptions();
    }
}