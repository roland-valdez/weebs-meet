package Controller;

import Models.User;
import dao.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private UserRepository userDao;

    public UserController(UserRepository userDao){
        this.userDao=userDao;
    }

@GetMapping("/sign-up")
    public String showSignUpForm(Model model){
        model.addAttribute("user", new User());
        return "users/sign-up";
}

@PostMapping("/sign-up")
    public String saveUser(@ModelAttribute User user){
        //will need to hash passwords for security
        user.setPassword(user.getPassword());
        userDao.save(user);
        return "redirect:/";
}

}
