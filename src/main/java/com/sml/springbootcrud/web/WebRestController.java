package com.sml.springbootcrud.web;

import com.sml.springbootcrud.domain.posts.PostsRepository;
import com.sml.springbootcrud.domain.posts.dto.posts.PostsSaveRequestDTO;
import com.sml.springbootcrud.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDTO dto){
        System.out.println("Here!");
        postsService.save(dto);
    }

}
