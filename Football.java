
/**
 * Football
 *
 * @author Liam Gerst, Stephen Armstrong
 * @version 3-27-18
 */
public class Football extends Sport {
    private int touchdowns, turnovers, fieldGoals;
    
    public void setAttrOne() {
        System.out.println("Enter the total number of touchdowns for the season:");
        touchdowns = scan.nextInt();
    }
    
    public void setAttrTwo() {
        System.out.println("Enter the total number of turnovers for the season:");
        turnovers = scan.nextInt();
    }
    
    public void setAttrThree() {
        System.out.println("Enter the total number of field goals for the season:");
        fieldGoals = scan.nextInt();
    }
    
    public String toString() {return "";}
}
