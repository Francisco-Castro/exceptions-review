public class MainClass0 {

    public static void main(String[] args) {

        try {
            String str = "A char string";
            System.out.println("Before problem.");
            char ch = str.charAt(20);
            System.out.println("After problem.");
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Hey - your string's not that big");
        }
        catch (NullPointerException e) {
            System.out.println("Oops, perhaps you tried to access a null string!");
        }
        catch (Exception e) {
            System.out.println("Oops, an unexpected problem occurred!");
        }
        System.out.println("Now what?");

        try {
            String str = "Another char string";
            System.out.println("Before problem.");
            char ch = str.charAt(20);
            System.out.println("After problem.");
        }
        catch ( StringIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Oops - You got string problems buddy!");
        }
    }
}
