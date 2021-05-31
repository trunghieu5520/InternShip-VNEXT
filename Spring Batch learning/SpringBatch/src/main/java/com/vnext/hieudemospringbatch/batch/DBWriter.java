package com.vnext.hieudemospringbatch.batch;

import com.vnext.hieudemospringbatch.model.User;
import com.vnext.hieudemospringbatch.repository.TaskRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private TaskRepository taskRepository;
    @Override
    public void write(List<? extends User> task) throws Exception {
//        System.out.println("Data Saved for Users: " +task );
        taskRepository.saveAll(task);
        moveFile("src/main/resources/todo");

    }

    public void deleteFile(String dirFile) {

        File file = new File(dirFile);
        if(file.exists()) {
            file.delete();
        }else{
            return;
        }
    }

    public void moveFile(String dir) throws IOException {

        System.out.println("move file");
        File direc =  new File(dir);
        File file = new File(direc,direc.list()[0]);
        Path temp = Files.move(Paths.get(file.getPath()),Paths.get("src/main/resources/done/"+file.getName()));
        System.out.println(file.getName());
        if(temp != null)
        {
            System.out.println("File renamed and moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
        deleteFile(file.getPath());
    }
}
