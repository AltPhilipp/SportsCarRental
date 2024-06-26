package ch.fhnw.sportscarrental.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "racetrack")
public class Racetrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trackID;
    private String trackName;
    private String trackDescription;
    private String trackLocation;
    private Double trackLength;
    public Long getTrackID() {
        return trackID;
    }

    //Getter and Setter methods
    
    public void setTrackID(Long trackID) {
        this.trackID = trackID;
    }
    public String getTrackName() {
        return trackName;
    }
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }
    public String getTrackDescription() {
        return trackDescription;
    }
    public void setTrackDescription(String trackDescription) {
        this.trackDescription = trackDescription;
    }
    public String getTrackLocation() {
        return trackLocation;
    }
    public void setTrackLocation(String trackLocation) {
        this.trackLocation = trackLocation;
    }
    public Double getTrackLength() {
        return trackLength;
    }
    public void setTrackLength(Double trackLength) {
        this.trackLength = trackLength;
    }
    
}