package com.example.techademy.dao;

import com.example.techademy.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccess extends JpaRepository<Admin,Integer> {
}
