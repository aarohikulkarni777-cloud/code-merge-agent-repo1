public class OrderCalculator {

    public double calculateTotal(double[] items, double discount) {
        double total = 0;
        for (double item : items) {
            total += item;
        }
        total = total - discount;
        return total;
    }
}
