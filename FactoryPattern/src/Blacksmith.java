public class Blacksmith extends WhichWeapons {
    public Blacksmith(){
        creatureName = CreatureName.Elves;
    }

    @Override
    public WhichWeapons getWhichWeapons(String weapons) {
        System.out.println("Elven " + weapons);
        return this;
    }
}
