package com.sparta.teamproject6.service;

import com.sparta.teamproject6.domain.Post;
import com.sparta.teamproject6.domain.User;
import com.sparta.teamproject6.dto.PostRequestsDto;
import com.sparta.teamproject6.repository.PostRepository;
import com.sparta.teamproject6.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public Post create(PostRequestsDto requestsDto) {
        User user = userRepository.findById(requestsDto.getUserId()).orElseThrow(
                () -> new IllegalArgumentException("유저가 존재하지 않습니다."));
        Post post = new Post(requestsDto, user);
        return postRepository.save(post);


    }

    @Transactional
    public String update(Long id, PostRequestsDto requestsDto) {
        User user = userRepository.findById(requestsDto.getUserId()).orElseThrow(
                () -> new IllegalArgumentException("유저가 존재하지 않습니다."));
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("게시글이 존재하지 않습니다."));
        post.update(requestsDto);
        return "로그인 구현 하면 수정함";
    }
//        String name1 = user.getUsername();// 레포지 안에 유저아이디
//        String name2 = requestsDto
//        if (!name2.equals(name1)) {
//            return "수정 실패";
//        } else {
//            post.update(requestsDto);
//            return "수정 성공";
//        }
//
//    }

    public String delete(Long id, PostRequestsDto requestsDto) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("게시글이 존재하지 않습니다."));
        postRepository.delete(post);
        return "로그인 구현하면 삭제완료함";
//            String name1 = post.getNickname();
//            String name2 = requestsDto.getNickname();
//            if (!name2.equals(name1)) {
//                return "삭제 실패";
//            } else {
//                postRepository.delete(post);
//                return "삭제 성공";
//            }
//        }
    }
}