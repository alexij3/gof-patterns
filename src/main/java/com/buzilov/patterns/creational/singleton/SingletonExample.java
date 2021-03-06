package com.buzilov.patterns.creational.singleton;

import java.io.IOException;

public class SingletonExample {
    public static void main(String[] args) {
        // Can't create an instance of FileSystemConfig by calling its constructor.
        //FileSystemConfig fileSystemConfig = new FileSystemConfig();

        try {
            FileSystemConfig fileSystemConfig = FileSystemConfig.getInstance();
            System.out.println(fileSystemConfig.getImagesPath());
            System.out.println(fileSystemConfig.getVideosPath());
            System.out.println(fileSystemConfig.getTextFilesPath());
            System.out.println("The same instance: " + (fileSystemConfig == FileSystemConfig.getInstance()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
