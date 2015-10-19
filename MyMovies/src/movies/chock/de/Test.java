package movies.chock.de;

import java.util.List;

/**
 * @author cbrueggemann
 * @version 0.1
 */
public class Test {
	public static void main (String [] args) {
		String fileName = System.getProperty("user.home")+"/movies.csv";
		System.out.println("File: "+fileName);
		
		System.out.println("Read CSV file:");
		List<Movie> movies= CsvFileReader.readCsvFile(fileName);
		
		System.out.println("Write CSV file:");
		CsvFileWriter.writeCsvFile(fileName+".out", movies);
	}
}