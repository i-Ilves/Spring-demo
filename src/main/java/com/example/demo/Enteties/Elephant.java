package com.example.demo.Enteties;

import javax.persistence.*;

@Entity
@Table(name = "elephants")
public class Elephant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String species;
    private String note;
    private String wikilink;

    public Elephant() {
    }

    public Elephant(int id, String name, String species, String note, String wikilink) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.note = note;
        this.wikilink = wikilink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getWikilink() {
        return wikilink;
    }

    public void setWikilink(String wikilink) {
        this.wikilink = wikilink;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", note='" + note + '\'' +
                ", wikilink='" + wikilink + '\'' +
                '}';
    }
}
