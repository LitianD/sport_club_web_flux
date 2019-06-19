package edu.bjtu.reative.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gym implements Serializable {
    private Integer id;

    private String name;

    private String address;


    private List<Course> courseList;

}
