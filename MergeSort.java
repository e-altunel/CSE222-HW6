public class MergeSort extends SortAlgorithm {

  public MergeSort(int input_array[]) { super(input_array); }

  private void merge(int low, int mid, int high) {
    // Due to i don't know how to implement the merge sort algorithm without
    // using the temp_array, i will not count the swap counter

    int temp_array[] = new int[high - low + 1]; // Create a temporary array

    int i = low;     // Index for the left half
    int j = mid + 1; // Index for the right half

    while (i <= mid && j <= high) { // While both halves have elements
      comparison_counter += 1;      // Increment the comparison counter
      if (arr[i] < arr[j]) {        // Compare the elements
        temp_array[i + j - low - mid - 1] = arr[i]; // Copy the left element
        i++; // Move to the next element in the left half
      } else {
        temp_array[i + j - low - mid - 1] = arr[j]; // Copy the right element
        j++; // Move to the next element in the right half
      }
    }

    // These two loops never work at every function call so it is not necessary
    // to count them
    while (i <= mid) { // Copy the remaining elements from the left half
      temp_array[i + j - low - mid - 1] = arr[i];
      i++;
    }
    while (j <= high) { // Copy the remaining elements from the right half
      temp_array[i + j - low - mid - 1] = arr[j];
      j++;
    }

    for (int k = low; k <= high;
         k++) { // Copy the sorted elements back to the original array
      arr[k] = temp_array[k - low];
    }
  }

  private void sort(int low, int high) {
    if (low < high) { // If the low index is less than the high index
      int mid = (low + high) / 2; // Calculate the middle index
      sort(low, mid);             // Recursively sort the left half
      sort(mid + 1, high);        // Recursively sort the right half
      merge(low, mid, high);      // Merge the two halves
    }
  }

  @Override
  public void sort() {
    sort(0, arr.length - 1); // Call the sort method
  }

  @Override
  public void print() {
    System.out.print("Merge Sort\t=>\t");
    super.print();
  }
}
