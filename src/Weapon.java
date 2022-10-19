public class Weapon {
    private String WeaponType;
    private String WeaponName;

    public Weapon(String WeaponName, String WeaponType) {
        this.WeaponType = WeaponType;
        this.WeaponName = WeaponName;
    }

    public String getWeaponType() {
        return WeaponType;
    }

    public Weapon setWeaponType(String WeaponType) {
        this.WeaponType = WeaponType;
        return null;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public Weapon setWeaponName(String WeaponName) {
        this.WeaponName = WeaponName;
        return null;


    }
}

