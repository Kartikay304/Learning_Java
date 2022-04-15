package unit_01;

/*
 * The wrapper class in java provides the mechanism to convert primitive data types into object and why?
 * Because we want to use predefined methods of those objects
 * - boolean data types ->Boolean obj; ->obj.toString();
 *     PRIMITIVE DATA Type        Wrapper Class
 *          char                    Character
 *          byte                    Byte
 *          short                   Short
 *          int                     Integer
 *          long                    Long
 *          float                   Float
 *          double                  Double
 *          boolean                 Boolean
 */

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		// Converting string into Integer
		int a=20;
//		String s = "" + a + "";
		Integer i=Integer.valueOf(a); // converting int into integer explicitly
        Integer j=a; // autoboxing, now compiler will write Integer.valueOf(a) internally
        
        System.out.println(a + " " + i + " " + j);
        
        System.out.println(i.toString());
        
        //a.toString() can not be done due to a is int not object
        
        //Autoboxing: Converting primitives into objects
        byte b=10;
        Byte byteobj=b;
        
        System.out.println(byteobj);
        
        //Unboxing: Converting objects to Primitives
        byte byteValue=byteobj;
        System.out.println(byteValue);
	}
}
