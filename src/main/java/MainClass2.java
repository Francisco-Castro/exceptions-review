import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class MainClass2 {


    public static void main(String[] args) {

        /**
         * Throwable is the Super class for all exceptions. It has two subclasses: Error and Exceptions.
         */
        Throwable throwable = new Throwable();
        Error error = new Error();
        Exception exception = new Exception();

        Throwable errorS = new Error();
        Throwable exceptionS = new Exception();

        /**
         * Exceptions comes in two flavors: RuntimeException and anything else. (Unchecked and checked exceptions).
         * Examples of unchecked exceptions are:
         *  - StringIndexOutOfBoundsException (for out of bounds strings)
         *  - ClassCastException (for illegal casting)
         *  - ArithmeticException (for division by zero)
         *  - ArrayIndexOutOfBoundsException
         *  - NullPointerException
         */

        RuntimeException runtimeException = new RuntimeException();
        StringIndexOutOfBoundsException stringIndexOutOfBoundsException = new StringIndexOutOfBoundsException();
        ClassCastException classCastException = new ClassCastException();
        ArithmeticException arithmeticException = new ArithmeticException();
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        NullPointerException nullPointerException = new NullPointerException();


        /**
         * Examples of checked exceptions are:
         *  - SQLException
         *  - FileNotFoundException
         *  - MalformedURLException
         */

        SQLException throwables = new SQLException();
        FileNotFoundException fileNotFoundException = new FileNotFoundException();
        MalformedURLException malformedURLException = new MalformedURLException();

    }
}
