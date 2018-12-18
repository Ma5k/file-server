package com.mask.fileserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mask.fileserver.domain.File;

public interface FileRepository extends MongoRepository<File, String> {
}