package br.com.ada.t1322.tecnicasprogramacao.projeto.service;

import br.com.ada.t1322.tecnicasprogramacao.projeto.model.Task;
import br.com.ada.t1322.tecnicasprogramacao.projeto.repository.TaskRepository;

public class TaskServiceImpl extends AbstractTaskService {

    public TaskServiceImpl(TaskRepository taskRepository) {
        super(taskRepository);
    }

    @Override
    protected void validateTask(Task task){
    }
}
