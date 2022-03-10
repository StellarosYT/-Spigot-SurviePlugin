package net.mythigame.survieplugin.Utils.bossbar;

import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;

import java.util.UUID;

public interface BossBar {
    String getName();

    UUID getUniqueId();

    void setTitle(String paramString);

    void setProgress(String paramString);

    void setProgress(float paramFloat);

    void setColor(String paramString);

    void setColor(BarColor paramBarColor);

    void setStyle(String paramString);

    void setStyle(BarStyle paramBarStyle);

    String getTitle();

    String getProgress();

    String getColor();

    String getStyle();
}
