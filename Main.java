class Main {

    public void JavaExceptions() {
        String str = "rushi111111";

        try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Number format Exception : "+ e);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        Main E = new Main();
        E.JavaExceptions();
    }
}