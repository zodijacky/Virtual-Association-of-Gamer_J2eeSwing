package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Article;

@Remote
public interface ArticleServicesRemote {
	
	
	Boolean addArticle(Article article);
	Boolean deleteArticle(Integer id);
	Boolean updateArticle(Article article);
	Article findArticleById(Integer id);
	List<Article> readAllArticles();

}
