package netgloo.models;

import java.util.Iterator;
import netgloo.services.PrintServiceI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@DataJpaTest
//@AutoConfigureTestDatabase  
public class JpaMysqlJpaAbedeenApplicationTests {
    
//this making the main problem.
//        @Autowired
//        private TestEntityManager entityManager;
    
        @Autowired
//        private UserDao1 userDaoI; 
        private UserDao1 userDaoI; 
       
        @Autowired
        PrintServiceI printServiceI;
        
        @Test
        public void test_getAllUsers()
        {
//            System.out.println(userDaoI.getAll());
            System.out.println("\n\n"+userDaoI.findAll()+"\n\n");
            for (Iterator iterator = userDaoI.findAll().iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                User user = (User) next;
                System.out.println(user.toString());
            }//for
        }//test_Hello
        
        
        @Test
        public void test_getOneUser()
        {
//            System.out.println(userDaoI.getAll());
            System.out.println("\n\n"+userDaoI.findById(1L).toString()+"\n\n");
            
        }//test_Hello
        
        
        @Test
        public void test_getdeleteOne()
        {
//            System.out.println(userDaoI.getAll());
//            userDaoI.deleteById(10L);
            System.out.println("Delete One Works.");
            
        }//test_Hello
        
        
        @Test
        public void test_printServiceP()
        {
            printServiceI.p();
        }
        
        
        @Test
        public void test_printServiceP2()
        {
            printServiceI.p2();
        }

}