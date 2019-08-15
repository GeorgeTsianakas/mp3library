package com.mp3project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

    @RequestMapping(value = "/allmp3", method = RequestMethod.GET)
    public String showAllMp3Page(ModelMap mm) {
        return "allmp3";
    }

    @RequestMapping(value = "/uploadmp3", method = RequestMethod.GET)
    public String showUploadFormPage(ModelMap mm) {
        return "uploadmp3";
    }

    @RequestMapping(value = "/findlyrics", method = RequestMethod.GET)
    public String showFindLyricsPage(Model model) {
        return "findlyrics";
    }

}
