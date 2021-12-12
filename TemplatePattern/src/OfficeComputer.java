public class OfficeComputer extends Computer{
    @Override
    void plugCPU() {
        System.out.println("Putting low-end dual-core cpu");
    }

    @Override
    void plugMemory() {
        System.out.println("Putting energy-efficient memory");
    }

    @Override
    void plugStorage() {
        System.out.println("Putting energy-efficient hdd");
    }
}
