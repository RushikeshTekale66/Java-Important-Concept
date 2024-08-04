class Main {

    public void JavaExceptions() {
        String str = "Rushikesh";

        try {
            char c = str.charAt(20);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index out of bound : "+ e);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        Main E = new Main();
        E.JavaExceptions();
    }
}