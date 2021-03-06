
package unwrittenfun.minecraft.lukkit.environment.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

import java.util.ArrayList;

/**
 * Bukkit Plugin: Lukkit
 * Original Author: UnwrittenFun
 * Maintainer: jammehcow
*/
public class LukkitEntityEvents implements Listener {
    public LukkitEntityEvents() {
        LukkitEvents.eventMap.put("areaEffectCloudApply", new ArrayList<>());
        LukkitEvents.eventMap.put("creatureSpawn", new ArrayList<>());
        LukkitEvents.eventMap.put("creeperPower", new ArrayList<>());
        LukkitEvents.eventMap.put("enderDragonChangePhase", new ArrayList<>());
        LukkitEvents.eventMap.put("entityAirChange", new ArrayList<>());
        LukkitEvents.eventMap.put("entityBreakDoor", new ArrayList<>());
        LukkitEvents.eventMap.put("entityBreed", new ArrayList<>());
        LukkitEvents.eventMap.put("entityChangeBlock", new ArrayList<>());
        LukkitEvents.eventMap.put("entityCombustByBlock", new ArrayList<>());
        LukkitEvents.eventMap.put("entityCombustByEntity", new ArrayList<>());
        LukkitEvents.eventMap.put("entityCombust", new ArrayList<>());
        LukkitEvents.eventMap.put("entityCreatePortal", new ArrayList<>());
        LukkitEvents.eventMap.put("entityDamageByBlock", new ArrayList<>());
        LukkitEvents.eventMap.put("entityDamageByEntity", new ArrayList<>());
        LukkitEvents.eventMap.put("entityDamage", new ArrayList<>());
        LukkitEvents.eventMap.put("entityDeath", new ArrayList<>());
        LukkitEvents.eventMap.put("entityExplode", new ArrayList<>());
        LukkitEvents.eventMap.put("entityInteract", new ArrayList<>());
        LukkitEvents.eventMap.put("entityPortalEnter", new ArrayList<>());
        LukkitEvents.eventMap.put("entityPortal", new ArrayList<>());
        LukkitEvents.eventMap.put("entityPortalExit", new ArrayList<>());
        LukkitEvents.eventMap.put("entityRegainHealth", new ArrayList<>());
        LukkitEvents.eventMap.put("entityResurrect", new ArrayList<>());
        LukkitEvents.eventMap.put("entityShootBow", new ArrayList<>());
        LukkitEvents.eventMap.put("entitySpawn", new ArrayList<>());
        LukkitEvents.eventMap.put("entityTame", new ArrayList<>());
        LukkitEvents.eventMap.put("entityTarget", new ArrayList<>());
        LukkitEvents.eventMap.put("entityTargetLivingEntity", new ArrayList<>());
        LukkitEvents.eventMap.put("entityTeleport", new ArrayList<>());
        LukkitEvents.eventMap.put("entityToggleGlide", new ArrayList<>());
        LukkitEvents.eventMap.put("entityUnleash", new ArrayList<>());
        LukkitEvents.eventMap.put("expBottle", new ArrayList<>());
        LukkitEvents.eventMap.put("explosionPrime", new ArrayList<>());
        LukkitEvents.eventMap.put("fireworkExplode", new ArrayList<>());
        LukkitEvents.eventMap.put("foodLevelChange", new ArrayList<>());
        LukkitEvents.eventMap.put("horseJump", new ArrayList<>());
        LukkitEvents.eventMap.put("itemDespawn", new ArrayList<>());
        LukkitEvents.eventMap.put("itemMerge", new ArrayList<>());
        LukkitEvents.eventMap.put("itemSpawn", new ArrayList<>());
        LukkitEvents.eventMap.put("lingeringPotionSplash", new ArrayList<>());
        LukkitEvents.eventMap.put("pigZap", new ArrayList<>());
        LukkitEvents.eventMap.put("playerDeath", new ArrayList<>());
        LukkitEvents.eventMap.put("playerLeashEntity", new ArrayList<>());
        LukkitEvents.eventMap.put("potionSplash", new ArrayList<>());
        LukkitEvents.eventMap.put("projectileHit", new ArrayList<>());
        LukkitEvents.eventMap.put("projectileLaunch", new ArrayList<>());
        LukkitEvents.eventMap.put("sheepDyeWool", new ArrayList<>());
        LukkitEvents.eventMap.put("sheepRegrowWool", new ArrayList<>());
        LukkitEvents.eventMap.put("slimeSplit", new ArrayList<>());
        LukkitEvents.eventMap.put("spawnerSpawn", new ArrayList<>());
        LukkitEvents.eventMap.put("villagerAcquireTrade", new ArrayList<>());
        LukkitEvents.eventMap.put("villagerReplenishTrade", new ArrayList<>());
    }

