package com.example.service;

import com.example.entity.AddComments;
import com.example.repository.AddCommentsRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class AddCommentsService {

    private final AddCommentsRepository addCommentsRepository;

    public AddCommentsService(AddCommentsRepository addCommentsRepository) {
        this.addCommentsRepository = addCommentsRepository;
      }

    public AddComments addComments(AddComments addComments) {
       return addCommentsRepository.save(addComments);

    }
}
