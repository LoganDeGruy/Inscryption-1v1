public class Main {
  public static void main(String[] args) {
    Cards dog = new Cards("dog",1,2,3);
    Cards dog2 = dog;
    Cards dog3 = dog;

    Cards[] hand = {dog,dog2,dog3);
    
    Players p1 = new Players (hand,1,2);
    System.out.println(p1.hand[0].name);
  }
}
