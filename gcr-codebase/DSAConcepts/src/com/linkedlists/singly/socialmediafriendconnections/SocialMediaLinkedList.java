package com.linkedlists.singly.socialmediafriendconnections;

public class SocialMediaLinkedList {

	private UserNode head;

	// Adds a new user to the end of the list
	public void addUser(int id, String name, int age) {
		UserNode node = new UserNode(id, name, age);

		if (head == null) {
			head = node;
			return;
		}

		// Traverse to last user
		UserNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	// Searches and returns user by ID
	public UserNode searchUserById(int id) {
		UserNode temp = head;

		// Traverse list to find matching userId
		while (temp != null) {
			if (temp.userId == id) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	// Searches user by name
	public void searchUserByName(String name) {
		UserNode temp = head;
		boolean found = false;

		// Traverse all users
		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {
				displayUser(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("User not found.");
		}
	}

	// Creates a two-way friend connection
	public void addFriendConnection(int userId1, int userId2) {

		UserNode user1 = searchUserById(userId1);
		UserNode user2 = searchUserById(userId2);

		if (user1 == null || user2 == null) {
			System.out.println("One or both users not found.");
			return;
		}

		// Add each user to other's friend list
		addFriend(user1, userId2);
		addFriend(user2, userId1);
	}

	// Adds a friend ID to user's friend list
	private void addFriend(UserNode user, int friendId) {

		FriendNode newFriend = new FriendNode(friendId);

		if (user.friendsHead == null) {
			user.friendsHead = newFriend;
			return;
		}

		FriendNode temp = user.friendsHead;

		// Traverse to check duplicates and reach end
		while (temp.next != null) {
			if (temp.friendId == friendId)
				return;
			temp = temp.next;
		}

		if (temp.friendId != friendId) {
			temp.next = newFriend;
		}
	}

	// Removes friend connection from both users
	public void removeFriendConnection(int userId1, int userId2) {

		UserNode user1 = searchUserById(userId1);
		UserNode user2 = searchUserById(userId2);

		if (user1 == null || user2 == null) {
			System.out.println("One or both users not found.");
			return;
		}

		removeFriend(user1, userId2);
		removeFriend(user2, userId1);
	}

	// Removes friend ID from user's friend list
	private void removeFriend(UserNode user, int friendId) {

		FriendNode temp = user.friendsHead;
		FriendNode prev = null;

		// Traverse friend list
		while (temp != null) {
			if (temp.friendId == friendId) {
				if (prev == null) {
					user.friendsHead = temp.next;
				} else {
					prev.next = temp.next;
				}
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}

	// Finds and prints mutual friends of two users
	public void findMutualFriends(int userId1, int userId2) {

		UserNode user1 = searchUserById(userId1);
		UserNode user2 = searchUserById(userId2);

		if (user1 == null || user2 == null) {
			System.out.println("User not found.");
			return;
		}

		FriendNode f1 = user1.friendsHead;
		boolean found = false;

		// Compare each friend of user1 with user2
		while (f1 != null) {
			FriendNode f2 = user2.friendsHead;

			while (f2 != null) {
				if (f1.friendId == f2.friendId) {
					System.out.println("Mutual Friend ID: " + f1.friendId);
					found = true;
				}
				f2 = f2.next;
			}
			f1 = f1.next;
		}

		if (!found) {
			System.out.println("No mutual friends.");
		}
	}

	// Displays all friends of a user
	public void displayFriends(int userId) {

		UserNode user = searchUserById(userId);
		if (user == null) {
			System.out.println("User not found.");
			return;
		}

		System.out.println("Friends of " + user.name + ":");

		FriendNode temp = user.friendsHead;
		if (temp == null) {
			System.out.println("No friends.");
			return;
		}

		// Traverse friend list
		while (temp != null) {
			System.out.println("Friend ID: " + temp.friendId);
			temp = temp.next;
		}
	}

	// Counts and prints number of friends for each user
	public void countFriends() {

		UserNode temp = head;

		// Traverse all users
		while (temp != null) {

			int count = 0;
			FriendNode f = temp.friendsHead;

			// Count friends
			while (f != null) {
				count++;
				f = f.next;
			}

			System.out.println(temp.name + " has " + count + " friends.");
			temp = temp.next;
		}
	}

	// Displays basic user information
	private void displayUser(UserNode user) {
		System.out.println("User ID : " + user.userId);
		System.out.println("Name    : " + user.name);
		System.out.println("Age     : " + user.age);
		System.out.println("-------------------------");
	}
}
