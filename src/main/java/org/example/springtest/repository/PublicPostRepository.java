package org.example.springtest.repository;

import org.example.springtest.entity.PublicPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicPostRepository extends JpaRepository<PublicPost, Long> {


}
