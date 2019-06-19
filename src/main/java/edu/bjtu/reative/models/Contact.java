package edu.bjtu.reative.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact implements Serializable {
    private Integer id;

    private String lastName;

    private String firstName;

    private String mobileNumber;    

    private String address;

    private Date createAt;

    private Date updateAt;
    
}
