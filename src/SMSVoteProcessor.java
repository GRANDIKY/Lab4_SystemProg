import java.util.*;

public class SMSVoteProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество sms-сообщений
        int N = Integer.parseInt(scanner.nextLine());

        // Создаем словарь для хранения количества голосов для каждой пары
        Map<Integer, Integer> votes = new HashMap<>();

        // Обрабатываем каждое sms-сообщение
        for (int i = 0; i < N; i++) {
            // Считываем номер пары
            int pairNumber = Integer.parseInt(scanner.nextLine());

            // Увеличиваем количество голосов для данной пары
            votes.put(pairNumber, votes.getOrDefault(pairNumber, 0) + 1);
        }

        // Преобразуем словарь в список для сортировки
        List<Map.Entry<Integer, Integer>> sortedVotes = new ArrayList<>(votes.entrySet());

        // Сортируем список в порядке убывания количества голосов
        sortedVotes.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Выводим список призеров
        for (Map.Entry<Integer, Integer> entry : sortedVotes) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
