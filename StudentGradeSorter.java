import java.util.Scanner;

public class StudentGradeSorter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            // Create arrays to store student names and their corresponding marks
            String[] studentNames = new String[numStudents];
            int[] studentMarks = new int[numStudents];

            // Input student names and marks
            for (int i = 0; i < numStudents; i++) {
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter the name of student " + (i + 1) + ": ");
                studentNames[i] = scanner.nextLine();
                System.out.print("Enter the mark of student " + (i + 1) + ": ");
                studentMarks[i] = scanner.nextInt();
            }

            // Sort students based on marks using a sorting algorithm (e.g., bubble sort)
            boolean swapped;
            do {
                swapped = false;
                for (int i = 0; i < numStudents - 1; i++) {
                    if (studentMarks[i] < studentMarks[i + 1]) {
                        // Swap marks
                        int tempMark = studentMarks[i];
                        studentMarks[i] = studentMarks[i + 1];
                        studentMarks[i + 1] = tempMark;

                        // Swap names to maintain corresponding order
                        String tempName = studentNames[i];
                        studentNames[i] = studentNames[i + 1];
                        studentNames[i + 1] = tempName;

                        swapped = true;
                    }
                }
            } while (swapped);

            // Display the sorted list of students and marks
            System.out.println("\nStudents sorted by marks (highest to lowest):");
            for (int i = 0; i < numStudents; i++) {
                System.out.println(studentNames[i] + ": " + studentMarks[i]);
            }
        }
    }
}
