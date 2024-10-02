public class WABonusComponentFactory implements SlotComponentFactory {
    public Cabinent createCabinet(){
        return new MediumCabinent();
    }
    public Display createDisplay(){
       return new VGA();
    }
    public Payment createPayment(){
        return new TicketInTicketOut();
    }
    public GPU createGPU(){
        return new ARM();
    }
    public OS createOS(){
        return new Symbian();
    }
}
