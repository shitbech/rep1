package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: JAVA类作用描述
 * @Author :胡辉
 * @CreatDate: 2019/3/21 20:09
 * @Version : 1.0
 */
public class TesrSpring {
    @Test
    public void run(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService service = ac.getBean("accountService", AccountService.class);
        service.findAll();
    }
}
