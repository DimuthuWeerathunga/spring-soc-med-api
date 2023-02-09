package com.dimuthu.smrest.jpa;

import com.dimuthu.smrest.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
