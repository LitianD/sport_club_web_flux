package edu.bjtu.reative.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coach {
    @Id
    private Integer id;
    private String username;
    private String name;
    private String password;

    private Integer age;
    private Integer sex;
    private String phoneNumber;
    private String mail;
    private String content;
}
