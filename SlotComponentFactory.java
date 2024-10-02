public interface SlotComponentFactory {
    public Cabinent createCabinet();
    public Display createDisplay();
    public Payment createPayment();
    public GPU createGPU();
    public OS createOS();
}