import logic.Bitcoin;
import logic.Exchange;

public class MyApp {

    public static void main(String[] args) {


        Exchange coinbase = new Exchange();
        Bitcoin bitcoin = new Bitcoin(coinbase);
        coinbase.setAmount(1);
        coinbase.setPrice(7000);

    }
}
