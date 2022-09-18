package com.stovblog;

import com.stovblog.entity.UserAuthor;
import com.stovblog.mapper.UserAuthorMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testInsertUser {

    @Autowired
    private UserAuthorMapper userAuthorMapper;

    @Test
    public void testInesrt(){
        UserAuthor userAuthor = new UserAuthor();
        userAuthor.setUserNickName("Sto");
        userAuthor.setUserPassword("123456");
        userAuthor.setUserProfilePhoto("http://localhost:8080/backgroundimgs/03.png");
        userAuthorMapper.insert(userAuthor);
    }
}
