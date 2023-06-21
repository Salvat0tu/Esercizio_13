public class EsercizioWhileLoop {
    public static void main(String[] args) {
        int daysToSell = 0;
        int poundsToSell = 10000;
        int poundsPerDay = 1000;

        while (poundsToSell > 0) {
            double poundExchange = 1 + (Math.random() * 0.2);
            daysToSell++;
            if (poundExchange > 1.15) {
                poundsToSell -= poundsPerDay;
                System.out.println("Day number " + daysToSell + ":" + " Remaining pounds to sell : " + poundsToSell);
            }
        }
        System.out.println("It took " + daysToSell + " to sell all the pounds");
    }
}
