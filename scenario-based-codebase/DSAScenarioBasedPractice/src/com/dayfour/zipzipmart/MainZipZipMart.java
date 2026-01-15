/*3. ZipZipMart – Daily Sales Summary Report (Merge Sort)
Story: ZipZipMart compiles thousands of daily sales records from all branches. To generate
reports, the system sorts transactions by date and amount using Merge Sort, which ensures
stability and efficiency with large datasets.
Key Concepts:
● Divide and conquer
● Large-scale sorting
● Preserves order of equal items (stable)*/
package com.dayfour.zipzipmart;

public class MainZipZipMart{
    public static void main(String[] args) {

        Transaction[] sales = {
            new Transaction("2026-01-10", 500, "Bhopal"),
            new Transaction("2026-01-08", 1200, "Indore"),
            new Transaction("2026-01-10", 300, "Delhi"),
            new Transaction("2026-01-08", 1200, "Mumbai")
        };

        MergeSort.mergeSort(sales, 0, sales.length - 1);

        System.out.println("Sorted Daily Sales Report:");
        for (Transaction t : sales) {
            t.display();
        }
    }
}
