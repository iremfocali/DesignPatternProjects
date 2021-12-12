//İREM FOÇALI - 18070006032
public class Test {
    public static void main(String[] args) {
        Creature creature = new War();
        WhichWeapons orc =  creature.whatCreature(CreatureName.Orcs);
        WhichWeapons elve =  creature.whatCreature(CreatureName.Elves);
        orc.getWhichWeapons("spear");
        orc.getWhichWeapons("axe");
        elve.getWhichWeapons("short sword");
        elve.getWhichWeapons("spear");
    }
}
