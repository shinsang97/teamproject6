package com.sparta.teamproject6.controller;

import com.sparta.teamproject6.domain.Post;
import com.sparta.teamproject6.dto.PostRequestsDto;
import com.sparta.teamproject6.repository.PostRepository;
import com.sparta.teamproject6.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;
    private final PostService postService;

    @PostMapping("/api/post")
    public Post createPost(@RequestBody PostRequestsDto requestsDto) {
        return postService.create(requestsDto);
    }

}
