package demo.test;

public class StringTest {
	public static void main(String[] args) throws InterruptedException {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			new Thread(new Stest(sb, i + System.currentTimeMillis() + "")).start();
		}
		Thread.sleep(10000);
		System.out.println(sb.toString());
	}
}
class Stest implements Runnable {
	StringBuilder sb;
	String m;
	public Stest(StringBuilder sb, String m) {
		this.sb = sb;
		this.m = m;
	}


	@Override
	public void run() {
		sb.append(m);
	}
}
