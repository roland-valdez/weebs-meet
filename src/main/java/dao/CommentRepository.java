package dao;

import Models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository {
    List<Comment> findCommentByPostId(long id);
}
