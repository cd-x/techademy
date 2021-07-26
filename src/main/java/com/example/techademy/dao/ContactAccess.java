package com.example.techademy.dao;

import com.example.techademy.pojo.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactAccess extends JpaRepository<Contact,Integer> {
}
