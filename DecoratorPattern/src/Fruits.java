public class Fruits extends WaffleDecorator {
    private final Waffle waffle;
    private String fruitOption;

    public Fruits(Waffle waffle , String fruitOption) {
        this.waffle = waffle;
        this.fruitOption = fruitOption;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + fruitOption + " ($0.5) , ";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 0.5 ;
    }
}

