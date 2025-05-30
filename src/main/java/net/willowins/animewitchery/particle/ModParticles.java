package net.willowins.animewitchery.particle;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.willowins.animewitchery.AnimeWitchery;

public class ModParticles {
    public static final DefaultParticleType LASER_PARTICLE =
            registerParticle("laser_particle", FabricParticleTypes.simple(true));


    private static DefaultParticleType registerParticle(String name, DefaultParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, new Identifier(AnimeWitchery.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        AnimeWitchery.LOGGER.info("Registering Particles for " + AnimeWitchery.MOD_ID);
    }
}