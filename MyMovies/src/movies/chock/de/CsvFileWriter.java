package movies.chock.de;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author cbrueggemann
 * @version 0.1
 * @see Class Movie
 */
public class CsvFileWriter {

    //Delimiter used in CSV file
    private static final String DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    //CSV file header
    private static final String HEADER = "Id,Name,Datum";
    
	/**
	 * @param fileName to write
	 * @param List of movies
	 */
	public static void writeCsvFile (String fileName, List<Movie> movies) {
		
	    FileWriter fileWriter = null;
	    
		try {
			fileWriter = new FileWriter(fileName);
			
            //Write the header
            fileWriter.append(HEADER.toString());
            //Add a new line
            fileWriter.append(NEW_LINE);
			
			for (Movie movie : movies) {
				System.out.println("Writing...");
				fileWriter.append(movie.id);
				fileWriter.append(DELIMITER);
				fileWriter.append(movie.name);
				fileWriter.append(DELIMITER);
				SimpleDateFormat dtf = new SimpleDateFormat("dd.MM.yyyy");
				fileWriter.append(dtf.format(movie.datum)); 
				fileWriter.append(NEW_LINE);
			}
		} catch (Exception e) {
		    System.out.println("Cannot write this!!!");
		    e.printStackTrace();
		} finally {
			try {
			 	fileWriter.flush();
			 	fileWriter.close();
			} catch (IOException e) {
			  	System.out.println("Error on flushing/closing writer!!!");
			  	e.printStackTrace();
			}
		}
	}
}