package Day1;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		//Pre increment - first increment then assign
		int a = 100;
		int b = ++a;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		
		//Post increment - first assign then increment 
		int c = 100;
		int d = c++;
		System.out.println("c= " + c);
		System.out.println("d= "+d);

	}

}
