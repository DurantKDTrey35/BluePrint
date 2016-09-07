package com.springapplication.filecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.appmodel.file.File;

@Controller
public class FileController 
{

	//Тут дописать разбери JavaBean beans 
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String myForm()
	{
		return "succesFile";
	}
	/**
	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model)
	{
		File file = new File();
		model.addAttribute("file", file);
		return "file";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String fileUploaded(Model model, @Validated File file, BindingResult result)
	{
		String returnVal = "succesFile";
		
		if (result.hasErrors())
		{
			return "file";
		}
		else
		{
			MultipartFile multipartfile = file.getMultipartfile();
		}
		
		return returnVal;
	}
	*/
}
