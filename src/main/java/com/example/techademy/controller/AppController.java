package com.example.techademy.controller;

import com.example.techademy.pojo.Contact;
import com.example.techademy.pojo.Feedback;
import com.example.techademy.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    private static final Logger log = LoggerFactory.getLogger(AppController.class);

    @Autowired
    AppService appService;

    @PostMapping("/saveContact")
    public void saveContact(@RequestBody Contact contact){
        appService.addContact(contact);
    }

    @RequestMapping("/saveFeedback")
    public void saveFeedback(@ModelAttribute("feedback")Feedback feedback){
        appService.addFeedback(feedback);
    }
    @GetMapping ("/getContact/{contactId}")
    public Contact getContact(@PathVariable Integer contactId){
        return appService.getContact(contactId);
    }
}
