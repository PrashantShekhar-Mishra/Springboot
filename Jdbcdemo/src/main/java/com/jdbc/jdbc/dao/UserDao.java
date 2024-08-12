package com.jdbc.jdbc.dao;

import com.jdbc.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_USER = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
    private static final String SELECT_USER_BY_ID = "SELECT * FROM users WHERE id = ?";
    private static final String SELECT_ALL_USERS = "SELECT * FROM users";
    private static final String UPDATE_USER = "UPDATE users SET name = ?, email = ?, password = ? WHERE id = ?";
    private static final String DELETE_USER = "DELETE FROM users WHERE id = ?";

    // Use BeanPropertyRowMapper for automatic mapping
    private final BeanPropertyRowMapper<User> userRowMapper = new BeanPropertyRowMapper<>(User.class);
    
    //custom row mapper
//    private final RowMapper<User> userRowMapper = new RowMapper<User>() {
//        @Override
//        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//            User user = new User();
//            user.setId(rs.getInt("id"));
//            user.setName(rs.getString("name"));
//            user.setEmail(rs.getString("email"));
//            user.setPassword(rs.getString("password"));
//            user.setCreatedAt(rs.getTimestamp("created_at"));
//            user.setUpdatedAt(rs.getTimestamp("updated_at"));
//            return user;
//        }
//    };

    public void addUser(User user) {
        jdbcTemplate.update(INSERT_USER, user.getName(), user.getEmail(), user.getPassword());
    }

    public User getUserById(int id) {
        try {
            return jdbcTemplate.queryForObject(SELECT_USER_BY_ID, new Object[]{id}, userRowMapper);
        } catch (EmptyResultDataAccessException e) {
            // Handle the case where no user is found with the given ID
            return null; // or throw a custom exception
        }
    }

    public List<User> getAllUsers() {
        return jdbcTemplate.query(SELECT_ALL_USERS, userRowMapper);
    }

    public void updateUser(User user) {
        jdbcTemplate.update(UPDATE_USER, user.getName(), user.getEmail(), user.getPassword(), user.getId());
    }

    public void deleteUser(int id) {
        jdbcTemplate.update(DELETE_USER, id);
    }
}
