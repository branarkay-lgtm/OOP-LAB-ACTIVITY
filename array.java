public class ArrayActivity {
    public static void main(String[] args) {

        // 💻 Activity 1: Declare and Initialize an Array
        int[] scores = {72, 85, 90, 78, 99, 92, 88, 75, 82, 74};

        // Find first, last, lowest, and highest elements
        int first = scores[0];
        int last = scores[scores.length - 1];
        int lowest = scores[0];
        int highest = scores[0];

        for (int score : scores) {
            if (score < lowest) lowest = score;
            if (score > highest) highest = score;
        }

        System.out.println("💻 Activity 1: First, Lowest, Highest, and Last Elements");
        System.out.println("First element: " + first);
        System.out.println("Lowest element: " + lowest);
        System.out.println("Highest element: " + highest);
        System.out.println("Last element: " + last);

        // 💻 Activity 2: Traverse the Array
        System.out.println("\n💻 Activity 2: Traverse the Array");

        // Using for loop with index
        System.out.println("Using for loop:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Index " + i + ": " + scores[i]);
        }

        // Using for-each loop
        System.out.println("\nUsing for-each loop:");
        for (int score : scores) {
            System.out.println(score);
        }

        // 💻 Activity 3: Calculate the Average
        System.out.println("\n💻 Activity 3: Calculate the Average");

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);
    }
}
