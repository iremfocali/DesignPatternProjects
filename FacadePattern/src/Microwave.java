public class Microwave {
    public void turnOn(){
        System.out.println("Turning On 'Microwave' ");
    }
    public void set(int temp,int min){
        System.out.println("Setting 'Microwave' on Pre-Heat, temprature '"+ temp + "', time '" + min + "' minutes. ");
    }
    public void turnOngrill(){
        System.out.println("Turning on grill of 'Microwave' ");
    }
    public void bake(String Pizza, int temp,int min){
        System.out.println("Baking " + Pizza + " in 'Microwave' for temprature '"+ temp + "', time '"+ min +"' minutes. ");
    }
    public void turnOff(){
        System.out.println("Turning Off 'Microwave' ");
    }

}
