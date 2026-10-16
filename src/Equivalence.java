public class Equivalence {
    // Prints one row of a truth table: a, b, left, right, and whether they match.
    public static void check(boolean a, boolean b) {
        boolean left = false;   // first expression
        boolean right = false;  // second expression
        System.out.println(a + " " + b + " " + left + " " + right + " " + (left == right));
    }

    public static void main(String[] args) {
        check(true, true);
        check(true, false);
        check(false, true);
        check(false, false);
    }
}
