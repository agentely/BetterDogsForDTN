package betterdogs_dtn;
import betterdogs_dtn.models.BDWolf;
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
        event.register(new Builder(getRes("rottweiler"), ModelLayerLocations.ROTTWEILER));
        event.register(new Builder(getRes("pug"), ModelLayerLocations.PUG));
        event.register(new Builder(getRes("wolf"), ModelLayerLocations.BD_WOLF)
            .withGlowingEyes());
        event.register(new Builder(getRes("australian_shepherd"), ModelLayerLocations.AUSTRALIAN_SHEPHERD));
        event.register(new Builder(getRes("beagle"), ModelLayerLocations.BEAGLE));
        event.register(new Builder(getRes("bernese_dog"), ModelLayerLocations.BERNESE_DOG));        
        event.register(new Builder(getRes("dachshund"), ModelLayerLocations.DACHSHUND));        
        event.register(new Builder(getRes("english_bulldog"), ModelLayerLocations.ENGLISH_BULLDOG));        
        event.register(new Builder(getRes("king_charles"), ModelLayerLocations.KING_CHARLES));        
        event.register(new Builder(getRes("west_cairn_terrier"), ModelLayerLocations.WEST_CAIRN_TERRIER));        
        event.register(new Builder(getRes("labrador_golden_retriever"), ModelLayerLocations.LAB_GOL));        
        event.register(new Builder(getRes("dalmatian"), ModelLayerLocations.DUMA));        
        event.register(new Builder(getRes("great_dane"), ModelLayerLocations.GREAT_DANE));        
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
        event.registerLayerDefinition(ModelLayerLocations.ROTTWEILER, LayerDefinitions::rottweiler);
        event.registerLayerDefinition(ModelLayerLocations.PUG, LayerDefinitions::pug);
        event.registerLayerDefinition(ModelLayerLocations.BD_WOLF, BDWolf::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.AUSTRALIAN_SHEPHERD, LayerDefinitions::australian_shepherd);
        event.registerLayerDefinition(ModelLayerLocations.BEAGLE, LayerDefinitions::beagle);
        event.registerLayerDefinition(ModelLayerLocations.BERNESE_DOG, LayerDefinitions::bernese_dog);
        event.registerLayerDefinition(ModelLayerLocations.DACHSHUND, LayerDefinitions::dachshund);
        event.registerLayerDefinition(ModelLayerLocations.ENGLISH_BULLDOG, LayerDefinitions::english_bulldog);
        event.registerLayerDefinition(ModelLayerLocations.KING_CHARLES, LayerDefinitions::king_charles);
        event.registerLayerDefinition(ModelLayerLocations.WEST_CAIRN_TERRIER, LayerDefinitions::west_cairn_terrier);
        event.registerLayerDefinition(ModelLayerLocations.LAB_GOL, LayerDefinitions::labrador_golden_retriever);
        event.registerLayerDefinition(ModelLayerLocations.DUMA, LayerDefinitions::dalmatian);
        event.registerLayerDefinition(ModelLayerLocations.GREAT_DANE, LayerDefinitions::great_dane);
    }

    public static ResourceLocation getRes(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
    
}
