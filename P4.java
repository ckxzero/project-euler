public class P3 {
    public static void main(String[] args) {
	String largestPalin = "0";
	String temp = "0";
	for (int i = 100; i < 1000; ++i) {
	    for (int j = 100; j < 1000; ++j) {
		temp = isPalin(i, j);
		if (Integer.parseInt(temp) != -1  && Integer.parseInt(temp) > Integer.parseInt(largestPalin)) {
		    largestPalin = temp;
		}
	    }
	}
	System.out.println(largestPalin);
    }

    public static String isPalin(int x, int y) {
	String s = Integer.toString(x * y);
	int sCopy = x * y;;
	String palin = "";
	while (sCopy > 0) {
	    //System.out.println(palin);
	    palin += Integer.toString(sCopy % 10);
	    sCopy /= 10;
	}
	if (palin.equals(s)) return palin;
	return "-1";
    }
}