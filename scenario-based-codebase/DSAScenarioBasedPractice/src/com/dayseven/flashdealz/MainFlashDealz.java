/*4. FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization*/

package com.dayseven.flashdealz;

import java.util.Scanner;

public class MainFlashDealz {
	
	public static void main(String[]args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("\n====== Welcome to FlashDealz – Product Sorting by Discount ======");
		System.out.print("Enter total product: ");
		int totalProduct = input.nextInt();
		
		double discountOnProducts []= new double[totalProduct];
		
		System.out.print("Enter discounts on products: ");
		for(int i = 0 ;i<totalProduct; i++) {
			discountOnProducts[i] = input.nextDouble();
		}	
		
		FlashDealzQuickSort.quickSort(discountOnProducts, 0, totalProduct-1);
		FlashDealzQuickSort.display(discountOnProducts);
		
	}

}
