package Controller;

import dao.MessageRepository;
import dao.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MessageController {

    private MessageRepository messageDao;

    private UserRepository userDao;


    @GetMapping(value="/messages")
    public String showMessges(Model model){
        model.addAttribute("messages",messageDao.findAll());
        return "/message";
    }

    @GetMapping(value= "/message/{id}")
    public String singleMessage(@PathVariable long id, Model model){
        model.addAttribute("singleMessage",messageDao.getById(id));
    return "redirect:/message/{id}";
    }



}
