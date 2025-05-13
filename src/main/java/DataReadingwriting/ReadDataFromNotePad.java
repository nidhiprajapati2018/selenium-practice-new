package DataReadingwriting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromNotePad {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader(System.getProperty("user.dir")+"/testdata/dataN.txt");
	     BufferedReader br=new BufferedReader(fr);
	     String str = "";
	      ///read line from the file upto null   
	     while((str=br.readLine())!=null)
	     {
	         System.out.println(str);
	      }
	     br.close();
	     
	 


	}

}
