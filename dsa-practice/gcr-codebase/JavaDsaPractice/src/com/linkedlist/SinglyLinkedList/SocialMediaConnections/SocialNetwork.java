package com.linkedlist.SinglyLinkedList.SocialMediaConnections;

public class SocialNetwork {

    private User head;

    // Add new user
    public void addUser(int id, String name, int age) {
        User u = new User(id, name, age);

        if (head == null) {
            head = u;
            return;
        }

        User temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = u;
    }

    // Add Friend
    public void addFriend(int id1, int id2) {
        User u1 = findUserById(id1);
        User u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        u1.friends[u1.friendCount++] = id2;
        u2.friends[u2.friendCount++] = id1;

        System.out.println("Friend connection added");
    }

    // Remove Friend
    public void removeFriend(int id1, int id2) {
        User u1 = findUserById(id1);
        User u2 = findUserById(id2);

        removeFromArray(u1, id2);
        removeFromArray(u2, id1);

        System.out.println("Friend removed");
    }

    private void removeFromArray(User u, int id) {
        if (u == null) return;

        for (int i = 0; i < u.friendCount; i++) {
            if (u.friends[i] == id) {
                for (int j = i; j < u.friendCount - 1; j++)
                    u.friends[j] = u.friends[j + 1];
                u.friendCount--;
                break;
            }
        }
    }

    // Show friends
    public void showFriends(int id) {
        User u = findUserById(id);
        if (u == null) return;

        System.out.print(u.name + "'s Friends: ");
        for (int i = 0; i < u.friendCount; i++)
            System.out.print(u.friends[i] + " ");
        System.out.println();
    }

    // Mutual friends
    public void mutualFriends(int id1, int id2) {
        User u1 = findUserById(id1);
        User u2 = findUserById(id2);

        System.out.print("Mutual Friends: ");
        for (int i = 0; i < u1.friendCount; i++) {
            for (int j = 0; j < u2.friendCount; j++) {
                if (u1.friends[i] == u2.friends[j])
                    System.out.print(u1.friends[i] + " ");
            }
        }
        System.out.println();
    }

    // Search by name or id
    public void search(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                System.out.println(temp.id + " " + temp.name + " " + temp.age);
            temp = temp.next;
        }
    }

    public void search(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id)
                System.out.println(temp.id + " " + temp.name + " " + temp.age);
            temp = temp.next;
        }
    }

    // Count friends
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendCount + " friends");
            temp = temp.next;
        }
    }

    private User findUserById(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }
}
