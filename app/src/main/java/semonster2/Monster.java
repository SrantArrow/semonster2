package semonster2;
import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster(int monstNum, int rareNum) {
    this.name = this.summonMonster(monstNum);
    this.rare = rareNum;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "マグマそうへい", "ヒサミツドラゴン", "スラリン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
