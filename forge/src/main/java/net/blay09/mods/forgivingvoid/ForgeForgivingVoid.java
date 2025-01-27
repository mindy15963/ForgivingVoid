package net.blay09.mods.forgivingvoid;

import net.blay09.mods.balm.api.Balm;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.network.FMLNetworkConstants;

@Mod(ForgivingVoid.MOD_ID)
public class ForgeForgivingVoid {

    public ForgeForgivingVoid() {
        Balm.initialize(ForgivingVoid.MOD_ID, ForgivingVoid::initialize);

        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> FMLNetworkConstants.IGNORESERVERONLY, (a, b) -> true));
    }

}
