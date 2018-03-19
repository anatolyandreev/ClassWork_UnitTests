package by.htp.MobApp;

import java.util.HashMap;
import java.util.Map;

public class Fortuneteller {

	int flower = 5;
	int a = 0;
	int s = (int) (Math.random() * 10);
	Flower fl = new Flower();

	Map<String, String> map = new HashMap<>();
	Map<Integer, Integer> flowers = new HashMap<>();

	public void addPetal() {
		while (a <= 5) {

			fl.setPetal(s);
			flowers.put(a, fl.getPetal());
			a++;

		}
	}

	public String futuretelling(Client client) {
		fl.add();

		if (flowers.size() > 0) {
			if (map.containsKey(client.getName())) {
				System.out.println("I've already told you " + client.getName() + " the future, come tomorrow!");
			} else {
				map.put(client.getName(), client.getType_futuretelling());
				System.out.println(
						"Telling the future to " + client.getName() + " for " + client.getType_futuretelling());

				int c = (int) (Math.random() * 4);
				if (client.getType_futuretelling().equals("Love")) {
					System.out.println(fl.love.get(c));
					flowers.remove(c);
					return fl.love.get(c);
				}
				if (client.getType_futuretelling().equals("Money")) {
					System.out.println(fl.money.get(c));
					flowers.remove(c);
					return fl.money.get(c);
				}
				if (client.getType_futuretelling().equals("Luck")) {
					System.out.println(fl.luck.get(c));
					flowers.remove(c);
					return fl.luck.get(c);
				}

				flower = flowers.size();
				System.out.println("The fortuneteller has " + flower + ".");
				System.out.println("");
			}

		} else {
			System.out.println("No more flowers! Go away!");
			return "No more flowers! Go away!";
		}
		return null;
	}

}
