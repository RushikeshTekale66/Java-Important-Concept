class Main {
    public void JavaException(){
        boolean condition = false;
        if(!condition){
            throw new UserDefinedException("Condition is false");
        }
        else{
            System.out.println("All ok");
        }
    }

    public static void main(String[] args) {
        Main je = new Main();
        je.JavaException();
    }
}


//User defined exception
class UserDefinedException extends RuntimeException{
    public UserDefinedException(String message){
        super(message);
    }
}