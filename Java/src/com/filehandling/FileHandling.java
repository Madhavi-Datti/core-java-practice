package com.filehandling;
import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException{
		File f = new File("./src/resume1.doc");
		//f.mkdirs();
		System.out.println(f.createNewFile());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getParent());
//		System.out.println(f.getName());
//		System.out.println(f.getPath());
		//f.delete();

	}

}
