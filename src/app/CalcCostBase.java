package app;

public class CalcCostBase {
    public static double calculate(Product product) {
        return product.getQuota() * product.getPrice();
    }
}
