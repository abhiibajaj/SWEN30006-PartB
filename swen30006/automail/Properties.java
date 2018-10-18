package automail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties {
	private int seed = 300;
	private int numberOfFloors = 14;
	private int lastDeliveryTime = 300;
	private int mailToCreate = 180;
	private String robotType1 = "Weak";
	private String robotType2 = "Strong";
	
	public Properties(String filename) {
			// Open the file
			try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
				String line;
				
				// Find the world size
				line = reader.readLine();
				
				// Loop over every line of the file
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		
}
	

