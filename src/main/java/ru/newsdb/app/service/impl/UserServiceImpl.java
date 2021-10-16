package ru.newsdb.app.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.newsdb.app.model.User;
import ru.newsdb.app.repository.UserRepository;
import ru.newsdb.app.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user, Long aLong) {
        user.setId(aLong);
        return userRepository.save(user);
    }

    @Override
    public User delete(Long aLong) {
        userRepository.deleteById(aLong);
        return User.builder()
                .id(aLong)
                .build();
    }

}
