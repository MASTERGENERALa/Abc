package ABC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        // Введення слів з клавіатури
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Введіть слово: ");
                String word = reader.readLine();
                words.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String> doubledWords = doubleValues(words);

        // Виведення результату на екран
        for (String word : doubledWords) {
            System.out.println(word);
        }
    }

    public static List<String> doubleValues(List<String> words) {
        List<String> doubledWords = new ArrayList<>();

        // Підвоєння слів за принципом a, b, c -> a, a, b, b, c, c
        for (String word : words) {
            doubledWords.add(word);
            doubledWords.add(word);
        }

        return doubledWords;
    }
}
