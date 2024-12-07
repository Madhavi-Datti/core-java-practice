package com.exceptionhandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ThrowsEg {
	  void m()throws IOException{
	    //throw new IOException("device error");//checked exception
			File file = new File("D:resume.doc");
			FileInputStream fis = new FileInputStream(file);
	//		System.out.println(fis);
	  }
	  void n()throws IOException{
	    m();
	  }
	  void p(){
	   try{
	    n();
	   }catch(Exception e){System.out.println("exception handled");}
	  }
	  public static void main(String args[]){
		  ThrowsEg obj=new ThrowsEg();
	   obj.p();
	   System.out.println("normal flow...");
	  }


}
