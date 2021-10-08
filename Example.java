package reversing;

public class Example {
	public static void main(String[] args) {

		String sr = "lokesh kumar";
		String rev = "";
		for (int i = sr.length() - 1; i >= 0; i--) {
			rev = rev + sr.charAt(i);
		}
		System.out.println(rev);

		System.out.println(sr.substring(sr.indexOf(' ') + 1) 
				           + " " + sr.substring(0, sr.indexOf(' ')));
		System.out.println(sr.substring(0, 6));
		System.out.println(sr.indexOf('k'));

	}
}
