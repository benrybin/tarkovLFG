package com.lfg.tarkovLFG.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String discordName;
    private String inGameName;
    private String email;
    private String region;
    private List<String> playStyle;
    private List<String> mapsLike;
    private List<String> mapsDontLike;

    @OneToOne
    @MapsId
    private User user;


}
