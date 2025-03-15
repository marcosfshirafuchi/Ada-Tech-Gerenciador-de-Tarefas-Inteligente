package br.com.ada.t1322.tecnicasprogramacao.projeto.service;

import br.com.ada.t1322.tecnicasprogramacao.projeto.model.Task;
import br.com.ada.t1322.tecnicasprogramacao.projeto.repository.TaskRepositoryImpl;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements TaskService{
    public TaskServiceImpl(TaskRepositoryImpl taskRepository) {
        if (taskRepository == null) {
            throw new IllegalArgumentException("TaskRepository não pode ser nulo.");
        }
    }

    @Override
    public Task validateAndSave(Task task) {
        return null;
    }

    @Override
    public List<Task> findAll(Comparator<Task> orderBy) {
        return List.of();
    }

    @Override
    public List<Task> findByStatus(String status, Comparator<Task> orderBy) {
        return List.of();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void notifyUpcomingDeadlines() {

    }
}
