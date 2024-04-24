package Q4.VirtualPetLab;

public class Fox extends Pet {
    public Fox(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomFoxImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Dog
        setEnergy(getEnergy() + 2);
        setHappiness(getHappiness() + 5);
        setHunger(getHunger() - 5);
        if (getEnergy() > 100) {setEnergy(100);}
        if (getHappiness() > 100) {setHappiness(100);}
        if (getHunger() < 0) {setHunger(0);}
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Dog
        setEnergy(getEnergy() - 5);
        setHappiness(getHappiness() + 7);
        setHunger(getHunger() + 7);
        if (getEnergy() < 0) {setEnergy(0);}
        if (getHappiness() > 100) {setHappiness(100);}
        if (getHunger() > 100) {setHunger(100);}
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Dog
        setEnergy(getEnergy() + 5);
        setHappiness(getHappiness() + 2);
        setHunger(getHunger() + 2);
        if (getEnergy() > 100) {setEnergy(100);}
        if (getHappiness() > 100) {setHappiness(100);}
        if (getHunger() > 100) {setHunger(100);}
    }
}
