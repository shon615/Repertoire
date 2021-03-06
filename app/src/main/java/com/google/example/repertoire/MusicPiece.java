package com.google.example.repertoire;

/**
 * Created by Yanjun on 9/5/2015.
 */
public class MusicPiece implements Comparable<MusicPiece> {

    private String name;
    private int opus;
    private int number;
    private String composer;

    public MusicPiece() {
        name = "";
        opus = 0;
        number = 0;
        composer = "";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOpus() {
        return opus;
    }

    public void setOpus(int opus) {

        this.opus = opus;
    }

    public MusicPiece(String composer , int opus, int number, String name) {
        this.name = name;
        this.opus = opus;
        this.number = number;

        this.composer = composer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposer() {

        return composer;
    }

    public String toString () {
        return String.format("name: %S opus. %d no. %d, by %S", new Object[]{this.getName(), this.getOpus(), this.getNumber(), this.getComposer()});
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int compareTo(MusicPiece other) {
        if (composer.compareTo(other.getComposer()) != 0) {
            return composer.compareTo(other.getComposer());
        } else if (Integer.compare(opus, other.getOpus()) != 0) {
            return Integer.compare(opus, other.getOpus());
        } else if (Integer.compare(number, other.getNumber()) != 0) {
            return Integer.compare(number, other.getNumber());
        } else {
            return 0;
        }
    }

    public boolean equals(MusicPiece other) {
        return (compareTo(other) == 0);
    }


}
