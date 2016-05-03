package com.demo;

public class StackTest {
	public static void main(String[] args) throws Exception {
		Stack<Integer> s = new Stack<>(10000);
		for (int i = 0; i < 10000; i++) {
			s.push(i);
		}

		while (!s.isEmpty()) {
			s.pop();
		}
		
		System.out.println("OK - grab a heap dump now");
		while(true){
			Thread.sleep(1000);
		}

	}

}
