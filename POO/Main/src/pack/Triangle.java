package pack;

public class Triangle {

    public double a = 2;
    public double b = 3;
    public double c = 4;

    public double areaTriangle() {
        double areaResult = (a + b + c) / 2;
        double result  = Math.sqrt(areaResult * (areaResult - a) * (areaResult - b) * (areaResult - c));
        return result;
    }

}
