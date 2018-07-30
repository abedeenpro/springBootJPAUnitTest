package netgloo.models;

import netgloo.models.UserDaoI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaMysqlJpaAbedeenApplicationTests {
    
        @Autowired
        private TestEntityManager entityManager;
    
        @Autowired
        private UserDaoI userDaoI; 
        
        @Test
        public void test_Hello()
        {
            System.out.println(userDaoI.getAll());
        }

}