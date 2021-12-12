package src.cherrymx;

import src.CoilSpring;

public class CherryMXCoilSpring extends CoilSpring {
    public CherryMXCoilSpring(int pressureCN) {
        super(pressureCN);
    }
    @Override
    public String toString() {
        return "CherryMXCoil{" + super.toString() + "}";
    }
}
