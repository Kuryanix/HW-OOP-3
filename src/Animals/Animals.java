package Animals;

public abstract class Animals {

    protected String name;
    protected int age;

    public Animals(String name, int age) {
        setName(name);

        if (age < 0) {
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Отсутствует";
        } else {
            this.name = name;
        }
    }

    public final int getAge() {
        return age;
    }

    abstract public void eat();
    abstract public void sleep();
    abstract public void go();


}
