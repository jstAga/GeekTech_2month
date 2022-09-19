public class Ferrari extends Car {
    private int speed;

    public Ferrari(String modelName, Color color, int speed) {
        super(modelName, color);
        this.speed = speed;
    }

    public int getSpeed() {
        if (this.speed > 10 || this.speed < 0) {
            return 0;
        }
        return speed;
    }

    @Override
    public String getInfo() {
        return ("Brand name - " + this.getClass().getName() +
                "\nModel name - " + this.getModelName() +
                "\nColor - " + this.getColor()) +
                "\nSpeed " + speed + "/10";
    }
}
