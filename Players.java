public class Players {
  Cards[] hand = new Cards[5];
  int blood;
  int turn;

  public Players (Cards[] hand, int blood, int turn) {
    this.hand = hand;
    this.blood = blood;
    this.turn = turn;
  }
}
