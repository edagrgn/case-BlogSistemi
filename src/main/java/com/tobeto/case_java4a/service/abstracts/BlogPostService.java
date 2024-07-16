package com.tobeto.case_java4a.service.abstracts;

import com.tobeto.case_java4a.model.entity.BlogPost;

import java.util.List;

public interface BlogPostService {
    BlogPost save(BlogPost blogPost);

    BlogPost save(BlogPost blogPost);

    List<BlogPost> findAll();
    BlogPost findById(Long id);
    List<BlogPost> findByAuthor(String username);
    void deleteById(Long id);
}
