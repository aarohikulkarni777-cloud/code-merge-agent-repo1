public class OrderCalculator {

    public double calculateTotal(double[] items) {
        double total = 0;
        for (double item : items) {
            total += item;
        }
        return total;
    }
}
