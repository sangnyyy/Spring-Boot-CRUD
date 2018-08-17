package com.sml.springbootcrud.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import com.sml.springbootcrud.domain.posts.Posts;
import com.sml.springbootcrud.domain.posts.PostsRepository;
import org.junit.After;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기(){
        postsRepository.save(Posts.builder()
            .title("테스트 게시글")
            .content("테스트 본문")
            .author("SML")
            .build()
        );

        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(), is("테스트 게시글"));
        assertThat(posts.getContent(), is("테스트 본문"));
    }
}
