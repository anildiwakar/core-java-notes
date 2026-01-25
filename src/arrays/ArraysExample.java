package arrays;

public class ArraysExample {

	public static void main(String[] args) {
		int arr[]; // declaration - otherway is int[] arr
		arr=new int[5]; // initialization
		//int arr[]=new int[5] - combining declaration and initialization
		//int arr[]={5,15,25,35,45};
		arr[0]=5;
		arr[1]=15;
		arr[2]=25;
		arr[3]=35;
		arr[4]=45;
		//traversing an array
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.println(arr[i]);
      }

}
}
