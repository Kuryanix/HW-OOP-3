package Animals;

public class Flightless extends Birds {

    private String typeOfMovement;

    public Flightless(String name, int age, String biom, String typeOfMovement) {

        super(name, age, biom);

        if (typeOfMovement == null || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "по земле";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public final String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public void eat() {
        System.out.println("Ест");
    }

    @Override
    public void sleep() {
        System.out.println("Спит");
    }

    @Override
    public void go() {
        System.out.println("Идет");
    }

    public void walk() {
        System.out.println("Гуляет");
    }

    @Override
    public void hunt() {
        System.out.println("Охотится");
    }

    @Override
    public String toString() {
        return "Животное: " + name + ", возраст: " + age + ", среда обитания: " + biom + ", тип передвижения: " + typeOfMovement;
    }

}

