package com.example.likelionnfirst.post.repository;

import com.example.likelionnfirst.post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<Board, Long>{
}
