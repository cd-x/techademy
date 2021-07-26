package com.example.techademy.dao;

import com.example.techademy.pojo.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackAccess extends JpaRepository<Feedback,Integer> {
}
