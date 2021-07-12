package com.example.sms.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@Getter
@Setter
public class Item {

    @Id
    private String id;
    private String name;

    private List<KeyPair> keyPairs;


}
