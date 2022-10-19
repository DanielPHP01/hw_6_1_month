public class Boss extends GameEntity {
    WeaponType weapon;

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Health: " + this.getHealth() +
                "\n " + "Damage: " + +this.getDamage() +
                "\n" + "Weapon Type: " + this.weapon;
    }
}
