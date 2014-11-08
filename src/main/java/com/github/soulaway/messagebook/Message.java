package com.github.soulaway.messagebook;
 
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class Message implements Serializable {
    private static final long serialVersionUID = Message.class.getName().hashCode();
 
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String text;
    private Date sendedDate;
 
    // Constructors:
    public Message() {
    }
 
    public Message(String text) {
        this.text = text;
        this.sendedDate = new Date(System.currentTimeMillis());
    }
 
    // String Representation:
    @Override
    public String toString() {
        return text + " (Sended on " + sendedDate + ")";
    }
}