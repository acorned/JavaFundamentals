package task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class InterQuiz {
    private static ResourceBundle bundle;

    private void takeAQuiz(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please choose language (1 - English, 2 - Russian)");
            String lang = br.readLine();
            Locale locale = new Locale(
                    lang.equals("1") ? "en" :
                            lang.equals("2") ? "ru" :
                                    "default");
            System.out.println(locale);
            bundle = ResourceBundle.getBundle("data", locale);
            System.out.println(bundle.getObject("intro"));
            System.out.printf("%s\n%s\n%s\n",
                    bundle.getObject("question1"),
                    bundle.getObject("question2"),
                    bundle.getObject("question3"));

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        InterQuiz quiz = new InterQuiz();
        quiz.takeAQuiz();
    }
}
