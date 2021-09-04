package com.xue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TestBCrypt {
    @Test
    public void test1() {
        for (int i = 0; i < 10; i++) {
            String gensalt = BCrypt.gensalt();
            String hashpw = BCrypt.hashpw("123456", gensalt);
            System.out.println(hashpw);
            System.out.println(gensalt);
            System.out.println("------------------");
        }
    }
}
