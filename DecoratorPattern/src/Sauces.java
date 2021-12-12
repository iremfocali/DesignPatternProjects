public class Sauces  extends WaffleDecorator {
    private final Waffle waffle;
    private String saucesOption;

    public Sauces(Waffle waffle , String saucesOption) {
        this.waffle = waffle;
        this.saucesOption = saucesOption;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + saucesOption + " ($1.0) , ";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 1.0 ;
    }
}
