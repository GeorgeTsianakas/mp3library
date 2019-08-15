package com.mp3project.controllers;

import com.mp3project.model.Mp3;
import com.mp3project.services.Mp3Service;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "mp3mapping")
public class Mp3Controller {

    @Autowired
    private Mp3Service mp3Service;

    @RequestMapping(value = "/douploadmp3", method = RequestMethod.POST)
    public String doUploadMp3File(ModelMap mm, @RequestParam(value = "myfile") MultipartFile sourcefile) {
        Mp3 mp3 = new Mp3();
        mp3.setFilename(sourcefile.getOriginalFilename());
        try {
            mp3.setFile(sourcefile.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(Mp3Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        mp3Service.insertMp3(mp3);
        return "redirect:/";

    }

}
