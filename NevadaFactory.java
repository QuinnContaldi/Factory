public class NevadaFactory extends Factory{

    Slots createStraightSlot(){
        return new NevadaStaright();
    }
    Slots createBGSlot(){
        return new NevadaBG();
    }
    Slots createProgressiveSlot(){
        return new NevadaProgressive();
    }
}