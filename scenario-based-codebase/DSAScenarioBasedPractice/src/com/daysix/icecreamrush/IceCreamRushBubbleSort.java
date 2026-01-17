package com.daysix.icecreamrush;

public class IceCreamRushBubbleSort {

	public void bubbleSort(IceCreams[] iceCreamSale) {

		int n = iceCreamSale.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {

				if (iceCreamSale[j].sells > iceCreamSale[j + 1].sells) {
					// swap objects
					IceCreams temp = iceCreamSale[j];
					iceCreamSale[j] = iceCreamSale[j + 1];
					iceCreamSale[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}
	}

	// display method
	public void display(IceCreams[] iceCreamSale) {
		for (IceCreams ice : iceCreamSale) {
			System.out.println(ice.flavor + " -> " + ice.sells + " sales");
		}
	}
}
