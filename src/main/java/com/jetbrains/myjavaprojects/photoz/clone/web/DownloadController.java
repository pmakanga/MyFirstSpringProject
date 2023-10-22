package com.jetbrains.myjavaprojects.photoz.clone.web;

import com.jetbrains.myjavaprojects.photoz.clone.model.Photo;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class DownloadController {
    @GetMapping("download/{id}")
    public ResponseEntity<byte[]> download(@PathVariable Integer id) {
        Photo photo = new Photo();
        if(photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        byte[] data = photo.getData();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf(photo.getContentType()));
        ContentDisposition build = ContentDisposition
                .builder("attachment")
                .filename(photo.getFileName())
                .build();
        headers.setContentDisposition(build);
        return  new ResponseEntity<>(data, headers, HttpStatus.OK);
    }
}
