
/**
 * Basketball
 *
 * @author Liam Gerst, Stephen Armstrong
 * @version 3-27-18
 */
public class Basketball extends Sport {
    private int yellow, red, saves;
    
    public void setAttrOne() {
        System.out.println("Enter the total number of yellow cards for the season:");
        yellow = scan.nextInt();
    }
    
    public void setAttrTwo() {
        System.out.println("Enter the total number of red cards for the season:");
        red = scan.nextInt();
    }
    
    public void setAttrThree() {
        System.out.println("Enter the total number of saves for the season:");
        saves = scan.nextInt();
    }
    
    public String toString() {return "";}
}
