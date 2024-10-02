public class WASProgressiveComponentFactory implements SlotComponentFactory{
    public Cabinent createCabinet(){
        return new LargeCabinent();
    }
    public Display createDisplay(){
        return new Reels();
    }
    public Payment createPayment(){
        return new Coins();
    }
    public GPU createGPU(){
        return new ARM();
    }
    public OS createOS(){
        return new Android();
    }
}