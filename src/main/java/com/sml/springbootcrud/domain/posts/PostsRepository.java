package com.sml.springbootcrud.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p " +
            "FROM Posts p " +
            "ORDER BY p.id DESC")
    Stream<Posts> findAllDesc();

//    @Modifying
//    @Query("DELETE FROM Posts p WHERE title = ?1")
//    void deleteByTitle(String title);

    @Modifying
    @Query("DELETE FROM Posts p WHERE title = :title")
    void deleteByTitle(@Param("title") String title);

}
