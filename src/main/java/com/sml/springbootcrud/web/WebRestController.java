package com.sml.springbootcrud.web;

import com.sml.springbootcrud.domain.posts.PostsRepository;
import com.sml.springbootcrud.domain.posts.dto.posts.PostsSaveRequestDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class WebRestController {


    private PostsRepository postsRepository;

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDTO dto){
        postsRepository.save(dto.toEntity());
    }

}
