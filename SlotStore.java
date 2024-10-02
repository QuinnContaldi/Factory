public class SlotStore{
 
    public static void main (String args[])
    {

        System.out.println("The Biggest Little Slots orders a progressive slot: ");
        Factory factory1 = new NevadaFactory(new WAStraightComponentFactory()); 
        factory1.print();
    }
}