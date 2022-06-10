package com.sparta.teamproject6.controller;

import com.sparta.teamproject6.domain.Post;
import com.sparta.teamproject6.dto.PostRequestsDto;
import com.sparta.teamproject6.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;

    @PostMapping("/api/post")
    public Post createPost(@RequestBody PostRequestsDto requestsDto) {
        Post post = new Post(requestsDto);
        return PostRepository.save(post);
    }

}
