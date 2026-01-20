package com.example.service;

import com.example.entity.AddComments;
import com.example.repository.AddCommentsRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<AddComments> getComments(Long id) {
        return addCommentsRepository.findById(id);
    }
    public void deleteComments(Long id) {
        addCommentsRepository.deleteById(id);
    }
    public void deleteAllComments() {
        addCommentsRepository.deleteAll();
    }
//    public List<AddComments> listAllComments() {
//       return addCommentsRepository.findAll();
//    }
   public String updateComments(String updateComments) {
       return "This is update";
   }
//   public AddComments updateCommentsData(AddComments addComments) {
//        return addCommentsRepository.save(addComments);
//   }

}
