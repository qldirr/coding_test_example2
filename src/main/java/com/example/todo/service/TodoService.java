package com.example.todo.service;

import com.example.todo.dto.TodoDTO;
import com.example.todo.entity.Todo;
import com.example.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    // 전체 할 일 목록 조회
    public List<TodoDTO> getAllTodos() {
        return todoRepository.findAll().stream()
                .map(todo -> TodoDTO.builder()
                        .id(todo.getId())
                        .title(todo.getTitle())
                        .completed(todo.isCompleted())
                        .build())
                .collect(Collectors.toList());
    }

    // 할 일 추가
    public TodoDTO addTodo(TodoDTO todoDTO) {
        Todo newTodo = Todo.builder()
                .title(todoDTO.getTitle())
                .completed(false)
                .build();

        Todo savedTodo = todoRepository.save(newTodo);

        return TodoDTO.builder()
                .id(savedTodo.getId())
                .title(savedTodo.getTitle())
                .completed(savedTodo.isCompleted())
                .build();
    }

    // 할 일 삭제
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

    // 할 일 완료 상태 수정
    public void updateTodoStatus(Long id, boolean completed) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 할 일이 없습니다. ID: " + id));

        todo.setCompleted(completed);
        todoRepository.save(todo);
    }
}
