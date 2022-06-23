package introduction;

public class SumOfDigit {

	public static void main(String[] args) {

		String str = ("knowledge is the key for the india");
		String s = new String("base");
	    System.out.println(str);
		System.out.println(s.compareTo(str));
        
		char[] arr= {' ', ' ', ' ', ' '};
	    str.getChars(3, 5, arr, 1);
	    System.out.println(arr);
		System.out.println(str = str.concat("base"));
		System.out.println(str.indexOf('e'));
		
		System.out.println(str.lastIndexOf("the"));
		System.out.println(str.length());
		System.out.println(str.replace('e', 'p'));
		System.out.println(str.replace("the", "if"));
		String[] arr2=str.split(" ");
		for(String sp:arr2) {
			System.out.println(sp.indexOf('o'));
		}
		System.out.println(str.substring(3, 9));
		char[] ch=str.toCharArray();
		for(char arr3:ch) {
			System.out.println(arr3);
		}
		System.out.println(str.contains("for"));
		
		
		
		
		
	}

}
