package Selenium;

public class TryCatchTest extends Tryclass {

	static void TestAndRetry() {
		int count = 0;
		int maxTries = 4;
		int countReset = 0;
		
		String[] methods = new String[10];
		methods[0] = "login";
		
			try {
				System.out.println("attempt: " + count);
				for (int x = 0; x < methods.length; x++) {
					run(methods[x]);
				}
				return;
			} catch (Exception e) {
				if (++count == maxTries) throw e;
				e.printStackTrace();
				if (count < maxTries) {
					run(methods[x]);
				}
			}
			
			count = countReset;	
	}
}

