package sort;

public class Quicksort {
	private int[] numbers;
	private int number;
	
	public int[] sort(int[] values) {
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
		return numbers;
	}
	
	
	private void quicksort(int low, int high) {
		int i = low, j = high;

		// Get element from middle of array to use as pivot
		int pivot = numbers[(low + high) / 2];
		
		// Divide array into two lists
		while(i <= j) {
			// If a number from the left list is lower than the pivot, increment to next element
			while(numbers[i] < pivot) {
				i ++;
			}
			
			// If a number from the right list is higher than the pivot, decrement to the next element
			while(numbers[j] > pivot) {
				j --;
			}
		
			// If a number from the left list is higher than one from the right list, swap them
			if(i <= j) {
				exchange(i, j);
				i ++;
				j --;
			}
		}
		
		// If low is still less than j, carry on sorting
		if(low < j){
			quicksort(low, j);
		}
		
		// If high is creater than i, carry on sorting
		if(i < high) {
			quicksort(i, high);
		}
	}
	
	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	
	public void printArray(int[] arr) {
		String comma = "";
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(comma + arr[i]);
			comma = ", ";
		}
		System.out.println("\n");
	}

}