    @EventHandler
    public void areaEffectCloudApply(AreaEffectCloudApplyEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("areaEffectCloudApply");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("creatureSpawn");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void creeperPower(CreeperPowerEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("creeperPower");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void enderDragonChangePhase(EnderDragonChangePhaseEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("enderDragonChangePhase");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityAirChange(EntityAirChangeEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityAirChange");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityBreakDoor(EntityBreakDoorEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityBreakDoor");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityBreed(EntityBreedEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityBreed");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityChangeBlock(EntityChangeBlockEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityChangeBlock");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityCombustByBlock(EntityCombustByBlockEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityCombustByBlock");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityCombustByEntity(EntityCombustByEntityEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityCombustByEntity");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityCombust(EntityCombustEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityCombust");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityCreatePortal(EntityCreatePortalEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityCreatePortal");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityDamageByBlock(EntityDamageByBlockEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityDamageByBlock");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityDamageByEntity(EntityDamageByEntityEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityDamageByEntity");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityDamage(EntityDamageEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityDamage");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityDeath(EntityDeathEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityDeath");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void entityExplode(EntityExplodeEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityExplode");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityInteract(EntityInteractEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityInteract");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityPortalEnter(EntityPortalEnterEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityPortalEnter");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void entityPortal(EntityPortalEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityPortal");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityPortalExit(EntityPortalExitEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityPortalExit");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityRegainHealth(EntityRegainHealthEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityRegainHealth");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityResurrect(EntityResurrectEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityResurrect");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityShootBow(EntityShootBowEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityShootBow");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entitySpawn(EntitySpawnEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entitySpawn");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityTame(EntityTameEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityTame");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityTarget(EntityTargetEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityTarget");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityTargetLivingEntity(EntityTargetLivingEntityEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityTargetLivingEntity");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityTeleport(EntityTeleportEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityTeleport");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityToggleGlide(EntityToggleGlideEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityToggleGlide");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void entityUnleash(EntityUnleashEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("entityUnleash");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void expBottle(ExpBottleEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("expBottle");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void explosionPrime(ExplosionPrimeEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("explosionPrime");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void fireworkExplode(FireworkExplodeEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("fireworkExplode");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void foodLevelChange(FoodLevelChangeEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("foodLevelChange");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void horseJump(HorseJumpEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("horseJump");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void itemDespawn(ItemDespawnEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("itemDespawn");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void itemMerge(ItemMergeEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("itemMerge");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void itemSpawn(ItemSpawnEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("itemSpawn");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void lingeringPotionSplash(LingeringPotionSplashEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("lingeringPotionSplash");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void pigZap(PigZapEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("pigZap");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void playerDeath(PlayerDeathEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("playerDeath");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void playerLeashEntity(PlayerLeashEntityEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("playerLeashEntity");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void potionSplash(PotionSplashEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("potionSplash");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void projectileHit(ProjectileHitEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("projectileHit");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void projectileLaunch(ProjectileLaunchEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("projectileLaunch");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void sheepDyeWool(SheepDyeWoolEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("sheepDyeWool");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void sheepRegrowWool(SheepRegrowWoolEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("sheepRegrowWool");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void slimeSplit(SlimeSplitEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("slimeSplit");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void spawnerSpawn(SpawnerSpawnEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("spawnerSpawn");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void villagerAcquireTrade(VillagerAcquireTradeEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("villagerAcquireTrade");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void villagerReplenishTrade(VillagerReplenishTradeEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("villagerReplenishTrade");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }
}