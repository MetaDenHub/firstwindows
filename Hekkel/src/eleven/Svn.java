package eleven;

import java.util.ArrayList;
import java.util.List;

public class Svn {
	public static void main(String[] args) {
		Svn[] svn = new Svn[10];
		List<Svn> listSvn = new ArrayList<Svn>();

		for (int i = 0; i < 10; i++) {
			svn[i] = new Svn();
			listSvn.add(svn[i]);
		}
		List<Svn> sub = new ArrayList<Svn>();
		sub = listSvn.subList(0, 8);
		System.out.println(sub);
		listSvn.removeAll(sub);
		System.out.println(listSvn);

	}
}
