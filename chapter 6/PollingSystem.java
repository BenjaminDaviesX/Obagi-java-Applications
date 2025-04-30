import java.util.Scanner;

public class PollingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1 Define topics
        String[] topics = {"Climate Change", "Healthcare", "Education", "Poverty", "Technology Ethics"};
        int[][] responses = new int[5][10]; 
        int numRespondents;

        // Step 2 Ask users how many people will rate
        System.out.print("Enter the number of respondents: ");
        numRespondents = scanner.nextInt();

        // Step3 Collect ratings
        for (int person = 0; person < numRespondents; person++) {
            System.out.println("\nRespondent #" + (person + 1) + ":");
            for (int i = 0; i < topics.length; i++) {
                System.out.print("Rate " + topics[i] + " (1-10): ");
                int rating = scanner.nextInt();
                
                if (rating >= 1 && rating <= 10) {
                    responses[i][rating - 1]++; 
                } else {
                    System.out.println("Invalid rating! Must be between 1 and 10.");
                    i--; 
                }
            }
        }

        // Step 4 Display results
        System.out.println("\nSurvey Results:");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.print("Topic         | ");
        for (int i = 1; i <= 10; i++) System.out.print(i + "  ");
        System.out.println("| Avg Score");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        int highestTotal = 0, lowestTotal = Integer.MAX_VALUE;
        String highestTopic = "", lowestTopic = "";

        for (int i = 0; i < topics.length; i++) {
            int totalPoints = 0;
            int totalResponses = 0;
            System.out.printf("%-14s| ", topics[i]);
            for (int j = 0; j < 10; j++) {
                System.out.print(responses[i][j] + "  ");
                totalPoints += responses[i][j] * (j + 1);
                totalResponses += responses[i][j];
            }
            double average = totalResponses == 0 ? 0 : (double) totalPoints / totalResponses;
            System.out.printf("| %.2f\n", average);

            if (totalPoints > highestTotal) {
                highestTotal = totalPoints;
                highestTopic = topics[i];
            }
            if (totalPoints < lowestTotal) {
                lowestTotal = totalPoints;
                lowestTopic = topics[i];
            }
        }

        // Step 5 Show highest and lowest rated topics
        System.out.println("\nHighest Rated Topic: " + highestTopic + " (" + highestTotal + " points)");
        System.out.println("Lowest Rated Topic: " + lowestTopic + " (" + lowestTotal + " points)");
    }
}
