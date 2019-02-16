public class Square extends Figure {
    int a;
    int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void getSquare (){
        int square = a*b;
        System.out.println("Площадь квадрата равна "+ square);
    }
}
