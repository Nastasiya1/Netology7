public class SalesManager {

    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int trimmedMean() {
        long min = sales[0];
        long max = sales[0];
        for (long value1 : sales) {
            if (value1 < min) {
                min = value1;
            }
        }
        for (long value2 : sales) {
            if (value2 > max) {
                max = value2;
            }
        }
        int total = 0;
        for (long value : sales) {
            if (value > min && value < max) {
                total += value;
            }
        }
        return total / (sales.length - 2);
    }
}
