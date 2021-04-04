package com.pocket.boot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity 클래스, Entity 클래스의 PK type> -> CRUD 메소드 자동 생성
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
