public class Main {
    public static void main(String[] args) {


        Boss boss = new Boss(400, 50,
                new Weapon("Avangard", "Missile"));

        Skeletons skeleton1 = new Skeletons(300, 28,
                new Weapon("Dragunov", "Sniper "));

        Skeletons skeleton2 = new Skeletons(330, 22,
                new Weapon("Battle", "Knife "));

        System.out.println(
                boss.printInfo() + skeleton1.printInfo() + skeleton2.printInfo()
        );
    }
}
