package com.app.appDetails.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "application")
@Data
public class Application implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appID;

    String appName;

    String appDesc;

    String region;

    String techStack;
}
