/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.ciclo4.reto1.app.services;

import com.usa.ciclo4.reto1.app.model.Clone;
import com.usa.ciclo4.reto1.app.repositories.CloneRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author r0mag
 */
@Service
public class CloneServices {

    @Autowired
    private CloneRepository cloneRepository;

    public List<Clone> getAll() {
        return cloneRepository.getAll();
    }

    public Clone save(Clone clone) {
        return cloneRepository.save(clone);
    }

    public Clone update(Clone clone) {
        if (clone.getId() != null) {

            Optional<Clone> cloneExist = cloneRepository.getCloneById(clone.getId());
            if (!cloneExist.isEmpty()) {
                if (clone.getBrand() != null) {
                    cloneExist.get().setBrand(clone.getBrand());
                }

                if (clone.getProcesor() != null) {
                    cloneExist.get().setProcesor(clone.getProcesor());
                }

                if (clone.getOs() != null) {
                    cloneExist.get().setOs(clone.getOs());
                }

                if (clone.getDescription() != null) {
                    cloneExist.get().setDescription(clone.getDescription());
                }

                if (clone.getMemory() != null) {
                    cloneExist.get().setMemory(clone.getMemory());
                }

                if (clone.getHardDrive() != null) {
                    cloneExist.get().setHardDrive(clone.getHardDrive());
                }

                if (clone.getPrice() != 0) {
                    cloneExist.get().setPrice(clone.getPrice());
                }

                if (clone.getQuantity() != 0) {
                    cloneExist.get().setQuantity(clone.getQuantity());
                }

                if (clone.getPhotography() != null) {
                    cloneExist.get().setPhotography(clone.getPhotography());
                }

                return cloneRepository.save(cloneExist.get());
                
            } else {
                return clone;
            }

        } else {
            return clone;
        }

    }

    public Integer deleteClone(Integer id) {
        Optional<Clone> userExist = cloneRepository.getCloneById(id);

        if (!userExist.isEmpty()) {
            cloneRepository.delete(id);
            return null;
        } else {
            return id;
        }
    }
}
