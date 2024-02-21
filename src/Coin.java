import java.util.Arrays;

public class Coin {


    String player1_coins[];
    String player2_coins[];
    String player3_coins[];
    String player4_coins[];

    public Coin() {
        this.player1_coins = player1_coins;
        this.player2_coins = player2_coins;
        this.player3_coins = player3_coins;
        this.player4_coins = player4_coins;
    }
     void coin1(){
         for(int i =0; i<=3; i++){
             player1_coins= new String[]{("0" + i)};

         }
         System.out.printf(Arrays.toString(player1_coins));
     }
     void coin2(){
         for(int i =0; i<=3; i++){
             player2_coins = new String[]{("G" + i)};
         }
     }
    void coin3(){
        for(int i =0; i<=3; i++){
            player3_coins = new String[]{("Y" + i)};
        }
    }
    void coin4(){
        for(int i =0; i<=3; i++){
            player4_coins = new String[]{("V" + i)};
        }
    }
}
