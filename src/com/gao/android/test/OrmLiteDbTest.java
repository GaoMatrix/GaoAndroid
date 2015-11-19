package com.gao.android.test;

import java.sql.SQLException;
import java.util.List;

import android.test.AndroidTestCase;

import com.gao.android.bean.Article;
import com.gao.android.bean.Student;
import com.gao.android.bean.User;
import com.gao.android.db.ormlite.ArticleDao;
import com.gao.android.db.ormlite.DatabaseHelper;
import com.gao.android.db.ormlite.UserDao;
import com.gao.android.util.LogUtils;
import com.j256.ormlite.dao.Dao;

public class OrmLiteDbTest extends AndroidTestCase {
    public void testAddArticle() {
        User u = new User();
        u.setName("张鸿洋");
        new UserDao(getContext()).add(u);
        Article article = new Article();
        article.setTitle("ORMLite的使用");
        article.setUser(u);
        new ArticleDao(getContext()).add(article);

    }

    public void testGetArticleById() {
        Article article = new ArticleDao(getContext()).get(1);
        LogUtils.d(article.getUser() + " , " + article.getTitle());
    }

    public void testGetArticleWithUser() {

        Article article = new ArticleDao(getContext()).getArticleWithUser(1);
        LogUtils.d(article.getUser() + " , " + article.getTitle());
    }

    public void testListArticlesByUserId() {

        List<Article> articles = new ArticleDao(getContext()).listByUserId(1);
        LogUtils.d(articles.toString());
    }

    public void testGetUserById() {
        User user = new UserDao(getContext()).get(1);
        LogUtils.d(user.getName());
        if (user.getArticles() != null)
            for (Article article : user.getArticles()) {
                LogUtils.d(article.toString());
            }
    }

    public void testAddStudent() throws SQLException {
        Dao dao = DatabaseHelper.getHelper(getContext()).getDao(Student.class);
        Student student = new Student();
        student.setDao(dao);
        student.setName("张鸿洋");
        student.create();
    }

}
