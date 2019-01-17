package com.sadad.jib.service;

import com.pusher.rest.Pusher;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class PushService {
    public void sendNotification(String message,String channelName) {
        Pusher pusher = new Pusher("693629", "3b48efbcd5541423402d", "0deb5124460742b09b15");
        pusher.setCluster("ap2");
        pusher.setEncrypted(true);

        pusher.trigger(channelName, channelName+"-event", Collections.singletonMap("message", message));
    }
}
