package Animals;

public abstract class Mammals extends Animals {

    protected final String biom;
    protected final int speed;

    public Mammals(String name, int age, String biom, int speed) {
        super(name, age);

        if (biom == null || biom.isEmpty()) {
            this.biom = "Отсутствует";
        } else {
            this.biom = biom;
        }

        if (speed < 0) {
            this.speed = Math.abs(speed);
        } else if (speed == 0) {
            this.speed = 10;
        } else
        this.speed = speed;
    }

    public final String getBiom() {
        return biom;
    }

    public final int getSpeed() {
        return speed;
    }

    abstract public void eat();
    abstract public void sleep();
    abstract public void go();
    abstract public void walk();


}
