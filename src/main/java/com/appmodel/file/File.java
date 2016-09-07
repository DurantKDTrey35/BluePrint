package com.appmodel.file;

import org.springframework.web.multipart.MultipartFile;

public class File 
{
	
	private MultipartFile multipartFile;
	
	
	public MultipartFile getMultipartfile()
	{
		return multipartFile;
	}
	
	public void setMultipartFile(MultipartFile myfile)
	{
		multipartFile = myfile;
	}
	
	public String getFileName()
	{
		return multipartFile.getName();
	}
	
	public long getContentSize()
	{
		return multipartFile.getSize();
	}
	

}
