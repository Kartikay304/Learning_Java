package Assignment_02;

class Reverse{
	public void reverseWord(String str) {
		String[] Words = str.split(" ");
		String reversedString = " ";
		for( int i=0;i<Words.length;i++) {
			String Word = Words[i];
			String wordReverse = " ";
			for(int j = Word.length()-1;j>=0;j--) {
				wordReverse = wordReverse + Word.charAt(j);
				
			}
			reversedString = reversedString + wordReverse + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}
}
public class Q6 {

	public static void main(String[] args) {
		Reverse obj = new Reverse();
		obj.reverseWord("Today is a Sunny Day");
	}

}
