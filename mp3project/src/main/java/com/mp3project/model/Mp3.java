package com.mp3project.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "mp3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mp3.findAll", query = "SELECT m FROM Mp3 m")
    , @NamedQuery(name = "Mp3.findById", query = "SELECT m FROM Mp3 m WHERE m.id = :id")
    , @NamedQuery(name = "Mp3.findByTitle", query = "SELECT m FROM Mp3 m WHERE m.title = :title")
    , @NamedQuery(name = "Mp3.findByAlbum", query = "SELECT m FROM Mp3 m WHERE m.album = :album")
    , @NamedQuery(name = "Mp3.findByArtist", query = "SELECT m FROM Mp3 m WHERE m.artist = :artist")
    , @NamedQuery(name = "Mp3.findByReleaseyear", query = "SELECT m FROM Mp3 m WHERE m.releaseyear = :releaseyear")
    , @NamedQuery(name = "Mp3.findByFilename", query = "SELECT m FROM Mp3 m WHERE m.filename = :filename")
    , @NamedQuery(name = "Mp3.findByPhotofilename", query = "SELECT m FROM Mp3 m WHERE m.photofilename = :photofilename")})
public class Mp3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "title")
    private String title;
    @Size(max = 45)
    @Column(name = "album")
    private String album;
    @Size(max = 255)
    @Column(name = "artist")
    private String artist;
    @Size(max = 45)
    @Column(name = "releaseyear")
    private String releaseyear;
    @Lob
    @Column(name = "file")
    private byte[] file;
    @Size(max = 100)
    @Column(name = "filename")
    private String filename;
    @Lob
    @Column(name = "photo")
    private byte[] photo;
    @Size(max = 45)
    @Column(name = "photofilename")
    private String photofilename;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "lyrics")
    private String lyrics;

    public Mp3() {
    }

    public Mp3(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(String releaseyear) {
        this.releaseyear = releaseyear;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPhotofilename() {
        return photofilename;
    }

    public void setPhotofilename(String photofilename) {
        this.photofilename = photofilename;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mp3)) {
            return false;
        }
        Mp3 other = (Mp3) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mp3project.model.Mp3[ id=" + id + " ]";
    }
    
}
