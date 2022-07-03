package Assignment_02;
import java.util.*;
public class Q7 {
	
	static String removeDuplicate(char str[],int n) {
		int index =0,j,i;
		for( i=0;i<n;i++) {
			for ( j=0;j<n;j++) {
				if(str[i]==str[j])
					break;
			}
			if(j==i)
				str[index++]=str[i];
		}
		return String.valueOf(Arrays.copyOf(str,index));
	}
	public static void main(String[] args) {
		
		char str []= "abbccddbf".toCharArray();
		int n =  str.length;
		System.out.println(removeDuplicate(str,n));
	}
}
