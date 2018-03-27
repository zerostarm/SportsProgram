import java.util.*;
/**
 * Sport
 * @author Liam Gerst, Stephen Armstrong
 * @version 3-27-18
 */
public abstract class Sport {
    protected Scanner scan = new Scanner(System.in);
    protected int totalPts, games, totalPasses;
    
    public abstract void setAttrOne();
    public abstract void setAttrTwo();
    public abstract void setAttrThree();
    
    public abstract String toString();
}
