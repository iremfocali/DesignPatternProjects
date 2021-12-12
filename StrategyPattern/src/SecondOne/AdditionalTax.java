package SecondOne;

//America için 0.75 ek vergi
public class AdditionalTax implements ITaxBehavior {
    public AdditionalTax() {
    }
    double additionalTax = 1.0075;

    @Override
    public double differentDutyTax() {
        return additionalTax;
    }
}
