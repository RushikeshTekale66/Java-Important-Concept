class Main {

    public void JavaExceptions() {
        String str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NUll Pointer Exception : "+ e);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        Main E = new Main();
        E.JavaExceptions();
    }
}