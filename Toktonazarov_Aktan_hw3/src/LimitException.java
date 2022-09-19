public class LimitException extends Exception{
    private Double remainingAmount = 0.0;
    public LimitException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
//        System.out.println(remainingAmount);
        return remainingAmount;
    }

    public void setRemainingAmount(Double remainingAmount) {
        LimitException.remainingAmount = remainingAmount;
    }
}
