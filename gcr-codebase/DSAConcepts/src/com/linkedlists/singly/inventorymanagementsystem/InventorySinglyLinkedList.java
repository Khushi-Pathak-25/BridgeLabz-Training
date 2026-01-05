package com.linkedlists.singly.inventorymanagementsystem;

public class InventorySinglyLinkedList {

	private ItemNode head;

	// add item at the first
	public void addFirst(String itemName, int itemID, int quantity, double price) {

		ItemNode newNode = new ItemNode(itemName, itemID, quantity, price);
		newNode.next = head;
		head = newNode;
	}

	// add item at the end
	public void addEnd(String itemName, int itemID, int quantity, double price) {

		ItemNode newNode = new ItemNode(itemName, itemID, quantity, price);
		if (head == null) {
			head = newNode;
			return;
		}

		ItemNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// add at specific position
	public void addAtPosition(int index, String itemName, int itemID, int quantity, double price) {

		if (index < 0) {
			System.out.println("Invalid index.");
			return;
		}

		if (index == 0) {
			addFirst(itemName, itemID, quantity, price);
			return;
		}

		ItemNode temp = head;
		for (int i = 0; temp != null && i < index - 1; i++) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Index Out of Bound");
			return;
		}

		ItemNode newNode = new ItemNode(itemName, itemID, quantity, price);
		newNode.next = temp.next;
		temp.next = newNode;

	}

	// Remove Item by ID
	public void removeByID(int itemID) {
		if (head == null) {
			System.out.println("Empty Inventory");
			return;
		}
		if (head.itemID == itemID) {
			head = head.next;
			return;
		}

		ItemNode temp = head;
		while (temp.next != null && temp.next.itemID != itemID) {
			temp = temp.next;
		}

		if (temp.next == null) {
			System.out.println("Item not found.");
			return;
		}
		temp.next = temp.next.next;
	}
	
	 // Update quantity by item ID
    public void updateQuantity(int itemID, int quantity) {

        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                temp.quantity = quantity;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    public void searchByItemId(int itemID) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    public void searchByItemName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public void displayTotalInventoryValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    // merge sort
    public void sortByName(boolean ascending) {
        head = mergeSort(head, true, ascending);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, false, ascending);
    }

    private ItemNode mergeSort(ItemNode node, boolean byName, boolean asc) {

        if (node == null || node.next == null) {
            return node;
        }

        ItemNode middle = getMiddle(node);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(node, byName, asc);
        ItemNode right = mergeSort(nextOfMiddle, byName, asc);

        return merge(left, right, byName, asc);
    }

    private ItemNode merge(ItemNode a, ItemNode b, boolean byName, boolean asc) {

        if (a == null) return b;
        if (b == null) return a;

        boolean condition;

        if (byName) {
            condition = asc
                    ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                    : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        ItemNode result;
        if (condition) {
            result = a;
            result.next = merge(a.next, b, byName, asc);
        } else {
            result = b;
            result.next = merge(a, b.next, byName, asc);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode node) {

        if (node == null) return node;

        ItemNode slow = node;
        ItemNode fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // method to display items
    public void displayAll() {

        if (head == null) {
            System.out.println("Inventory empty.");
            return;
        }

        ItemNode temp = head;
        int index = 0;

        while (temp != null) {
            System.out.println("Index : " + index);
            displayItem(temp);
            temp = temp.next;
            index++;
        }
    }

    // method to display an item
    private void displayItem(ItemNode node) {
        System.out.println("ID       : " + node.itemID);
        System.out.println("Name     : " + node.itemName);
        System.out.println("Quantity : " + node.quantity);
        System.out.println("Price    : " + node.price);
        System.out.println("-----------------------");
    }

}
