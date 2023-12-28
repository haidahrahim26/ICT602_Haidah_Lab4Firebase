package com.example.ict602cdcs2703b_lab4haidah_firebase;

public class Artist
{
    String artisId;
    String artistName;

    public Artist(){}

    public Artist(String artisId, String artistName)
    {
        this.artisId = artisId;
        this.artistName = artistName;
    }

    public String getArtisId()
    {
        return artisId;
    }

    public String getArtistName()
    {
        return artistName;
    }

}
