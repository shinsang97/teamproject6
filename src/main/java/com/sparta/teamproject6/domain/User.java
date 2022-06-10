package com.sparta.teamproject6.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sparta.teamproject6.Timestamped;
import com.sparta.teamproject6.dto.UserRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class User extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNumber;

    @JsonBackReference
    @OneToMany(mappedBy = "user", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Post> postList = new ArrayList<>();

    //아이디
    @Column(nullable = false)
    private String username;
    //닉네임
    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;





    public User(Long userNumber, String username, String nickname, String password) {
        this.userNumber = userNumber;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
    }

    public User(UserRequestDto requestDto){

        this.userNumber = requestDto.getUserNumber();
        this.nickname = requestDto.getUsername();
        this.nickname = requestDto.getNickname();
        this.password = requestDto.getPassword();
    }

    public void update(UserRequestDto requestDto){

        this.userNumber = requestDto.getUserNumber();
        this.nickname = requestDto.getUsername();
        this.nickname = requestDto.getNickname();
        this.password = requestDto.getPassword();
    }
}
