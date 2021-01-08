package org.sid.customerservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Integer Id;
    private    String matricule;
    private String login;
    private  String password;
    private String firstName;
    private String lastName;
    private Integer NumCin;
    private String email;
    private Integer numTel;
    private String diplome;
    private String familySituation;
    private String adresse;
    private String dateNaissance;
    private boolean isActif;





}