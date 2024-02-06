# Introduction
The StudentGradeSorter program is a Java console application designed to sort students based on their marks in descending order. It allows the user to input the number of students, their names, and their corresponding marks. The program then sorts the students by their marks from highest to lowest and displays the sorted list. This application is an example of how to use arrays in combination with basic sorting algorithms to organize data.

# Features
- User Input for Data Collection: The program collects data directly from the user, including the number of students, each student's name, and their marks.
- Dynamic Data Handling: It dynamically handles data based on the number of students specified by the user, showcasing how to work with arrays of varying lengths.
- Sorting Mechanism: Implements a basic sorting algorithm (bubble sort) to sort the students based on their marks in descending order, demonstrating an understanding of - sorting algorithms and their application.
- Correlation of Data: Maintains the correlation between each student's name and their marks through the sorting process, ensuring that the output accurately reflects each student's performance.
# Components
- StudentGradeSorter class: This is the main class of the application. It includes the main method where the program's logic is implemented.
# How It Works
- Initialization: The program starts by asking the user to enter the number of students. This number is used to create arrays that will store the students' names and their marks.

- Data Collection: Through a loop, the program collects the name and marks for each student. It ensures that the newline character is consumed after reading an integer (the marks) to prevent input skipping issues.

- Sorting: After collecting all the data, the program uses a bubble sort algorithm to sort the students based on their marks in descending order. This is done by comparing adjacent elements and swapping them if they are in the wrong order. This process repeats until no swaps are needed, indicating that the array is sorted.

- Display Sorted List: Finally, the program displays the sorted list of students and their marks, with the highest marks first.

# Usage
To use the StudentGradeSorter, compile and run the StudentGradeSorter.java file. Follow the prompts to enter the number of students, and for each student, enter their name and marks when prompted. After all data has been entered, the program will display the list of students sorted by their marks in descending order.

# Conclusion
The StudentGradeSorter program is a practical example of applying basic sorting algorithms and array manipulation in Java. It demonstrates how to collect and process user input, sort data using a simple algorithm, and display the results. This application can serve as a foundational tool for understanding sorting mechanisms and managing correlated data in arrays.




