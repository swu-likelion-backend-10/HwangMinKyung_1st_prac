package com.example.likelionnfirst.post.repository;

import com.example.likelionnfirst.post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BoardRepository extends JpaRepository<Board, Long>{
    List<Board> findByNameContaining(String keyword);
}
