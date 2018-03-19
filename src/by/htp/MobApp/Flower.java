package by.htp.MobApp;

import java.util.HashMap;
import java.util.Map;

public class Flower {

	private int petal;

	Map<Integer, String> love = new HashMap<>();
	Map<Integer, String> money = new HashMap<>();
	Map<Integer, String> luck = new HashMap<>();

	public void add() {
		love.put(0, "You will find the love of your life in a month");
		love.put(1, "You will divorce in 2 weeks because of cheating");
		love.put(2,
				"Your boyfriend will make you a proposal to marry him and you will get 50% of his property according to marriage contract");
		love.put(3, "You will find the love of your life in a month");

		money.put(0, "Your salary will be increased by 50%!");
		money.put(1, "You will have a lot of unforeseen expenses!");
		money.put(2, "You will get a huge inheritance!");
		money.put(3, "Your salary will not be increased this year...");

		luck.put(0, "You will win a tour to Amsterdam!");
		luck.put(1, "Your flat will be sold and you will get a new cottage!");
		luck.put(2, "Be aware of black cats! One can bring you bad luck this spring!");
		luck.put(3, "You will win  100 BYN in Udacha v pridachu!");

	}

	public int getPetal() {
		return petal;
	}

	public void setPetal(int petal) {
		this.petal = petal;
	}

}
