package com.lfg.tarkovLFG.Models;

import javax.persistence.*;

@Entity
@Table(name = "joingrouprequest")
public class JoinGroupRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UserProfile userProfile;
    private String message;
    private Boolean accepted;

}
