package com.linkedlists.doubly.moviemanagementsystem;

public class MovieDoublyLinkedList {
	
	private MovieNode head;
	private MovieNode tail;
	
	// add movie at start
	public void addFirst(String title,String director,int releaseYear, double rating) {
	    MovieNode newNode = new MovieNode(title, director, releaseYear, rating);
	    
	    // case-1 :if there is no element then head and tail point to same newNode
	    if(head == null) {
	    	head = tail = newNode;
	    	return;
	    }
	    
	    // case -2 (if there is elements)
	    newNode.next = head;
	    head.prev = newNode;
	    head = newNode;    	    
	}
	//add movie at end
	public void addEnd(String title,String director,int releaseYear, double rating) {
		
		MovieNode newNode = new MovieNode(title, director, releaseYear, rating);
		// case-1 :if there is no element then head and tail point to same newNode
	    if(tail == null) {
	    	head = tail = newNode;
	    	return;
	    }
	    // case -2 (if there is elements)
	    tail.next = newNode;
	    newNode.prev = tail;
	    tail = newNode;
	    
	}
	// add at specific position
	public void addAtPosition(int index,String title,String director,int releaseYear, double rating) {
		
		if(index < 0) {
			System.out.println("Invalid Index");
		}
		// if index is 0 then add newNode at first
		if(index == 0) {
			addFirst(title, director, releaseYear, rating);
			return;
		}
		
		MovieNode temp = head;
		for(int i = 0; temp != null &&  i<index-1; i++ ) {
			temp= temp.next;
		}
		
		if(temp == null) {
			System.out.println("Index Out of Bound");
			return;
		}
		
		MovieNode newNode = new MovieNode(title, director, releaseYear, rating);
		
		newNode.next = temp.next;
		newNode.prev = temp;
		
		if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
	}
	
	// Remove node by title
	public void removeByTitle(String title) {
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		MovieNode temp = head;
		while (temp!= null && !temp.title.equalsIgnoreCase(title)) {
			temp = temp.next;
		}
		
		if (temp == null) {
            System.out.println("Movie not found");
            return;
        }
		
		if(temp == head) {
			 head = head.next;
	            if (head != null) head.prev = null;
	            else tail = null;
	        } 
		
	   else if (temp == tail) {
	            tail = tail.prev;
	            tail.next = null;
	        }
	   else {
	            temp.prev.next = temp.next;
	            temp.next.prev = temp.prev;
	        }
	}
 
	// Search movies by director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for this director.");
        }
    }

    // Search movies by rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with this rating.");
        }
    }

    // Update rating by movie title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    // Display movies forward
    public void displayForward() {

        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display movies in reverse
    public void displayReverse() {

        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Method to display a movie
    private void displayMovie(MovieNode node) {
        System.out.println("Title    : " + node.title);
        System.out.println("Director : " + node.director);
        System.out.println("Year     : " + node.releaseYear);
        System.out.println("Rating   : " + node.rating);
        System.out.println("---------------------------");
    }
}

