final public class Senior extends Middle {
    public Senior(String name, Location location, LAPTOP laptop) {
        super(name, location, laptop);
    }

    @Override
    public String getLevel() {
        System.out.println();
        return super.getName() +"`s Level : Senior";
    }
}
