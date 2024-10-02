public class NVBonusComponentFactory {
    public Cabinent createCabinet(){
        return new SmallCabinent();
    }
    public Display createDisplay(){
       return new CRT();
    }
    public Payment createPayment(){
        return new TicketInTicketOut();
    }
    public GPU createGPU(){
        return new X86();
    }
    public OS createOS(){
        return new Linux();
    }
}
