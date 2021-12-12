package src;

public class Linear extends Switch implements Stem {
    SwitchComponentFactory switchComponentFactory;
    public Linear(SwitchComponentFactory switchComponentFactory) {
        this.switchComponentFactory = switchComponentFactory;
    }


    @Override
    public void gatherParts() {
        keyCap = switchComponentFactory.createKeyCap();
        stem = switchComponentFactory.createStem();
        coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Light);
    }
}
