public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(int health, int damage, Weapon weapon) {
        this.setHealth(health);
        this.setDamage(damage);
        this.setWeapon(weapon);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "\n \n" +
                "Health: " + getHealth() + "\n" +
                "Damage: " + getDamage() + "\n" +
                "Weapon: " + getWeapon().getWeaponName() + "\n" +
                "Type: " + getWeapon().getWeaponType();
    }
}
