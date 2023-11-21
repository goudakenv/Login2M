package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.DBConnector;
import domain.Post;

public class PostDAO {
    private Connection connection;

    public PostDAO() {
        try {
            connection = DBConnector.getConnections();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        String query = "SELECT * FROM posts ORDER BY created_at DESC";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Post post = new Post();
                post.setId(resultSet.getInt("id"));
                post.setUsername(resultSet.getString("username"));
                post.setName(resultSet.getString("name"));
                post.setAge(resultSet.getString("age"));
                post.setMessage(resultSet.getString("message"));
                post.setCreatedAt(resultSet.getTimestamp("created_at"));
                posts.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return posts;
    }

    public void addPost(Post post) {
        String query = "INSERT INTO posts (username, message, name, age) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        	System.out.println(post.getUsername());
        	System.out.println(post.getName());
        	System.out.println(post.getMessage());
            preparedStatement.setString(1, post.getUsername());
            preparedStatement.setString(2, post.getMessage());
            preparedStatement.setString(3, post.getName());
            preparedStatement.setString(4, post.getAge());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
