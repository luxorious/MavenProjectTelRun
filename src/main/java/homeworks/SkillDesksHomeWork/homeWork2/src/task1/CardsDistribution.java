package homeworks.SkillDesksHomeWork.homeWork2.src.task1;

import java.util.*;

public class CardsDistribution {
    private int numberPlayers;
    final int NUMBER_OF_CARDS_PER_PLAYER = 5;
    private ArrayList<Player> listOfPlayers = new ArrayList<>();
    final String[] CARDS_DECK = {
            "6♣️", "6♦️", "6♠️", "6♥️",
            "7♣️", "7♦️", "7♠️", "7♥️",
            "8♣️", "8♦️", "8♠️", "8♥️",
            "9♣️", "9♦️", "9♠️", "9♥️",
            "10♣️", "10♦️", "10♠️", "10♥️",
            "J♣️", "J♦️", "J♠️", "J♥️",
            "Q♣️", "Q♦️", "Q♠️", "Q♥️",
            "K♣️", "K♦️", "K♠️", "K♥️",
            "A♣️", "A♦️", "A♠️", "A♥️",
    };
    private ArrayList<String> mixed = new ArrayList<>(Arrays.asList(CARDS_DECK));

    public CardsDistribution(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public CardsDistribution() {
    }
//    1. Напишите программу, которая должна имитировать раздачу карт для игры в покер.
//    Программа получает число n, задаваемое с консоли пользователем, и раздает карты
//    на n игроков (по 5 карт каждому) из рассортированной колоды.
//    Разделяйте пять карт, выданных каждому игроку, пустой строкой.

    public List<String> mixCards(){
        Collections.shuffle(this.mixed);
        return this.mixed;
    }

    public ArrayList<Player> distributing(){
        mixCards();
        for (int j = 0; j < numberPlayers; j++) {
            if (mixed.size() < 5){
                break;
            }

            String[] cardsForOnePerson = new String[NUMBER_OF_CARDS_PER_PLAYER];
            Player player = new Player();
            player.setPlayerNumber("player " + (j + 1));
            int l = 0;

            for (int i = 0; i <= NUMBER_OF_CARDS_PER_PLAYER; i++) {
                cardsForOnePerson[l] = this.mixed.get(0);
                this.mixed.remove(0);
                l+=1;
                if (i == 0){
                    ;
                } else if (l == 5){
                    break;
                }
            }
            player.setPlayersCard(cardsForOnePerson);
            listOfPlayers.add(player);
        }
        return listOfPlayers;
    }

    public List<String> getMixed() {
        return mixed;
    }
}