public class ThreadSafeInitialization {
    private static ThreadSafeInitialization instance;
    private int coins;
    private ThreadSafeInitialization(int coin){
        this.coins = coin;
    }
    public static synchronized ThreadSafeInitialization getInstance(){
        if(instance == null)
            instance = new ThreadSafeInitialization(0);
        return instance;
    }
    public void addCoins(int coin){
        coins=coins+coin;
        System.out.println("coin1 = "+ instance);
    }
    public void decreaseCoins(int coin){
        coins=coins-coin;
        System.out.println("coin2 = "+ instance);
    }
}
