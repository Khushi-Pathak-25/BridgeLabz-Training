package test.junit.listmanager;

import org.junit.jupiter.api.Test;

import com.junit.listmanager.ListManager;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    private final ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        
        assertEquals(1, manager.getSize(list));
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        
        manager.addElement(list, 20);
        manager.removeElement(list, 10);
        assertEquals(1, manager.getSize(list));
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        manager.addElement(list, 20);
        
        assertEquals(2, manager.getSize(list));
    }
}