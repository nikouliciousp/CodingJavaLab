package gr.aueb.cf.projects.wf3;

/**
 * "hello" -> "HeLlO"
 */
public class UpperLowerCaseApp {

    public static void main(String[] args) {
        String sentence = "Athanasios";
        StringBuilder sb = new StringBuilder();
        String s;
        String substring;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isUpperCase(sentence.charAt(i)) || (Character.isLowerCase(sentence.charAt(i)))) {
                substring = sentence.substring(i, i + 1);
                s = ((i % 2) == 0) ? substring.toUpperCase() : substring.toLowerCase();
                sb.append(s);
            }
        }

        System.out.println(sb);

        /*for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }*/
    }
}
