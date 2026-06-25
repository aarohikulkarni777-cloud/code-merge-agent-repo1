public class OrderCalculator {

    public double calculateTotal(double[] items, double taxRate) {
        double total = 0;
        for (double item : items) {
            total += item;
        }
        total = total + (total * taxRate);
        return total;
    }
}
