package by.htp.MobApp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlowerSimpleTest {
	
	public Fortuneteller ft;
	public Client cl;
	public Flower fl;

	@Before
	public void initTestData() {
		ft = new Fortuneteller();
		cl = new Client("Grisha", "Love");
		fl = new Flower();
	}

	@Test
	public void test() {
		
		ft.addPetal();
		int x = ft.flowers.size();
		ft.futuretelling(cl);
		int y = ft.flowers.size();
		assertTrue(x == y + 1);
	}

}
