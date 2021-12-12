public abstract class Computer {
    final void route(){
        plugCPU();
        plugMemory();
        plugStorage();
        plugPeripherals();
    }
    abstract void plugCPU();
    abstract void plugMemory();
    abstract void plugStorage();
    void plugPeripherals(){
        System.out.println("Connecting mouse, keybord, monitor");
    }
}
