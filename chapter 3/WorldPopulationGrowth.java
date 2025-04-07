public class WorldPopulationGrowth {
    public static void main(String[] args) {
        // Initial population and growth rate
        double currentPopulation = 8.200000000; 
        double growthRate = 0.0085; 

        System.out.printf("%-10s %-20s %-20s%n", "Year", "Population", "Increase");

        double doublePopulation = currentPopulation * 2; // Population to double
        int yearToDouble = -1; // To store the year when population doubles

        for (int year = 1; year <= 75; year++) {
            double increase = currentPopulation * growthRate; // Annual increase
            currentPopulation += increase; // Update population

            System.out.printf("%-10d %-20.2f %-20.2f%n", year, currentPopulation, increase);

            // Check if population has doubled
            if (yearToDouble == -1 && currentPopulation >= doublePopulation) {
                yearToDouble = year;
            }
        }

        if (yearToDouble != -1) {
            System.out.printf("%nThe population will double in year %d.%n", yearToDouble);
        } else {
            System.out.println("\nThe population will not double within 75 years.");
        }
    }
}
