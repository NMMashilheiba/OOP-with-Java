public class gBinarySearch {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[]{1, 2, 23, 12, 32, 54, 56, 45, 87, 13, 45, 69, 89, 77, 66};
		
		int l = 0;
		int r = arr.length - 1;
		
		int mid = (l + r) / 2;
		
		System.out.println(mid);
		System.out.println(arr[mid]);
		
		
		System.out.println(arr.length);
		
	}
}
