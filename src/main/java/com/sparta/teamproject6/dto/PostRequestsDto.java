package com.sparta.teamproject6.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class PostRequestsDto {
    private String title;
    private String imageurl;
    private String content;
    private Long userId;
}
