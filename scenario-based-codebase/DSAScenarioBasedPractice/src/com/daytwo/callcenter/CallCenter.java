
package com.daytwo.callcenter;

import java.util.HashMap;

public class CallCenter {

    private NormalQueue normalQueue = new NormalQueue();
    private VIPQueue vipQueue = new VIPQueue();
    private HashMap<String, Integer> customerCallCount = new HashMap<>();

    public void addCall(Customer customer) {

        // Add to respective queue
        if (customer.isVIP) {
            vipQueue.enqueue(customer);
        } else {
            normalQueue.enqueue(customer);
        }

        // Update call count
        customerCallCount.put(customer.name, customerCallCount.getOrDefault(customer.name, 0) + 1);
    }

    public Customer serveCall() {

        if (!vipQueue.isEmpty()) {
            return vipQueue.dequeue();
        } 
        else if (!normalQueue.isEmpty()) {
            return normalQueue.dequeue();
        } 
        else {
            return null;
        }
    }

    public int getCallCount(String name) {
        return customerCallCount.getOrDefault(name, 0);
    }
}

