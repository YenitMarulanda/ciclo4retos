package com.usa.ciclo4.reto1.app.repositories.crud;

import com.usa.ciclo4.reto1.app.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

//public interface UserCrudRepository extends CrudRepository<User,Integer> {
public interface UserCrudRepository extends MongoRepository<User,Integer> {
    /*
    este es para practicar
     */
    public Optional<User> findByName(String name);
    /*
    1.6 utilizar elementos que el crud repository me permite implementar
    buscar un unico usuario por email
    Select * from user where user_email=''
     */
    public Optional<User> findByEmail(String email);
    /*
    buscar un unico usuario por email y password
    Select * from user where user_email='' and user_password=''
     */
    public Optional<User> findByEmailAndPassword(String email,String password);

    /*
    con list los valores no son unicos
     */
    public List<User> findByNameOrEmail(String name, String email);
    /**
     * 
     * @param Identification
     * @param cellPhone
     * @param email
     * @param password
     * @param Name
     * @return 
     */
    public List<User> findByIdentificationAndCellPhoneAndEmailAndPasswordAndName(String Identification,String cellPhone, String email, String password, String Name);
}


