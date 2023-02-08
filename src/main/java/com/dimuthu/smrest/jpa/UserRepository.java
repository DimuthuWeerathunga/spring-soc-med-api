package com.dimuthu.smrest.jpa;

import com.dimuthu.smrest.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
