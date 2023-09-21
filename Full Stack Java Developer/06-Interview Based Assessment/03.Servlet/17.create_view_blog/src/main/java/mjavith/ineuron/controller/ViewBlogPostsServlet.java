package mjavith.ineuron.controller;

import mjavith.ineuron.model.BlogPost;
import mjavith.ineuron.util.DBUtil;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

@WebServlet("/view")
public class ViewBlogPostsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Connection connection = DBUtil.getConnection();
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM blog_posts";
			ResultSet resultSet = statement.executeQuery(sql);

			List<BlogPost> blogPosts = new ArrayList<>();
			while (resultSet.next()) {
				BlogPost blogPost = new BlogPost();
				blogPost.setId(resultSet.getInt("id"));
				blogPost.setTitle(resultSet.getString("title"));
				blogPost.setDescription(resultSet.getString("description"));
				blogPost.setContent(resultSet.getString("content"));
				blogPosts.add(blogPost);
			}

			request.setAttribute("blogPosts", blogPosts);
			request.getRequestDispatcher("view.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
			response.getWriter().println("An error occurred while retrieving blog posts.");
		}
	}
}
