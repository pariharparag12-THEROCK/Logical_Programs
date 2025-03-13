package allLogicalPrograms;

public class SHUBHAM {

	public static void main(String[] args) {
		
		String s = "shubham"; 
		//System.out.println(s.length());
		char[] ch = s.toCharArray();
		reverse(ch,4,s.length()-1);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		

	}
	public static void reverse(char[] ch,int start,int end) {
		while(start<=end) {
			char temp = ch[end];
			ch[end] = ch[start];
			ch[start] = temp;
			start++;
			end--;
		}
	}

}
