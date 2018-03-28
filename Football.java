
/**
 * Football
 *
 * @author Liam Gerst, Stephen Armstrong
 * @version 3-27-18
 */
public class Football extends Sport {
    private int touchdowns, turnovers, fieldGoals, fGTotal;
    
    public void setAttrOne() {
        System.out.println("Enter the total number of touchdowns this season:");
        touchdowns = scan.nextInt();
    }
    
    public void setAttrTwo() {
        System.out.println("Enter the total number of turnovers this season:");
        turnovers = scan.nextInt();
    }
    
    public void setAttrThree() {
        System.out.println("Enter the total number of field goals attempted this season:");
        fGTotal = scan.nextInt();
        System.out.println("Enter the total number of field goals made this season:");
        fieldGoals = scan.nextInt();
    }
    
    public String toString() {
        String ret = printCommon();
        return "";
    }
}
