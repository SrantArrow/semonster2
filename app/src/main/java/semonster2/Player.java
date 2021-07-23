package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  private String name;
  private ArrayList<Monster> deck = new ArrayList<>();
  private LinkedList<Integer> randomNum;
  private static final int DeckSize = 5;

  Player(String playername, LinkedList<Integer> randomNum) {
    this.name = playername;
    this.randomNum = randomNum;
  }

  // ５枚ランダムにドロー
  public void drawMonsters() {
    for (int i = 0; i < DeckSize; i++) {
      this.deck.add(new Monster(this.randomNum.removeFirst(), this.randomNum.removeFirst()));
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:" + this.name + "\n");
    for (Monster m : this.deck) {
      sb.append(m);
    }
    return sb.toString();
  }

}
