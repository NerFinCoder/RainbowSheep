package me.nerfin.rainbowsheep.events;

import org.bukkit.DyeColor;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class SpawnEvent implements Listener {

    @EventHandler
    private void onSpawn(EntitySpawnEvent event) {
        byte random = (byte) (Math.random()*8);

        if (event.getEntity() instanceof Sheep) {
            Sheep sheep = (Sheep) event.getEntity();
            if (random == 0) {
                sheep.setColor(DyeColor.LIME);
            }
            else if (random == 1) {
                sheep.setColor(DyeColor.BLUE);
            }
            else if (random == 2) {
                sheep.setColor(DyeColor.CYAN);
            }
            else if (random == 3) {
                sheep.setColor(DyeColor.PINK);
            }
            else if (random == 4) {
                sheep.setColor(DyeColor.ORANGE);
            }
            else if (random == 5) {
                sheep.setColor(DyeColor.RED);
            }
            else if (random == 6) {
                sheep.setColor(DyeColor.YELLOW);
            }
            else if (random == 7) {
                sheep.setColor(DyeColor.LIGHT_BLUE);
            }

        }

    }
}
