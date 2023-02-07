public class Main {
    public static void main(String[] args) {

//        int[] sales = {1500, 3000, 6800, 2000, 4500};

        long[] sales = {1500, 3000, 6800, 2000, 4500};

        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальеая продажа - " + salesManager.max());
        System.out.println("Обрезанное среднее значение по продажам - " + salesManager.trimmedMean());
    }
}
