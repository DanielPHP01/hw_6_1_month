public class Boss extends GameEntity {
    private Weapon saber;

    public Boss(int health, int damage, Weapon weapon) {
        this.setHealth(health);
        this.setDamage(damage);
        this.setSaber(weapon);
    }

    public Weapon getSaber() {
        return saber;
    }

    public void setSaber(Weapon saber) {
        this.saber = saber;
    }

    public String printInfo() {
        return "\n \n" +
                "Health: " + getHealth() + "\n" +
                "Damage: " + getDamage() + "\n" +
                "Weapon: " + getSaber().getWeaponName() + "\n" +
                "Type: " + getSaber().getWeaponType();
    }
}
