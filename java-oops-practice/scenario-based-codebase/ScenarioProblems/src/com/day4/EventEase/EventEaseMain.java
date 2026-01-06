package com.day4.EventEase;

public class EventEaseMain {

    public static void main(String[] args) {

        User user = new User("Kabir", "kabir@gmail.com");

        Event event = new BirthdayEvent("Bharti Birthday", "Royal Hall",
                						"10-Feb-2026", 120, user, 25000, 8000, 2000 );
        
        Event event2 = new ConferenceEvent("Collegue Birthday", "Royal Hall",
				"15-Feb-2026", 120, user, 20000, 5000, 500 );

        event.schedule();                  //Cost 
        event.reschedule("12-Feb-2026");   //polymorphism
        event.cancel();
        
        event2.schedule();                  //Cost 
        event2.reschedule("20-Feb-2026");   //polymorphism
        event2.cancel();
    }
}
