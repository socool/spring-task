package com.task.demo.web;

import com.task.demo.model.Task;
import com.task.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("")
    public Task saveOrUpdateTask(@RequestBody Task task){
        return taskService.saveOrUpdateTask(task);
    }

    @GetMapping("/all")
    public Iterable<Task> getAllTasks(){
        return taskService.listAllTasks();
    }

    @GetMapping("/{taskId}")
    public Task getTaskById(@PathVariable Long taskId){
        return taskService.getTaskById(taskId);
    }

    @DeleteMapping("/{taskId}")
    public void deleteTask(@PathVariable Long taskId){
        taskService.deleteTask(taskId);
    }
}
