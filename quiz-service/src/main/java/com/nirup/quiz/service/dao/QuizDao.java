package com.nirup.quiz.service.dao;

import com.nirup.quiz.service.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}