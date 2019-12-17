package codegym.controller;

import codegym.model.Product;
import codegym.model.User;
import codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/userList")
    public ResponseEntity<List<User>> getList(){
        List<User> productList = (List<User>) userService.getList();
        return  new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Void> addProduct(@RequestBody User user){
        userService.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}/deleteUser")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/editUser")
    public ResponseEntity<User> updateProduct(@RequestBody User user){
//        User product1=userService.findById(id);
//        if (product1 ==null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        product1.setName(user.getName());
//        product1.setEmail(user.getEmail());

        userService.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
