public class circle {

    private double radius;
    private String color;

    public circle() {
        radius = 1.0;
        color = "red";
    }
    public double getCircumference() {
        return radius+radius*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=1]";

    }

    public static void main(String[] args) {

        circle c1 = new circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and them circumference of " + c1.getCircumference() + "and them area of " + c1.getArea());
    }
}
