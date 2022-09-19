public class Mercedes extends Car {
    private int comfortable;

    public Mercedes(String modelName, Color color, int comfortable) {
        super(modelName, color);
        this.comfortable = comfortable;
    }

    public int getComfortable() {
        if (this.comfortable > 10 || this.comfortable < 0) {
            return 0;
        }
        return comfortable;
    }

    @Override
    public String getInfo() {       // беру имя бренда с названия класса
        return ("Brand name - " + this.getClass().getName() +
                "\nModel name - " + this.getModelName() +
                "\nColor - " + this.getColor()) +
                "\nComfortable " + comfortable + "/10";
    }
}
