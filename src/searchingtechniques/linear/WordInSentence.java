package searchingtechniques.linear;

public class WordInSentence {

    public static void main(String[] args) {
        String[] sentences = {
                "The sun is bright today",
                "It might rain tomorrow",
                "Always stay positive",
                "Search for knowledge every day"
        };

        String word = "positive";

        String result = findSentenceWithWord(sentences, word);
        System.out.println("Result: " + result);
    }

    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence; // Return the first matching sentence
            }
        }
        return "Not Found"; // If no match found
    }


}
