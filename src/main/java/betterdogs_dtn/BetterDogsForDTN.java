package betterdogs_dtn;
import doggytalents.api.events.RegisterCustomDogModelsEvent;
import doggytalents.api.events.RegisterDogSkinJsonPathEvent;
import doggytalents.api.events.RegisterCustomDogModelsEvent.DogModelProps.Builder;
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
        event.register(new Builder(getRes("borzoi"), ModelLayerLocations.BORZOI));
        event.register(new Builder(getRes("corgi"), ModelLayerLocations.CORGI));
        event.register(new Builder(getRes("shih_tzu"), ModelLayerLocations.SHIH_TZU));
        event.register(new Builder(getRes("border_collie"), ModelLayerLocations.BORDER_COLLIE));
        event.register(new Builder(getRes("basset_hound"), ModelLayerLocations.BASSET_HOUND));
        event.register(new Builder(getRes("irish_terrier"), ModelLayerLocations.IRISH_TERRIER));
        event.register(new Builder(getRes("chihuahua"), ModelLayerLocations.CHIHUAHUA)
            .withDefaultScale(0.704f));
        event.register(new Builder(getRes("boxer"), ModelLayerLocations.BOXER));
        event.register(new Builder(getRes("bull_terrier"), ModelLayerLocations.BULL_TERRIER));
        event.register(new Builder(getRes("german_shepherd"), ModelLayerLocations.GERMAN_SHEPHERD));
    }

    public static void registeringSkinJson(RegisterDogSkinJsonPathEvent event) {
        event.register(Constants.SKIN_JSON_PATH);
    }

    public static void registerLayerDefinition(RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelLayerLocations.BORZOI, LayerDefinitions::borzoi);
        event.registerLayerDefinition(ModelLayerLocations.CORGI, LayerDefinitions::corgi);
        event.registerLayerDefinition(ModelLayerLocations.SHIH_TZU, LayerDefinitions::shih_tzu);
        event.registerLayerDefinition(ModelLayerLocations.CHIHUAHUA, LayerDefinitions::chihuahua);
        event.registerLayerDefinition(ModelLayerLocations.BASSET_HOUND, LayerDefinitions::basset_hound);
        event.registerLayerDefinition(ModelLayerLocations.BORDER_COLLIE, LayerDefinitions::border_collie);
        event.registerLayerDefinition(ModelLayerLocations.IRISH_TERRIER, LayerDefinitions::irish_terrier);
        event.registerLayerDefinition(ModelLayerLocations.BOXER, LayerDefinitions::boxer);
        event.registerLayerDefinition(ModelLayerLocations.BULL_TERRIER, LayerDefinitions::bull_terrier);
        event.registerLayerDefinition(ModelLayerLocations.GERMAN_SHEPHERD, LayerDefinitions::german_shepherd);
    }

    public static ResourceLocation getRes(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
    
}
