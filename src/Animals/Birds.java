package Animals;

public abstract class Birds extends Animals{

    protected String biom;

    public Birds(String name, int age, String biom) {
        super(name, age);

        if (biom == null || biom.isEmpty()) {
            this.biom = "Отсутствует";
        } else {
            this.biom = biom;
        }
    }

    public final String getBiom() {
        return biom;
    }

    abstract public void eat();
    abstract public void sleep();
    abstract public void go();
    abstract public void hunt();

}
