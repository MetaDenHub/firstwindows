package ten;

public class JungleAnonymous {

	static String jungle(char[] cha) {
		char[] ch = cha;
		char[] chHelp = new char[cha.length];
		if ((ch.length % 2) == 0) {
			for (int c = 0 ; c < ch.length; c++) {
				if ((c % 2) == 0) {
					chHelp[c] = ch[c];
					ch[c] = ch[c + 1];
					ch[c + 1] = chHelp[c];
				}
			}
		}
		return String.valueOf(ch).toString();
	}

	public static void main(String[] args) {
		String s = jungle("Hello! Ananas!".toCharArray());
		System.out.println(s);
	}

}
