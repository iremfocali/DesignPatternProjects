package src.gateron;

import src.CoilSpring;

public class GateronCoilSpring extends CoilSpring {
    public GateronCoilSpring(int pressureCN) {
        super(pressureCN);
    }
    @Override
    public String toString() {
        return "Gateron{" + super.toString() + "}";
    }
}
