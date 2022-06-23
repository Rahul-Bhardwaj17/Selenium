package introduction;

public class AddTwoBinayNo {

	public static void main(String[] args) {

		int a = Integer.parseInt("10", 2);
		int b = Integer.parseInt("11", 2);
		int sum = a + b;
		int mul = a * b;
		int c = 5;
		int d = 15;
		int e = Integer.parseInt("1101", 2);
		int f = Integer.parseInt("111", 2);
		int g = Integer.parseInt("10", 8);
		int h = Integer.parseInt("7", 8);

		System.out.println(Integer.toBinaryString(sum));
		System.out.println(Integer.toBinaryString(mul));

		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toHexString(d));
		System.out.println(Integer.toOctalString(d));
		System.out.println(Integer.parseInt("100", 2));

		System.out.println(Integer.toHexString(e));
		System.out.println(Integer.toOctalString(f));
		System.out.println(Integer.parseInt("10", 8));
		System.out.println(Integer.toBinaryString(h));
	}

}
