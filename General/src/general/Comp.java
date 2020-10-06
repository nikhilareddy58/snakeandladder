package general;

import java.util.Comparator;

public class Comp implements Comparator<BigNum> {

	@Override
	public int compare(BigNum o1, BigNum o2) {

		if (Integer.valueOf(o1.s1 + o2.s1) > Integer.valueOf(o2.s1 + o1.s1))
			return -1;
		else if (Integer.valueOf(o1.s1 + o2.s1) == Integer.valueOf(o2.s1 + o1.s1))
			return 0;
		return 1;
	}

}
