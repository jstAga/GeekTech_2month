import java.util.Random;

public class Junior {
    private String name;
    private int age = generateAge();
    private Location location;
    private LAPTOP laptop;


    public Junior(String name, Location location, LAPTOP laptop) {
        this.name = name;
        this.location = location;
        this.laptop = laptop;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Location getLocation() {
        return location;
    }

    public LAPTOP getLaptop() {
        return laptop;
    }


    private int generateAge(){
        Random random = new Random();
        return random.nextInt(60) + 18;
    }
}
