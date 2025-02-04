package app.controller;

import app.model.User;
import app.repo.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups")
public class GroupController {
    private final MyService srv;

    @Autowired
    public GroupController(MyService srv) {
        this.srv = srv;
    }

    @PostMapping
    public int Create() {
        System.out.println("create");
        return srv.Group().Create();
    }


    @GetMapping("/{Id}")
    public User[] Get(@PathVariable("Id") String Id) {
        System.out.println("get");
        return srv.Group().Get(Integer.parseInt(Id));
    }
}
