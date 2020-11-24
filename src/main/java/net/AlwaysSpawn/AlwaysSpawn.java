package net.AlwaysSpawn;

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;

public class AlwaysSpawn extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this,this);
    }

    public void onJoin(PlayerJoinEvent event){
        event.getPlayer().teleport(this.getServer().getDefaultLevel().getSpawnLocation());
    }
}
