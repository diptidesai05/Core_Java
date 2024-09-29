
public class String_Example {

	public static void main(String[] args) {
		
		String str="Dipti";
		String str1="Dipti";
		String str2=new String("Dipti");
		String str3="dipti";
		
		/*
		 * if(str==str3) { System.out.println(" Equals ====???"); } if(str2==str3) {
		 * System.out.println(" Equals >>>>>>>"); } if(str.equals(str3)) {
		 * System.out.println(" Equals 11111"); } if(str2.equals(str3)) {
		 * System.out.println(" Equals 222222222"); }
		 * 
		 * if(str==str1) {
		 * 
		 * System.out.println(" Equals");
		 * 
		 * }else { System.out.println(" Not Equals"); } if(str.equals(str1)) {
		 * System.out.println(" Equals ===="); }
		 */
		
		if(str1==str2) {
			
			System.out.println(" Equals 888888");
			
		}else {
			System.out.println(" Not Equals 66666");
		}
		if(str1.equals(str2)) {
			System.out.println(" Equals ====33333");
		}
	}

}
