public class Chocolate extends WaffleDecorator {
    private final Waffle waffle;
    private String chocolateOption;

    public Chocolate(Waffle waffle , String chocolateOption) {
        this.waffle = waffle;
        this.chocolateOption = chocolateOption;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + chocolateOption + " Chocolate ($2.0) , ";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 2.0 ;
    }
}
