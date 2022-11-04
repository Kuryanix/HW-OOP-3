package Animals;

public class Herbivores extends Mammals {

    private String typeOfFood;

    public Herbivores(String name, int age, String biom, int speed, String typeOfFood) {

        super(name, age, biom, speed);

        if (typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "Трава";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public final String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public void eat() {
        System.out.println("Ест траву");
    }

    @Override
    public void sleep() {
        System.out.println("Спит в безопасном месте");
    }

    @Override
    public void go() {
        System.out.println("Идет");
    }

    @Override
    public void walk() {
        System.out.println("Гуляет без цели");
    }

    public void graze() {
        System.out.println("Пасется на лугу");
    }


    @Override
    public String toString() {
        return "Животное: " + name + ", возраст: " + age + ", среда обитания: " + biom + ", скорость: " + speed + ", тип пищи: " + typeOfFood;
    }
}
