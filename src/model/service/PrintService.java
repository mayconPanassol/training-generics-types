package model.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public T itemFirst() {

		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		} else {
			return list.get(0);
		}
	}

	public void print() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		} else {

			System.out.print("[");
			
			for (int i=0; i<list.size();i++) {

				System.out.print(list.get(i));
				
				if (!(1 + i == list.size())) {
					System.out.print(", ");
				}
				
			}
			
			
			
			System.out.println("]");

		}

	}

}
