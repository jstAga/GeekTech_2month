public class Main {
    public static void main(String[] args) {
        Location location = new Location("Kyrgyzstan", "Bishkek");
        Middle middle = new Middle("Barsbek", location, LAPTOP.APPLE);

        System.out.println(middle.getInfo());
        System.out.println(middle.getInfo("B1"));

        System.out.println(middle.work());
        System.out.println(middle.work("Lalafo"));

        System.out.println(middle.getLevel());


        System.out.println("-----------------------------");


        Location location2 = new Location("France", "Paris");
        Senior senior = new Senior("Alex", location2, LAPTOP.XIAOMI);

        System.out.println(senior.getInfo());
        System.out.println();
        System.out.println(senior.getInfo("C2"));

        System.out.println(senior.work());
        System.out.println(senior.work("Instagram"));

        System.out.println(senior.getLevel());


        System.out.println("-----------------------------");


        Location location3 = new Location("Russia", "Moscow");
        Senior senior2 = new Senior("Victor", location3, LAPTOP.SAMSUNG);

        System.out.println(senior2.getInfo());
        System.out.println();
        System.out.println(senior2.getInfo("B2"));

        System.out.println(senior2.work());
        System.out.println(senior2.work("VK"));

        System.out.println(senior2.getLevel());
    }
}