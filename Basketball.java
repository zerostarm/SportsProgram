
/**
 * Basketball
 *
 * @author Liam Gerst, Stephen Armstrong
 * @version 3-27-18
 */
public class Basketball extends Sport {
	private int two, twoTotal, three, threeTotal, assists;

	public void setAttrOne() {
		System.out.println("Enter the total number of two-point attempts this season:");
		twoTotal = scan.nextInt();
		System.out.println("Enter the number of two-point goals scored this season:");
		two = scan.nextInt();
	}

	public void setAttrTwo() {
		System.out.println("Enter the total number of three-point attempts this season:");
		threeTotal = scan.nextInt();
		System.out.println("Enter the number of three-point goals scored this season:");
		three = scan.nextInt();
	}

	public void setAttrThree() {
		System.out.println("Enter the total number of assists this season:");
		assists = scan.nextInt();
	}

	public String toString() {
		String ret = printCommon();
		ret += "\nTwo-Point Percentage: " + ((float) two / twoTotal*100) + "%";
		ret += "\nThree-Point Percentage: " + ((float) three / threeTotal*100 + "%");
		ret += "\nAssists per Game: " + ((float) assists / games);
		return ret;
	}
}
