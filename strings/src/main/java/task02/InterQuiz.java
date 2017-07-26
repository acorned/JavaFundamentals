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
            while (true) {
                boolean toExit = false;
                System.out.println("Please choose language (1 - English, 2 - Russian)");
                String inputString = br.readLine();
                Locale locale = new Locale(
                        inputString.equals("1") ? "en" :
                                inputString.equals("2") ? "ru" :
                                        "default");

                bundle = ResourceBundle.getBundle("data", locale);

                System.out.println(bundle.getObject("intro"));
                System.out.printf("%s\n%s\n%s\n",
                        bundle.getObject("question1"),
                        bundle.getObject("question2"),
                        bundle.getObject("question3"));
                inputString = br.readLine();
                switch (inputString) {
                    case "1":
                        System.out.println(bundle.getObject("answer1"));
                        break;
                    case "2":
                        System.out.println(bundle.getObject("answer2"));
                        break;
                    case "3":
                        System.out.println(bundle.getObject("answer3"));
                        break;
                    default:
                        System.out.println(bundle.getObject("wrong_number"));
                }
                System.out.println(bundle.getObject("continue"));
                inputString = br.readLine();
                switch (inputString) {
                    case "y":
                    case "д":
                        break;
                    case "n":
                    case "н":
                        toExit = true;
                        break;
                }
                if (toExit == true) break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        InterQuiz quiz = new InterQuiz();
        quiz.takeAQuiz();
    }
}
