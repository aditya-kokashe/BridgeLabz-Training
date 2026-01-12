package com.day2.CallCenter;

import java.util.*;
public class CallCenter {
	Queue<Customer> queue  =new LinkedList<>();
	PriorityQueue<Customer> vipQueue = new PriorityQueue<>((a,b) -> a.name.compareTo(b.name));
	HashMap<String , Integer> callCount = new HashMap<>();

	public void incomingCall(String name, boolean isVip) {
		Customer c = new Customer(name, isVip);
		callCount.put(name, callCount.getOrDefault(name, 0) + 1);
	
		if(isVip) {
			vipQueue.add(c);
		}else {
			queue.add(c);
		}
		System.out.println("Call Added: " + c);
	}
	
	public void serveCall() {
		Customer served;
		if(!vipQueue.isEmpty()) {
			served = vipQueue.poll();
		}else {
			served = queue.poll();
		}
		
		if(served != null) {
			System.out.println("Serving: "+ served);
		}else {
			System.out.println("No calls waiting!");
		}
	}
	
	public void showDetails() {
		System.out.println("\nCall Count- ");
		for(String name : callCount.keySet()) {
			System.out.println(name+" : "+ callCount.get(name));
		}
	}
}











