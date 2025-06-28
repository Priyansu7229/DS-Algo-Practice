	class Insertionsort {
			
		public static void sorting(int[] arr, int n) {
			
			for(int i = 1; i < n; i++) {
				int key = arr[i];
				int j = i - 1;
				
				while(j >= 0 && key < arr[j]) {
						arr[j + 1] = arr[j];
						j = j - 1;
						
				}
				arr[j + 1] = key;
			}
			System.out.println("After Insertion Sort");
			printarray(arr, n);
		}
		
		public static void printarray(int[] arr, int n) {
			
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			
			int[] arr = {5,8,2,9,10,1};
			int n = arr.length;
			System.out.println("Before Insertion Sort");
			printarray(arr, n);
			sorting(arr, n);
		}
	}