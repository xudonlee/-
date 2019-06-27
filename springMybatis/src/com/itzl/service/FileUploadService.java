package com.itzl.service;

import java.util.List;

import org.apache.commons.fileupload.FileItem;

import com.itzl.pojo.News;

public interface FileUploadService {
	public News newsUpload(List<FileItem> fs);
}
