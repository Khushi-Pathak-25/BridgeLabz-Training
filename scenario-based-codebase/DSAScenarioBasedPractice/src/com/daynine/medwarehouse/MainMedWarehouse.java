/*10. MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory*/

package com.daynine.medwarehouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMedWarehouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Medicine> medicines = new ArrayList<>();

        System.out.print("Enter number of medicines: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Enter medicine name: ");
            String name = sc.nextLine();

            System.out.print("Enter expiry date (YYYY-MM-DD): ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            medicines.add(new Medicine(name, date));
        }

        List<Medicine> sortedList = MedWarehouseMergeSort.mergeSort(medicines);

        System.out.println("\nMedicines Sorted by Expiry Date:");
        for (Medicine m : sortedList) {
            System.out.println(m);
        }

        System.out.println("\nNear Expiry Medicines (within 30 days):");
        LocalDate today = LocalDate.now();

        for (Medicine m : sortedList) {
            if (!m.expiryDate.isAfter(today.plusDays(30))) {
                System.out.println(m);
            }
        }

        sc.close();
    }
}
