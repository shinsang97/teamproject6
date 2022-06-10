package com.sparta.teamproject6.repository;

import com.sparta.teamproject6.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{


}
