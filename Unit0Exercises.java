public class Unit0Exercises {
    public static void main(String[] args) {
        System.out.println("--- Variable Snapshot ---");

        // TODO: Declare and initialize score, price, and isPassing.
        int score = 85;
        double price = 19.99;
        boolean isPassing = true;
        final double TAX_RATE = 0.0925;
        char letter = 'A';
        long population = 8000000000L;

        System.out.println("Name\tInitial Value");
        System.out.println("Score: " + score);
        System.out.println("Price: " + price);
        System.out.println("Boolean: " + isPassing);
        System.out.println("Letter: " + letter);
        System.out.println("Population: " + population);
        System.out.println("Tax Rate: " + TAX_RATE);

        // TODO: Print the original values using the required labels.

        System.out.println("--- After Updates ---");

        // TODO: Reassign score, price, and isPassing to their updated values.

        score += 5;
        price += 2.50;
        isPassing = false;
        letter = 'A';
        population = 8000000000L;

        // TODO: Print the updated values using the required labels.

        System.out.println("\nName\tInitial Value");
        System.out.println("Score: " + score);
        System.out.println("Price: " + price);
        System.out.println("Is Passing: " + isPassing);
        System.out.println("Letter: " + letter);
        System.out.println("Population: " + population);
        System.out.println("Tax Rate: " + TAX_RATE);
    }
}
