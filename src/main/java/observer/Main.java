package observer;

import observer.model.EmailTopic;
import observer.model.EmailTopicObserver;

public class Main {
    public static void main(String[] args) {
        EmailTopic emailTopic = new EmailTopic();

        EmailTopicObserver emailTopicObserver1 = new EmailTopicObserver("observer-1");
        EmailTopicObserver emailTopicObserver2 = new EmailTopicObserver("observer-2");

        emailTopic.register(emailTopicObserver1);
        emailTopic.register(emailTopicObserver2);

        emailTopicObserver1.setSubject(emailTopic);
        emailTopicObserver2.setSubject(emailTopic);

        emailTopicObserver1.update();

        emailTopic.postMessage("hello all!!");
    }
}
