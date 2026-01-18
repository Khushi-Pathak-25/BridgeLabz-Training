import java.util.Scanner;

public class SortPeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (heights[j] < heights[j + 1]) {

                    // swap heights
                    int tempHeight = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempHeight;

                    // swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        int[] heights = new int[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        String[] sortedNames = sortPeople(names, heights);

        System.out.println("\nPeople sorted by height (descending):");
        for (String name : sortedNames) {
            System.out.println(name);
        }

        sc.close();
    }
}
