public class NJStraightComponentFactory {
    public Cabinent createCabinet(){
        return new SmallCabinent();
    }
    public Display createDisplay(){
       return new LCD();
    }
    public Payment createPayment(){
        return new Coins();
    }
    public GPU createGPU(){
        return new ARM();
    }
    public OS createOS(){
        return new WindowsME();
    }
}
