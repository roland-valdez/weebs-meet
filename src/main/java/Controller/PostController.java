package Controller;

import Models.Post;
import Models.User;
import dao.CommentRepository;
import dao.PostRepository;
import dao.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostRepository postDao;

    private UserRepository userDao;
    private CommentRepository commentDao;
    public PostController(PostRepository postDao, UserRepository userDao, CommentRepository commentDao){
        this.postDao= postDao;
        this.userDao=userDao;
        this.commentDao= commentDao;

    }
    //get index page with post on it
    @GetMapping(value="/")
    public String indexPage(Model model){
        model.addAttribute("post", postDao.findAll());
        model.addAttribute("user", new User());
    return "post/index";
    }

    //show all post

    @GetMapping(value="/postPage")
    public String showPostPage(Model model){
        model.addAttribute("posts", postDao.findAll());
        return "postPage";
    }

    //show one post
    @GetMapping(value= "/post/{id}")
    public String onePost(@PathVariable long id, Model model){
        model.addAttribute("singlePost", postDao.getById(id));
        //to see comments on post
        model.addAttribute("allComments", commentDao.findCommentByPostId(id));
        return "singlePost";
    }
    //get post to edit
    @GetMapping(value = "/post/edit")
    public String editPost(Model model, @RequestParam long id){
        //find post to edit
       Post postToEdit = postDao.getById(id);
        model.addAttribute("post", postToEdit);
        return "post/edit";
    }

    //save edited changes
    @PostMapping(value= "/post/edit/{id}")
    public String saveEditedPost(@PathVariable long id, @ModelAttribute Post post){
        postDao.save(post);
        return "profile";
    }

    @GetMapping(value="/post/add")
    public String addPost(@RequestParam(name="addPost") String title, @RequestParam String description, @RequestParam String video, @RequestParam String image){
        Post post = new Post( title, video, image, description);
        postDao.save(post);
        return "redirect: /profile";
    }

    @GetMapping(value="/post/create")
    public String createPost(Model model){
        model.addAttribute("addPost", new Post());
        return "/post/create";
    }


}
