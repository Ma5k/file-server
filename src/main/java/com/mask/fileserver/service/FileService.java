package com.mask.fileserver.service;

import java.util.List;

import com.mask.fileserver.domain.File;

public interface FileService {
	/**
	 * 保存文件
	 * @param File
	 * @return
	 */
	File saveFile(File file);
	
	/**
	 * 删除文件
	 * @param File
	 * @return
	 */
	void removeFile(String id);
	
	/**
	 * 根据id获取文件
	 * @param File
	 * @return
	 */
	File getFileById(String id);
	
	/**
	 * 获取文件列表
	 * @param File
	 * @return
	 */
	List<File> listFiles();
}
