package Observer;

import java.util.Vector;

interface Observer {
    public void receiveNotification(String msg);
}

interface Observable {
    public void addSubscriber(User user);
    public void removeSubscriber(User user);
    public void notifyUser(String msg);
}
class User implements Observer {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String msg) {
        System.out.println(msg);
    }

    public void subscribe(Channel channel) {
        channel.addSubscriber(this);
    }

    public void unsubscribe(Channel channel) {
        channel.removeSubscriber(this);
    }

    public String getName() {
        return name;
    }
}

class Channel implements Observable {
    private String name;
    private Vector<User> subscibers;

    public Channel(String name) {
        this.name = name;
        this.subscibers = new Vector<User>();
    }

    @Override
    public void addSubscriber(User user) {
        subscibers.add(user);
    }

    @Override
    public void removeSubscriber(User user) {
        subscibers.remove(user);
    }

    @Override
    public void notifyUser(String msg) {
        System.out.println(name + " memosting video balu!");
        String constructedMessage = String.format("%s: %s", name, msg);
        for(User user : subscibers) {
            user.receiveNotification(constructedMessage);
        }
    }
}
class Main {
    public static void main(String[] args) {
        Channel ch = new Channel("aldi batagor Observer.Channel");
        User user1 = new User("zamhur jeunieb");
        User user2 = new User("sunil blangpulo");
        User user3 = new User("riski bloodstrike");

        ch.addSubscriber(user1);
        ch.addSubscriber(user2);
        ch.notifyUser("ada video baru untuk anda jangan lupa di subrek");

        user3.subscribe(ch);
        ch.notifyUser("video baru");
    }
}