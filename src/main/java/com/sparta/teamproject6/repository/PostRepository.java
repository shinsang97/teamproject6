package com.sparta.teamproject6.repository;

import com.sparta.teamproject6.domain.Post;
import com.sparta.teamproject6.dto.PostRequestsDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long>{

    List<Post> findAllByOrderByModifiedAtDesc();
}
