public class Triangle extends Figure {
    double a;
    double b;
    double angle1;


    public Triangle(double a, double b, double angle1) {
        this.a = a;
        this.b = b;
        this.angle1 = angle1;
        System.out.println(Math.sin(angle1));
    }

    public void getSquare (){
        double square = Math.sin(angle1)*a*b/2;
        System.out.println("Площадь треугольника равна "+ square);
    }
}
