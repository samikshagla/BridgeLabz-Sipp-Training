public class LinearSearchWordInSentences {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "Java is a popular programming language.",
            "This is a test sentence.",
            "Welcome to BridgeLabz."
        };
        String word = "Java";
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence containing '" + word + "': " + result);
    }
}
