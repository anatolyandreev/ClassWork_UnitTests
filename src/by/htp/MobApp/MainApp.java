package by.htp.MobApp;

public class MainApp {

	public static void main(String[] args) {

		Fortuneteller ft = new Fortuneteller();

		ft.addPetal();
		System.out.println("The futureteller has " + ft.flower+ " flowers");
		

		Client client1 = new Client("James", "Love");
		Client client2 = new Client("Peter", "Love");
		Client client3 = new Client("Sandra", "Money");
		Client client4 = new Client("Jack", "Luck");
		Client client5 = new Client("Pat", "Money");

		ft.futuretelling(client5);
		ft.futuretelling(client4);
		ft.futuretelling(client3);
		ft.futuretelling(client4);
		ft.futuretelling(client1);
		ft.futuretelling(client2);
	}
}
