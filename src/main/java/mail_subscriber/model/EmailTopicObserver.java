package mail_subscriber.model;

import mail_subscriber.interfaces.Observer;
import mail_subscriber.interfaces.Subject;

public class EmailTopicObserver implements Observer {
    private String name;
    private Subject topic;

    public EmailTopicObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Object message = topic.getUpdate(this);
        if (message == null) {
            System.out.println(name + ": no new message on this topic");
        }else {
            System.out.println(name + ": consuming message: " + message);
        }

    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
