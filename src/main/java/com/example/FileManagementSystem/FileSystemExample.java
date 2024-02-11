package com.example.FileManagementSystem;

public class FileSystemExample {
    public static void main(String[] args) {
        // Creating individual files
        FileSystemComponent file1 = new File("Document.txt");
        FileSystemComponent file2 = new File("Image.jpeg");

        // Creating a composite directory (group)
        Directory documents = new Directory("Documents");
        documents.addComponent(file1);

        Directory pictures = new Directory("Pictures");
        pictures.addComponent(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(documents);
        rootDirectory.addComponent(pictures);

        // Displaying the file system structure
        rootDirectory.display();
    }
}
