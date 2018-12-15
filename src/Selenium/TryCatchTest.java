package Selenium;

public class TryCatchTest extends Tryclass{

	static void TestandRetry() {
		int count = 0;
		int maxTries = 4;
		//int countReset = 0;
		
		while (true) {
			try {
				runScripts();
				return;
			} catch (Exception e) {
				if (++count == maxTries) throw e;
				System.err.println(e);
			}

			/*
			count = countReset;
			
			try {
				Tryclass.testAnotherThing();
				return;
			} catch (Exception f) {
				if (++count == maxTries) throw f;
				System.err.println(f);
			}
			
			count = countReset;
			
			try {
				Tryclass.testOneMoreThing();
				return;
			} catch (Exception g) {
				if (++count == maxTries) throw g;
				System.err.println(g);
			}
	*/		
		}
	}
}

