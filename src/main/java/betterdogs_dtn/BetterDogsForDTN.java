package betterdogs_dtn;
import doggytalents.api.events.RegisterCustomDogModelsEvent;
import doggytalents.api.events.RegisterDogSkinJsonPathEvent;
import doggytalents.api.events.RegisterCustomDogModelsEvent.Entry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class BetterDogsForDTN {

    public BetterDogsForDTN() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            modEventBus.addListener(BetterDogsForDTN::registeringSkin);
            modEventBus.addListener(BetterDogsForDTN::registeringSkinJson);
            modEventBus.addListener(BetterDogsForDTN::registerLayerDefinition);
        });

    }

    public static void registeringSkin(RegisterCustomDogModelsEvent event) {
        event.register(new Entry(getRes("borzoi"), ModelLayerLocations.BORZOI, false, false));
        event.register(new Entry(getRes("corgi"), ModelLayerLocations.CORGI, false, false));
        event.register(new Entry(getRes("shih_tzu"), ModelLayerLocations.SHIH_TZU, false, false));
    }

    public static void registeringSkinJson(RegisterDogSkinJsonPathEvent event) {
        event.register(Constants.SKIN_JSON_PATH);
    }

    public static void registerLayerDefinition(RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelLayerLocations.BORZOI, LayerDefinitions::borzoi);
        event.registerLayerDefinition(ModelLayerLocations.CORGI, LayerDefinitions::corgi);
        event.registerLayerDefinition(ModelLayerLocations.SHIH_TZU, LayerDefinitions::shih_tzu);
    }

    public static ResourceLocation getRes(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
    
}
