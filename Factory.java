abstract public class Factory{
    Slots slot;
    abstract Slots createStraightSlot();
    abstract Slots createBGSlot();
    abstract Slots createProgressiveSlot();

}