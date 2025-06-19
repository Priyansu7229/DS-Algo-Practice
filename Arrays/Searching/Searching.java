class Searching {
	
	public static boolean binarysearch(int[] arr, int ls, int rs,int num) {
		
		int mid = 0;
		
		while(ls<=rs) {
			
			mid = ls + (rs-ls)/2;
			
			if(arr[mid] == num)
				return true;
			
			else if(arr[mid] < num) {
				
				ls = mid + 1;
				binarysearch(arr, ls, rs, num);
			}
			else {
				
				rs = mid - 1;
				binarysearch(arr, ls, rs, num);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,50,70,90};
		int num = 110;
		if(binarysearch(arr, 0, arr.length-1, num))
			System.out.println("The Searched Element is Found.");
		else
			System.out.println("The Searched Element is not Found.");
	}
}
			
			
			
