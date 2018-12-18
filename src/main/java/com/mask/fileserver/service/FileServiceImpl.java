package com.mask.fileserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mask.fileserver.domain.File;
import com.mask.fileserver.repository.FileRepository;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	public FileRepository fileRepository;


	@Override
	public File saveFile(File file) {
		return fileRepository.save(file);
	}


	@Override
	public void removeFile(String id) {
		fileRepository.delete(id);
	}


	@Override
	public File getFileById(String id) {
		return fileRepository.findOne(id);
	}


	@Override
	public List<File> listFiles() {
		return fileRepository.findAll();
	}

}
