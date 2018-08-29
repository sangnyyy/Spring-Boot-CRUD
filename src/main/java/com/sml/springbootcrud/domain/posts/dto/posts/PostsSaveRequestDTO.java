package com.sml.springbootcrud.domain.posts.dto.posts;


import com.sml.springbootcrud.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDTO {

    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDTO(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
