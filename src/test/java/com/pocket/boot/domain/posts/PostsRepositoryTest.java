package com.pocket.boot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest // H2 데이터베이스 자동 실행
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After // 단위 테스트가 끝날 때마다 수행되는 메소드
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기(){
        String title = "테스트 게시글";
        String content = "테스트 본문";

        // id 값이 있다면 update, 없다면 insert
        postsRepository.save(Posts.builder()
                                .title(title)
                                .content(content)
                                .author("jungdahee010@naver.com")
                                .build());

        // posts 테이블에 있는 모든 데이터 조회
        List<Posts> postsList = postsRepository.findAll();
    }




}
