package com.filehandling;
import java.io.*;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
//		File f = new File("tst.doc");
//		f.createNewFile();
//		FileWriter fr = new FileWriter(f);
		try(BufferedWriter br = new BufferedWriter(new FileWriter(new File("tst.doc")))){
		br.write("Hi This is Madhavi");
		br.newLine();
		br.write("Java Developer");
	}
		catch(IOException e)
		{
			System.out.println("exception");
		}

}}
