package com.example.likelionnfirst.post.dto;

import com.example.likelionnfirst.post.domain.Board;
import lombok.Builder;
import lombok.Getter;

import  java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
public class BoardDto {

    private Long id;
    private String name;
    private String age;
    private String major;
    private String introduce;
    private LocalDateTime createdTime;
    private LocalDateTime modifiedTime;

    public Board toEntity(){
        Board build = Board.builder()
                .id(id)
                .name(name)
                .age(age)
                .major(major)
                .introduce(introduce)
                .build();
        return build;

    }

    @Builder
    public BoardDto(Long id, String name, String age, String major, String introduce, LocalDateTime createdTime, LocalDateTime modifiedTime){
        this.id=id;
        this.name=name;
        this.age=age;
        this.major=major;
        this.introduce=introduce;
        this.createdTime=createdTime;
        this.modifiedTime=modifiedTime;
    }
}
