public class SelectionSort extends SortAlgorithm {

  public SelectionSort(int input_array[]) { super(input_array); }

  @Override
  public void sort() {
    int current_min = 0; // Index of the current minimum element

    for (int i = 0; i < arr.length - 1; i++) { // Iterate through the array
      current_min = i; // Set the current minimum to the current index

      for (int j = i + 1; j < arr.length;
           j++) { // Iterate through the array from the next index
        comparison_counter += 1;         // Increment the comparison counter
        if (arr[j] < arr[current_min]) { // Make the comparison
          current_min = j;               // Update the current minimum
        }
      }

      swap(i, current_min); // Swap the elements
    }
  }

  @Override
  public void print() {
    System.out.print("Selection Sort\t=>\t");
    super.print();
  }
}
