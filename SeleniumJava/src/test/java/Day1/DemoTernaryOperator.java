package Day1;

public class DemoTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 10;
		 int max = (a>b) ? a : b ;
		 System.out.println(max);
		 
		 String sname = "jobin";
		 String accessPermission = sname.equalsIgnoreCase("jobin") ? "Granted" : "No permission";
		 System.out.println(accessPermission);

	}

}
