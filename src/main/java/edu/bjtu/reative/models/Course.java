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
public class Course implements Serializable {

    private Integer id;

    private String name;

    private String gym_id;

    private Double cost;

    private String content;

    private String Time;


}
