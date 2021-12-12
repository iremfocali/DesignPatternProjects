public class ScheduleFacade {
    ScheduleServer schedule;
    CoffeeMaker coffeeMaker;
    ElectricGrill electricGrill;
    KitchenLight kitchenLight;
    LivingRoomFan livingRoomFan;
    LivingRoomFireTV4KStick livingRoomFireTV4KStick;
    LivingRoomLight livingRoomLight;
    LivingRoomSoundBar livingRoomSoundBar;
    LivingRoomTV livingRoomTV;
    Microwave microwave;
    Netflix netflix;
    Refrigerator refrigerator;


    public ScheduleFacade(ScheduleServer schedule, CoffeeMaker coffeeMaker, ElectricGrill electricGrill, KitchenLight kitchenLight, LivingRoomFan livingRoomFan, LivingRoomFireTV4KStick livingRoomFireTV4KStick, LivingRoomLight livingRoomLight, LivingRoomSoundBar livingRoomSoundBar, LivingRoomTV livingRoomTV, Microwave microwave, Netflix netflix, Refrigerator refrigerator) {
        this.schedule = schedule;
        this.coffeeMaker = coffeeMaker;
        this.electricGrill = electricGrill;
        this.kitchenLight = kitchenLight;
        this.livingRoomFan = livingRoomFan;
        this.livingRoomFireTV4KStick = livingRoomFireTV4KStick;
        this.livingRoomLight = livingRoomLight;
        this.livingRoomSoundBar = livingRoomSoundBar;
        this.livingRoomTV = livingRoomTV;
        this.microwave = microwave;
        this.netflix = netflix;
        this.refrigerator = refrigerator;
    }

    public void startServer(){
        schedule.startParty();
        System.out.println("--------------------------------------------------");
        schedule.setUpMovie();
        livingRoomFan.turnOn();
        livingRoomFan.encreas(2);
        livingRoomLight.turnOn();
        livingRoomTV.turnOn();
        livingRoomTV.setSource("HDMI ARC");
        livingRoomFireTV4KStick.turnOn();livingRoomSoundBar.turnOn();
        livingRoomSoundBar.set("Dolby Atmos");
        netflix.open();
        netflix.search("Spider-Man: Far From Home");
        livingRoomLight.dimming();
        livingRoomSoundBar.setVolume("20"); //**
        netflix.play("Spider-Man: Far From Home");
        System.out.println("--------------------------------------------------");
        schedule.prepareFood();
        kitchenLight.turnOn();
        refrigerator.set("Party");
        microwave.turnOn();
        microwave.turnOn();
        microwave.set(200,5);
        microwave.turnOngrill();
        electricGrill.turnOn();
        coffeeMaker.turnOn();
        microwave.bake("Napoletana Pizza",400,10); //**
        microwave.bake("Margherita Pizza",400,10);
        microwave.bake("Marinara Pizza",400,10);
        microwave.bake("Chicago-Style Deep Dish Pizza",400,10);
        System.out.println("--------------------------------------------------");
        schedule.enjoy();
        schedule.completed();
        System.out.println("--------------------------------------------------");
    }
    public void stopServer(){
        schedule.stopMovie();
        netflix.close();
        livingRoomFireTV4KStick.turnOff();
        livingRoomSoundBar.turnOff();
        livingRoomTV.turnOff();
        livingRoomLight.set("100"); //**
        livingRoomFan.turnOff();
        System.out.println("--------------------------------------------------");
        schedule.closeKitchen();
        refrigerator.set("Normal");
        electricGrill.turnOff();
        coffeeMaker.turnOff();
        microwave.turnOff();
        System.out.println("--------------------------------------------------");
        schedule.done();
    }
}
