package com.lz_java.controller;

import com.lz_java.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletContext;
import java.io.IOException;

@Controller
public class FileUploadController {

    @Autowired
    ServletContext context;

    @RequestMapping(value="/fileUpload", method= RequestMethod.GET)
    public ModelAndView fileUpload()
    {
        File file = new File();

        return new ModelAndView("file/upload", "command", file);
    }

    @RequestMapping(value="/fileUpload", method= RequestMethod.POST)
    public String fileUploadPost(@Validated File file, BindingResult result, ModelMap model) throws IOException
    {
        if (result.hasErrors()) {
            System.out.println("validation error");
            return "file/upload";
        } else {
            System.out.println("fetching file");
            MultipartFile multipartFile = file.getFile();
            String uploadPath = context.getRealPath("") + java.io.File.separator + "temp" + java.io.File.separator;

            FileCopyUtils.copy(file.getFile().getBytes(), new java.io.File(uploadPath + file.getFile().getOriginalFilename()));
            String fileName = multipartFile.getOriginalFilename();
            model.addAttribute("fileName", fileName);
            return "file/success";
        }
    }
}
