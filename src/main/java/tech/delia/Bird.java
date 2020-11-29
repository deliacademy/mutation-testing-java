package tech.delia;

public class Bird {
    /** The species of this bird */
    protected Species species;

    /** The sex of this bird */
    protected Sex sex;

    /** The size (in cm) of this bird */
    protected int size;

    /** The age (in years) of this bird */
    protected int age;

    public Bird(Species species, int size, Sex sex, int age)
    {
        this.species = species;
        this.size = size;
        this.sex = sex;
        this.age = age;
    }

    public Bird(Species species, Sex sex, int size)
    {
        this(species, size, sex,0);
    }

    public Species getSpecies() {
        return species;
    }

    public Sex getSex() {
        return sex;
    }

    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public void incrementAge()
    {
        age++;
    }

    public int getLegsCount()
    {
        return 2;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "species=" + species +
                ", size=" + size +
                ", age=" + age +
                ", legs=" + getLegsCount() +
                '}';
    }
}
