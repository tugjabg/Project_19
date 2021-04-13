package Models;

import java.util.Date;

public class User {
    // đại diện cho từng từ khóa trong mỗi bảng của 1 đối tượng nào đấy -> tránh điền nhầm, khó fix bug
    public static final String ID = "id";
    public static final String USER_NAME = "username";
    public static final String PASS_WORD = "password";
    public static final String DISPLAY_NAME = "display_name";
    public static final String BIRTHDAY = "birthday";
    public static final String RULE = "rule";


    private int id;
    private String userName;
    private String passWord;
    private Date birthday;
    private String displayName;
    private int rule;

    public User(int id, String userName, String passWord, Date birthday, String displayName, int rule) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.birthday = birthday;
        this.displayName = displayName;
        this.rule = rule;
    }

    public User(String userName, String passWord, Date birthday, String displayName, int rule) {
        this.userName = userName;
        this.passWord = passWord;
        this.birthday = birthday;
        this.displayName = displayName;
        this.rule = rule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getRule() {
        return rule;
    }

    public void setRule(int rule) {
        this.rule = rule;
    }
}
