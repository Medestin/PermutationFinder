public class Main {

    public static void main(String[] args) {
        String one = "abba";
        String two = "babanbbaabbasdaswbaab";

        PermutationFinder permutationFinder = new PermutationFinder(one, two);
        permutationFinder.searchForPermutations();
    }
}
