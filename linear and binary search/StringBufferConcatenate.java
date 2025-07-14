public class StringBufferConcatenate {
    public static String concatenate(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " Welcome", " to", " Java."};
        String result = concatenate(words);
        System.out.println("Concatenated String: " + result);
    }
}
