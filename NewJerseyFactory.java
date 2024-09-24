public class NewJerseyFactory extends Factory{

    Slots createStraightSlot(){
        return new NewJerseyStraight();
    }
    Slots createBGSlot(){
        return new NewJerseyBG();
    }
    Slots createProgressiveSlot(){
        return new NewJerseyProgressive();
    }
    
}