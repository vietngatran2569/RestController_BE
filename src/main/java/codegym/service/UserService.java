package codegym.service;

import codegym.model.Product;
import codegym.model.User;

public interface UserService {
    Iterable<User> getList();
    User save(User user);
    void delete(Long id);
    User findById(Long id);
}
