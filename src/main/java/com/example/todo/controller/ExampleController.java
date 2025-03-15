package com.example.todo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ExampleController {
//    private final UserService userService;

    // ✅ @RequestBody 사용 → 사용자 추가
//    @RequestBody : 요청의 본문(body)에서 JSON 데이터를 받아서 처리할 때 사용 { "name": "홍길동" }
//    @PostMapping
//    public User addUser(@RequestBody User user) {
//        return userService.addUser(user);
//    }

    // ✅ @PathVariable 사용 → ID로 사용자 조회
//    @PathVariable : URL 경로의 값을 받아서 처리할 때 사용, /users/{id}
//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Long id) {
//        return userService.getUserById(id);
//    }

    // ✅ @RequestParam 사용 → 이름으로 사용자 검색
//    @RequestParam : URL 쿼리스트링 값을 받아서 처리할 때 사용, /users?name=홍
//    @GetMapping
//    public List<User> getUsersByName(@RequestParam(required = false) String name) {
//        if (name != null) {
//            return userService.getUsersByName(name);
//        }
//        return List.of(); // 빈 리스트 반환
//    }

//    @RequestBody → 주로 POST/PUT 요청에서 사용
//    @PathVariable → 주로 GET/DELETE에서 특정 리소스를 식별할 때 사용
//    @RequestParam → 주로 GET에서 필터링이나 검색에 사용
}
