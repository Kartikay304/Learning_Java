package Assignment_02;

public class Q18 {
	
	static public void substring(String str ,int n) {
		int i,j,k;
		for(i=0;i<n;i++) {
			for(j=i;j<=n;j++) {
				for(k = i;k<j;k++) {
					System.out.print(str.charAt(k)+ " ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		String str= "abcd";
		int n= str.length();
		substring(str,n);
	}
}
