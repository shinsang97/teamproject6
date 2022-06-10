package com.sparta.teamproject6.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor // 기본 생성자 만듬.
@Getter // 조회를 하기 위해 있어야 됨.
@Entity // 테이블과 연계됨을 스프링에게 알려줌
public class Post extends Timestamped { // 생성 , 수정 시간을 자동으로 만듬.

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id //고유 아이디
    private Long postId;

    @Column(nullable = false)
    private String username;
    // 제목
    @Column(nullable = false)
    private String title;

    // 이미지
    private String image;

    // 작성글
    private String content;
}
