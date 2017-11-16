package com.ykp.junit;

import com.ykp.TestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class JunitTest {

    @Test
    public void test() {
        System.out.println("Hello World");
    }
}
