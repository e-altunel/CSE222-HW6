public class BubbleSort extends SortAlgorithm {

  public BubbleSort(int input_array[]) { super(input_array); }

  @Override
  public void sort() {
    int last_swap = arr.length - 1; // Upper bound of the array
    int first_swap = 0;             // Lower bound of the array

    while (
        last_swap >
        first_swap) { // While the upper bound is greater than the lower bound
      int last_swap_temp = 0;   // Temporary variable to store the last swap
      int first_swap_temp = -1; // Temporary variable to store the first swap

      for (int j = first_swap; j < last_swap;
           j++) { // Iterate through the array from the lower bound to the upper
                  // bound

        comparison_counter += 1;       // Increment the comparison counter
        if (arr[j] > arr[j + 1]) {     // Make the comparison
          last_swap_temp = j;          // Update the last swap
          if (first_swap_temp == -1) { // Update the first swap if it is not
                                       // already updated
            first_swap_temp = j - 1;
          }

          swap(j, j + 1); // Swap the elements
        }
      }
      last_swap = last_swap_temp; // Update the upper bound
      first_swap =
          first_swap_temp < 0 ? 0 : first_swap_temp; // Update the lower bound
    }
  }

  @Override
  public void print() {
    System.out.print("Bubble Sort\t=>\t");
    super.print();
  }
}
