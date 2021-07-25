package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  public String name;
  public ArrayList<Monster> deck = new ArrayList<>();
  private LinkedList<Integer> MonsRandNum; // モンスター用LinkedList
  private LinkedList<Integer> RareRandNum; // レア度用LinkedList
  private static final int DeckSize = 5; // デッキ枚数

  Player(String playername, LinkedList<Integer> mRandNum, LinkedList<Integer> rRandNum) {
    this.name = playername;
    this.MonsRandNum = mRandNum;
    this.RareRandNum = rRandNum;
  }

  // ５枚ランダムにドロー
  public void drawMonsters() {
    for (int i = 0; i < DeckSize; i++) {
      this.deck.add( new Monster(this.MonsRandNum.pop(), this.RareRandNum.pop()));
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
