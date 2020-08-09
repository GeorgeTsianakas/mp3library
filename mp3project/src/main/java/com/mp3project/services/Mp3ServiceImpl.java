package com.mp3project.services;

import com.mp3project.model.Mp3;
import com.mp3project.repositories.Mp3Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mp3ServiceImpl implements Mp3Service {

    @Autowired
    private Mp3Repository mp3Repo;

    @Override
    public List<Mp3> getAllMp3() {
        return mp3Repo.findAll();
    }

    @Override
    public Mp3 getMp3ByID(int id) {
        return mp3Repo.findById(id).get();
    }

    @Override
    public void insertMp3(Mp3 mp3) {
        mp3Repo.save(mp3);
    }

    @Override
    public void deleteMp3(int id) {
        mp3Repo.deleteById(id);
    }

}
