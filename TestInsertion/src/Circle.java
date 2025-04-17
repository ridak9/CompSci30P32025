public class Circle implements Comparable<Circle> {  // Updated to use generics
    private static final String PI = "3.14";  // PI as a String
    private String radius;  // Radius stored as a String

    // Default constructor (radius "1")
    public Circle() {
        this.radius = "1";
    }

    // Constructor with String radius
    public Circle(String radius) {
        this.radius = radius;
    }

    // Setter (accepts String radius)
    public void setRadius(String newRadius) {
        this.radius = newRadius;
    }

    // Getter (returns String radius)
    public String getRadius() {
        return radius;
    }

    // Area calculation (returns String)
    public String area() {
        try {
            double r = Double.parseDouble(radius);
            double area = Math.PI * r * r;
            return String.valueOf(area);  // Return area as String
        } catch (NumberFormatException e) {
            return "Invalid radius: " + radius;  // Handle non-numeric strings
        }
    }

    // Static method to display formula (unchanged)
    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a circle is a=Pi*r*r");
    }

    // Equality check (compares String radii)
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return this.radius.equals(other.radius);  // String comparison
        }
        return false;
    }

    // Comparison (lexicographic or numeric)
    @Override
    public int compareTo(Circle other) {
        // Option 1: Lexicographic (string) comparison
        // return this.radius.compareTo(other.radius);

        // Option 2: Numeric comparison (if radii are numeric strings)
        try {
            double thisRadius = Double.parseDouble(this.radius);
            double otherRadius = Double.parseDouble(other.radius);
            return Double.compare(thisRadius, otherRadius);
        } catch (NumberFormatException e) {
            return this.radius.compareTo(other.radius);  // Fallback to string comparison
        }
    }

    // toString (unchanged, but radius is now String)
    @Override
    public String toString() {
        return "Circle has radius " + radius;
    }
}