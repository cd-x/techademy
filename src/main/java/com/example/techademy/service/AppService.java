package com.example.techademy.service;

import com.example.techademy.dao.ContactAccess;
import com.example.techademy.dao.FeedbackAccess;
import com.example.techademy.pojo.Contact;
import com.example.techademy.pojo.Feedback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class AppService {

    private static final Logger log = LoggerFactory.getLogger(AppService.class);
    private final ContactAccess contactAccess;
    private final FeedbackAccess feedbackAccess;

    public AppService(ContactAccess contactAccess, FeedbackAccess feedbackAccess) {
        this.contactAccess = contactAccess;
        this.feedbackAccess = feedbackAccess;
    }

    public void addContact(Contact contact){
        try{
            contactAccess.save(contact);
            log.info("Contact successfully added");
        }catch (Exception e){
            log.error(e.getMessage().toString(),e);
        }

    }
    public void addFeedback(Feedback feedback){
        try {
            feedbackAccess.save(feedback);
            log.info("Feedback added successfully.");
        }catch (Exception e){
            log.error(e.getMessage().toString(),e);
        }

    }

    public Contact getContact(Integer contact_id){
        return contactAccess.findById(contact_id).orElse(new Contact());
    }
}
