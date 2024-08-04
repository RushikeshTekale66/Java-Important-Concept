class Main {

    public void JavaExceptions() {
        int age = 10;

        if(age>18){
            System.out.println("Eligible for voting");
        }
        else{
            throw new IllegalArgumentException("No Eligible for voting");
        }
        
    }

    public static void main(String[] args) {
        Main E = new Main();
        E.JavaExceptions();
    }
}