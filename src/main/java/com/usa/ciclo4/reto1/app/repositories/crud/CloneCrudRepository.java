/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.ciclo4.reto1.app.repositories.crud;

import com.usa.ciclo4.reto1.app.model.Clone;
import com.usa.ciclo4.reto1.app.model.User;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author r0mag
 */
public interface CloneCrudRepository extends MongoRepository<Clone, Integer>{
    
}
