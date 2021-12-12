package SecondOne;

//America için 15 dolar
public class BaseDeliveryFeeForAmerica implements IBaseDeliveryBehavior {
    public BaseDeliveryFeeForAmerica() {

    }
    double basedeliveryfeeAmerica = 15.0;
    @Override
    public double differentBaseDeliveryFee() {
        return basedeliveryfeeAmerica;
    }
}
