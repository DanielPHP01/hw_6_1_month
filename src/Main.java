public class Main {
    public static void main(String[] args) {
                Boss boss1=new Boss();
                boss1.setHealth(300);
                boss1.setDamage(1000);
                boss1.setWeapon(WeaponType.MISSILE);

                Skeletons skeleton1=new Skeletons();
                skeleton1.setHealth(150);
                skeleton1.setDamage(100);
                skeleton1.setWeapon(WeaponType.GUN);
                skeleton1.setNumberArrows(30);

                Skeletons skeleton2=new Skeletons();
                skeleton2.setHealth(50);
                skeleton2.setDamage(40);
                skeleton2.setWeapon(WeaponType.KNIFE);
                skeleton2.setNumberArrows(5);

                System.out.println(" health:"+boss1.getHealth()+" damage:"+boss1.getDamage()+" weapon type:"+
                        boss1.getWeapon());


                System.out.println(skeleton1.printInfo());
                System.out.println(skeleton2.printInfo());

    }
}

