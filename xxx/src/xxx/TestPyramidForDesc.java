package xxx;

public class TestPyramidForDesc {

	public static void main(String[] args) {
		int[] arr={0,10,20,30,40,50,60};
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<=i;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}

	}

}
