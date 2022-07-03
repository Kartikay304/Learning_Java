package Assignment_02;

public class Q19 {
	
	static public boolean checkRotation(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		String s3 = s1+s1;
		if(s3.contains(s2))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		String str1 = "avajava";
		String str2 = "javaava";
		System.out.println("checking if a string is rotation of another");
		if(checkRotation(str1,str2)) 
			System.out.println("YES  "+str2 +"  is rotation of  "+str1);
		else
			System.out.println("NO  "+str2+"  is not rotation of  "+str1);
	}
}
