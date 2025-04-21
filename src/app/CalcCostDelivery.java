package app;

public class CalcCostDelivery {
    public static double calculate(Product product) {
        double baseCost = CalcCostBase.calculate(product);
        return baseCost + Constants.DELIVERY_COST;
    }
}
