package partialcovering;
/**
 * Class for showing something on coverage
 * @author PR
 *
 */
public class PartialCover {
	
	 public static int returnZeroOrOne(int x, int y) {
			int res = 0; 
			int z = 2;
			x = z * z - z - 1;
			/* on va voir si intelj s'en sort!*/
			y = x > 0 ? -1 : 0;
			for (int i = x; i < y; i++ ) {
				res = x == 0? 1 : 0;
			}
			return res;
		}

	public static void main(final String [] args) {
		int x = 10;
		int y = 10;
		System.out.println(returnZeroOrOne(x, y));
	}
}
