package sample.util;

import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;

public class FileHandler {
    private static FileHandler instance = new FileHandler();
    private File selectedFile;

    public static FileHandler getInstance(){
        return instance;
    }

    public File selectFile(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("C:\\"));
        selectedFile = fileChooser.showOpenDialog(null);
        return selectedFile;
    }
    public File selectDirectory(){
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setInitialDirectory(new File("C:\\"));
        File selectedDirectory = directoryChooser.showDialog(null);
        return  selectedDirectory;
    }

    public File selectEncryptedFile(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("C:\\"));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("text files","*.txt"));
        selectedFile = fileChooser.showOpenDialog(null);
        return selectedFile;
    }
    public File getPath(){
        return selectedFile;
    }
}