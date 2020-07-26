package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";

	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		System.out.println("efnekjna");
		int bob;
		int joe;

		for (int j = 0; j < array.length; j++) {
			display.updateDisplay();
			for (int i = j + 1; i < array.length; i++) {

				bob = array[j];
				joe = array[i];
				int transition;

				if (bob >= joe) {
					transition = array[j];
					array[j] = array[i];
					array[i] = transition;
				}

			}

		}

	}
}
