//18070006032-İrem Foçalı
public class Test {
    public static void main(String[] args) {
        ScheduleServer schedule = new ScheduleServer();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        ElectricGrill electricGrill = new ElectricGrill();
        KitchenLight kitchenLight = new KitchenLight();
        LivingRoomFan livingRoomFan = new LivingRoomFan();
        LivingRoomFireTV4KStick livingRoomFireTV4KStick = new LivingRoomFireTV4KStick();
        LivingRoomLight livingRoomLight = new LivingRoomLight();
        LivingRoomSoundBar livingRoomSoundBar = new LivingRoomSoundBar();
        LivingRoomTV livingRoomTV = new LivingRoomTV();
        Microwave microwave = new Microwave();
        Netflix netflix = new Netflix();
        Refrigerator refrigerator = new Refrigerator();

        ScheduleServer scheduleServer = new ScheduleServer();

        ScheduleFacade scheduleFacade1 = new ScheduleFacade(scheduleServer,coffeeMaker,electricGrill,kitchenLight
                ,livingRoomFan,livingRoomFireTV4KStick,livingRoomLight,livingRoomSoundBar,livingRoomTV,microwave,netflix,refrigerator);
        scheduleFacade1.startServer();
        System.out.println();
        scheduleFacade1.stopServer();
    }
}
