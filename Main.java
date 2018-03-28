import java.util.*;

/**
 * Controlling Class
 * 
 * @author Liam Gerst, Stephen Armstrong
 * @version 3-27-18
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the team name:");
        String name = scan.nextLine();
        Sport sp;
        while (true) {
            System.out.println("Enter the team's sport (basketball, soccer, or football):");
            String sport = scan.nextLine();
            if (sport.equalsIgnoreCase("basketball"))
                sp = new Basketball();
            else if (sport.equalsIgnoreCase("soccer"))
                sp = new Soccer();
            else if (sport.equalsIgnoreCase("football"))
                sp = new Football();
            else {
                System.out.println("Invalid sport.");
                continue;
            }
            break;
        }
        sp.setName(name);
        sp.common();
        sp.setAttrOne();
        sp.setAttrTwo();
        sp.setAttrThree();
        System.out.println(sp);
    }
}
