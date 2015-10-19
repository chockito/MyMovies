package movies.chock.de;

/**
 * @author cbrueggemann
 * @version 0.1
 */
public class Test {
	public static void main (String [] args) {
		String fileName = System.getProperty("user.home")+"/movies.csv";
		System.out.println("File: "+fileName);
		
		System.out.println("Read CSV file:");
		CsvFileReader.readCsvFile(fileName);
	}
}