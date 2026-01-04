package arrays;

public class ArraysExample {

	public static void main(String[] args) {
			int[] marks = new int[5];  //initialized but not stored elements
			int[] marks1 = {80,90,95,100,45};
		
			
//			marks[0]=80;
//			marks[1]=90;
//			marks[2]=95;
//			marks[3]=70;
//			marks[4]=100;
			for(int i=0;i<marks.length;i++)
			{
				marks[i]=80+i;
			}
		
			
			//traversing an array
			for(int i=0;i<marks.length;i++)
			{
				System.out.println(marks[i]);
			}
			
			for(int i=0;i<marks1.length;i++)
			{
				System.out.println(marks1[i]);
			}
			
			//System.out.println(marks[4]);

			
			
			//int marks1[] = {1,2,3,4,5};
	}

}
