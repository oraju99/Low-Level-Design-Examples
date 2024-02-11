package com.example.FileManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

    private String directoryName;
    private List<FileSystemComponent> fileSystemComponents = new ArrayList<>();

    Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void addComponent(FileSystemComponent fileSystemComponent) {
        fileSystemComponents.add(fileSystemComponent);
    }

    @Override
    public void display() {
        System.out.println("Directory name : " + directoryName);
        System.out.print("Components : ");
        for (FileSystemComponent fileSystemComponent : fileSystemComponents) {
            fileSystemComponent.display();
        }
    }
}
