package com.example.controller;

import com.example.entity.AddComments;
import com.example.service.AddCommentsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddCommentsController {
    private final AddCommentsService addCommentsService;

    public AddCommentsController(AddCommentsService addCommentsService) {
        this.addCommentsService = addCommentsService;
    }
    //this method is going to add id and comments
    @PostMapping("/addComments")
    public ResponseEntity<AddComments> addComments(@RequestBody AddComments addComments) {
        addCommentsService.addComments(addComments);
        return ResponseEntity.ok(addComments);
    }

    @GetMapping("/deleteAllComments")
    public void deleteAllComments() {
        addCommentsService.deleteAllComments();
    }

    @GetMapping("/listAllComments")
    public List<AddComments> listAllComments() {
        return addCommentsService.listAllComments();
    }

}
