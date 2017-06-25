package appiumJ4;

import java.io.File;
import java.io.IOException;

public class fileTest {

	public static void main(String[] args) throws IOException{
		File path = new File("");
		String file = path.getAbsolutePath();
		String file1 = path.getCanonicalPath();
		System.out.println(file);
		System.out.println(file1);
	}
}
