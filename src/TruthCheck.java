// Given. Run this to check the 20 cells of your table in exercises/TruthTables.md.
public class TruthCheck {
    static void row(int x) {
        System.out.println("x = " + x);
        System.out.println("  x > 0       : " + (x > 0));
        System.out.println("  x >= 3      : " + (x >= 3));
        System.out.println("  x == 0      : " + (x == 0));
        System.out.println("  x != 3      : " + (x != 3));
        System.out.println("  x % 2 == 0  : " + (x % 2 == 0));
    }

    public static void main(String[] args) {
        row(-2);
        row(0);
        row(3);
        row(10);
    }
}
