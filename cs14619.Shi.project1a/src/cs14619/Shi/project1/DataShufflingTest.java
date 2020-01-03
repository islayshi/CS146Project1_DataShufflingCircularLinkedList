package cs14619.Shi.project1;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.*;

public class DataShufflingTest {

	@Test
	public void FileCompare() throws IOException {
		
		//Create DataShufflinf class and make shuffled file
		DataShuffling testShuffle = new DataShuffling();
		testShuffle.shuffle(); 
		
		
		String expectedLine = "";
		try {
			FileReader outFile = new FileReader("data/Target1.txt");
			File f = new File("");
			String path = f.getAbsolutePath() + "\\ShiIslaShuffled.txt";
			FileReader inFile = new FileReader(path);	
			
			BufferedReader out = new BufferedReader(outFile);
			BufferedReader in = new BufferedReader(inFile);

			//Compare line by line 
			String actualLine;
			
			//If lines don't match, test fails
			while ((actualLine = in.readLine()) != null) {
				expectedLine = out.readLine();
				assertEquals(expectedLine, actualLine);
			}
			
			//Close Buffered Reader
			out.close();
			in.close();
			
			//Close FileReader
			outFile.close();
			inFile.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

}
