package SecondOne;

// Europe için 11 lira
public class BaseDeliveryFeeForEurope implements IBaseDeliveryBehavior {
    public BaseDeliveryFeeForEurope() {
    }
    double basedeliveryfeeEurope = 11.0;
    @Override
    public double differentBaseDeliveryFee() {
        return basedeliveryfeeEurope;
    }
}
