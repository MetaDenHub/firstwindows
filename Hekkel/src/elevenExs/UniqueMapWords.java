package elevenExs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class UniqueMapWords {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Vaiger\\Desktop\\text.txt");

		BufferedReader br = new BufferedReader(new FileReader(f));
		String strLine;
		String[] words = null;
		List<String> li = new LinkedList<>();
		while ((strLine = br.readLine()) != null) {
			System.out.println("good");
			words = strLine.split(" ");
		}

		System.out.println(words);
		for (int i = 0; i < words.length; i++) {
			li.add(words[i]);
		}
		System.out.println();
		System.out.println(li);
		System.out.println();

		int wordCounter = 0;
		for (String list : li) {
			if (list.equals("hello"))
				wordCounter++;
		}
		// how much hello?
		System.out.println(wordCounter);
		br.close();
	}
}
