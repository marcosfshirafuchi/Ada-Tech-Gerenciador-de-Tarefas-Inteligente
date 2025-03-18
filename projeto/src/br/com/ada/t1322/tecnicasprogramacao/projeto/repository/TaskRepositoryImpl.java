package br.com.ada.t1322.tecnicasprogramacao.projeto.repository;

import br.com.ada.t1322.tecnicasprogramacao.projeto.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public class TaskRepositoryImpl implements TaskRepository {
    private List<Task> tasks = new ArrayList<>();
    private long count = 1;

    @Override
    public Task save(Task task) {
        if (!tasks.isEmpty()) {
            count = tasks.size();
            count++;
            task.setId(count);
            tasks.add(task);
            return task;
        } else {
            task.setId(count);
            tasks.add(task);
            return task;
        }
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }

    @Override
    public List<Task> findByStatus(String status) {
        //Predicate<Task> verificarStatus = task -> task.getStatus().getDescricao().equalsIgnoreCase(status);
        Function<String, List<Task>> verificarStatus = s -> s.compareToIgnoreCase(status) == 0 ? tasks : List.of();
        return (List<Task>) verificarStatus;
    }

    @Override
    public Optional<Task> findById(Long id) {
        return findById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }

    @Override
    public void deleteAll() {
        tasks.clear();
    }
}
