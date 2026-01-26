package com.annotations.suppressunchecked;

import java.util.List;
import java.util.ArrayList;

public class SuppressUncheckedWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

	List list = new ArrayList();
	list.add("Java");
	list.add("CPP");
	list.add("Python");

	// Unchecked cast warning at compile  (suppressed)
	List<String> languages = (List<String>) list;
	System.out.println(languages);
    }
}