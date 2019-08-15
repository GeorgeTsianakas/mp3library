package com.mp3project.services;

import com.mp3project.model.Mp3;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface Mp3Service {

    public List<Mp3> getAllMp3();

    public Mp3 getMp3ByID(int id);

    public void insertMp3(Mp3 mp3);

    public void deleteMp3(int id);

}
