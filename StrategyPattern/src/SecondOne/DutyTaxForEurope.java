package SecondOne;

public class DutyTaxForEurope implements ITaxBehavior {
    public DutyTaxForEurope() {
    }
    double dutyTaxforEurope = 1.015;
    @Override
    public double differentDutyTax() {
        return dutyTaxforEurope;
    }
}
