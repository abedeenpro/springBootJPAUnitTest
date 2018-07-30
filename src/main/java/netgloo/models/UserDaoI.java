/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netgloo.models;

import java.util.List;

/**
 *
 * @author Dell-3460
 */
public interface UserDaoI {

    // ------------------------
    // PUBLIC METHODS
    // ------------------------
    /**
     * Save the user in the database.
     */
    void create(User user);

    /**
     * Delete the user from the database.
     */
    void delete(User user);

    /**
     * Return all the users stored in the database.
     */
    @SuppressWarnings(value = "unchecked")
    List<User> getAll();

    /**
     * Return the user having the passed email.
     */
    User getByEmail(String email);

    /**
     * Return the user having the passed id.
     */
    User getById(long id);

    /**
     * Update the passed user in the database.
     */
    void update(User user);
    
}
