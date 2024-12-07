package objectclass;

public class ObjectClass {
	   private String name;
	    private int rollno;
	    public ObjectClass(String name, int rollno) {
	        this.name = name;
	        this.rollno = rollno;
	    }
	    @Override
	    public String toString() {
	        return name+" "+rollno;
	    }
	    public static void main(String[] args) {
	    	ObjectClass obj = new ObjectClass("madhu",39);
	        System.out.println(obj);
	    }
	}
