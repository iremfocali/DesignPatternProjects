package src.cherrymx;

import src.*;

public class CherryMXBrandFactory implements SwitchComponentFactory {


    @Override
    public KeyCap createKeyCap() {
        return new CherryMXKeyCap();
    }

    @Override
    public Stem createStem() {
        return new CherryMXLinearStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        CherryMXCoilSpring cs;

        if (pressureCN == pressureCN.Light) {
            return new CherryMXCoilSpring(45);
        } else if (pressureCN == pressureCN.Medium) {
            return new CherryMXCoilSpring(55);
        } else if (pressureCN == pressureCN.Heavy) {
            return new CherryMXCoilSpring(60);
        } else if (pressureCN == pressureCN.SuperHeavy) {
            return new CherryMXCoilSpring(80);
        }
        else {
            return null;
        }
    }

}
