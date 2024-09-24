public class SlotStore{
 
    public static void main (String args[])
    {

        System.out.println("The Biggest Little Slots orders a progressive slot: ");
        Factory factory1 = new NevadaFactory();
        Slots slot1 = factory1.createProgressiveSlot();
        slot1.Print();
        
        System.out.println("The Atlantis orders a straight slot: ");
        Factory factory2 = new WashingtonFactory();
        Slots slot2 = factory2.createStraightSlot();
        slot2.Print();

        System.out.println("The Contaldi Casino orders a progressive slot: ");
        Factory factory3 = new NewJerseyFactory();
        Slots slot3 = factory3.createBGSlot();
        slot3.Print();
    }
}