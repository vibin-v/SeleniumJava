package Day1;

public class DemoForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int a=1;a<=10;a++)
		{
			System.out.println(a);
			if(a==5)
			{
				System.out.println("found 5");
				break;
			}
		
		}
		System.out.println("exited");
	}

}
