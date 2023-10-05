package betterdogs_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class BDWolf {
    
    public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.65F, 8.8F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition wolf_tail = real_tail.addOrReplaceChild("wolf_tail", CubeListBuilder.create(), PartPose.offset(0.0F, -1.6793F, 0.7969F));

		PartDefinition Nieuwwolf8 = wolf_tail.addOrReplaceChild("Nieuwwolf8", CubeListBuilder.create().texOffs(9, 18).addBox(-2.0F, 1.4293F, -2.1969F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.0F, 8.0F));

		PartDefinition leg2 = right_hind_leg.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, -1.0F));

		PartDefinition Nieuwwolfausshepherd5 = leg2.addOrReplaceChild("Nieuwwolfausshepherd5", CubeListBuilder.create().texOffs(852, 9).addBox(-2.0F, -0.1F, -0.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F))
		.texOffs(864, 10).addBox(-2.0F, -0.2477F, -2.3523F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.0F, 8.0F));

		PartDefinition leg1 = left_hind_leg.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, -1.0F));

		PartDefinition Nieuwwolfausshepherd4 = leg1.addOrReplaceChild("Nieuwwolfausshepherd4", CubeListBuilder.create().texOffs(864, 10).addBox(-2.0F, -0.2477F, -2.3523F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F))
		.texOffs(852, 9).addBox(-2.0F, -0.1F, -0.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 17.0F, -4.0F));

		PartDefinition leg4 = right_front_leg.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, 0.0F));

		PartDefinition Nieuwwolf7 = leg4.addOrReplaceChild("Nieuwwolf7", CubeListBuilder.create().texOffs(852, 9).addBox(-2.0F, -0.1F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 17.0F, -4.0F));

		PartDefinition leg3 = left_front_leg.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-4.0F, -1.0F, 0.0F));

		PartDefinition Nieuwwolf6 = leg3.addOrReplaceChild("Nieuwwolf6", CubeListBuilder.create().texOffs(852, 9).addBox(-2.0F, -0.1F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 13.2F, 2.2F));

		PartDefinition wolf_body = body.addOrReplaceChild("wolf_body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8F, -0.2F));

		PartDefinition body_rotation = wolf_body.addOrReplaceChild("body_rotation", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_1 = body_rotation.addOrReplaceChild("body_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Nieuwwolf2 = body_sub_1.addOrReplaceChild("Nieuwwolf2", CubeListBuilder.create().texOffs(867, 11).addBox(-3.0F, -1.85F, -2.1F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 13.1F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation = upper_body.addOrReplaceChild("mane_rotation", CubeListBuilder.create(), PartPose.offset(1.0F, 2.5F, -3.4F));

		PartDefinition mane_sub_1 = mane_rotation.addOrReplaceChild("mane_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Nieuwwolf3 = mane_sub_1.addOrReplaceChild("Nieuwwolf3", CubeListBuilder.create().texOffs(844, 19).addBox(-4.0F, -5.5F, -0.1F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.9F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.5F, -2.4F, 0.5F));

		PartDefinition oor11 = right_ear.addOrReplaceChild("oor11", CubeListBuilder.create().texOffs(846, 3).addBox(-2.4257F, -13.0447F, -8.6448F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(863, 0).addBox(-2.3704F, -13.0447F, -9.0352F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(190, 0).addBox(-1.9117F, -13.7297F, -9.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(846, 0).addBox(-1.9362F, -13.7449F, -8.652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(5.3F, 10.7F, 6.15F, 0.0F, 0.4363F, -0.0349F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.5F, -2.4F, 0.5F));

		PartDefinition oor12 = left_ear.addOrReplaceChild("oor12", CubeListBuilder.create().texOffs(190, 0).addBox(-1.8022F, -13.6446F, -9.042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(846, 0).addBox(-1.8124F, -13.6519F, -8.665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(-2.8F, 10.7F, 7.35F, 0.0F, -0.4363F, 0.0349F));

		PartDefinition head_sub_103 = oor12.addOrReplaceChild("head_sub_103", CubeListBuilder.create().texOffs(846, 3).mirror().addBox(-2.3323F, -12.9519F, -8.6562F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
		.texOffs(863, 0).mirror().addBox(-2.327F, -12.9519F, -9.0465F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wolfhead = real_head.addOrReplaceChild("wolfhead", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.6F, 3.0F));

		PartDefinition Nieuwwolf = wolfhead.addOrReplaceChild("Nieuwwolf", CubeListBuilder.create().texOffs(828, 0).addBox(-4.0F, -2.75F, -3.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(834, 23).addBox(1.95F, -1.8501F, -2.8F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(834, 23).addBox(1.74F, -2.74F, -1.751F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(808, 10).addBox(2.7F, 0.15F, -2.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(808, 10).addBox(-5.7F, 0.15F, -2.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(834, 23).addBox(-4.95F, -1.8501F, -2.8F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(834, 23).addBox(-4.74F, -2.74F, -1.751F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -0.8F, -2.25F));

		PartDefinition bone149 = Nieuwwolf.addOrReplaceChild("bone149", CubeListBuilder.create().texOffs(826, 15).addBox(-2.0F, -6.691F, -10.8112F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.6F, 8.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition mond2 = Nieuwwolf.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(863, 3).addBox(-1.5F, -7.6F, -12.9628F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F))
		.texOffs(874, 26).addBox(-1.5F, -8.1515F, -12.9689F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
		.texOffs(852, 0).addBox(-1.5F, -9.659F, -12.9827F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 9.1F, 6.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition bone4 = mond2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1001, 24).addBox(-1.0F, -0.9001F, -1.0044F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -9.062F, -12.427F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bone39 = Nieuwwolf.addOrReplaceChild("bone39", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.65F, 11.05F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone148 = bone39.addOrReplaceChild("bone148", CubeListBuilder.create().texOffs(874, 3).addBox(-0.5F, -0.9617F, -1.5924F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(1.0F, -7.2915F, -12.4806F, 0.5672F, 0.0F, 0.0F));

		PartDefinition oog5 = Nieuwwolf.addOrReplaceChild("oog5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0163F, -0.6228F, -3.583F, 0.0019F, 0.0436F, 0.0262F));

		PartDefinition head_sub_109 = oog5.addOrReplaceChild("head_sub_109", CubeListBuilder.create().texOffs(830, 2).mirror().addBox(1.2504F, -0.3684F, -0.167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(853, 3).mirror().addBox(0.5917F, -0.3684F, -0.167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition oog6 = Nieuwwolf.addOrReplaceChild("oog6", CubeListBuilder.create().texOffs(830, 2).addBox(-2.2489F, -0.3683F, -0.0669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(853, 3).addBox(-1.5902F, -0.3683F, -0.0669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0163F, -0.6228F, -3.683F, 0.0019F, -0.0436F, -0.0271F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
    
}
