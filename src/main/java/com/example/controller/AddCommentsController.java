package com.example.controller;

import com.example.entity.AddComments;
import com.example.service.AddCommentsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddCommentsController {
    private final AddCommentsService addCommentsService;

    public AddCommentsController(AddCommentsService addCommentsService) {
        this.addCommentsService = addCommentsService;
    }

    @PostMapping("/addComments")
    public ResponseEntity<AddComments> addComments(@RequestBody AddComments addComments) {
        addCommentsService.addComments(addComments);
        return ResponseEntity.ok(addComments);
    }
}
