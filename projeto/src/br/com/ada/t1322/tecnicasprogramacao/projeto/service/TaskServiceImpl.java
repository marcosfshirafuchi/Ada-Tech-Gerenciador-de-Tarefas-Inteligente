package br.com.ada.t1322.tecnicasprogramacao.projeto.service;

import br.com.ada.t1322.tecnicasprogramacao.projeto.dto.TaskUpdateRequest;
import br.com.ada.t1322.tecnicasprogramacao.projeto.model.Task;
import br.com.ada.t1322.tecnicasprogramacao.projeto.repository.TaskRepository;
import br.com.ada.t1322.tecnicasprogramacao.projeto.service.notification.TaskNotifier;
import br.com.ada.t1322.tecnicasprogramacao.projeto.service.validation.TaskValidator;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskServiceImpl implements TaskService {
    private final TaskRepository repository;
    private final TaskValidator validator;
    private final TaskNotifier taskNotifier;

    public static TaskService create(TaskRepository repository, TaskValidator validator, TaskNotifier taskNotifier) {
        return new TaskServiceImpl(repository, validator, taskNotifier);
    }

    private TaskServiceImpl(TaskRepository repository, TaskValidator validator, TaskNotifier taskNotifier) {
        this.repository = repository;
        this.validator = validator;
        this.taskNotifier = taskNotifier;
    }

    @Override
    public Task save(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("A tarefa não pode ser nula.");
        }
        validator.validate(task);
        Task savedTask = repository.save(task);
        return savedTask;
    }

    @Override
    public List<Task> findAll(Optional<Comparator<Task>> orderBy) {
        List<Task> tasks = repository.findAll();
        return orderBy.map(comparator -> tasks.stream()
                        .sorted(comparator)
                        .collect(Collectors.toList()))
                .orElse(tasks);
    }

    @Override
    public List<Task> findByStatus(Task.Status status, Optional<Comparator<Task>> orderBy) {
        List<Task> tasks = repository.findByStatus(status);
        return orderBy.map(comparator -> tasks.stream()
                        .sorted(comparator)
                        .collect(Collectors.toList()))
                .orElse(tasks);
    }

    @Override
    public List<Task> findBy(Predicate<Task> predicate, Optional<Comparator<Task>> orderBy) {
        List<Task> tasks = repository.findBy(predicate);
        return orderBy.map(comparator -> tasks.stream()
                        .sorted(comparator)
                        .collect(Collectors.toList()))
                .orElse(tasks);
    }

    @Override
    public Optional<Task> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return repository.deleteById(id);
    }

    @Override
    public void clearAll() {
        repository.deleteAll();
    }

    @Override
    public Task updateTask(TaskUpdateRequest updateRequest) {
        Task existingTask = getById(updateRequest.getId());
        existingTask.setTitle(updateRequest.getTitle());
        existingTask.setDescription(updateRequest.getDescription());
        existingTask.setDeadline(updateRequest.getDeadline());
        validator.validate(existingTask);
        return repository.save(existingTask);
    }

    @Override
    public Task updateStatus(Long id, Task.Status newStatus) {
        Task existingTask = getById(id);
        existingTask.setStatus(newStatus);
        return repository.save(existingTask);
    }

    @Override
    public void stopNotifier() {
        taskNotifier.stop();
    }

    @Override
    public void startNotifier() {
        taskNotifier.start();
    }
}
