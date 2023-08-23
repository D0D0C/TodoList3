package org.example.dao;

import org.example.model.Task;
import org.example.model.User;

import java.util.List;

public interface TaskDAO {

    public boolean addTask(Task task);

    public List<Task> getAllTasks();

    public boolean deleteTask(Long taskId);

    public boolean markTaskAsCompleted(Long taskId);

    public boolean addUser(User user);
}