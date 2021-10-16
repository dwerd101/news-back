package ru.newsdb.app.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.newsdb.app.model.User;
import ru.newsdb.app.service.MyNewsService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private final MyNewsService<User, Long> myNewsService;
    @GetMapping("/")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(myNewsService.findAll());
    }
    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.ok(myNewsService.save(user));
    }
    @PutMapping("/update/{id}")
    public   ResponseEntity<User>  updateUser(@RequestBody User user, @PathVariable String id) {
        return ResponseEntity.ok(myNewsService.update(user,Long.parseLong(id)));
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<User> deleteUser( @PathVariable String id) {
        return ResponseEntity.ok(myNewsService.delete(Long.parseLong(id)));
    }


}
