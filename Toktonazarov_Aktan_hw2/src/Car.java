abstract public class Car implements Printable{
    private String modelName;
    private Color color;

    public Car(String modelName, Color color) {
        this.modelName = modelName;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public Color getColor() {
        return color;
    }
}
