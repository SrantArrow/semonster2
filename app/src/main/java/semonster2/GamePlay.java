package semonster2;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Random;

public class GamePlay {
  HashMap<String, Player> playerMap = new HashMap<>();
  public int maxRandomMonsterNum;
  public int maxRandomRareNum;
  final static Random random = new Random();


  GamePlay(int maxRandMonst, int maxRandRare){
    this.maxRandomMonsterNum = maxRandMonst;
    this.maxRandomRareNum = maxRandRare;
  }

  void addPlayer(String playerName){
    this.playerMap.put(playerName, new Player(playerName, this.createRandomList(10, this.maxRandomMonsterNum), this.createRandomList(10, maxRandomRareNum)));
  }

  void drawCard(String playerName){
    Player player = this.playerMap.get(playerName);
    player.drawMonsters();
    System.out.println(player.toString());
  }

  void battleStart(String player1, String player2){
    this.addPlayer(player1);
    this.drawCard(player1);
    this.addPlayer(player2);
    this.drawCard(player2);

    Player playerA = this.playerMap.get(player1);
    Player playerB = this.playerMap.get(player2);

    Battle battleOIT = new Battle(playerA, playerB);
    battleOIT.battlefield();
  }

  public static LinkedList<Integer> createRandomList(int count, int MaxRandomNum) {
    LinkedList<Integer> randNumList = new LinkedList<>();
    for (int i = 0; i < count; i++) {
      randNumList.add(random.nextInt(MaxRandomNum + 1));
    }

    return randNumList;
  }

}
