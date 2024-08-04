class Main {

    public void JavaExceptions() {
        int [] arr = new int[10];

        try{
            int num = arr[15];
            System.out.println(num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bound exception " + e);
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