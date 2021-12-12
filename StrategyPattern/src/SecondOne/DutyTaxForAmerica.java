package SecondOne;

//duty tax 1 america
public class DutyTaxForAmerica implements ITaxBehavior {
    public DutyTaxForAmerica() {
    }
    double dutyTaxforAmerica = 1.01;

    @Override
    public double differentDutyTax() {
        return dutyTaxforAmerica;
    }
}
