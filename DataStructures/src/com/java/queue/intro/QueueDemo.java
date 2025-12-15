package com.java.queue.intro;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue que = new LinkedList();
		
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		
		System.out.println(que);
		
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}
}
