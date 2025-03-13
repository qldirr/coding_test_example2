package com.example.todo.controller;

import com.example.todo.dto.TodoDTO;
import com.example.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // CORS 설정
public class TodoController {
    private final TodoService todoService;

    // 전체 목록 조회
    @GetMapping
    public List<TodoDTO> getTodos() {
        return todoService.getAllTodos();
    }

    // 할 일 추가
    @PostMapping
    public TodoDTO addTodo(@RequestBody TodoDTO todoDTO) {
        return todoService.addTodo(todoDTO);
    }

    // 할 일 삭제
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }

    // 완료 상태 수정
    @PatchMapping("/{id}")
    public void updateTodoStatus(@PathVariable Long id, @RequestBody TodoDTO todoDTO) {
        todoService.updateTodoStatus(id, todoDTO.isCompleted());
    }

//    ✔️ 전체 할 일 조회 (GET /api/todos)
//    ✔️ 할 일 추가 (POST /api/todos)
//    ✔️ 할 일 삭제 (DELETE /api/todos/{id})
//    ✔️ 완료 상태 수정 (PATCH /api/todos/{id})
}
