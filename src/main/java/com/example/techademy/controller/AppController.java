package com.example.techademy.controller;

import com.example.techademy.pojo.Contact;
import com.example.techademy.pojo.Feedback;
import com.example.techademy.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    private static final Logger log = LoggerFactory.getLogger(AppController.class);

    @Autowired
    AppService appService;

    @RequestMapping("/saveContact")
    public void saveContact(@ModelAttribute("contact")Contact contact){
        appService.addContact(contact);
    }

    @RequestMapping("/saveFeedback")
    public void saveFeedback(@ModelAttribute("feedback")Feedback feedback){
        appService.addFeedback(feedback);
    }
}
