
/**
 * Soccer
 *
 * @author Liam Gerst, Stephen Armstrong
 * @version 3-27-18
 */
public class Soccer extends Sport {
    private int yellow, red, saves;

    public void setAttrOne() {
        System.out.println("Enter the total number of yellow cards this season:");
        yellow = scan.nextInt();
    }

    public void setAttrTwo() {
        System.out.println("Enter the total number of red cards this season:");
        red = scan.nextInt();
    }

    public void setAttrThree() {
        System.out.println("Enter the total number of saves this season:");
        saves = scan.nextInt();
    }

    public String toString() {return "";}
}
