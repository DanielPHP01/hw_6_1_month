public class Skeletons extends Boss {

    private int arrows = 25;

    public Skeletons(int health, int damage, Weapon weapon) {
        super(health, damage, weapon);
    }


    public String printInfo() {
        return super.printInfo() + getArrows();
    }

    public int getArrows() {
        return arrows;
    }
}
