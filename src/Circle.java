public class Circle extends Figure {
    int r;
    final double Pi = 3.1415926536;

    public Circle(int r) {
        this.r = r;
    }

    public void getSquare (){
        double square = Pi*r*r;
        System.out.println("Площадь круга равна "+ square);
    }
}
