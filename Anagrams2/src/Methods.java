import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class Methods {

	ArrayList<String> words = new ArrayList<String>();
	ArrayList<String> sortedWords = new ArrayList<String>();
	
	HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

	public void readFromFile() throws IOException {
		String cLine;
		InputStream fis = new FileInputStream("Anagram.txt");
		InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);

		while ((cLine = br.readLine()) != null) {

			words.add(cLine);

		}
		br.close();
	}

	public void sortString() {
		for (int i = 0; i < words.size(); i++) {
			String s = words.get(i);
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String sortedString = new String(charArray);
			sortedWords.add(sortedString);
		}
	}
	
	public void printSortedString()
	{
		for(int i = 0; i < sortedWords.size(); i++)
		{
			String s = sortedWords.get(i);
			System.out.println(s);
		}
	}
	
	public void organiseSortedStrings()
	{
		for(int i = 0; i < sortedWords.size(); i++)
		{
			String s = sortedWords.get(i);
			ArrayList<String> ls = new ArrayList<String>();
			if(ls.isEmpty())
			{
				ls.add(s);
			}
			if(sortedWords.get(0).equals(ls.get(0)))
			{
				ls.add(s);
			}
			
			//iterate through words
			//add word to new list
			//if words already exists add to pre-existing list
			
		}
	}

}
