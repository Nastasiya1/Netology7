public class SalesManager {

    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int trimmedMean() {
        int min = sales[0];
        int max = sales[0];
        for (int value1 : sales) {
            if (value1 < min) {
                min = value1;
            }
        }
        for (int value2 : sales) {
            if (value2 > max){
                max = value2;
            }
        }
        int total = 0;
        for (int value : sales){
            if (value > min && value < max){
                total += value;
            }
        }
        return total/(sales.length - 2);
    }
}
