package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
	File f = new File("sample1.txt");
if(!f.exists())
 f.createNewFile();
//		FileInputStream fis = new FileInputStream(f);
//		int ascii;
//		while((ascii=fis.read())!= -1)
//		{
//			System.out.print((char)ascii);
//		}
//		fis.close();
		
		FileReader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);
		String line = new String();
		while((line = br.readLine())!= null)
		{
			System.out.println(line);
		}
		r.close();
		br.close();	
		
	}

}
