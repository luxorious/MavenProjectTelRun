package homeworks.SkillDesksHomeWork.homeWork2.src.task1;

import java.util.Arrays;

public class Player extends CardsDistribution{
    private String playerNumber;

    private String[] playersCard = new String[5];

    public Player() {
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String[] getPlayersCard() {
        return playersCard;
    }

    public void setPlayersCard(String[] playersCard) {
        this.playersCard = playersCard;
    }

    public void output(){
        for (int i = 0; i < playersCard.length; i++) {
            System.out.print(playersCard[i] + " ");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerNumber='" + playerNumber + '\'' +
                ", playersCard=" + Arrays.toString(playersCard) +
                '}';
    }
}
