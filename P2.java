public class P2 {
    public static void main(String[] args) {
	int n1 = 1;
	int n2 = 2;
	int temp = 0;
	int sum = 0;
	while (n2 < 4000000) {
	    if (n2 % 2 == 0) {
		sum += n2;
	    }
	    temp = n1;
	    n1 = n2;
	    n2 = n1 + temp;
	}
	System.out.println(sum);
    }
}