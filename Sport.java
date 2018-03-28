import java.util.*;
/**
 * Sport
 * @author Liam Gerst, Stephen Armstrong
 * @version 3-27-18
 */
public abstract class Sport {
    protected Scanner scan = new Scanner(System.in);
    protected int totalPts, games, passes, totalPasses;
    
    public void common() {
        System.out.println("Enter the total number of points scored this season:");
        totalPts = scan.nextInt();
        System.out.println("Enter the total number of games this season:");
        games = scan.nextInt();
        System.out.println("Enter the total number of passes attempted this season:");
        totalPasses = scan.nextInt();
        System.out.println("Enter the total number of passes made this season:");
        passes = scan.nextInt();
    }
    
    public abstract void setAttrOne();
    public abstract void setAttrTwo();
    public abstract void setAttrThree();
    
    public abstract String toString();
}
