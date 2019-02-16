public abstract class BankomatAbstract implements BankomatInterface{
    private int num_20;
    private int num_50;
    private int num_100;
    private boolean isSuccess=false;

    protected BankomatAbstract() {
        this.num_20 = num_20;
        this.num_50 = num_50;
        this.num_100 = num_100;
    }

    public abstract boolean inputMoney (int sum);
    public abstract void outputMoney (int sum);
    protected abstract int [] countNum (int sum);
}
