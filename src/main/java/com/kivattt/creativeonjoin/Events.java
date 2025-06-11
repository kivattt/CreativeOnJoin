package com.kivattt.creativeonjoin;

import com.fox2code.foxevents.EventHandler;
import com.fox2code.foxloader.event.player.PlayerJoinEvent;

public class Events {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getEntityPlayer().changeGamemode(1);
    }
}
