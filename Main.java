class Main {
    public void JavaException(){
        try{
            Class.forName("Class1");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found exception : "+ e);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        Main je = new Main();
        je.JavaException();
    }
}