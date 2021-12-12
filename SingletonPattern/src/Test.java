//İrem Foçalı- 18070006032
public class Test {
        public static void main(String[] args) {
            EagerInitialization eagerInitialization = EagerInitialization.getInstance();
            LazyInitialization lazyInitialization = LazyInitialization.getInstance();
            ThreadSafeInitialization threadSafeInitialization = ThreadSafeInitialization.getInstance();
            eagerInitialization.addCoins(10);
            lazyInitialization.addCoins(10);
            System.out.println();
            eagerInitialization.decreaseCoins(1);
            lazyInitialization.decreaseCoins(1);
            System.out.println();
            threadSafeInitialization.addCoins(10);
            threadSafeInitialization.decreaseCoins(1);
        }
}
