package com.example.likelionnfirst.post.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length=100, nullable = false)
    private String name;

    @Column(length=100, nullable = false)
    private String age;

    @Column(length=100, nullable = false)
    private String major;

    @Column(columnDefinition = "Text", nullable = false)
    private String introduce;



    @Builder
    public Board(Long id, String name, String age, String major, String introduce){
        this.id=id;
        this.name=name;
        this.age=age;
        this.major=major;
        this.introduce=introduce;
    }
}