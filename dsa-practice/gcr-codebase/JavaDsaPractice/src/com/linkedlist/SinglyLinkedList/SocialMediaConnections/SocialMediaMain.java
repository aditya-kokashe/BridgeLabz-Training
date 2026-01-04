package com.linkedlist.SinglyLinkedList.SocialMediaConnections;

public class SocialMediaMain {
    public static void main(String[] args) {

        SocialNetwork sn = new SocialNetwork();

        sn.addUser(1, "Rahul", 20);
        sn.addUser(2, "Aman", 21);
        sn.addUser(3, "Neha", 19);
        sn.addUser(4, "Pooja", 22);

        sn.addFriend(1, 2);
        sn.addFriend(1, 3);
        sn.addFriend(2, 3);
        sn.addFriend(2, 4);

        sn.showFriends(1);
        sn.showFriends(2);

        sn.mutualFriends(1, 2);
        sn.countFriends();
    }
}
