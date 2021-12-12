public class Nuts  extends WaffleDecorator {
    private final Waffle waffle;
    private String nutsOption;

    public Nuts(Waffle waffle , String nutsOption) {
        this.waffle = waffle;
        this.nutsOption = nutsOption;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + nutsOption + " ($1.0) -> ";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 1.0 ;
    }
}