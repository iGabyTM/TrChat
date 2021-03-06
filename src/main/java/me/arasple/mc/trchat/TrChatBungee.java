package me.arasple.mc.trchat;

import me.arasple.mc.trchat.bstats.MetricsBungee;
import me.arasple.mc.trchat.bungee.ListenerBungeeTransfer;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author Arasple
 * @date 2019/8/4 22:42
 */
public class TrChatBungee extends Plugin {

    @Override
    public void onEnable() {
        new MetricsBungee(this);
        getProxy().getPluginManager().registerListener(this, new ListenerBungeeTransfer());
    }

}
