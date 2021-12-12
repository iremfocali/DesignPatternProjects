public class EagerInitialization {
    private int coins;
    private static final EagerInitialization instance = new EagerInitialization(0);
    private EagerInitialization(int coin){
        this.coins=coin;
    };
    public static EagerInitialization getInstance(){
        return instance;
    }
    public void addCoins(int coin){
        coins = coins + coin;
        System.out.println("coin1.getCoinCount() = "+coins);
    }
    public void decreaseCoins(int coin){
        coins= coins-coin;
        System.out.println("coin1.getCoinCount() = "+coins);
    }
}

