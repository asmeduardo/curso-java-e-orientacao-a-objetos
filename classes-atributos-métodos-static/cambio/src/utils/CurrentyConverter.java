package utils;

public final class CurrentyConverter {

    private static final double IOF = 0.06;

    private CurrentyConverter() {
    }

    public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }
}