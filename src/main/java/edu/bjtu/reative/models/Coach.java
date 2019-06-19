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
public class Coach implements Serializable {

    private Integer id;
    private String username;
    private String name;
    private String password;

    private Integer age;

    //1为男 0为女
    private Integer sex;
    private String phoneNumber;
    private String mail;
    private String content;

    private String Course_id;

}
