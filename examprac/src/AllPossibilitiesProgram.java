public class AllPossibilitiesProgram {

    public static int isAllPossibilities(int[] a) {
        int isAllPossibilities = 1; // Corrected variable name

        if (a.length == 0) isAllPossibilities = 0;

        for (int i = 0; i < a.length && isAllPossibilities == 1; i++) {
            int index = -1;
            for (int j = 0; j < a.length && index == -1; j++) {
                if (i == a[j]) index = j;
            }

            if (index == -1)
                isAllPossibilities = 0;
        }

        return isAllPossibilities;
    }

    public static void main(String[] args) {
        // Example usage
        int[] possibilitiesArray = {1, 2, 0, 3};
        int[] notPossibilitiesArray = {1, 2, 2, 3};

        System.out.println("Is all possibilities: " + isAllPossibilities(possibilitiesArray)); // Output: 1 (true)
        System.out.println("Is all possibilities: " + isAllPossibilities(notPossibilitiesArray)); // Output: 0 (false)
    }
}
