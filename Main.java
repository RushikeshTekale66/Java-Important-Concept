class Main{
	public static void main(String [] args){
        int a =10;
        int b =0;

        try{
            System.out.println(a/b);
        }
        catch(NullPointerException ne){
            System.out.println("Null Pointer Exception");
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
        catch(Exception exception){
            System.out.println("Exception : " + exception);
        }
    }
}