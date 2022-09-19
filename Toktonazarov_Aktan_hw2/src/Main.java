public class Main {
    public static void main(String[] args) {
        /* В каждый дочерний класс добавил индвидуальное поле которое описывает одну из выдающихся характеристик
           бренда машины (Мерседес - комфорт, Ферари - скорость, Вольво - безопасность).
           Характеристика оценивается в диапазоне от 0 до 10, она не может быть меньше или больше, в противном случае
           характеристика будет равна 0.

           В интерфейсе Printable создал метод getInfo, и имплементировал интерфейс в родительский класс Car,
           в дочерних классах переопределил метод getInfo, чтоб он выдавал полную информацию об объекте.

          Создал массив с объектами Car, и в этом массиве при помощи метода createObject принимаю ссылки на объекты и
          печатаю их через цикл.
         */
        Car[] cars = {createObject("Mercedes","E213", Color.BLACK, 7),
        createObject("Ferrari","F40", Color.RED, 10),
        createObject("Volvo","s60", Color.WHITE, 8)};


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getInfo());
            System.out.println("");
        }
    }


    public static Car createObject(String className, String modelName, Color color, int characteristic) {
        if (className.equals("Mercedes")) {
            Mercedes mercedes = new Mercedes(modelName, color, characteristic);
            return mercedes;
        } else if (className.equals("Ferrari")) {
            Ferrari ferrari = new Ferrari(modelName, color, characteristic);
            return ferrari;
        } else if (className.equals("Volvo")) {
            Volvo volvo = new Volvo(modelName, color, characteristic);
            return volvo;
        }
        return null;
    }
}