public class Root {
    public double computeRoot(int number, int number2) {
        double exponent = 1.0/number2;
        return Math.round(Math.pow(number, exponent));
    } 
}
