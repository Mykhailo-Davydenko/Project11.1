import java.util.ArrayList;

public class StringListUtils {

    private ArrayList<String> sentences = new ArrayList<>();

    public void addSentence(String sentence) {
        sentences.add(sentence);
    }

    public void printSentences() {
        System.out.println("Sentences: " + sentences);
    }

    public int countWords() {
        int total = 0;
        for (String sentence : sentences) {

            String trimmed = sentence.trim();
            if (trimmed.isEmpty()) {
                continue;
            }
            total += trimmed.split("\\s+").length;
        }

            return total;
        }


    public ArrayList<String> findLongestWords() {
        ArrayList<String> longest = new ArrayList<>();
        int maxLength = 0;

        for (String sentence : sentences) {
            String trimmed = sentence.trim();
            if (trimmed.isEmpty()) {
                continue;
            }
            for (String word : trimmed.split("\\s+")) {
                if (word.length() > maxLength) {
                    longest.clear();
                    longest.add(word);
                    maxLength = word.length();
                } else if (word.length() == maxLength && !longest.contains(word)) {
                    longest.add(word);
                }
            }
        }
        return longest;
    }

    public void removeShortWords(int minLength) {
        for (int i = 0; i < sentences.size(); i++) {
            String trimmed = sentences.get(i).trim();
            if (trimmed.isEmpty()) {
                continue;
            }
            StringBuilder result = new StringBuilder();
            for (String word : trimmed.split(" ")) {
                if (word.length() >= minLength) {
                    result.append(word).append(" ");
                }
            }
            sentences.set(i, result.toString().trim());
        }
    }
}