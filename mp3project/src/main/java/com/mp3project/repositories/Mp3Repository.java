package com.mp3project.repositories;

import com.mp3project.model.Mp3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mp3Repository extends JpaRepository<Mp3, Integer> {

}
