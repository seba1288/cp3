/**
 * 1. Save this program along with your programs (C1.java .. C6.java) in the same folder
 * 2. Open a terminal window
 * 3. Compile this program
 *    javac ThisProgramName.java
 * 4. Compile your programs:
 *    javac C?.java
 * 5. Run this program:
 *    java -ea ThisProgramName
 * 6. Test1 results will be saved to a file results.txt
 *  
 */


import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;
import java.util.HashMap;

public class GRADE_TEST1_ZIIAS1_2312 {
	static String r = ""; 
	
	public static void main(String[] args) {
		HashMap<String, Integer> results = new HashMap<String, Integer>();

		// C1
		try {
			int[] arr1 = {33,44,55,77,99,88,88,88};
			assert C1.even(arr1) == 4;
			assert C1.reverse(arr1)[0] == 88;
			assert C1.reverse(arr1)[arr1.length-1] == 33;
			results.put("C1", 1);
		} catch (Throwable e) {
			results.put("C1", 0);
		}

		// C2
		try {
			C2 o1 = new C2(345);
			assert o1.ok() == false;
			assert o1.toString().equals("0345");
			C2 o2 = new C2(556677);
			assert o2.ok() == true;
			assert o2.toString().equals("556677");
			results.put("C2", 1);
		} catch (Throwable e) {
			results.put("C2", 0);
		}

		// C3
		try {
			C3 c = new C3();
			assert c.value() == 0;
			c.increase();
			c.decrease();
			c.increase(7);
			c.increase(-3);
			c.decrease(1);
			assert c.value() == 6;
			c.cancel();
			assert c.value() == 0;
			results.put("C3", 1);
		} catch (Throwable e) {
			results.put("C3", 0);
		}

		// C4
		try {
			C4 c = new C4(23,55);
			assert c.getHour() == 23;
			assert c.getMinute() == 55;
			c.add();
			c.add();
			assert c.getHour() == 23;
			assert c.getMinute() == 57;
			c.add();
			c.add();
			c.add();
			c.add();
			c.add();
			c.add();
			assert c.getHour() == 0;
			assert c.getMinute() == 3;
			results.put("C4", 1);
		} catch (Throwable e) {
			results.put("C4", 0);
		}

		// C5
		try {
			assert C5.m("displays").equals("di+sp+la+ys");
			assert C5.m("ok").equals("ok");
			assert C5.m("f").equals("f");
			results.put("C5", 1);
		} catch (Throwable e) {
			results.put("C5", 0);
		}

		// C6
		try {
			C6 p = new C6();
			p.setName("disPLAY");
			assert p.getName().equals("Display");
			p.setGrade(4f);
			assert p.getGrade() == 4f;
			p.setGrade(6f);
			assert p.getGrade() == 4f;
			results.put("C6", 1);
		} catch (Throwable e) {
			results.put("C6", 0);
		}



		// Display test results
		System.out.println(results);
		try {
			FileWriter myWriter = new FileWriter("results.txt");
			myWriter.write(results.toString());
			myWriter.close();
		} catch (IOException e){}
		
	}
}



// Class templates

class C1 {
	public static int even(int[] array1){return 0;}
	public static int[] reverse(int[] array){int[] arr = {}; return arr;}
}

class C2 {
	public C2(int id){}
	public boolean ok(){return false;}
	public String toString(){return "";}
}

class C3 {
	public void increase(){}
	public void decrease(){}
	public void increase(int n){}
	public void decrease(int n){}
	public int value(){return 0;}
	public void cancel(){}
}

class C4 {
	public C4(int hour, int minute){}
	public void setHour(int hour){}
	public void setMinute(int minute){}
	public int getHour(){return 0;}
	public int getMinute(){return 0;}
	public void add(){}
}

class C5 {
	public static String m(String t){return "";}
}

class C6 {
	public void setName(String name){}
	public void setGrade(float grade){}
	public void setPassed(boolean passed){}
	public String getName(){return "";}
	public float getGrade(){return 0f;}
}
