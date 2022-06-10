package com.sparta.teamproject6.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequestsDto {
    private String title;
    private String image;
    private String content;
}
