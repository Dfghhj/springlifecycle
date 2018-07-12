package top.dfghhj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.dfghhj.pojo.Person;

/**
 * @author dfghhj
 * @version V1.0.0
 * Description description
 * @date 2018/07/12 15:26
 */
public class BeanLifeCycle {

    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");

        ApplicationContext factory = new ClassPathXmlApplicationContext(
                "beans.xml");
        System.out.println("容器初始化成功");
        // 得到Preson，并使用
        Person person = factory.getBean("person", Person.class);
        System.out.println(person);

        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext) factory).registerShutdownHook();
    }
}
