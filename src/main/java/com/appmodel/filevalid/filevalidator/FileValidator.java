package com.appmodel.filevalid.filevalidator;
import  com.appmodel.file.File;
import org.springframework.validation.Validator;


import org.springframework.validation.Errors;

public class FileValidator implements Validator
{
	public boolean supports(Class<?> clazz)
	{
		return File.class.equals(clazz);
	}
	
	public void validate(Object obj, Errors e)
	{
		File file = (File) obj;
		if (file.getMultipartfile().getSize() == 0)
		{
			e.rejectValue("file", "valid.file");
		}
	}

	
}
