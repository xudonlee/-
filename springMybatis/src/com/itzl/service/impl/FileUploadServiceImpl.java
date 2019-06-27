package com.itzl.service.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import org.apache.commons.fileupload.FileItem;
import org.springframework.stereotype.Service;

import com.itzl.service.FileUploadService;
import com.itzl.pojo.News;
@Service
public class FileUploadServiceImpl implements FileUploadService {

	@Override
	public News newsUpload(List<FileItem> fs) {
		News ns = new News();
		try {
			for(FileItem f:fs){
				if(f.isFormField()){
					String inputName = f.getFieldName();
					String inputValue = f.getString("UTF-8");
					if("id".equals(inputName)) {
						if(inputValue!=null&&!"".equals(inputValue)) {
							ns.setId(new Integer(inputValue));
						}
					}
					
					if("newsid".equals(inputName)){
						if(inputValue!=null&&!"".equals(inputValue)){
							ns.setNewId(new Integer(inputValue));
						}
					}if("newstitle".equals(inputName)){
						ns.setNewTitle(inputValue);
					}if("context".equals(inputName)){
						ns.setNewContext(inputValue);
					}if("newseditor".equals(inputName)){
						ns.setNewEditor(inputValue);
					}
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
					
					if("newsdate".equals(inputName)){
						if(inputValue!=null&&!"".equals(inputValue)){
							ns.setNewDate(sdf.parse(inputValue));
						}
					}

				}else{
					String oldName = f.getName();
					if(oldName!=null&&!"".equals(oldName)){
						String newName=UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
						File newFile = new File("G:/Program Files/Apache Software Foundation/apache-tomcat-8.5.41/webapps/imgs/"+newName);
						f.write(newFile);
						ns.setNewPic("../imgs"+newName);
						
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ns;
	}

}
