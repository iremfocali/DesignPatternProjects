public class LazyInitialization {
    private static LazyInitialization instance;
    private int coins;
    private LazyInitialization(int coin){
        this.coins = coin;
    }
        public static LazyInitialization getInstance(){
            if(instance == null){
                instance = new LazyInitialization(0);
            }
            return instance;
        }
    public void addCoins(int coin){
        coins=coins+coin;
        System.out.println("coin2.getCoinCount() = "+coins);
    }
    public void decreaseCoins(int coin){
        coins=coins-coin;
        System.out.println("coin2.getCoinCount() = "+coins);
    }
}
