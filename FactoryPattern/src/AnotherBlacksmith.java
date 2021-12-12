public class AnotherBlacksmith extends WhichWeapons {
    public AnotherBlacksmith(){
        creatureName = CreatureName.Orcs;
    }

    @Override
    public WhichWeapons getWhichWeapons(String weapons) {
        System.out.println("Orcish " + weapons);
        return this;
    }
}
