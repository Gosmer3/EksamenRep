package ArrayList.Opgave3;

import java.util.ArrayList;

public class TeamApp {
    public static void main(String[] args) {
        ArrayList<Player> playerList = new ArrayList<>();
        Player p1 = new Player("Hans", 19, 10);
        Player p2 = new Player("Ib", 21, 15);
        Player p3 = new Player("Bo", 29, 13);
        Player p4 = new Player("Bent", 25, 22);
        Team t1 = new Team("AGF2", playerList);
        p1.addScore(10);
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        playerList.add(p4);

        t1.printPlayers();
        System.out.println(t1.calcAverageAge());
        System.out.println(t1.calcTotalScore());
        System.out.println(t1.calcOldPlayerScore());
        System.out.println(t1.maxScore());
        System.out.println(t1.bestPlayer());

    }
}
