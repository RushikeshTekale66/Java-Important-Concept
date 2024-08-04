class Main {

    public static void add(int a, int b) {
    System.out.println("Additin of two numbers " + (a + b));

    }

    public static void main(String[] args) {
        int a = 10;
        int b = -10;

        if(a>=0 && b>=0){
            add(a, b);
        }
        else{
            throw new IllegalStateException("Either a or b is not positive integer");
        }
    }
}