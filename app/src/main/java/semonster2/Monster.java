package semonster2;

import java.util.Map;
import java.util.HashMap;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare,5:ultimate rare

  Monster(int monstNum, int rareNum) {
    this.name = this.summonMonster(monstNum);
    if (this.name == "Blue Eyes OIT Dragon") {
      this.rare = 5;
    } else {
      this.rare = rareNum;
    }
    if (this.rare > 2) {
      this.name = this.evolutionMonster(this.name);
    }
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "マグマそうへい", "ヒサミツドラゴン", "スラリン", "デュラハン", "シーサーペント", "Blue Eyes OIT Dragon" };
    return monsters[mnumber];
  }

  String evolutionMonster(String monster) {
    Map<String, String> evo_table = new HashMap<>();
    evo_table.put("マグマそうへい", "マントルそうへい");
    evo_table.put("ヒサミツドラゴン", "グレイトヒサミツドラゴン");
    evo_table.put("スラリン", "プラチナスラリン");
    evo_table.put("デュラハン", "サー・バルドゥル");
    evo_table.put("シーサーペント", "ハリケーンドラゴン");
    evo_table.put("Blue Eyes OIT Dragon", "Blue Eyes OIT Dragon" );
    return evo_table.get(monster);
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
