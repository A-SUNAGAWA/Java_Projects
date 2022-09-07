package java1104;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main5 {
	public static String[] createDeck(String[] suits,String[] nums) {
		String[] deck = new String[suits.length * nums.length];// 52
		for(int i = 0;i < deck.length; i++){
			deck[i] = suits[i / nums.length] + nums[i % nums.length];
			// suits[i / 13](0/13=0,1/13=0...13/13=1,14/13=1...)
			//+ nums[i % 13](0%13=0,1%13=1...)
		}
		return deck;// 配列を返す
	}

	public static String[] createDeck2(String[] suits,String[] nums) {
		String[] deck = new String[suits.length * nums.length];// 52
		int count = 0;
		for(String i : suits) {// 4回まわる
			for(String j : nums) {// 13回まわる
				deck[count] = i + j;
				count++;
			}
		}
		return deck;// 配列を返す
	}

	public static void cards(String[] cards){
		for(int i = 0; i < cards.length; i++){
			if(i % 13 == 0){// 13で割った時0ならば改行
				System.out.println();
			}
			System.out.print(cards[i]);
		}
	}

	public static void main(String[] args) {
		String[] suits = {"♠","♦","♥","♣"};
		String[] nums = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] deck = createDeck(suits,nums);
		cards(deck);

		String[] deck2 = createDeck2(suits,nums);
		cards(deck2);

		System.out.println();
		for(int i = 0; i < 5; i++) {
			int r = new java.util.Random().nextInt(deck.length);
			System.out.print(deck[r]);
		}

		System.out.println();

		List<String> list = Arrays.asList(deck);
		System.out.println(list.get(0));
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}

}