public class Main {
    public static void main(String[] args) {
        int[] sales = {1500, 3000, 6800};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
