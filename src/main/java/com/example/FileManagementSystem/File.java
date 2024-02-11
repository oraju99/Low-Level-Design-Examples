package com.example.FileManagementSystem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File implements FileSystemComponent {

    private String fileName;

    @Override
    public void display() {
        System.out.println("File name is " + fileName);
    }
}
