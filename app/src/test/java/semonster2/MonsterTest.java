/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void testsummonMonster() {
    Monster classUnderTest = new Monster();
    String monsters[] = { "マグマそうへい", "ヒサミツドラゴン", "スラリン", "デュラハン", "シーサーペント" };
    for(int i=0; i<5; i++){
      assertNotNull(monsters[i], classUnderTest.summonMonster(i));
    }
  }

}