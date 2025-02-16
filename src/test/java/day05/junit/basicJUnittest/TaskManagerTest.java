package day05.junit.basicJUnittest;
import org.day05.problemstatement.junit.basicJUnittest.performancetestingusingtimeout.TaskManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskManagerTest {

    private final TaskManager taskManager = new TaskManager();

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    void testLongRunning(){
        taskManager.logRunningTask();
    }
}
