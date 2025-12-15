package com.java.queue.intro;

import java.util.PriorityQueue;
import java.util.Scanner;


public class RemoveHighestPriorityEle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Read the number of initial tasks (n)
		int initialTask = sc.nextInt();
		// TODO: Create a PriorityQueue to store task priorities as a max-priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		// TODO: Read and add n task priorities to the PriorityQueue
		for (int i = 0; i < initialTask; i++) {
			pq.add(sc.nextInt());
		}
		// TODO: Read the new task priority to insert
		int newTask = sc.nextInt();
		// TODO: Add the new task priority to the PriorityQueue
		pq.add(newTask);
		// TODO: Remove the highest-priority task from the queue
		pq.remove();
		// TODO: Print the updated queue of task priorities
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		System.out.println("Updated Priority Queue of Task Priorities:");
		for (int val : pq) {
			System.out.print(val + " ");
		}
		sc.close();

	}

}
