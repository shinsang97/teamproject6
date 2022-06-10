package com.sparta.teamproject6.controller;

import com.sparta.teamproject6.domain.Post;
import com.sparta.teamproject6.dto.PostRequestsDto;
import com.sparta.teamproject6.repository.PostRepository;
import com.sparta.teamproject6.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;
    private final PostService postService;

    //게시글 생성
    @PostMapping("/api/post")
    public Post createPost(@RequestBody PostRequestsDto requestsDto) {
        return postService.create(requestsDto);
    }
    // 메인 홈페이지에서 게시글 내림차순 조회
    @GetMapping("/api/post/show")
    public List<Post> postList() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }
    // 게시글 수정
    @PutMapping("/api/post/{id}")
    public String updatePost(@PathVariable Long id, @RequestBody PostRequestsDto requestsDto) {
        return postService.update(id, requestsDto);
    }
    // 게시글 삭제
    @DeleteMapping("/api/post/{id}")
    public String deletePost(@PathVariable Long id, @RequestBody PostRequestsDto requestsDto) {
        return postService.delete(id, requestsDto);
    }


}
