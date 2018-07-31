///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package netgloo.controllers;
//
//import java.util.List;
//import netgloo.models.User;
//import netgloo.models.UserDao1;
//import netgloo.models.UserDaoI;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
///**
// *
// * @author Dell-3460
// */
//@RestController
//public class NewRestController {
//
//    @Autowired
//    private UserDaoI userDao;
//    
//    @Autowired
//    private UserDao1 userDao1;
//
//    @RequestMapping(value = "/getAll")
//    public List getAll() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll23")
//    public List getAll2() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll3")
//    public List getAll3() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll4")
//    public List getAll4() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll5")
//    public List getAll5() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll6")
//    public List getAll6() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll7")
//    public List getAll7() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll8")
//    public List getAll8() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll9")
//    public List getAll9() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll10")
//    public List getAll10() {
//        return userDao.getAll();
//    }
//    @RequestMapping(value = "/getAll1")
//    public List getAll11() {
//        return userDao.getAll();
//    }
//
//    @RequestMapping(value = "/getAll2")
//    public List getAll12() {
//        return (List<User>) userDao1.findAll();
//    }
//    @RequestMapping(value = "/save")
//    public User save(@RequestBody User user) {
//        return  userDao1.save(user);
//    }
//
//    @RequestMapping(value = "/create")
//    public String create(String email, String name) {
//        try {
//            User user = new User(email, name);
//            userDao.create(user);
//        } catch (Exception ex) {
//            return "Error creating the user: " + ex.toString();
//        }
//        return "User succesfully created!";
//    }
//    
//    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
//    public String createUser(@RequestBody User user) {
//            userDao.create(user);
//        return "User succesfully created!";
//    }
//    
//    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
//    public String updateUser(@RequestBody User user) {
//            userDao.update(user);
//        return "User succesfully created!";
//    }
//
//}//class
