package test.junit.taskmanager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.taskmanager.TaskManager;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    private final TaskManager manager = new TaskManager();

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS) // must be > 3 seconds
    void testLongRunningTask() {
        assertEquals("Task completed", manager.longRunningTask());
    }
}
