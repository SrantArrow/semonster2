/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;
import java.util.Random;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void testsummonMonster() {
    Monster testMonster = new Monster(0, 0);
    assertEquals("マグマそうへい:レア度[0]\n", testMonster.toString());
  }

}
