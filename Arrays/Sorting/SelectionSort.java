class SelectionSort {
	public static void sorting(int[] arr, int n) {
		
		int min=0;

		for(int i=0; i<n-1; i++) {

			min = i;

			for(int j=i+1; j<n; j++) {

				if(arr[j] < arr[min])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		System.out.println("After Selection Sort");
		printarray(arr);
	}

	public static void printarray(int[] arr) {
		
			for(int i: arr)
				System.out.print(i+" ");
			System.out.println();
	}

	public static void main(String args[]) {
	
		int[] arr = {24,756,123,856,423,42,534645,4,523675,1,26};
		int n = arr.length;
		System.out.println("Before Selection Sort");
		printarray(arr);
		sorting(arr,n);
	}
}
			