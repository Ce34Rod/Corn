public class Seed extends Item{
    private boolean isGerminated;
    private boolean isWatered;
    private boolean isInSoil;
    private int age;

    public Seed(){};

    public Seed(String name, boolean isGerminated, boolean isWatered, boolean isInSoil, int age) {
        super(name);
        this.isGerminated = isGerminated;
        this.isWatered = isWatered;
        this.isInSoil = isInSoil;
        this.age = age;
    }

    public String getStatus(Seed seed) {
        return "Name: " + seed.getName() + "\nAge: " + seed.getAge() + "\nGermination Status: " + seed.isGerminated
                + "\nWatered Status: " + seed.isWatered + "\nIn Soil Status: " + seed.isInSoil;
    }


    public boolean isGerminated() {
        return isGerminated;
    }

    public void setGerminated(boolean germinated) {
        isGerminated = germinated;
    }

    public boolean isWatered() {
        return isWatered;
    }

    public void setWatered(boolean watered) {
        isWatered = watered;
    }

    public boolean isInSoil() {
        return isInSoil;
    }

    public void setInSoil(boolean inSoil) {
        isInSoil = inSoil;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
