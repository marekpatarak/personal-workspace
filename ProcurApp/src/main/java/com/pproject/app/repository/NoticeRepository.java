package com.pproject.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.pproject.app.entity.Notice;

public interface NoticeRepository extends CrudRepository<Notice, String> {

}
