package com.example.god.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;;

@Entity
@AllArgsConstructor 
@NoArgsConstructor 
@Setter 
@Getter 
 
public class ClienteModel {
    private long id;
    private String username;
    private String password;
    
}
