public class Middle extends Junior {
    public Middle(String name,
                  Location location, LAPTOP laptop) {
        super(name, location, laptop);
    }

    final public String getInfo(){                        // краткая информация
        return "Name : " + getName() +
                "\nLevel : " + this.getClass().getName();
    }

    public String getInfo(String englishLevel){     // полная информация
        return "Name : " + getName() +
                "\nAge : " + super.getAge() +
                "\nCountry : " + super.getLocation().getCountry() +
                "\nCity : " + super.getLocation().getCity() +
                "\nLaptop : " + super.getLaptop() +
                "\nEnglish Level : " + englishLevel;
    }

    public String work(){
        System.out.println();      // пробелы для читабельности вывода
        return super.getName() + " started working";
    }

    public String work(String projectName){
        System.out.println();
        return super.getName() + " started working on project " + "\"" + projectName + "\"";
    }

    public String getLevel(){           // уровень программсита
        System.out.println();
        return super.getName() +"`s Level : Middle";
    }

}
