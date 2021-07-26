package com.example.techademy.pojo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    private Integer contact_id;

    private Integer user_id;
    private String name;
    private String email;
    private Integer phone_no;
    private String message;
}
