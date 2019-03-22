package com.song.jdbc.raw;

import java.util.List;

public interface ArticleDao {
	List<Article> listArticle();
	
	Article getArticle(String articleId);
	
	void addArticle(Article article);
	
	void updateArticle(Article article);
	
	void deleteArticle(String articleId);

}
