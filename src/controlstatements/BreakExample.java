package controlstatements;

public abstract class BreakExample {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("___________________________");
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==6)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
