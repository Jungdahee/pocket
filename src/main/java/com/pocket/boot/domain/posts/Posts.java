package com.pocket.boot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter // lombok annotation
@NoArgsConstructor // lombok annotation, 기본 생성자 자동 추가
@Entity // JPA annotation, 테이블과 링크될 클래스
public class Posts { // 실제 DB의 테이블과 매칭될 클래스

    @Id // PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment option
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스 생성
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
