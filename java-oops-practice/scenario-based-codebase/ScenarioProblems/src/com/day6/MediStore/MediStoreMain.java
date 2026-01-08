package com.day6.MediStore;

public class MediStoreMain {

	public static void main(String[] args) {
		Medicine m1 = new Preserved("Med1", "2025-05-05", 200.0, 10, 0, 0.05, null);
		Medicine m2 = new LiquidMeds("Med2", "2026-03-02", 100.0, 10, 0, 0.05, null);
	
		Medicine[] meds = {m1, m2};
 		
		for(Medicine m : meds) {
			m.getDetails();
			m.displayInfo();
			if(m instanceof ISellable) {
				ISellable p = (ISellable) m;
				p.checkExpiry();
				p.sell();
			}
		}
	}
}
