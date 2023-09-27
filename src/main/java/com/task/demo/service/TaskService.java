package com.task.demo.service;

import com.task.demo.model.Task;
import com.task.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveOrUpdateTask(Task task){
        return taskRepository.save(task);
    }

    public Iterable<Task> listAllTasks(){
        return taskRepository.findAll();
    }

    public void deleteTask(Long id){
        taskRepository.delete(getTaskById(id));
    }

    public Task getTaskById(Long id){
        return taskRepository.getById(id);
    }
}
