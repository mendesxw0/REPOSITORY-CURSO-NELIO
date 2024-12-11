package pack;

public class TriangleTest {
    public static void main(String[] args) {

        Triangle newTriangleX = new Triangle();
        Triangle newTriangleY = new Triangle();

      double a = newTriangleX.a = 6;
      double b = newTriangleX.b = 3;
      double c = newTriangleX.c = 2;

      //////

        double d = newTriangleY.a = 1;
        double e = newTriangleY.b = 2;
        double f = newTriangleY.c = 3;

        System.out.println("Value newTriangleX: "+newTriangleY.areaTriangle());
        System.out.println("Value newTriangleY: "+newTriangleY.areaTriangle());




        
    }
}
