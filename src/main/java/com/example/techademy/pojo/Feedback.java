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
public class Feedback {

    @Id
    private Integer f_id;

    private Integer user_id;
    private String name;
    private String email;
    private String feedback;
}
