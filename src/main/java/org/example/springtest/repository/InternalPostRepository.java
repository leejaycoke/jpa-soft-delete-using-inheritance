package org.example.springtest.repository;

import org.example.springtest.entity.InternalPost;
import org.example.springtest.entity.PublicPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalPostRepository extends JpaRepository<InternalPost, Long> {


}
