package com.tobeto.case_java4a.repository;

import com.tobeto.case_java4a.model.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    List<BlogPost> findByAuthor_Username(String username);
    List<BlogPost> findByPublishedDateBetween(LocalDateTime start, LocalDateTime end);
}
