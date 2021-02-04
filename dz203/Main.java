package lesson203.dz203;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"word01", "word02", "word03", "word04", "word05", "word06", "word07", "word02", "word01", "word03", "word10", "word09"};
        HashMap<String, Integer> hmWords = new HashMap<>();
        for(String word: words){
            Integer result = hmWords.get(word);
            hmWords.put(word, result == null ? 1 : result + 1);
        }
        System.out.println(hmWords);

        System.out.println();

        PhoneBook pBook = new PhoneBook();
        pBook.addContact("Иванов", "+375295847632");
        pBook.addContact("Сидоров", "+375445698421");
        pBook.addContact("Вечнов", "+375336589421");
        pBook.addContact("Хохлов", "+375258569471");
        pBook.addContact("Иванов", "+375445269874");

        pBook.findContact("Иванов");
        pBook.findContact("Хохлов");
    }
}
