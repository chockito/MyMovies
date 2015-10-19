package movies.chock.de;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author cbrueggemann
 * @version 0.1
 * @see Class Movie
 */
public class CsvFileReader {
	// Delimiter
	private static final String COMMA_DELIMITER = ",";
	
	// attributes indexes
	private static final int MOVIE_ID_IDX =0;
	private static final int MOVIE_NAME_IDX =1;
	private static final int MOVIE_DATUM_IDX =2;
	
	
	/**
	 * @param fileName
	 */
	public static List<Movie> readCsvFile(String fileName) {
		BufferedReader fileReader = null;
		
		//Create a new list of movies 
		List<Movie> movies = new ArrayList<Movie>();
		
		try {

			
			String line = "";
			//Create the file reader
			fileReader = new BufferedReader(new FileReader(fileName));
			
			//Read the CSV file header to skip it
			fileReader.readLine();
			
			//Read the file line by line starting from the second line
			while(( line= fileReader.readLine()) != null) {
				System.out.println("Reading...");
				
				//Get all tokens available in line
				String[] tokens = line.split(COMMA_DELIMITER);
				
				if (tokens.length > 0) {
					//Create a new movie object and fill his data
					SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
			        Date datum = formatter.parse(tokens[MOVIE_DATUM_IDX]);
					
					Movie movie = new Movie(tokens[MOVIE_ID_IDX], tokens[MOVIE_NAME_IDX], datum);
					movies.add(movie);
				} else {
					System.out.println("Line empty?");
				}
			}
			
			for (Movie movie : movies) {
				System.out.println(movie.toString());
			}
			
		} catch (Exception e)  {
			System.out.println("Error on reading CSV");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e){
				System.out.println("Error while closing fileReader !!!");
				e.printStackTrace();
			}
		}
		return movies;
	}
}
