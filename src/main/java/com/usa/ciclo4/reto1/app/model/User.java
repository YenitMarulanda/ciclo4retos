package com.usa.ciclo4.reto1.app.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.metamodel.SingularAttribute;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "usuarios")
public class User{

    @Id
    private Integer id;
    private String identification;
    private String name;
    //private Date birthtDay;
    //private String monthBirthtDay;
    private String address;
    private String cellPhone;
    private String email;
    private String password;
    private String zone;
    private String type;

}
