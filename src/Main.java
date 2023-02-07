public class Main {
    public static void main(String[] args) {
        long[] sales = {1500, 3000, 6800, 2000, 4500};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
