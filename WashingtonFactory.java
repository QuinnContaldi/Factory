public class WashingtonFactory extends Factory{

    Slots createStraightSlot(){
        return new WashingtonStraight();
    }
    Slots createBGSlot(){
        return new WashingtonBG();
    }
    Slots createProgressiveSlot(){
        return new WashingtonProgressive();
    }
}