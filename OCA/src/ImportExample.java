
import java.util.Random;
import java.util.Date;
import java.sql.*;

public class ImportExample {

		public static void main(String[] args) {
			
			for(String arg : args ) {
				System.out.println("->"+arg);
			}
			
			Random r = new Random(); // DOES NOT COMPILE
			System.out.println(r.nextInt(10));
		}
	
}
