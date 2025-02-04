package app.controller;

import app.model.User;
import app.repo.MyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups/{UserId}/users")
public class UserController {
    private final MyService srv;

    public UserController(MyService srv) {
        this.srv = srv;
    }

    @PostMapping
    public User Add(@PathVariable("UserId") String UserId, @RequestBody User user) {
        System.out.println("Adding user " + UserId);
        user.setUser_id(Integer.parseInt(UserId));
        System.out.println(user.getUser_name());
        System.out.println(user.getAge());
        return srv.User().Add(user);
    }


    @DeleteMapping("/{Id}")
    public void Delete(@PathVariable("UserId") String UserId,@PathVariable("Id") String Id) {
        System.out.println("Deleting user " + UserId);
        srv.User().Delete(Integer.parseInt(Id));
    }

}
