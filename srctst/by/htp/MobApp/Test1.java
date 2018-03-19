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
		assertFalse(fl.luck.containsValue(result));
	}
	
	@Test
	public void tomorrowTest1() {
		ft.addPetal();
		fl.add();
		ft.futuretelling(cl);
		String result = ft.futuretelling(cl);
		assertTrue(result.equals("I've already told you " + cl.getName() + " the future, come tomorrow!"));
	}
	
	@Test
	public void randomPetalTest1() {
		ft.addPetal();
		fl.add();
		System.out.println(ft.s);
		assertTrue(ft.fl.getPetal() > 0 && ft.fl.getPetal() < 11);
	}
	
}
