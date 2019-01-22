package demo.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Testtt {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Object o = list.toArray();
		System.out.println((o instanceof Object[]));
	}
}
