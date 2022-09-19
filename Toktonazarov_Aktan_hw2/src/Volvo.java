public class Volvo extends Car {
    private int safety;

    public Volvo(String modelName, Color color, int safety) {
        super(modelName, color);
        this.safety = safety;
    }

    public int getSafety() {
        if (this.safety > 10 || this.safety < 0) {
            return 0;
        }
        return safety;
    }

    @Override
    public String getInfo() {
        return ("Brand name - " + this.getClass().getName() +
                "\nModel name - " + this.getModelName() +
                "\nColor - " + this.getColor()) +
                "\nSafety " + safety + "/10";
    }
}
