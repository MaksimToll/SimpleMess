package com.simplemess.repository;

import com.simplemess.entity.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message , Long> {
    List<Message> findByAoutorId(Long userId);
}
