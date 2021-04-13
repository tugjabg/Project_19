package DAO;

import DatabaseConnection.Connect;
import Models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAO {
    public UserDAO() {
    }

    public List<User> getAllUser() throws ClassNotFoundException, SQLException {
        Connection conn = Connect.getConnect();
        List<User> result = new ArrayList<>();
        String sql = "SELECT * FROM user";
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt(User.ID);
            String userName = rs.getString(User.USER_NAME);
            String passWord = rs.getString(User.PASS_WORD);
            String displayName = rs.getString(User.DISPLAY_NAME);
            Date birthday = rs.getDate(User.BIRTHDAY);
            int rule = rs.getInt(User.RULE);
            result.add(new User(id, userName, passWord, birthday, displayName, rule));
        }
        return result;

    }

}
