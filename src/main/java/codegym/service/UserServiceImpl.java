package codegym.service;

import codegym.model.User;
import codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> getList() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
         userRepository.deleteById(id);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }
}
