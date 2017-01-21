package org.personal.design.adapterpattern;

public class Client implements Sorter {
	 
	 private SortListAdapter adapter;
	 
	 public int[] sort(int[] numbers) {
	 adapter = new SortListAdapter();
	 return adapter.sort(numbers);
	 }

}
