import java.util.Scanner;

class ElementFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = scanner.nextLine();

        countElementFrequency(input);

        scanner.close();
    }

    public static void countElementFrequency(String input) {
        String[] elements = input.split(" ");
        int[] frequency = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            if (frequency[i] == -1) {
                continue;  // Skip already counted elements
            }

            int count = 1;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i].equals(elements[j])) {
                    count++;
                    frequency[j] = -1;  // Mark counted elements as -1
                }
            }

            System.out.println(elements[i] + " -> " + count);
        }
    }
}
