package src.gateron;

import src.*;

public class GateronBrandFactory implements SwitchComponentFactory {
    @Override
    public KeyCap createKeyCap() {
        return new GateronKeyCap();
    }

    @Override
    public Stem createStem() {
        return new GateronLinearStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        return null;
    }
}
