package src;

public class Tactile extends Switch implements Stem {
    SwitchComponentFactory switchComponentFactory;
    public Tactile(SwitchComponentFactory switchComponentFactory) {
        this.switchComponentFactory = switchComponentFactory;
    }


    @Override
    public void gatherParts() {
        keyCap = switchComponentFactory.createKeyCap();
        stem = switchComponentFactory.createStem();
        coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Medium);
    }
}
