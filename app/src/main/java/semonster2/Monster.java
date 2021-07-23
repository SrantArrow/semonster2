package semonster2;

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
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "マグマそうへい", "ヒサミツドラゴン", "スラリン", "デュラハン", "シーサーペント", "Blue Eyes OIT Dragon" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
