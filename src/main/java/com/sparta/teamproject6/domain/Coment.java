package com.sparta.teamproject6.domain;

import lombok.NoArgsConstructor;
import lombok.Getter;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Coment {

    @GeneratedValue
    @Id
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private  String coment;

}
