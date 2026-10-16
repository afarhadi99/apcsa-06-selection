public class LeapCompound {
    public static boolean isLeapNested(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isLeapCompound(int year) {
        // one boolean expression
        return false; // replace this line
    }

    public static void compare(int year) {
        if (isLeapNested(year) == isLeapCompound(year)) {
            System.out.println(year + " match");
        } else {
            System.out.println(year + " MISMATCH");
        }
    }

    public static void main(String[] args) {
        compare(1900);
        compare(2000);
        compare(2024);
        compare(2027);
        compare(2100);
        // guard lab goes here
    }
}
