public class SafeCompare {
    public static String respond(String command) {
        // null first, then start, then stop, then everything else
        return ""; // replace this line
    }

    public static void main(String[] args) {
        String a = "hello";
        String b = new String("hello");
        String c = a;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        // call respond with "start", "stop", "go" and null
    }
}
