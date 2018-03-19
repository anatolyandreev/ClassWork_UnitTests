package by.htp.MobApp;

public class Client {

	private String name;
	private String type_futuretelling;

	public Client(String name, String type_futuretelling) {
		this.name = name;
		this.type_futuretelling = type_futuretelling;

	}

	public String getName() {
		return name;
	}

	public String getType_futuretelling() {
		return type_futuretelling;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType_futuretelling(String type_futuretelling) {
		this.type_futuretelling = type_futuretelling;
	}

}
