import java.util.*;

public class SMSVoteProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        Map<Integer, Integer> votes = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int pairNumber = Integer.parseInt(scanner.nextLine());
            votes.put(pairNumber, votes.getOrDefault(pairNumber, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedVotes = new ArrayList<>(votes.entrySet());
        sortedVotes.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<Integer, Integer> entry : sortedVotes) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
