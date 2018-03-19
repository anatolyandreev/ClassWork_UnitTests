package by.htp.MobApp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test1 {

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
	public void positiveTest1() {
		ft.addPetal();
		fl.add();
		String result = ft.futuretelling(cl);
		assertTrue(fl.love.containsValue(result));
	}
	
	@Test
	public void negativeTest1() {
		ft.addPetal();
		fl.add();
		String result = ft.futuretelling(cl);
		assertTrue(fl.luck.containsValue(result));
	}

}
