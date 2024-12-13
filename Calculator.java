/* This is a modified version of a project I did in JavaScript (changeCalculator on my GitHub)
 * Apologize if this is not exactly what you wanted, but due to my time limitations I just used
 * the logic from there and translated it to Java.
 */

public class Calculator {
    private static final int[] VALUES = {1000, 500, 100, 25, 10, 5, 1};
    private static final String[] NAMES = {
        "ten dollar bills", "five dollar bills", "one dollar bills",
        "quarters", "dimes", "nickels", "pennies"
    };

    public static String calculateChange(double amount) {
        StringBuilder result = new StringBuilder();
        int remainingCents = (int) Math.round(amount * 100);

        for (int i = 0; i < VALUES.length; i++) {
            int count = remainingCents / VALUES[i];
            remainingCents %= VALUES[i];
            result.append(count).append(" ").append(NAMES[i]).append("\n");
        }

        return result.toString();
    }
}