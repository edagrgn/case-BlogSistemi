package com.tobeto.case_java4a.service.concretes;

import com.tobeto.case_java4a.model.entity.BlogPost;
import com.tobeto.case_java4a.repository.BlogPostRepository;
import com.tobeto.case_java4a.service.abstracts.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BlogPostServiceImpl implements BlogPostService {
    @Autowired
    private BlogPostRepository blogPostRepository;

    @Override
    public BlogPost save(BlogPost blogPost) {
        blogPost.setPublishedDate(LocalDateTime.now());
        return blogPostRepository.save(blogPost);
    }

    @Override
    public List<BlogPost> findAll() {
        return blogPostRepository.findAll();
    }

    @Override
    public BlogPost findById(Long id) {
        return blogPostRepository.findById(id).orElse(null);
    }

    @Override
    public List<BlogPost> findByAuthor(String username) {
        return blogPostRepository.findByAuthor_Username(username);
    }

    @Override
    public void deleteById(Long id) {
        blogPostRepository.deleteById(id);
    }
}
