package com.jetbrains.myjavaprojects.photoz.clone.repository;

import com.jetbrains.myjavaprojects.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
