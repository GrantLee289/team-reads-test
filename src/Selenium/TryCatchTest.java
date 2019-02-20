package Selenium;

public class TryCatchTest extends Tryclass {

	static void TestAndRetry() {
		int tryCount = 0;
		int maxTries = 4;
		int countReset = 0;
		int y = 0;
		
		String[] methods = new String[10];
		methods[0] = "login";
		methods[1] = "";
		methods[2] = "";
		
			try {
				System.out.println("attempt: " + tryCount);
				for (int x = y; x < methods.length; x++) {
					y = x;
					run(methods[x]);
				}
			} catch (Exception e) {
				if (++tryCount == maxTries) throw e;
				e.printStackTrace();
				if (tryCount < maxTries) {
					run(methods[y]);
				}
			}
			
			tryCount = countReset;	
	}
}

