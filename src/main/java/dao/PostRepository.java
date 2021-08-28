package dao;

import Models.Post;
import Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findById(long id);
    List<Post> findPostByUserOrderById(User user);
    List<Post> findAllByOrderByIdDesc();
}
