/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netgloo.models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell-3460
 */
public class Test_generatingRequest_MappingUrl {

    public Test_generatingRequest_MappingUrl() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {

        for (int i = 200; i < 500; i++) {
//            System.out.println("\n");
            System.out.println("@RequestMapping(value = \"/getMethod"+i+"\")\n"
                    + "    public List getMethod"+i+"() {\n"
                    + "    return userDao.getAll();\n"
                    + "    }");
//            System.out.println("\n");
        }//for

    }//hello
}
