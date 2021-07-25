package semonster2;

public class Battle {
  public Player player1;
  public Player player2;

  Battle(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public void battlefield() {
    int player1Point = 0;
    int player2Point = 0;
    System.out.println("Welcome to battlefield!!\n");
    System.out.println(player1.name + " VS " + player2.name + "\n");
    System.out.println("Duel stand-by!!\n");
    for (int i = 0; i < player1.deck.size(); i++) {
      Monster player1Monster = player1.deck.get(i);
      Monster player2Monster = player2.deck.get(i);

      System.out.println(player1Monster.name + " VS " + player2Monster.name + "\n");

      if (player1Monster.rare > player2Monster.rare) {
        player1Point++;
        System.out.println(player1.name + "'s " + player1Monster.name + " Win!!\n");
      } else if (player1Monster.rare < player2Monster.rare) {
        player2Point++;
        System.out.println(player2.name + "'s " + player2Monster.name + " Win!!\n");
      } else {
        System.out.println("Draw\n");
      }
    }
    if (player1Point > player2Point) {
      System.out.println(player1.name + "Win!!\n");
    } else if (player1Point < player2Point) {
      System.out.println(player2.name + "Win!!\n");
    } else {
      System.out.println("Draw...\n");
    }
  }
}
