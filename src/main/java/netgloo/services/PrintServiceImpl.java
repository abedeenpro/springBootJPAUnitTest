/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netgloo.services;

import org.springframework.stereotype.Component;

/**
 *
 * @author Dell-3460
 */
@Component
public class PrintServiceImpl implements PrintServiceI {
    @Override
    public void p()
    {
        System.out.println("Alhumdulilah...!+p");
    }
    @Override
    public void p2()
    {
        System.out.println("Alhumdulilah...!+p2");
    }
}
