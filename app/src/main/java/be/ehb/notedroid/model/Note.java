package be.ehb.notedroid.model;

import java.time.LocalDate;
import java.util.Date;

public class Note {

    private String titel;
    private String content;
    private LocalDate date;

    public Note(String titel, String content, LocalDate date) {
        this.titel = titel;
        this.content = content;
        this.date = date;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
