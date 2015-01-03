import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class FileToArray {

	public FileToArray() {
	}

	public String[] ArrayReader(FileReader fr1) {
		List<String> wordList = new ArrayList<String>();

		BufferedReader br = null;
		{
			try {
				br = new BufferedReader(new FileReader("oncall.txt"));
				String word;
				// loop and read a line from the file
				while ((word = br.readLine()) != null)
					// add the read word to the wordList
					wordList.add(word);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					// attempt the close the file
					br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			// initialize a new string array equal to the size of the wordList
			String[] words = new String[wordList.size()];

			// call the wordList's toArray method to and transfer items from
			// wordList to our string array words
			wordList.toArray(words);
			return words;
		}
	}
}