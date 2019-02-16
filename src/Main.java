public class Main {

    public static void main(String[] args) {
        Bankomat mtb = new Bankomat(0,0,0);
        System.out.println(mtb.getName("МТБ15"));
        mtb.inputMoney(3290);
        mtb.outputMoney(1020);
        mtb.countSum();
    }
}
