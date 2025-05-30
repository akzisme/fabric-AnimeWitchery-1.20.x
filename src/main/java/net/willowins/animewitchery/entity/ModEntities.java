package net.willowins.animewitchery.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.willowins.animewitchery.AnimeWitchery;
import net.willowins.animewitchery.entity.projectile.NeedleProjectileEntity;

public class ModEntities {
    public static final EntityType<NeedleProjectileEntity> NEEDLE_PROJECTILE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AnimeWitchery.MOD_ID, "needle_projectile"),
            FabricEntityTypeBuilder.<NeedleProjectileEntity>create(
                            SpawnGroup.MISC,
                            NeedleProjectileEntity::new
                    )
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f))
                    .trackRangeBlocks(4)
                    .trackedUpdateRate(10)
                    .build()
    );

    public static void registerModEntities() {
        System.out.println("Registering Mod Entities for " + AnimeWitchery.MOD_ID);
    }
}
