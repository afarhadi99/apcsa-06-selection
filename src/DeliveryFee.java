public class DeliveryFee {
    // Given. Fee in dollars for 0 to 10 miles: 3 for 0-3 miles, 5 for 4-10 miles.
    public static int baseFee(int miles) {
        if (miles <= 3) {
            return 3;
        }
        return 5;
    }

    /**
     * Returns the delivery fee in dollars for an order.
     * Delivery is not offered beyond 10 miles: return -1.
     * An order of 50 dollars or more ships free, and so does an order of
     * 30 dollars or more placed by a member: return 0.
     * Every other order pays baseFee(miles).
     * Precondition: miles >= 0, orderTotal >= 0
     */
    public static int deliveryFee(int miles, int orderTotal, boolean isMember) {
        // your code here
        return 0; // replace this line
    }

    public static void main(String[] args) {
        System.out.println(deliveryFee(2, 20, false));   // expect 3
        System.out.println(deliveryFee(8, 20, false));   // expect 5
        System.out.println(deliveryFee(8, 35, true));    // expect 0
        System.out.println(deliveryFee(8, 35, false));   // expect 5
        System.out.println(deliveryFee(3, 50, false));   // expect 0
        System.out.println(deliveryFee(10, 29, true));   // expect 5
        System.out.println(deliveryFee(11, 100, true));  // expect -1
    }
}
