public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle triangle1 = new RightTriangle(3, 4);
        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        System.out.println(triangle1.hypotenuse());
        System.out.println(triangle2.hypotenuse());

        RightTriangle triangle3 = new RightTriangle(13.4, 12);
        System.out.println(triangle3.hypotenuse());
    }
}
