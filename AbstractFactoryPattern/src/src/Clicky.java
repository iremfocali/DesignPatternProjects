package src;

public class Clicky  extends Switch implements Stem {
    SwitchComponentFactory switchComponentFactory;

    public Clicky(SwitchComponentFactory switchComponentFactory) {
        this.switchComponentFactory = switchComponentFactory;
    }

    @Override
    public void gatherParts() {
        keyCap = switchComponentFactory.createKeyCap();
        stem = switchComponentFactory.createStem();
        coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Heavy);
    }
}
