public class TestDateModern {
    public static void main(String[] args) {
        DateModern d1 = new DateModern(2025, 2, 8);
        System.out.println("\nOriginal Date: " + d1);

        // Use a chain of with methods to create a modified copy
        DateModern d2 = d1.withDate(2012, 12, 23);
        System.out.println("New date (from chain): " + d2);
        System.out.println("Year is " + d2.getYear());
        System.out.println("Month is " + d2.getMonth());
        System.out.println("Day is " + d2.getDay());

        // Show that d1 is unchanged
        System.out.println("Original Date (d1) is still: " + d1);
    }
}
