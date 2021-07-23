package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class PlayerTest {
  final static Random random = new Random();
  final static int maxRandomMonsterNum = 5;
  final static int maxRandomRareNum = 5;

  @Test

  public void testdrawMonsters() {
    int DeckSize = 5; // デッキ枚数
    ArrayList<Monster> testdeck = new ArrayList<>(); // テスト用デッキ
    // LinkListへの数値の代入は適宜変更すること

    LinkedList<Integer> testNumList1 = createRandomList(10, maxRandomMonsterNum);
    LinkedList<Integer> testNumList2 = createRandomList(10, maxRandomRareNum);

    Player testPlayer = new Player("tester", testNumList1, testNumList2);
    testPlayer.drawMonsters();

    for (int i = 0; i < DeckSize; i++) {
      testdeck.add(i, new Monster(testNumList1.get(i), testNumList2.get(i)));
    }

    for (int i = 0; i < DeckSize; i++) {
      assertEquals(testdeck.get(i), testPlayer.deck.get(i));
    }

  }

  public static LinkedList<Integer> createRandomList(int count, int MaxRandomNum) {
    LinkedList<Integer> randNumList = new LinkedList<>();
    for (int i = 0; i < count; i++) {
      randNumList.add(random .nextInt(MaxRandomNum + 1));
    }

    return randNumList;
  }

}
