package com.task.demo.service;

import com.task.demo.model.Task;
import com.task.demo.repository.TaskRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
class TaskServiceTest {
    @InjectMocks
    private TaskService service = new TaskService();

    @Mock
    private TaskRepository taskRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    void saveOrUpdateTask() {
        // Arrange
        Task task = new Task();
        task.setId(1L);
        task.setDescription("test");

        // Act
        Task actual = this.service.saveOrUpdateTask(task);

        // Assert
        verify(this.taskRepository, times(1)).save(task);
    }

    @Test
    void listAllTasks() {
    }

    @Test
    void deleteTask() {
    }

    @Test
    void getTaskById() {
    }
}