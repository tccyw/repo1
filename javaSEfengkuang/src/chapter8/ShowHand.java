package chapter8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShowHand {
    private final int PLAY_NUM = 5;
    private String[] types = {"方块", "草花", "红心", "黑桃"};
    private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private List cards = new LinkedList();
    private String[] players = new String[PLAY_NUM];
    private List[] playerCards = new List[PLAY_NUM];

    /*
    * 初始化扑克牌，放入52张
    * 并且使用Collection.shuffle随机排列
    * */
    public void initCards(){
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {

                cards.add(types[i] + values[j]);

            }
        }
        //随机排列
        Collections.shuffle(cards);

    }

    /*初始化玩家，为每个玩家分派用户名*/
    public void initPlayer(String... name) {

        if (name.length > PLAY_NUM || name.length < 2) {
            System.out.println("玩家数量不对");
            return;
        } else {
            /*初始化玩家用户名*/
            for (int i = 0; i < name.length; i++) {
                players[i] = name[i];

            }
        }
    }
    /*初始化手牌。开始游戏时每个人手上的牌为空*/
    public void initPlayerCards() {
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null && players[i].equals("")) {
                playerCards[i] = new LinkedList();
            }

        }
    }

    public void showAllCards() {
        for (Object card : cards) {
            System.out.println(card);

        }
    }

    /*派发扑克牌 */
    public void deleverCard(String first) {
//        int firstPos=ArrayUtils.
    }

    public static void main(String[] args) {
        ShowHand sh = new ShowHand();
        sh.initCards();

//        sh.showAllCards();
        System.out.println();
    }
}
