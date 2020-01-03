package cs14619.Shi.project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class DataShuffling {
	//private or public
	 private ArrayList<String> text;

	public DataShuffling() {
		this.text = new ArrayList<String>();
	}

	//Modularity 
	//make methods 
	public void shuffle() throws IOException {
		try {
			// Take ErdosCA.txt
			FileReader inputFile = new FileReader("data/ErdosCA.txt");

			// Store into array
			BufferedReader readErdos = new BufferedReader(inputFile);
			String line = null;

			readErdos.readLine();

			while ((line = readErdos.readLine()) != null) {
				text.add(line);
			}

			// close inputFile
			inputFile.close();
			// Close bufferedreader
			readErdos.close();

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

		// Algorithm from the requirements
		// Declare Random class
		Random r = new Random();
		
		// set seed
		r.setSeed(20);

		int n = text.size();
		for (int i = n - 1; i >= 0; i--) {
			// Pick a random index from 0 to i
			double d = r.nextDouble();
			int j = (int) (d * i);

			// Swap arr[i] with the element at random index
			String temp = text.get(i);
			// arr[i] = arr[j];
			text.set(i, text.get(j));
			// arr[j] = temp;
			text.set(j, temp);
		}

		// Write into files
		File f = new File("");
		String path = f.getAbsolutePath() + "\\ShiIslaShuffled.txt";
		FileWriter writer = new FileWriter(path);
		try {
			for (String str : text) {
				writer.write(str + System.lineSeparator());
			}
			writer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}
