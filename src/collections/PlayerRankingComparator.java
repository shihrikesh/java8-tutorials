package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerRankingComparator implements Comparator<Player> {


    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("rishi", 455, 21));
        playerList.add(new Player("ramu", 341, 23));
        playerList.add(new Player("shradha", 233, 20));

        System.out.println(" creating PlayerRankingComparator for ranking comparator for Player ");
        PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();
        Collections.sort(playerList, playerRankingComparator);
        playerList.forEach(System.out::println);

        System.out.println(" java 8 , Comparator.comparing class");
        playerList.stream().sorted(Comparator.comparing(Player::getAge)).forEach(System.out::println);
    }

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getRanking().compareTo(o2.getRanking());
    }
}
