public class Factory{
SlotComponentFactory slotComponentFactory;
    public void print(){
        System.out.println(slotComponentFactory.createCabinet().name);
        System.out.println(slotComponentFactory.createDisplay().name);
        System.out.println(slotComponentFactory.createGPU().name);
        System.out.println(slotComponentFactory.createOS().name);
        System.out.println(slotComponentFactory.createPayment().name);
    }

}