package com.enums;
public class EnumsExample {
	public static void main(String[] args) {
		for(Fruits f:Fruits.values())
		{		
			System.out.println(f.ordinal()+" "+f+" "+f.getCount());		
		}	
	}
}
	enum Fruits{
		 ORANGE(5),MANGO(3),APPLE(4),PAPAYA(2);
		private int count;
		private Fruits(int count) {
			this.count = count;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		
		

	
	
}
