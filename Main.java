class Main{

    public void ArithmeticE(){
        int a = 10;
        int b = 0;

        try{
            int c = a/b;
        }
        catch(ArithmeticException exception){
            System.out.println(exception);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        Main AE = new Main();
        AE.ArithmeticE();
    }
}