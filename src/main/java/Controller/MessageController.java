package Controller;

import Models.Message;
import dao.MessageRepository;
import dao.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping(value="message/add")
    public String getComposeMessage(@RequestParam(name="composeMessage") String text){
        Message newMessage= new Message(text);
        messageDao.save(newMessage);
        return "/message";
    }

    @PostMapping(value= "message/create")
    public String saveCreatedMessage(@ModelAttribute Message message){
        message.setUser(userDao.getById(message.getId()));
        Message saveMessage = messageDao.save(message);
        return "redirect: /message" + saveMessage.getId();
    }

    @PostMapping(value="message/delete")
    public String deleteMessage(@RequestParam long id){
        messageDao.deleteById(id);
        return "redirect: messages";
    }

    // crud dont kindof need to figure out how to send outgoing message to other users
}
