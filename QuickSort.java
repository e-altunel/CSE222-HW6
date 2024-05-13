public class QuickSort extends SortAlgorithm {

  public QuickSort(int input_array[]) { super(input_array); }

  private int partition(int low, int high) {
    int pivot = high--; // Choose the last element as the pivot because no
                        // matter what the pivot is we will have to swap it
                        // with the last element

    while (low < high) {
      // While the low index is less than or equal to the high index

      comparison_counter += 1; // Increment the comparison counter
      while (arr[low] < arr[pivot] && low < high) {
        // If the element at the low index is less
        // than the pivot
        comparison_counter += 1; // Increment the comparison counter
        low++;                   // Move to the next element
      }
      if (low >= high)
        break;

      comparison_counter += 1; // Increment the comparison counter
      while (arr[high] > arr[pivot] && low < high) {
        // If the element at the high index
        // is greater than the pivot
        comparison_counter += 1; // Increment the comparison counter
        high--;                  // Move to the previous element
      }
      if (low >= high)
        break;

      comparison_counter += 1; // Increment the comparison counter
      swap(low++, high--);     // Swap the elements and move to the next and
                               // previous elements
    }

    comparison_counter += 1; // Increment the comparison counter
    if (arr[low] > arr[pivot]) {
      swap(low, pivot); // Swap the pivot with the element at the low index
      return low;       // Return the low index
    }
    return pivot; // Return the pivot index
  }

  private void sort(int low, int high) {
    if (low < high) { // If the low index is less than the high index
      int pivot = partition(low, high); // Partition the array
      sort(low, pivot - 1);             // Recursively sort the left half
      sort(pivot + 1, high);            // Recursively sort the right half
    }
  }

  @Override
  public void sort() {
    sort(0, arr.length - 1); // Call the sort method
  }

  @Override
  public void print() {
    System.out.print("Quick Sort\t=>\t");
    super.print();
  }
}
