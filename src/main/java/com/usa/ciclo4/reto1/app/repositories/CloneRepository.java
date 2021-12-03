/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.ciclo4.reto1.app.repositories;

import com.usa.ciclo4.reto1.app.model.Clone;
import com.usa.ciclo4.reto1.app.repositories.crud.CloneCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author r0mag
 */
@Repository
public class CloneRepository {

    @Autowired
    private CloneCrudRepository cloneCrud;

    public List<Clone> getAll() {
        return (List<Clone>) cloneCrud.findAll();
    }

    public Optional<Clone> getCloneById(int id) {
        return cloneCrud.findById(id);
    }

    public Clone save(Clone clone) {
        return cloneCrud.save(clone);
    }

    public void delete(Integer id) {
        cloneCrud.deleteById(id);
    }

}
