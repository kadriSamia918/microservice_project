package org.sid.customerservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class offre {
    @Id
    @GeneratedValue
 private Integer id;
private boolean statut;
private String poste ;
private String creationDate;
private String finpubDate;
private String descriprion;
@ManyToOne
    private User user;
}
