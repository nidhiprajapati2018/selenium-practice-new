package DataReadingwriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoNoteP {

	public static void main(String[] args) throws IOException {
		FileWriter fr=new FileWriter(System.getProperty("user.dir")+"/testdata/dataN.txt");
	     BufferedWriter br=new BufferedWriter(fr);
	     br.write("This is sample data");
	     br.newLine();
	     br.write("This is sample data2");
	     
	     
	     br.close(); // Always close BufferedWriter
         System.out.println("Data written successfully!");




	}

}
