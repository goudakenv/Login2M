package domain;

import java.util.Date;


public class Post {
    private int id;
    private String username;
    private String message;
    private Date createdAt;

    // コンストラクタ
    public Post() {
    }

    public Post(String username, String message) {
        this.username = username;
        this.message = message;
    }

    // ゲッターとセッター
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
