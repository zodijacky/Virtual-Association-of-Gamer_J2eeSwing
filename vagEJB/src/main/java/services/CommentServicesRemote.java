package services;

import java.util.List;

import javax.ejb.Remote;


import entities.Comment;

@Remote
public interface CommentServicesRemote {
	Boolean addComment(Comment advertisement);
	Boolean deleteComment(Integer id);
	Boolean updateComment(Comment advertisement);
	Comment findCommentById(Integer id);
	List<Comment> readAllComment();


}
