public class MainClass3 {


    public static void withdraw() throws OverdraftException{
        Double balance = 10.0;
        Double amount = 100.0;

        if (balance - amount < 0) {
            throw new OverdraftException("insuficients founds");
        }
    }

    public static void main(String[] args) {
        try {
            withdraw();
        } catch (OverdraftException e) {
            e.printStackTrace();
        }
    }
}
