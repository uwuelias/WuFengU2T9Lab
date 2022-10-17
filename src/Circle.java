public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
  }

    public double circumference() {
        return Math.PI * 2 * radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getInfo() {
        return "radius = " + radius + "\narea = " + area() + "\ncircumference = " + circumference();
    }
}