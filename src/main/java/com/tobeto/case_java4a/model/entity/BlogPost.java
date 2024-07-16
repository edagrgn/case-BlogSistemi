package com.tobeto.case_java4a.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

import java.time.LocalDateTime;
import java.util.Set;

@Entity(name = "blogPosts")
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    private LocalDateTime publishedDate;

    @OneToMany(mappedBy = "blogPost", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Comment> comments;

}
