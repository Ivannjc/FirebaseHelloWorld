package sg.edu.rp.c346.firebasehelloworld;

import java.io.Serializable;

/**
 * Created by 15017608 on 25/7/2017.
 */

public class Message implements Serializable {

    private String text;
    private String priority;

    public Message() {

    }
    public Message(String text, String priority) {
        this.text = text;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Message{" +
                ", text='" + text + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }


}
