public class LettersList {
    public static String[] getLettersList(String word) {
        String[] lettersList = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            // Extract each letter as a substring and add it to the list
            lettersList[i] = word.substring(i, i + 1);
        }

        return lettersList;
    }

    public static void main(String[] args) {
        String inputWord = "Hello";
        String[] lettersArray = getLettersList(inputWord);

        for (String letter : lettersArray) {
            System.out.print(letter + " ");
        }
    }
}
