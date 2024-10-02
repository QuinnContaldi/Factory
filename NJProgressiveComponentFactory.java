public class NJProgressiveComponentFactory{
    public Cabinent createCabinet(){
        return new SmallCabinent();
    }
    public Display createDisplay(){
       return new LCD();
    }
    public Payment createPayment(){
        return new TicketInTicketOut();
    }
    public GPU createGPU(){
        return new X77();
    }
    public OS createOS(){
        return new Android();
    }
}