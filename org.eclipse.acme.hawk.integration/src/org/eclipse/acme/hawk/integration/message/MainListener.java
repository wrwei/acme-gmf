package org.eclipse.acme.hawk.integration.message;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MainListener implements PropertyChangeListener {
    private ClassWithProperty test;

    public MainListener() {
        test = new ClassWithProperty();
        test.addPropertyChangeListener(this);
        test.setupOnlineUsers();
    }

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(test.getUsersOnline());
    }

    public static void main(String[] args) {
        new MainListener(); // do everything in the constructor
    }
}