import autowire.bean.Category1;
import autowire.bean.Product1;
import bean.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 陈敬 on 2017/3/15.
 */
@ContextConfiguration(locations = "classpath:spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class testAutowireXml {
    @Autowired
    Product1 p;

    @Test
    public void testProduct(){
        Assert.assertNotNull(p);
        System.out.println(p.toString());
    }

    @Autowired
    Category1 category;

    @Test
    public void testCategory(){
        Assert.assertNotNull(category);
    }
}
