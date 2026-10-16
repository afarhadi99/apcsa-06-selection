public class ComparisonDrills {
    // true for "admin" or "Admin"; false for null. Must never crash.
    public static boolean isAdmin(String name) {
        return false; // replace this line
    }

    // true when both Strings have the same length; false if either is null
    public static boolean sameLength(String a, String b) {
        return false; // replace this line
    }

    public static void main(String[] args) {
        String a = "cat";
        String b = new String("cat");
        String c = a;
        String d = null;

        System.out.println("1: " + (a == b));
        System.out.println("2: " + a.equals(b));
        System.out.println("3: " + (a == c));
        System.out.println("4: " + a.equals(c));
        System.out.println("5: " + (b == c));
        System.out.println("6: " + (d == null));
        System.out.println("7: " + a.equals(d));
        // 8: uncomment to see the crash, read the message, then comment it out again.
        // System.out.println("8: " + d.equals(a));

        // Test isAdmin and sameLength here. Record the results in a comment.
    }
}
