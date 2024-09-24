abstract public class Slots{
    public String Cabinet;
    public String Display;
    public String Payment;
    public String GPU;
    public String OS;
    
    public void Print(){
        System.out.println(this.Cabinet);
        System.out.println(this.Display);
        System.out.println(this.Payment);
        System.out.println(this.GPU);
        System.out.println(this.OS);
        System.out.println();
        System.out.println();
    }
}