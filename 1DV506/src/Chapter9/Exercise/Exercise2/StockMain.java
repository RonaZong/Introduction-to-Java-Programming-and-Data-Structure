package Chapter9.Exercise.Exercise2;

public class StockMain {
    public static void main(String[] args) {
        Stock a = new Stock("ORCL", "Oracle Corporation");
        a.setPreviousClosingPrice(34.5);
        a.setCurrentPrice(34.35);

        System.out.println("Price-change percentage of stock a is " + a.getChangePercent() +"%");
    }
}
