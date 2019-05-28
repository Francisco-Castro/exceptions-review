public class MainClass1 {

    public static void main(String[] args) {

        try {
            String str = "A char string";
            System.out.println("Before problem.");
            char ch = str.charAt(20);
            System.out.println("After problem.");
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getCause());
            System.out.println("Problem in main: " + e.getMessage() );
            System.out.println(e.getStackTrace().length);
            e.printStackTrace();
        }


    }
}
