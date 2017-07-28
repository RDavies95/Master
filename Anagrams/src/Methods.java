import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Pattern;

public class Methods {

	ArrayList<String> words = new ArrayList<String>();
	ArrayList<String> sortedWords = new ArrayList<String>();
	
	HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
	HashMap<String, ArrayList<String>> map2 = new HashMap<String, ArrayList<String>>();

	public void readFromFile() throws IOException {
		String cLine;
		InputStream fis = new FileInputStream("C:\\Users\\ewomack\\workspace\\Library\\wordList.txt");
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


	public void organiseIntoHashmap()
	{
		ArrayList<String> ar2 = new ArrayList<String>();
		for(int i = 0; i < sortedWords.size(); i++)
		{
			map2.put(sortedWords.get(i),ar2);
		}
	}

	public void addValuesIntoArray()
	{
		for(int i = 0; i < sortedWords.size(); i++)
		{

		}
	}




	
	public void printSortedString()
	{
		for(int i = 0; i < sortedWords.size(); i++)
		{
			String s = sortedWords.get(i);
		}
		Collections.sort(sortedWords);
	}
	
	public void organiseSortedStrings()
	{
		ArrayList<String> ar = new ArrayList<>();

		int countValue = 0;
		for(int i = 0; i < sortedWords.size(); i++)
		{
			if(i == sortedWords.size() -1)
			{
				ArrayList<String> tempar = new ArrayList<>();
				ar.add(sortedWords.get(i));
				tempar.addAll(ar);
				map.put(countValue, tempar);
				countValue++;
				ar.clear();
			}
			else {
				if (sortedWords.get(i).equals(sortedWords.get(i + 1))) {
					ar.add(sortedWords.get(i));
				} else {
					ArrayList<String> tempar = new ArrayList<>();
					ar.add(sortedWords.get(i));
					tempar.addAll(ar);
					map.put(countValue, tempar);
					countValue++;
					ar.clear();
				}
			}
		}
	}

	public void printHashMap()
	{
		int largestWord = 0;
		int keypos =-1;
		String wordsToUse ="";
		for (int key: map.keySet()){

			int keyInt = key;
			ArrayList tempar = map.get(key);
			if(tempar.size() > largestWord)
			{
				largestWord = tempar.size();
				keypos = key;
				wordsToUse = tempar.toString();

			}
			for(int i = 0; i < tempar.size(); i++)
			{
				//System.out.println(key + " " + tempar.get(i));
			}

		}
		System.out.println("Largest Anagram is Position " + keypos);
	}


	//add words as values in hash map
	//iterate though



}
