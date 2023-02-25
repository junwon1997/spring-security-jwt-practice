package com.tommy.surveyProject.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "authority")
public class Authority {

    @Id @Column(name = "authority_name")
    private String authorityName;

}
