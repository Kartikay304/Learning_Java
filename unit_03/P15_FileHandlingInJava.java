package Unit_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class P15_FileHandlingInJava {

	public static void main(String[] args)throws IOException {
		FileHandling obj = new FileHandling();
		
		obj.takeInputFromAFileNotFromConsole();
		obj.saveOutputIntoAFile();
		obj.createALogFile();
		
	}

}

class FileHandling{
	static int a = 0;
	void takeInputFromAFileNotFromConsole()throws IOException {
		//System.out.println("takeInputFromAFileNotFromConsole");
		String path = "/Users/LENOVO/git/p1_task01HelloWorld_JavaProgram/javaprogramming/Input.txt";
		
		File file = new File(path);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while((st = br.readLine()) != null) {
			System.out.println(st);
		}
		
		// List that holds string of a file
		List<String>listOfString = new ArrayList<String>(); 
		
		//read entire line as a string
		String line = br.readLine();
		
		while(line != null ) {
			listOfString.add(line);
			line = br.readLine();
		}
		
		for(String str : listOfString) {
			System.out.println(str);
		}
		System.out.println("\n");
		br.close();
	}
	
	void saveOutputIntoAFile()throws IOException {
		//System.out.println("saveOutputIntoAFile");
		FileWriter myobj = null;
		try {
			myobj = new FileWriter("output.txt");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(myobj);
		String text = "Life is fun !";
		
		f_writer.write(text);
		f_writer.close();
		
	}
	
	void createALogFile()throws IOException {
		//System.out.println("createALogFile");
		a++;
		
		//Find current Time and Date
		LocalTime Itime = java.time.LocalTime.now();
		LocalDate Idate = java.time.LocalDate.now();
		
		FileWriter myobj = null;
		
		try {
			myobj = new FileWriter("log.txt",true);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(myobj);
		String text = "the time is : " + Itime.toString() + "" + "and the Date is : " + Idate.toString() + "\n";
		
		try {
			f_writer.write("Value of a : " + a + ",");
			f_writer.write(text);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		f_writer.close();
	}
}
