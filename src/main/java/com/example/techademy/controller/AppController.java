package com.example.techademy.controller;

import com.example.techademy.pojo.Contact;
import com.example.techademy.pojo.Feedback;
import com.example.techademy.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    private static final Logger log = LoggerFactory.getLogger(AppController.class);

    @Autowired
    AppService appService;

    @RequestMapping("/contact")
    public ModelAndView contact(ModelAndView mv){
        mv.setViewName("contact");
        return mv;
    }
    @RequestMapping("/saveContact")
    public String saveContact(@ModelAttribute("contact") Contact contact){

        appService.addContact(contact);
        return "redirect:/contact";
    }

    @RequestMapping("/feedback")
    public ModelAndView feedback(ModelAndView mv){
        mv.setViewName("feedback");
        return mv;
    }
    @RequestMapping("/saveFeedback")
    public String saveFeedback(@ModelAttribute("feedback")Feedback feedback){
        appService.addFeedback(feedback);
        return "redirect:/feedback";
    }

    @RequestMapping ("/getContact/{contactId}")
    public Contact getContact(@PathVariable Integer contactId){
        return appService.getContact(contactId);
    }
}
