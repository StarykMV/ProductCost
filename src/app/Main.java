package app;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("abc", 5, 2.5);

        // Базова вартість
        System.out.println(product);
        double baseCost = CalcCostBase.calculate(product);
        System.out.printf("Cost is EUR %.1f.%n", baseCost);

        // Вартість з доставкою
        System.out.println(product);
        double fullCost = CalcCostDelivery.calculate(product);
        System.out.printf("Cost is EUR %.1f.%n", fullCost);
    }
}
