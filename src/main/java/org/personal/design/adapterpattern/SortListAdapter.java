package org.personal.design.adapterpattern;

import java.util.ArrayList;
import java.util.List;

public class SortListAdapter implements Sorter {

	private List<Integer> listNumbers;
	private int[] arrayNumbers;
	private NumberSorter numberSorter;

	public int[] sort(int[] numbers) {
		numberSorter = new NumberSorter();
		return convertListToArray(numberSorter.sort(convertArrayToList(numbers)));
	}

	private List<Integer> convertArrayToList(int[] numbers) {
		listNumbers = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			listNumbers.add(numbers[i]);
		}
		return listNumbers;
	}

	private int[] convertListToArray(List<Integer> numbers) {
		arrayNumbers = new int[numbers.size()];
		for (int i = 0; i < numbers.size(); i++) {
			arrayNumbers[i] = numbers.get(i);
		}
		return arrayNumbers;
	}
}
