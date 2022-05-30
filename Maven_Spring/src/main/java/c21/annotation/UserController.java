package c21.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource(name = "userService")
    private UserService userService;
    public void show(){
        this.userService.show();
        System.out.println("userController ... show");
    }
}
