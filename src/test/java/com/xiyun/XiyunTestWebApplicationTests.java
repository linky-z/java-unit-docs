package test.java.com.xiyun;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
class XiyunTestWebApplicationTests {

    @Test
    void firstExample() {
        //创建模拟对象
        List mockedList = mock(List.class);

        //使用模拟对象
        mockedList.add("one");
        mockedList.clear();

        //默认情况下验证方法调用1次
        verify(mockedList).add("one");
        verify(mockedList).clear();

        //验证是否调用remove方法
        verify(mockedList).remove("one");
    }
}