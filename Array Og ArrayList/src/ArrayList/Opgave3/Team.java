package ArrayList.Opgave3;

import java.util.ArrayList;

public class Team {

    private String name;
    ArrayList<Player> playerList = new ArrayList<>();

    public Team(String name, ArrayList<Player> playerList) {
        this.name = name;
        this.playerList = playerList;
    }

    public String getName() {
        return name;
    }
    public void addPlayer(Player player){
    playerList.add(player);
    }
    public void printPlayers(){
        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(playerList.get(i));
        }
    }
    public double calcAverageAge(){
        double sum = 0;
        for (int i = 0; i < playerList.size(); i++) {
            sum += playerList.get(i).getAge();
        }
        return sum/playerList.size();
    }
    public int calcTotalScore(){
        int sum = 0;
        for (int i = 0; i < playerList.size(); i++) {
            sum += playerList.get(i).getScore();

        }
        return sum;
    }
    public int calcOldPlayerScore(){
        int sum = 0;
        for (int i = 0; i < playerList.size(); i++) {
            if(playerList.get(i).getAge() > 24){
                sum += playerList.get(i).getScore();
            }
        }
        return sum;
    }
    public int maxScore(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < playerList.size(); i++) {
            if(playerList.get(i).getScore() > max){
                max = playerList.get(i).getScore();
            }
        }
        return max;
    }
    public String bestPlayer(){
        int max = Integer.MIN_VALUE;
        String navn = null;
        for (int i = 0; i < playerList.size(); i++) {
            if(playerList.get(i).getScore() > max){
                max = playerList.get(i).getScore();
                navn = playerList.get(i).getName();
            }
        }
        return navn;
    }
}
