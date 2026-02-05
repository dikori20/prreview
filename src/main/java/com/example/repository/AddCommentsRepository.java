package com.example.repository;

import com.example.entity.AddComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddCommentsRepository extends JpaRepository<AddComments,Long> {

}
