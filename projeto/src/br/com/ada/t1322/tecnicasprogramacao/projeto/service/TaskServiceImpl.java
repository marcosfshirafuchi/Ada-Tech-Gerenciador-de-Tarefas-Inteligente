package br.com.ada.t1322.tecnicasprogramacao.projeto.service;

import br.com.ada.t1322.tecnicasprogramacao.projeto.dto.TaskUpdateRequest;
import br.com.ada.t1322.tecnicasprogramacao.projeto.model.Task;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class TaskServiceImpl implements TaskService {


    @Override
    public Task save(Task task) {
        return null;
    }

    @Override
    public List<Task> findAll(Optional<Comparator<Task>> orderBy) {
        return List.of();
    }

    @Override
    public List<Task> findByStatus(Task.Status status, Optional<Comparator<Task>> orderBy) {
        return List.of();
    }

    @Override
    public List<Task> findBy(Predicate<Task> predicate, Optional<Comparator<Task>> orderBy) {
        return List.of();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Task getById(Long id) {
        return TaskService.super.getById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public void clearAll() {

    }

    @Override
    public Task updateTask(TaskUpdateRequest updateRequest) {
        return null;
    }

    @Override
    public Task updateStatus(Long id, Task.Status newStatus) {
        return null;
    }

    @Override
    public void stopNotifier() {

    }

    @Override
    public void startNotifier() {

    }
}
