package com.buzilov.patterns.singleton;

import java.io.IOException;
import java.util.Properties;

public class FileSystemConfig {
    private static FileSystemConfig instance;
    private Properties properties;

    private static String IMG_PATH_PROPERTY = "path.images";
    private static String VIDEOS_PATH_PROPERTY = "path.videos";
    private static String TEXT_PATH_PROPERTY = "path.text";

    private FileSystemConfig() throws IOException {
        properties = new Properties();
        properties.load(getClass().getResourceAsStream("props/fileconfig.properties"));
    }

    public static FileSystemConfig getInstance() throws IOException{
        if (instance == null) {
            instance = new FileSystemConfig();
        }
        return instance;
    }

    public String getImagesPath() {
        return properties.getProperty(IMG_PATH_PROPERTY);
    }

    public String getVideosPath() {
        return properties.getProperty(VIDEOS_PATH_PROPERTY);
    }

    public String getTextFilesPath() {
        return properties.getProperty(TEXT_PATH_PROPERTY);
    }

}
