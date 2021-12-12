public class War implements Creature {
    @Override
    public WhichWeapons whatCreature(CreatureName creatureName) {
        WhichWeapons whichWeapons = null;
        if(creatureName == CreatureName.Elves)
            whichWeapons = new Blacksmith();
        else if (creatureName == CreatureName.Orcs)
            whichWeapons = new AnotherBlacksmith();
        return whichWeapons;
    }
}
