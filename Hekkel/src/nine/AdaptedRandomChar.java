package nine;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomChar extends RandomSymbols implements Readable {
	private int count;

	public AdaptedRandomChar(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0)
			return -1;
		String result = Character.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}

	
}
