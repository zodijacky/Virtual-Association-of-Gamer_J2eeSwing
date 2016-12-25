package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Comment;

/**
 * Session Bean implementation class CommentServices
 */
@Stateless
@LocalBean
public class CommentServices implements CommentServicesRemote {
	@PersistenceContext
	private EntityManager entityManager;

	

    /**
     * Default constructor. 
     */
    public CommentServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addComment(Comment advertisement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteComment(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateComment(Comment advertisement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment findCommentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> readAllComment() {
		// TODO Auto-generated method stub
		return null;
	}

}
