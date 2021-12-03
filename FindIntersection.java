package week2.day2.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,8};
		int[] arr2 = {1,2,8,4,9,7};
		System.out.println("The Intersection of Arr1 and Arr2: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		

	}

}
