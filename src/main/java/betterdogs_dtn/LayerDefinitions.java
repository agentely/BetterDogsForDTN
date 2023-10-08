package betterdogs_dtn;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class LayerDefinitions {

    public static LayerDefinition borzoi() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-1.0F, 10.0F, 6.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition borzoi_tail_full2 = real_tail.addOrReplaceChild("borzoi_tail_full2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.5753F, 0.9418F, 0.2182F, 0.0F, 0.0F));

		PartDefinition borzoi_tail_full_rot2 = borzoi_tail_full2.addOrReplaceChild("borzoi_tail_full_rot2", CubeListBuilder.create().texOffs(1990, 23).addBox(-1.0F, -1.7823F, -5.3515F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(2145, 5).addBox(-1.0F, -5.1823F, -5.3515F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -0.65F, -1.25F, 0.7418F, 0.0F, 0.0F));

		PartDefinition borzoi_tail_bottom2 = borzoi_tail_full_rot2.addOrReplaceChild("borzoi_tail_bottom2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.25F, -5.75F));

		PartDefinition borzoi_tail_bottom_rot2 = borzoi_tail_bottom2.addOrReplaceChild("borzoi_tail_bottom_rot2", CubeListBuilder.create().texOffs(1990, 9).addBox(-1.0F, -1.9106F, -5.2762F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.19F))
		.texOffs(2147, 20).addBox(-1.0F, -4.2906F, -5.2762F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.75F, 15.0F, -7.5F));

		PartDefinition borzoi_leg7 = left_front_leg.addOrReplaceChild("borzoi_leg7", CubeListBuilder.create().texOffs(2193, 1).addBox(-1.0F, -2.0F, -7.05F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(2220, 0).addBox(-1.0F, 0.0F, -7.05F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.15F, 2.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.75F, 15.0F, -7.5F));

		PartDefinition borzoi_leg8 = right_front_leg.addOrReplaceChild("borzoi_leg8", CubeListBuilder.create().texOffs(2193, 1).mirror().addBox(-0.85F, -0.3F, -9.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2220, 0).mirror().addBox(-0.85F, 1.7F, -9.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 15.0F, 5.0F));

		PartDefinition borzoi_leg6 = left_hind_leg.addOrReplaceChild("borzoi_leg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 0.0F, -0.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition borzoi_leg3_side2 = borzoi_leg6.addOrReplaceChild("borzoi_leg3_side2", CubeListBuilder.create().texOffs(1990, 17).addBox(-1.9F, -0.25F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2105, 0).addBox(-1.9F, -1.25F, -9.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition borzoi_leg3_coat2 = borzoi_leg3_side2.addOrReplaceChild("borzoi_leg3_coat2", CubeListBuilder.create().texOffs(2070, 0).addBox(-1.5535F, -2.5224F, -0.3561F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.5035F, -3.0439F, -1.9724F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 15.0F, 5.0F));

		PartDefinition borzoi_leg5 = right_hind_leg.addOrReplaceChild("borzoi_leg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, 0.0F, -0.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition borzoi_leg4_side2 = borzoi_leg5.addOrReplaceChild("borzoi_leg4_side2", CubeListBuilder.create().texOffs(1990, 17).mirror().addBox(-0.1F, -0.25F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2105, 0).mirror().addBox(-0.1F, -1.25F, -9.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition borzoi_leg4_coat2 = borzoi_leg4_side2.addOrReplaceChild("borzoi_leg4_coat2", CubeListBuilder.create().texOffs(2070, 0).mirror().addBox(0.5535F, -2.5224F, -0.3561F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5035F, -3.0439F, -1.9724F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 11.9F, 0.9F));

		PartDefinition borzoi_body_r1 = body.addOrReplaceChild("borzoi_body_r1", CubeListBuilder.create().texOffs(2072, 16).addBox(-2.5F, -0.6F, 9.6F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 12.1F, -0.9F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, -5.0F));

		PartDefinition borzoi_mane2 = upper_body.addOrReplaceChild("borzoi_mane2", CubeListBuilder.create().texOffs(2175, 18).addBox(-3.0F, -13.0F, 0.5F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(2129, 0).addBox(-3.0F, -13.0F, -4.9F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(2180, 4).addBox(2.0F, -13.0F, -4.9F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(2180, 4).mirror().addBox(-3.0F, -13.0F, -4.9F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, 9.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition borzoi_mane_coat_left2 = borzoi_mane2.addOrReplaceChild("borzoi_mane_coat_left2", CubeListBuilder.create(), PartPose.offset(2.45F, -10.0F, 5.6F));

		PartDefinition borzoi_mane_coat_left_rot2 = borzoi_mane_coat_left2.addOrReplaceChild("borzoi_mane_coat_left_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5267F, 1.0F, -0.4373F, -1.5708F, -0.0436F, 0.0F));

		PartDefinition borzoi_mane_coat_right2 = borzoi_mane2.addOrReplaceChild("borzoi_mane_coat_right2", CubeListBuilder.create(), PartPose.offset(-2.7F, -10.0F, 5.6F));

		PartDefinition borzoi_mane_coat_right_rot2 = borzoi_mane_coat_right2.addOrReplaceChild("borzoi_mane_coat_right_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2767F, 1.0F, -0.4373F, -1.5708F, 0.0436F, 0.0F));

		PartDefinition borzoi_mane_coat_front2 = borzoi_mane2.addOrReplaceChild("borzoi_mane_coat_front2", CubeListBuilder.create(), PartPose.offset(0.2F, -12.85F, 4.35F));

		PartDefinition borzoi_mane_coat_front_rot2 = borzoi_mane_coat_front2.addOrReplaceChild("borzoi_mane_coat_front_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -2.75F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5F, -10.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition borzoi_head_rot = real_head.addOrReplaceChild("borzoi_head_rot", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 10.0F));

		PartDefinition borzoi_head_main = borzoi_head_rot.addOrReplaceChild("borzoi_head_main", CubeListBuilder.create().texOffs(1902, 6).addBox(-2.5F, -1.35F, -2.4F, 5.0F, 5.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, -21.85F, -8.8F));

		PartDefinition borzoi_head_beard = borzoi_head_rot.addOrReplaceChild("borzoi_head_beard", CubeListBuilder.create(), PartPose.offset(0.0F, -18.3F, -10.85F));

		PartDefinition borzoi_head_beard_rot = borzoi_head_beard.addOrReplaceChild("borzoi_head_beard_rot", CubeListBuilder.create().texOffs(2099, 16).addBox(-3.5F, -2.5F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.25F, 0.8F));

		PartDefinition borzoi_head_top = borzoi_head_rot.addOrReplaceChild("borzoi_head_top", CubeListBuilder.create().texOffs(1902, 2).mirror().addBox(-3.5F, -1.4039F, 0.5287F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.05F, -22.5632F, -7.875F, -0.48F, 0.0F, 0.0F));

		PartDefinition borzoi_neck = borzoi_head_rot.addOrReplaceChild("borzoi_neck", CubeListBuilder.create().texOffs(2089, 1).addBox(-2.0F, -1.5315F, -3.9672F, 3.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -18.85F, -6.4F, 0.3491F, 0.0F, 0.0F));

		PartDefinition borzoi_eye_right = borzoi_head_rot.addOrReplaceChild("borzoi_eye_right", CubeListBuilder.create().texOffs(1569, 23).addBox(-1.15F, 0.25F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offset(-1.3084F, -22.4931F, -10.85F));

		PartDefinition borzoi_pupil_right = borzoi_eye_right.addOrReplaceChild("borzoi_pupil_right", CubeListBuilder.create().texOffs(1496, 4).mirror().addBox(-1.8416F, -10.7431F, -9.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offset(0.7584F, 10.3931F, 8.75F));

		PartDefinition borzoi_eye_left = borzoi_head_rot.addOrReplaceChild("borzoi_eye_left", CubeListBuilder.create().texOffs(1569, 23).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offset(1.9584F, -21.7431F, -10.65F));

		PartDefinition borzoi_pupil_left = borzoi_eye_left.addOrReplaceChild("borzoi_pupil_left", CubeListBuilder.create().texOffs(1496, 4).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.5F)), PartPose.offset(-0.5668F, -0.1F, -0.5F));

		PartDefinition borzoi_mouth = borzoi_head_rot.addOrReplaceChild("borzoi_mouth", CubeListBuilder.create().texOffs(2070, 2).addBox(-1.5F, 0.1681F, -5.819F, 3.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -21.7162F, -11.1634F, 0.3142F, 0.0F, 0.0F));

		PartDefinition borzoi_jaw = borzoi_mouth.addOrReplaceChild("borzoi_jaw", CubeListBuilder.create().texOffs(1868, 14).addBox(-1.5F, -0.8728F, -4.6692F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.22F))
		.texOffs(425, 7).addBox(-1.5F, -1.3728F, -4.6692F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.23F)), PartPose.offset(0.0F, 2.5735F, -0.1806F));

		PartDefinition borzoi_jaw_bottom = borzoi_jaw.addOrReplaceChild("borzoi_jaw_bottom", CubeListBuilder.create().texOffs(2038, 25).addBox(-1.5F, -0.5937F, -2.965F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.24F)), PartPose.offset(0.0F, 0.2417F, -1.6027F));

		PartDefinition borzoi_tongue_rot = borzoi_jaw.addOrReplaceChild("borzoi_tongue_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -2.2736F, -0.9235F, 0.0436F, 0.0F, 0.0F));

		PartDefinition borzoi_tongue = borzoi_tongue_rot.addOrReplaceChild("borzoi_tongue", CubeListBuilder.create().texOffs(1448, 15).addBox(-1.4921F, -2.3241F, -3.2057F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offset(-0.2864F, 3.1239F, -1.5346F));

		PartDefinition borzoi_nose = borzoi_mouth.addOrReplaceChild("borzoi_nose", CubeListBuilder.create().texOffs(1855, 9).addBox(-1.5F, 0.2404F, -1.2273F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(0.0F, -0.529F, -5.412F, -0.0611F, 0.0F, 0.0F));

		PartDefinition borzoi_bridge = borzoi_head_rot.addOrReplaceChild("borzoi_bridge", CubeListBuilder.create().texOffs(1519, 0).addBox(-0.5F, 0.0101F, -1.9293F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.8698F, -11.3651F, 0.6109F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.5F, -6.5F, 3.0F));

		PartDefinition borzoi_ear_left2 = left_ear.addOrReplaceChild("borzoi_ear_left2", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0F, 0.75F));

		PartDefinition borzoi_ear_left_rot2 = borzoi_ear_left2.addOrReplaceChild("borzoi_ear_left_rot2", CubeListBuilder.create().texOffs(1933, 14).addBox(-0.8556F, -0.6131F, -2.3301F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9684F, -1.633F, -1.3565F, 3.1358F, 0.9915F, 2.1281F));

		PartDefinition borzoi_ear_left_fuzz2 = borzoi_ear_left_rot2.addOrReplaceChild("borzoi_ear_left_fuzz2", CubeListBuilder.create().texOffs(1918, 17).addBox(-1.0351F, -2.5097F, -2.871F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.474F, 1.7047F, -1.224F, 0.1852F, -0.5391F, -0.035F));

		PartDefinition borzoi_sideburns = left_ear.addOrReplaceChild("borzoi_sideburns", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3F, -0.85F, -2.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition borzoi_sideburn_left_r1 = borzoi_sideburns.addOrReplaceChild("borzoi_sideburn_left_r1", CubeListBuilder.create().texOffs(2010, 0).mirror().addBox(2.1914F, -23.6094F, 18.2495F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(5.9993F, 22.35F, -16.4488F, 0.0F, -0.1745F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.5F, -6.5F, 3.0F));

		PartDefinition borzoi_ear_right2 = right_ear.addOrReplaceChild("borzoi_ear_right2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.75F));

		PartDefinition borzoi_ear_right_rot2 = borzoi_ear_right2.addOrReplaceChild("borzoi_ear_right_rot2", CubeListBuilder.create().texOffs(1933, 14).mirror().addBox(-0.1444F, -0.6131F, -2.3301F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4684F, -0.633F, -1.3565F, 3.1358F, -0.9915F, -2.1281F));

		PartDefinition borzoi_ear_right_fuzz2 = borzoi_ear_right_rot2.addOrReplaceChild("borzoi_ear_right_fuzz2", CubeListBuilder.create().texOffs(1918, 17).mirror().addBox(0.0351F, -2.5097F, -2.871F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.474F, 1.7047F, -1.224F, 0.1852F, 0.5391F, 0.035F));

		PartDefinition borzoi_sideburn_right = right_ear.addOrReplaceChild("borzoi_sideburn_right", CubeListBuilder.create().texOffs(2010, 0).addBox(-2.0876F, -2.7363F, -0.0183F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, 0.4559F, -0.7905F, -0.1745F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
    
	public static LayerDefinition corgi() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 4.75F, 1.9635F, 0.0F, 0.0F));

		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offset(-1.0F, -5.6429F, 1.7223F));

		PartDefinition corgi_tail3 = real_tail2.addOrReplaceChild("corgi_tail3", CubeListBuilder.create(), PartPose.offset(1.0F, 4.8F, -2.2F));

		PartDefinition corgitail_rot3 = corgi_tail3.addOrReplaceChild("corgitail_rot3", CubeListBuilder.create().texOffs(404, 14).addBox(-2.0F, -3.8884F, 1.9255F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 3.0F, -3.35F, -0.2618F, 0.0F, 0.0F));

		PartDefinition corgitail_bottom_top3 = corgitail_rot3.addOrReplaceChild("corgitail_bottom_top3", CubeListBuilder.create().texOffs(412, 15).addBox(-1.0F, -12.4581F, 9.3695F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 12.5F, -5.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition corgitail_top_bottom3 = corgitail_rot3.addOrReplaceChild("corgitail_top_bottom3", CubeListBuilder.create().texOffs(413, 26).addBox(-1.0F, -6.1116F, 4.6246F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -7.0F, 6.75F, 3.1416F, 0.0F, 0.0F));

		PartDefinition corgitail_bottom_bottom3 = corgitail_rot3.addOrReplaceChild("corgitail_bottom_bottom3", CubeListBuilder.create().texOffs(420, 13).addBox(-1.0F, 11.6873F, -4.195F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 15.0F, 0.0F, -3.0107F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(405, 26).addBox(-0.9F, 1.5F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(-1.6F, 18.75F, 5.5F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(405, 26).addBox(-1.0F, 1.5F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.6F, 18.75F, 5.55F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(405, 25).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(-1.75F, 19.25F, -3.8F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(405, 25).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.75F, 19.25F, -3.8F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 19.5F, 2.0F));

		PartDefinition dddd2 = body.addOrReplaceChild("dddd2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, -2.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone178_r1 = dddd2.addOrReplaceChild("bone178_r1", CubeListBuilder.create().texOffs(377, 19).addBox(-2.5F, -2.5F, 4.3F, 5.0F, 7.0F, 6.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(0.0F, 4.35F, 2.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(402, 0).addBox(-2.0F, -2.65F, -3.7F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 17.75F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 15.5F, -5.0F));

		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5F, -2.0F));

		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition corgi_ear_right2 = right_ear.addOrReplaceChild("corgi_ear_right2", CubeListBuilder.create().texOffs(422, 27).mirror().addBox(-1.1826F, -4.3668F, -0.7878F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1087F, -1.5863F, 1.0947F, 0.0F, 0.3491F, -0.3927F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition corgi_ear_left2 = left_ear.addOrReplaceChild("corgi_ear_left2", CubeListBuilder.create().texOffs(422, 27).addBox(-1.8174F, -4.3668F, -0.7878F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1087F, -1.5863F, 1.0947F, 0.0F, -0.3491F, 0.3927F));

		PartDefinition corgi_head_full2 = real_head2.addOrReplaceChild("corgi_head_full2", CubeListBuilder.create().texOffs(371, 0).addBox(-3.5F, -2.0F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.0F, 0.25F, 1.5F));

		PartDefinition corgi_mouth_full2 = corgi_head_full2.addOrReplaceChild("corgi_mouth_full2", CubeListBuilder.create().texOffs(368, 11).addBox(-1.5F, -0.1283F, -2.2822F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0F, 0.6316F, -2.7778F, 0.2618F, 0.0F, 0.0F));

		PartDefinition corgi_nose2 = corgi_mouth_full2.addOrReplaceChild("corgi_nose2", CubeListBuilder.create().texOffs(686, 0).addBox(-1.0F, -0.5942F, -1.1425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.0F, 0.1626F, -1.5233F, -0.0436F, 0.0F, 0.0F));

		PartDefinition corgi_jaw_tongue2 = corgi_mouth_full2.addOrReplaceChild("corgi_jaw_tongue2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.3427F, 1.0712F));

		PartDefinition corgi_mouth_rot2 = corgi_jaw_tongue2.addOrReplaceChild("corgi_mouth_rot2", CubeListBuilder.create().texOffs(389, 0).addBox(-1.5F, -1.0551F, -3.2113F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.29F))
		.texOffs(17, 0).addBox(-1.5F, -1.4551F, -3.2113F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition corgi_chin2 = corgi_mouth_rot2.addOrReplaceChild("corgi_chin2", CubeListBuilder.create().texOffs(560, 0).addBox(-1.5F, 0.0308F, -3.478F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, -0.6805F, 0.2881F));

		PartDefinition corgi_tongue2 = corgi_mouth_rot2.addOrReplaceChild("corgi_tongue2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8247F, -2.2323F));

		PartDefinition corgi_tongue_rot2 = corgi_tongue2.addOrReplaceChild("corgi_tongue_rot2", CubeListBuilder.create().texOffs(123, 19).addBox(-1.5F, -2.5489F, -2.4103F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition corgi_smile_full2 = corgi_mouth_full2.addOrReplaceChild("corgi_smile_full2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.22F, 1.5825F, 0.825F, -0.1309F, 0.0F, 0.0F));

		PartDefinition corgi_smile_left2 = corgi_smile_full2.addOrReplaceChild("corgi_smile_left2", CubeListBuilder.create().texOffs(400, 0).addBox(-0.3806F, -0.3429F, -0.4472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition corgi_smile_right2 = corgi_smile_full2.addOrReplaceChild("corgi_smile_right2", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-0.6194F, -0.3429F, -0.4472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.44F, 0.0F, 0.0F, -0.1308F, 0.0057F, 0.0433F));

		PartDefinition corgi_bridge2 = corgi_head_full2.addOrReplaceChild("corgi_bridge2", CubeListBuilder.create().texOffs(379, 12).addBox(-0.5F, 0.0087F, 0.1804F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.0F, -0.4256F, -1.9369F, -0.5672F, 0.0F, 0.0F));

		PartDefinition corgi_eyes2 = corgi_head_full2.addOrReplaceChild("corgi_eyes2", CubeListBuilder.create().texOffs(678, 0).addBox(-1.0F, -0.85F, -0.94F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(400, 2).addBox(-0.2F, -0.2F, -0.44F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)), PartPose.offset(0.32F, -0.22F, -1.55F));

		PartDefinition mane_sub_2 = corgi_eyes2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(678, 0).mirror().addBox(-3.64F, -0.85F, -0.94F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(400, 2).mirror().addBox(-3.44F, -0.2F, -0.44F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition corgi_top2 = corgi_head_full2.addOrReplaceChild("corgi_top2", CubeListBuilder.create().texOffs(926, 17).addBox(-2.5F, -1.1202F, -0.0867F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -5.25F, 0.3F, -0.2618F, 0.0F, 0.0F));

		PartDefinition corgi_tuft_left2 = corgi_head_full2.addOrReplaceChild("corgi_tuft_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.55F, -0.75F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition head_sub_2 = corgi_tuft_left2.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(637, 0).mirror().addBox(-2.5086F, -1.15F, -0.0381F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition corgi_tuft_right2 = corgi_head_full2.addOrReplaceChild("corgi_tuft_right2", CubeListBuilder.create().texOffs(637, 0).addBox(-2.4913F, -1.15F, -0.0381F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.55F, -0.75F, 0.0F, 0.0F, 0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition shih_tzu() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 14.75F, 5.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_staart2 = real_tail.addOrReplaceChild("shihtzu_staart2", CubeListBuilder.create().texOffs(1706, 20).addBox(-1.1044F, -0.6833F, -0.9584F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.09F))
		.texOffs(1755, 17).addBox(2.0756F, -0.6833F, -2.9584F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-0.15F, -0.4F, 0.7F, 0.1085F, 0.1284F, 0.8822F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.75F, 17.25F, 4.5F));

		PartDefinition shihtzu_leg6 = left_hind_leg.addOrReplaceChild("shihtzu_leg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.75F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_leg2_rot3 = shihtzu_leg6.addOrReplaceChild("shihtzu_leg2_rot3", CubeListBuilder.create().texOffs(1455, 22).mirror().addBox(0.0F, -12.0F, -3.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.75F, 17.25F, 4.5F));

		PartDefinition shihtzu_leg5 = right_hind_leg.addOrReplaceChild("shihtzu_leg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.75F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_leg2_rot2 = shihtzu_leg5.addOrReplaceChild("shihtzu_leg2_rot2", CubeListBuilder.create().texOffs(1455, 22).addBox(-2.0F, -12.0F, -3.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 16.0F, -4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_leg3 = left_front_leg.addOrReplaceChild("shihtzu_leg3", CubeListBuilder.create(), PartPose.offset(1.25F, -3.0F, 1.0F));

		PartDefinition shihtzu_leg4_rot3 = shihtzu_leg3.addOrReplaceChild("shihtzu_leg4_rot3", CubeListBuilder.create().texOffs(1455, 22).addBox(-2.0F, 6.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 16.0F, -4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_leg2 = right_front_leg.addOrReplaceChild("shihtzu_leg2", CubeListBuilder.create(), PartPose.offset(-1.25F, -3.0F, 1.0F));

		PartDefinition shihtzu_leg4_rot2 = shihtzu_leg2.addOrReplaceChild("shihtzu_leg4_rot2", CubeListBuilder.create().texOffs(1455, 22).mirror().addBox(0.0F, 6.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_body2 = body.addOrReplaceChild("shihtzu_body2", CubeListBuilder.create().texOffs(1833, 0).addBox(-3.5F, -0.475F, -6.05F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.15F))
		.texOffs(1427, 13).addBox(-3.5F, -0.025F, -3.45F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.09F)), PartPose.offset(0.0F, -1.775F, 0.35F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 18.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_mane2 = upper_body.addOrReplaceChild("shihtzu_mane2", CubeListBuilder.create().texOffs(1424, 0).addBox(-3.5F, -6.0F, -8.35F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.1F)), PartPose.offset(1.0F, 3.25F, 5.35F));

		PartDefinition shihtzu_mane_hair2 = shihtzu_mane2.addOrReplaceChild("shihtzu_mane_hair2", CubeListBuilder.create().texOffs(1813, 0).addBox(-3.5F, -3.0F, -7.75F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -3.0F, -3.4F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(1468, 11).mirror().addBox(-2.0F, -0.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(1783, 17).mirror().addBox(-2.0F, 2.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.55F, 0.5F, 0.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(1468, 11).addBox(0.0F, -0.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(1783, 17).addBox(0.0F, 2.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.55F, 0.5F, 0.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_head2 = real_head.addOrReplaceChild("shihtzu_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5F, -3.25F));

		PartDefinition shihtzu_head_rot2 = shihtzu_head2.addOrReplaceChild("shihtzu_head_rot2", CubeListBuilder.create().texOffs(1402, 0).addBox(-3.0F, -0.4F, 3.75F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -7.8F, 4.75F, -1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu2 = shihtzu_head_rot2.addOrReplaceChild("shihtzu2", CubeListBuilder.create(), PartPose.offset(0.0F, 11.3F, 13.0F));

		PartDefinition shihtzu_tong2 = shihtzu2.addOrReplaceChild("shihtzu_tong2", CubeListBuilder.create(), PartPose.offset(0.0F, -6.25F, -9.85F));

		PartDefinition shihtzu_tong_rot2 = shihtzu_tong2.addOrReplaceChild("shihtzu_tong_rot2", CubeListBuilder.create().texOffs(1495, 20).addBox(-1.0F, -1.8381F, -0.9441F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.25F, 0.5672F, 0.0F, 0.0F));

		PartDefinition shihtzu_neusbrug2 = shihtzu2.addOrReplaceChild("shihtzu_neusbrug2", CubeListBuilder.create().texOffs(1463, 27).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -9.05F, -9.55F));

		PartDefinition shihtzu_longhair2 = shihtzu2.addOrReplaceChild("shihtzu_longhair2", CubeListBuilder.create().texOffs(1685, 1).addBox(-2.0F, -5.9F, -10.05F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = shihtzu_longhair2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_baard2 = shihtzu_longhair2.addOrReplaceChild("shihtzu_baard2", CubeListBuilder.create().texOffs(1621, 11).addBox(-3.0F, -0.15F, -0.05F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offset(0.0F, -5.75F, -9.2F));

		PartDefinition shihtzu_hair2 = shihtzu_longhair2.addOrReplaceChild("shihtzu_hair2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, -8.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition shihtzu_hair_rot2 = shihtzu_hair2.addOrReplaceChild("shihtzu_hair_rot2", CubeListBuilder.create().texOffs(1627, 0).addBox(-1.5F, -2.25F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition shihtzu_mond2 = shihtzu2.addOrReplaceChild("shihtzu_mond2", CubeListBuilder.create().texOffs(1474, 3).addBox(-1.5F, -10.3F, -10.251F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.95F))
		.texOffs(1503, 4).addBox(-1.0F, -7.5F, -10.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1538, 18).addBox(-2.0F, -8.7F, -10.05F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1537, 29).addBox(-2.0F, -6.7F, -10.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1537, 29).addBox(1.0F, -6.7F, -10.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1571, 1).addBox(-2.0F, -8.3F, -10.55F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_ear_left2 = shihtzu2.addOrReplaceChild("shihtzu_ear_left2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_ear_right2 = shihtzu2.addOrReplaceChild("shihtzu_ear_right2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane_sub_3 = shihtzu_ear_right2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition chihuahua() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 14.3F, 5.25F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(992, 23).addBox(-1.0F, -0.2532F, -1.2242F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(968, 21).mirror().addBox(-0.5F, 1.15F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false)
		.texOffs(942, 21).mirror().addBox(-0.5F, 1.35F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(1.35F, 17.5F, 5.45F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(968, 21).addBox(-0.5F, 1.15F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.3F))
		.texOffs(942, 21).addBox(-0.5F, 1.35F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.35F, 17.5F, 5.45F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(968, 21).mirror().addBox(-0.6F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offset(1.75F, 18.75F, -3.75F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(968, 21).addBox(-0.4F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offset(-1.75F, 18.75F, -3.75F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(947, 19).addBox(-2.5F, -2.25F, -2.25F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 16.75F, 1.95F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(967, 22).addBox(-2.5F, -2.65F, -2.25F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 16.75F, -2.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, -5.5F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.75F, -2.5F, -1.25F));

		PartDefinition oor2 = right_ear.addOrReplaceChild("oor2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6116F, -11.1457F, 0.65F, 0.0F, 0.0F, -0.3927F));

		PartDefinition oor3 = oor2.addOrReplaceChild("oor3", CubeListBuilder.create().texOffs(973, 13).addBox(-6.8068F, 6.5058F, 0.5836F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1661F, 0.0829F, -0.147F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.75F, -2.5F, -1.25F));

		PartDefinition oor4 = left_ear.addOrReplaceChild("oor4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6116F, -11.1457F, 0.65F, 0.0F, 0.0F, 0.3927F));

		PartDefinition oor5 = oor4.addOrReplaceChild("oor5", CubeListBuilder.create().texOffs(973, 13).mirror().addBox(3.8068F, 6.5058F, 0.5836F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1661F, -0.0829F, 0.147F));

		PartDefinition chihuahuaheadd2 = real_head.addOrReplaceChild("chihuahuaheadd2", CubeListBuilder.create().texOffs(1690, 0).addBox(-2.5F, -0.15F, -8.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1680, 18).addBox(-2.5F, -1.8F, -7.1F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(841, 19).addBox(-5.0F, -0.15F, -7.95F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, -2.75F, 6.0F));

		PartDefinition pomeranian_tong2 = chihuahuaheadd2.addOrReplaceChild("pomeranian_tong2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7834F, -8.3671F));

		PartDefinition pomeranian_tong_rot2 = pomeranian_tong2.addOrReplaceChild("pomeranian_tong_rot2", CubeListBuilder.create().texOffs(995, 1).addBox(-1.0F, 5.8165F, 6.9888F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition mane_sub_3 = chihuahuaheadd2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(841, 19).mirror().addBox(1.75F, -0.15F, -7.95F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = chihuahuaheadd2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(308, 18).addBox(-1.0F, 3.2507F, -11.4181F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -8.1259F, -8.022F, 1.1868F, 0.0F, 0.0F));

		PartDefinition mond2 = chihuahuaheadd2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1087, 16).addBox(-1.5F, 10.0537F, -3.0617F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F))
		.texOffs(978, 15).addBox(-1.5F, 10.8037F, -3.1617F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, -7.4827F, -8.5314F, 0.1222F, 0.0F, 0.0F));

		PartDefinition bone3 = mond2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1000, 28).addBox(-1.0F, 10.5755F, -2.1968F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(958, 30).addBox(-1.0F, 11.6269F, -1.8615F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
		.texOffs(875, 29).addBox(-0.5F, 11.4262F, -1.7601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.52F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = chihuahuaheadd2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(902, 28).addBox(-1.55F, 9.85F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offset(-0.8F, -8.75F, -7.65F));

		PartDefinition bone6 = chihuahuaheadd2.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.8F, -8.75F, -7.65F));

		PartDefinition mane_sub_4 = bone6.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(902, 28).mirror().addBox(-0.45F, 9.85F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition border_collie() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.5F, 6.5F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bordercollie_tail2 = real_tail.addOrReplaceChild("bordercollie_tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.45F, 2.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bordercollie_tail_rot2 = bordercollie_tail2.addOrReplaceChild("bordercollie_tail_rot2", CubeListBuilder.create().texOffs(100, 20).addBox(-1.0F, -23.5237F, 3.8556F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(63, 13).addBox(-1.0F, -23.5237F, 6.8556F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -11.0F, -11.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.25F, 5.75F));

		PartDefinition bordercollie_leg6 = right_hind_leg.addOrReplaceChild("bordercollie_leg6", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition bordercollie_leg1_rot3 = bordercollie_leg6.addOrReplaceChild("bordercollie_leg1_rot3", CubeListBuilder.create().texOffs(124, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -0.25F, -0.25F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.25F, 5.75F));

		PartDefinition bordercollie_leg5 = left_hind_leg.addOrReplaceChild("bordercollie_leg5", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition bordercollie_leg1_rot2 = bordercollie_leg5.addOrReplaceChild("bordercollie_leg1_rot2", CubeListBuilder.create().texOffs(124, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, -0.25F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, -5.5F));

		PartDefinition bordercollie_leg3 = right_front_leg.addOrReplaceChild("bordercollie_leg3", CubeListBuilder.create(), PartPose.offset(0.0F, -6.25F, 4.75F));

		PartDefinition bordercollie_leg4_rot2 = bordercollie_leg3.addOrReplaceChild("bordercollie_leg4_rot2", CubeListBuilder.create().texOffs(106, 2).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.25F, -4.5F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, -5.5F));

		PartDefinition bordercollie_leg2 = left_front_leg.addOrReplaceChild("bordercollie_leg2", CubeListBuilder.create(), PartPose.offset(0.0F, -6.25F, 4.75F));

		PartDefinition bordercollie_leg4_rot3 = bordercollie_leg2.addOrReplaceChild("bordercollie_leg4_rot3", CubeListBuilder.create().texOffs(106, 2).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 5.25F, -4.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bordercollie_body2 = body.addOrReplaceChild("bordercollie_body2", CubeListBuilder.create().texOffs(43, 18).addBox(-3.5F, -5.0F, -3.75F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(96, 0).addBox(3.0F, -5.0F, -5.7F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 5).addBox(-3.0F, -5.0F, -5.7F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.3F, 1.2F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bordercollie_mane2 = upper_body.addOrReplaceChild("bordercollie_mane2", CubeListBuilder.create().texOffs(70, 16).addBox(-4.0F, -3.5F, -8.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(1819, 9).addBox(-4.0F, -3.5F, -10.5F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 0).addBox(-3.0F, -2.3F, -10.4F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 0).addBox(3.0F, -2.3F, -10.4F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -0.2F, 4.2F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, -6.75F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition whatever = real_head.addOrReplaceChild("whatever", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bordercollie_head2 = whatever.addOrReplaceChild("bordercollie_head2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.25F, 7.5F));

		PartDefinition bordercollie_head_rot2 = bordercollie_head2.addOrReplaceChild("bordercollie_head_rot2", CubeListBuilder.create().texOffs(73, 5).addBox(-2.25F, -2.35F, -8.15F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.08F))
		.texOffs(1686, 23).addBox(-3.75F, -3.0F, -7.5F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(72, 4).addBox(0.25F, -2.49F, -8.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(-0.75F, 7.75F, -7.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone2 = bordercollie_head_rot2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(96, 14).addBox(-0.5F, 6.2247F, 6.6264F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.75F, -9.706F, -11.5752F, -0.4363F, 0.0F, 0.0F));

		PartDefinition collie_mouth2 = bordercollie_head_rot2.addOrReplaceChild("collie_mouth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 0.65F, -6.05F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone3 = collie_mouth2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(36, 13).addBox(-1.5F, 7.75F, -1.6263F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -8.0626F, -5.2431F, 0.2443F, 0.0F, 0.0F));

		PartDefinition collie_nose2 = bone3.addOrReplaceChild("collie_nose2", CubeListBuilder.create().texOffs(1422, 14).addBox(-1.5F, 8.2912F, -0.3224F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, -1.4133F, -1.6124F, -0.0873F, 0.0F, 0.0F));

		PartDefinition collie_jaw2 = collie_mouth2.addOrReplaceChild("collie_jaw2", CubeListBuilder.create(), PartPose.offset(0.5F, -8.275F, -3.5518F));

		PartDefinition collie_jaw_rot2 = collie_jaw2.addOrReplaceChild("collie_jaw_rot2", CubeListBuilder.create().texOffs(14, 24).addBox(-1.5F, 8.7919F, -5.3356F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F))
		.texOffs(107, 5).addBox(-1.5F, 9.2919F, -5.3356F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F))
		.texOffs(543, 0).addBox(-1.5F, 9.7019F, -5.3356F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.4538F, 0.0F, 0.0F));

		PartDefinition bordercollie_tongue2 = collie_jaw2.addOrReplaceChild("bordercollie_tongue2", CubeListBuilder.create(), PartPose.offset(0.25F, 2.6985F, -2.2603F));

		PartDefinition bordercollie_tongue_rot2 = bordercollie_tongue2.addOrReplaceChild("bordercollie_tongue_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5111F, -0.8342F, 0.7854F, 0.0F, 0.0F));

		PartDefinition bordercollie_tongue_walk2 = bordercollie_tongue_rot2.addOrReplaceChild("bordercollie_tongue_walk2", CubeListBuilder.create().texOffs(615, 15).addBox(-1.6974F, 8.5915F, -8.0003F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, -2.1F, 2.0F));

		PartDefinition oog2 = bordercollie_head_rot2.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(45, 13).addBox(-0.2013F, 0.6812F, -2.56F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 14).addBox(0.5487F, 0.6912F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(74, 8).addBox(0.5487F, 0.6912F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6F, -1.6F, -5.8F, 0.0F, 0.0F, -0.0436F));

		PartDefinition oog3 = bordercollie_head_rot2.addOrReplaceChild("oog3", CubeListBuilder.create().texOffs(45, 13).addBox(1.9513F, 0.6812F, -2.56F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 14).addBox(1.2013F, 0.6912F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(57, 14).addBox(1.2013F, 0.6912F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.85F, -1.7F, -5.8F, 0.0F, 0.0F, 0.0436F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, -1.75F, -1.0F, 1.5639F, -0.1569F, 0.3583F));

		PartDefinition collie_ear_right_rot_r1 = left_ear.addOrReplaceChild("collie_ear_right_rot_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8156F, -0.2839F, 1.2672F, -1.5708F, 0.0436F, 3.1416F));

		PartDefinition collie_ear_hinge_left_r1 = left_ear.addOrReplaceChild("collie_ear_hinge_left_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8156F, -0.2839F, 3.7672F, -1.5708F, 0.0436F, 3.1416F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, -1.75F, -1.0F, 1.5639F, 0.1569F, -0.3583F));

		PartDefinition collie_ear_left_rot_r1 = right_ear.addOrReplaceChild("collie_ear_left_rot_r1", CubeListBuilder.create().texOffs(45, 2).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8156F, -0.2839F, 1.2672F, -1.5708F, -0.0436F, -3.1416F));

		PartDefinition collie_ear_hinge_right_r1 = right_ear.addOrReplaceChild("collie_ear_hinge_right_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8156F, -0.2839F, 3.7672F, -1.5708F, -0.0436F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition basset_hound() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5F, 8.0F, 2.4871F, 0.0F, 0.0F));
		
		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.5F, 0.0F));

		PartDefinition basset_tail2 = real_tail2.addOrReplaceChild("basset_tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 12.75F, -5.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition basset_tail_rot2 = basset_tail2.addOrReplaceChild("basset_tail_rot2", CubeListBuilder.create().texOffs(1665, 1).addBox(-0.55F, -13.7268F, 4.1864F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition basset_tail_bottom2 = basset_tail_rot2.addOrReplaceChild("basset_tail_bottom2", CubeListBuilder.create().texOffs(1497, 24).addBox(-0.55F, -13.879F, 9.9848F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 8.605F, -1.8211F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 17.0F, 7.25F));

		PartDefinition basset_leg2 = right_hind_leg.addOrReplaceChild("basset_leg2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -9.25F));

		PartDefinition basset_leg1_rot3 = basset_leg2.addOrReplaceChild("basset_leg1_rot3", CubeListBuilder.create().texOffs(1168, 22).mirror().addBox(-3.0F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 0.0F, 2.0F));

		PartDefinition boxer3 = basset_leg1_rot3.addOrReplaceChild("boxer3", CubeListBuilder.create().texOffs(1580, 20).mirror().addBox(-2.5F, -8.7992F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -1.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 17.0F, 7.25F));

		PartDefinition basset_leg5 = left_hind_leg.addOrReplaceChild("basset_leg5", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -9.25F));

		PartDefinition basset_leg1_rot2 = basset_leg5.addOrReplaceChild("basset_leg1_rot2", CubeListBuilder.create().texOffs(1168, 22).addBox(1.0F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 2.0F));

		PartDefinition boxer2 = basset_leg1_rot2.addOrReplaceChild("boxer2", CubeListBuilder.create().texOffs(1580, 20).addBox(0.5F, -8.7992F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.25F, 19.25F, -4.0F));

		PartDefinition basset_leg7 = right_front_leg.addOrReplaceChild("basset_leg7", CubeListBuilder.create(), PartPose.offset(-1.0F, 3.75F, 8.0F));

		PartDefinition basset_leg3_rot3 = basset_leg7.addOrReplaceChild("basset_leg3_rot3", CubeListBuilder.create().texOffs(668, 0).mirror().addBox(-3.25F, -8.25F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(3.5F, 1.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.25F, 19.25F, -4.0F));

		PartDefinition basset_leg6 = left_front_leg.addOrReplaceChild("basset_leg6", CubeListBuilder.create(), PartPose.offset(1.0F, 3.75F, 8.0F));

		PartDefinition basset_leg3_rot2 = basset_leg6.addOrReplaceChild("basset_leg3_rot2", CubeListBuilder.create().texOffs(668, 0).addBox(1.25F, -8.25F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-3.5F, 1.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition basset_body2 = body.addOrReplaceChild("basset_body2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition basset_body_rot2 = basset_body2.addOrReplaceChild("basset_body_rot2", CubeListBuilder.create().texOffs(1717, 0).addBox(-3.0F, -6.7F, -5.3F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(484, 0).addBox(1.0F, -2.95F, -6.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(484, 0).addBox(-3.0F, -2.95F, -6.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 6.0F, 2.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.75F, -1.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition basset_mane2 = upper_body.addOrReplaceChild("basset_mane2", CubeListBuilder.create().texOffs(434, 6).addBox(-3.5F, -3.0F, -3.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.25F, 1.25F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.5F, -7.0F));

		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, 1.0F, 2.0F));

		PartDefinition mane_sub_45_r1 = left_ear.addOrReplaceChild("mane_sub_45_r1", CubeListBuilder.create().texOffs(529, 5).mirror().addBox(-3.4F, -4.0F, -2.875F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1705, 5).mirror().addBox(-3.4F, 0.0F, -3.125F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8948F, -0.7183F, -2.7498F, -1.5304F, -0.0705F, -0.3959F));

		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, 1.0F, 2.0F));

		PartDefinition mane_sub_46_r1 = right_ear.addOrReplaceChild("mane_sub_46_r1", CubeListBuilder.create().texOffs(529, 5).addBox(2.4F, -4.0F, -2.875F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1705, 5).addBox(2.4F, 0.0F, -3.125F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8948F, -0.7183F, -2.7498F, -1.5304F, 0.0705F, 0.3959F));

		PartDefinition basset_head2 = real_head2.addOrReplaceChild("basset_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.25F, 1.75F));

		PartDefinition bassethound2 = basset_head2.addOrReplaceChild("bassethound2", CubeListBuilder.create().texOffs(1709, 18).addBox(-2.9833F, -2.2833F, -1.1667F, 6.0F, 7.0F, 7.0F, new CubeDeformation(-0.1F))
		.texOffs(1257, 0).addBox(-0.4833F, -2.1833F, -1.0667F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
		.texOffs(1474, 0).addBox(-2.1833F, -0.7333F, -1.0667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1470, 0).addBox(-2.7333F, -0.5333F, -1.0667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(1474, 0).addBox(1.1667F, -0.7333F, -1.0667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1470, 0).addBox(1.7167F, -0.5333F, -1.0667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.0167F, -2.5833F, 0.2667F, -1.5708F, 0.0F, 0.0F));

		PartDefinition basset_neck_sack_right2 = bassethound2.addOrReplaceChild("basset_neck_sack_right2", CubeListBuilder.create(), PartPose.offset(-1.0832F, -4.7877F, -1.5667F));

		PartDefinition bassetnekzakrechtss2 = basset_neck_sack_right2.addOrReplaceChild("bassetnekzakrechtss2", CubeListBuilder.create().texOffs(385, 7).addBox(-0.5856F, 9.6346F, 0.0827F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0545F, -0.248F, 0.0454F, 0.0436F, 0.0F, 0.0436F));

		PartDefinition basset_neck_sack_left2 = bassethound2.addOrReplaceChild("basset_neck_sack_left2", CubeListBuilder.create(), PartPose.offset(1.1166F, -4.7877F, -1.5667F));

		PartDefinition bassetnekzalinkss2 = basset_neck_sack_left2.addOrReplaceChild("bassetnekzalinkss2", CubeListBuilder.create().texOffs(385, 7).mirror().addBox(-1.4689F, 9.3866F, 0.1281F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, -0.0436F));

		PartDefinition basset_mouth2 = bassethound2.addOrReplaceChild("basset_mouth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0167F, -6.9833F, -5.0167F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = basset_mouth2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1409, 15).addBox(-1.5F, 8.608F, -0.4815F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.0F, -0.5767F, -2.2714F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mond2 = basset_mouth2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1463, 19).addBox(-1.95F, 7.4624F, -0.7035F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.3F))
		.texOffs(226, 15).addBox(-0.5F, 7.6507F, -0.4204F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F))
		.texOffs(1294, 7).addBox(-1.0F, 9.7722F, -0.5651F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(340, 27).addBox(-1.6F, 10.1222F, -0.3151F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.11F))
		.texOffs(340, 27).addBox(0.4F, 10.1222F, -0.3151F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.0F, 0.9292F, -0.7504F, 0.0873F, 0.0F, 0.0F));

		PartDefinition mane_sub_4 = mond2.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(1463, 19).mirror().addBox(-0.05F, 7.4624F, -0.7035F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neus2 = mond2.addOrReplaceChild("neus2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.9595F, 15.3032F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone3 = neus2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1531, 29).addBox(-1.0F, 7.7726F, -7.1331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, -13.3889F, -4.9479F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone4 = neus2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(940, 27).addBox(-0.5F, -5.7631F, -7.6743F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3555F, -13.9238F, -0.829F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition irish_terrier() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-1.0F, 14.25F, 8.25F));

		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.25F, -0.75F));

		PartDefinition irishterrier_tail3 = real_tail2.addOrReplaceChild("irishterrier_tail3", CubeListBuilder.create(), PartPose.offset(1.5F, 1.7F, -5.0F));

		PartDefinition irishterrier_tail_rot3 = irishterrier_tail3.addOrReplaceChild("irishterrier_tail_rot3", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.413F, 6.155F));

		PartDefinition irishterrier_tail_bottom3 = irishterrier_tail_rot3.addOrReplaceChild("irishterrier_tail_bottom3", CubeListBuilder.create().texOffs(1809, 16).addBox(-1.5F, -6.2F, 3.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 3.2F, -4.1F));

		PartDefinition irishterrier_tail_top3 = irishterrier_tail_rot3.addOrReplaceChild("irishterrier_tail_top3", CubeListBuilder.create(), PartPose.offset(0.0F, 2.45F, -0.1F));

		PartDefinition irishterrier_tail_top_rot3 = irishterrier_tail_top3.addOrReplaceChild("irishterrier_tail_top_rot3", CubeListBuilder.create().texOffs(1597, 0).addBox(-1.0F, -0.32F, -0.86F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.15F, -0.3F, 1.2217F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, 7.0F));

		PartDefinition irishterrier_left_hind_leg = left_hind_leg.addOrReplaceChild("irishterrier_left_hind_leg", CubeListBuilder.create().texOffs(1853, 15).addBox(-1.0F, -0.25F, -6.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(1252, 15).addBox(-1.0F, -2.25F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.05F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, 7.0F));

		PartDefinition irishterrier_right_hind_leg = right_hind_leg.addOrReplaceChild("irishterrier_right_hind_leg", CubeListBuilder.create().texOffs(1853, 15).mirror().addBox(-1.0F, -0.25F, -6.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1252, 15).mirror().addBox(-1.0F, -2.25F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, -0.05F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 19.0F, -5.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_front_right_leg = right_front_leg.addOrReplaceChild("irishterrier_front_right_leg", CubeListBuilder.create().texOffs(1853, 0).mirror().addBox(-1.0F, 2.0F, -10.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -3.0F, 4.55F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 19.0F, -5.25F));

		PartDefinition irishterrier_front_left_leg = left_front_leg.addOrReplaceChild("irishterrier_front_left_leg", CubeListBuilder.create().texOffs(1853, 0).addBox(-0.75F, -1.0F, -6.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -0.55F, 0.05F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 1.0F));

		PartDefinition irishterrier_body2 = body.addOrReplaceChild("irishterrier_body2", CubeListBuilder.create().texOffs(1921, 19).addBox(-2.5F, 0.0F, -2.1F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, -0.45F, -0.3F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.0F, -4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_mane = upper_body.addOrReplaceChild("irishterrier_mane", CubeListBuilder.create().texOffs(1895, 17).addBox(-3.0F, -14.25F, -1.55F, 6.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, -2.75F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, -6.5F));

		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.75F, 1.75F));

		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.75F, -6.0F, -3.5F));

		PartDefinition irishterrier_ear_right = right_ear.addOrReplaceChild("irishterrier_ear_right", CubeListBuilder.create().texOffs(715, 4).mirror().addBox(-0.6913F, -2.149F, -1.4808F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9368F, -0.0527F, 1.2733F, 0.3106F, 0.1871F, -0.1555F));

		PartDefinition bone191 = irishterrier_ear_right.addOrReplaceChild("bone191", CubeListBuilder.create().texOffs(771, 4).mirror().addBox(-0.343F, 0.6753F, -0.662F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3483F, -2.0768F, -0.5358F, -0.8727F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.5F, -6.0F, -3.5F));

		PartDefinition irishterrier_ear_left = left_ear.addOrReplaceChild("irishterrier_ear_left", CubeListBuilder.create().texOffs(715, 4).addBox(-2.3087F, -2.149F, -1.4808F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1868F, -0.0527F, 1.2733F, 0.3106F, -0.1871F, 0.1555F));

		PartDefinition bone184 = irishterrier_ear_left.addOrReplaceChild("bone184", CubeListBuilder.create().texOffs(771, 4).addBox(-1.457F, 0.1268F, -0.0712F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8517F, -2.1768F, -1.3358F, -0.8727F, 0.0F, 0.0F));

		PartDefinition irishterrier_head = real_head2.addOrReplaceChild("irishterrier_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -0.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_neck_full = irishterrier_head.addOrReplaceChild("irishterrier_neck_full", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.75F, 3.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_neck = irishterrier_neck_full.addOrReplaceChild("irishterrier_neck", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.85F, 1.35F));

		PartDefinition irishterrier_neck_rot = irishterrier_neck.addOrReplaceChild("irishterrier_neck_rot", CubeListBuilder.create().texOffs(7, 8).addBox(-2.0F, -1.6F, -2.9F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -0.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition irishterrier_head_full = irishterrier_head.addOrReplaceChild("irishterrier_head_full", CubeListBuilder.create(), PartPose.offset(1.0F, -1.75F, 2.75F));

		PartDefinition irishterrier_head_rot = irishterrier_head_full.addOrReplaceChild("irishterrier_head_rot", CubeListBuilder.create().texOffs(1763, 11).addBox(-3.5F, -4.25F, -2.3F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_eye_left = irishterrier_head_rot.addOrReplaceChild("irishterrier_eye_left", CubeListBuilder.create().texOffs(751, 6).addBox(1.06F, -17.35F, 1.63F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(751, 4).addBox(1.36F, -17.2F, 1.635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 14.0F, -4.0F));

		PartDefinition irishterrier_eye_right = irishterrier_head_rot.addOrReplaceChild("irishterrier_eye_right", CubeListBuilder.create().texOffs(751, 6).mirror().addBox(-2.06F, -17.35F, 1.63F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(751, 4).mirror().addBox(-2.36F, -17.2F, 1.635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.0F, 14.0F, -4.0F));

		PartDefinition irishterrier_mouth2 = irishterrier_head_rot.addOrReplaceChild("irishterrier_mouth2", CubeListBuilder.create().texOffs(1602, 13).addBox(-2.0F, -2.9899F, -1.3271F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.46F, -4.2348F, 0.2967F, 0.0F, 0.0F));

		PartDefinition irishterrier_neusbrug = irishterrier_mouth2.addOrReplaceChild("irishterrier_neusbrug", CubeListBuilder.create().texOffs(1576, 7).addBox(-1.0F, -0.5381F, -1.9909F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.9719F, 2.6553F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone197 = irishterrier_mouth2.addOrReplaceChild("bone197", CubeListBuilder.create().texOffs(401, 19).addBox(-2.0F, -1.6406F, -0.859F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.403F, -0.5783F, -0.0873F, 0.0F, 0.0F));

		PartDefinition irishterrier_mouth = irishterrier_mouth2.addOrReplaceChild("irishterrier_mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.248F, 1.8622F, 0.0436F, 0.0F, 0.0F));

		PartDefinition irishterrier_mouth_beard = irishterrier_mouth.addOrReplaceChild("irishterrier_mouth_beard", CubeListBuilder.create().texOffs(1121, 2).addBox(-1.5F, 0.3251F, 0.5771F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.7894F, -3.7479F));

		PartDefinition bone204 = irishterrier_mouth.addOrReplaceChild("bone204", CubeListBuilder.create().texOffs(751, 18).addBox(-1.5F, -0.5688F, -1.4452F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6833F, -1.7257F));

		PartDefinition irishterrier_tongue = irishterrier_mouth.addOrReplaceChild("irishterrier_tongue", CubeListBuilder.create(), PartPose.offset(0.25F, 2.9235F, -3.7428F));

		PartDefinition irishterrier_tongue_rot = irishterrier_tongue.addOrReplaceChild("irishterrier_tongue_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.239F, 0.0F, 0.0F));

		PartDefinition irishterrier_tongue2 = irishterrier_tongue_rot.addOrReplaceChild("irishterrier_tongue2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone182 = irishterrier_mouth2.addOrReplaceChild("bone182", CubeListBuilder.create().texOffs(739, 2).addBox(-1.5F, -1.6298F, -0.8611F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.7F)), PartPose.offset(-0.05F, -2.0342F, -1.4958F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition boxer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 13.4F, 3.4F));

		PartDefinition body_rotation = body.addOrReplaceChild("body_rotation", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -1.4F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_1 = body_rotation.addOrReplaceChild("body_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition boxer_body = body_sub_1.addOrReplaceChild("boxer_body", CubeListBuilder.create().texOffs(515, 16).addBox(-3.5F, -2.25F, -3.0F, 7.0F, 9.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		var tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition boxer_tail = real_tail.addOrReplaceChild("boxer_tail", CubeListBuilder.create().texOffs(1583, 12).addBox(-0.5F, -0.2936F, -0.6989F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition boxer_tail_bottom = boxer_tail.addOrReplaceChild("boxer_tail_bottom", CubeListBuilder.create().texOffs(1576, 0).addBox(-0.999F, -4.1654F, 2.1673F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.202F)), PartPose.offsetAndRotation(0.5F, 8.35F, -4.15F, -0.5672F, 0.0F, 0.0F));

		var head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-1.0F, 10.5F, -7.9F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition boxer_head = real_head.addOrReplaceChild("boxer_head", CubeListBuilder.create(), PartPose.offset(2.0F, -0.35F, 0.9F));

		PartDefinition head_main = boxer_head.addOrReplaceChild("head_main", CubeListBuilder.create().texOffs(1558, 5).addBox(-4.0F, -3.05F, -3.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(1571, 12).addBox(-2.0F, 2.35F, -2.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(1602, 23).addBox(-1.5F, -2.9714F, -3.42F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eye_brow_right = head_main.addOrReplaceChild("eye_brow_right", CubeListBuilder.create().texOffs(1548, 0).addBox(-1.9001F, -13.4965F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.25F, 10.7F, 1.3F, 0.0F, 0.0F, -0.0349F));

		PartDefinition eye_brow_left = head_main.addOrReplaceChild("eye_brow_left", CubeListBuilder.create().texOffs(1548, 0).addBox(-2.1374F, -13.5254F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.25F, 10.8F, 1.3F, 0.0F, 0.0F, 0.0349F));

		PartDefinition boxer_mouth = head_main.addOrReplaceChild("boxer_mouth", CubeListBuilder.create().texOffs(1566, 17).addBox(-2.0F, -14.0002F, -5.99F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.16F))
		.texOffs(1520, 26).addBox(-2.0F, -12.2483F, -6.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1522, 29).addBox(-2.0F, -10.9083F, -5.6293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(1522, 29).addBox(1.0F, -10.9083F, -5.6293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(1520, 26).addBox(1.0F, -12.2483F, -6.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.4F, 0.35F, -0.0436F, 0.0F, 0.0F));

		PartDefinition boxer_nose = head_main.addOrReplaceChild("boxer_nose", CubeListBuilder.create().texOffs(1566, 0).addBox(1.0F, -11.3828F, -10.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-2.5F, 11.45F, 3.85F, -0.0698F, 0.0F, 0.0F));

		PartDefinition boxer_lip = head_main.addOrReplaceChild("boxer_lip", CubeListBuilder.create().texOffs(1554, 0).addBox(1.0F, -11.6957F, -9.68F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 12.05F, 3.15F, -0.0524F, 0.0F, 0.0F));

		PartDefinition boxer_jaw = head_main.addOrReplaceChild("boxer_jaw", CubeListBuilder.create().texOffs(1587, 12).addBox(1.0F, -11.5017F, -9.5002F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.5F, 12.05F, 3.75F, 0.0175F, 0.0F, 0.0F));

		PartDefinition boxer_eye_left = head_main.addOrReplaceChild("boxer_eye_left", CubeListBuilder.create().texOffs(1562, 0).addBox(0.8022F, -11.5999F, -9.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.03F))
		.texOffs(1566, 0).addBox(0.4522F, -11.5999F, -9.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offset(-0.5F, 9.8F, 5.8F));

		PartDefinition boxer_eye_right = head_main.addOrReplaceChild("boxer_eye_right", CubeListBuilder.create().texOffs(1566, 0).addBox(1.5417F, -11.578F, -9.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(1562, 0).addBox(1.1917F, -11.578F, -9.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.03F)), PartPose.offset(-4.5F, 9.8F, 5.9F));

		PartDefinition boxer_nose_bridge = head_main.addOrReplaceChild("boxer_nose_bridge", CubeListBuilder.create().texOffs(1557, 17).addBox(-0.5F, -10.5311F, -5.2581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, 9.6F, -2.6F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boxer_ear_right = boxer_head.addOrReplaceChild("boxer_ear_right", CubeListBuilder.create().texOffs(1577, 17).addBox(1.8923F, -13.6578F, -5.7154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1550, 4).addBox(2.1423F, -13.7578F, -8.5154F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1550, 4).addBox(2.8478F, -13.978F, -8.5865F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1555, 4).addBox(2.1694F, -10.7517F, -7.9193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.25F, 10.45F, 5.75F, 0.0F, -0.1309F, 0.0873F));

		PartDefinition boxer_ear_left = boxer_head.addOrReplaceChild("boxer_ear_left", CubeListBuilder.create().texOffs(1577, 17).addBox(2.1077F, -13.6578F, -5.7154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1550, 4).addBox(1.8577F, -13.7578F, -8.5154F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1550, 4).addBox(1.1522F, -13.978F, -8.5865F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1555, 4).addBox(1.8393F, -10.7517F, -8.0189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 10.85F, 6.5F, 0.0F, 0.1309F, -0.0873F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition doberman_rot6 = right_hind_leg.addOrReplaceChild("doberman_rot6", CubeListBuilder.create().texOffs(1168, 22).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 2.0F, 0.0F));

		PartDefinition boxer3 = doberman_rot6.addOrReplaceChild("boxer3", CubeListBuilder.create().texOffs(1580, 20).addBox(-2.5F, -8.8492F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 6.35F, -8.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.0F, 16.0F, 7.0F));

		PartDefinition doberman_rot3 = left_hind_leg.addOrReplaceChild("doberman_rot3", CubeListBuilder.create().texOffs(1168, 22).addBox(1.0F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 8.0F, -7.0F));

		PartDefinition boxer2 = doberman_rot3.addOrReplaceChild("boxer2", CubeListBuilder.create().texOffs(1580, 20).addBox(0.5F, -8.7992F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition doberman_rot5 = right_front_leg.addOrReplaceChild("doberman_rot5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 1.0F, -4.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition doberman_rot4_r1 = doberman_rot5.addOrReplaceChild("doberman_rot4_r1", CubeListBuilder.create().texOffs(1159, 14).addBox(-3.25F, -9.0F, 10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 8.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.6F, 16.0F, -4.0F));

		PartDefinition doberman_rot4 = left_front_leg.addOrReplaceChild("doberman_rot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 1.0F, -4.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition doberman_rot3_r1 = doberman_rot4.addOrReplaceChild("doberman_rot3_r1", CubeListBuilder.create().texOffs(1159, 14).addBox(1.35F, -9.0F, 10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 8.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(1580, 18).addBox(-2.5F, -3.0F, -4.5F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-1.0F, 13.6F, -3.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition bull_terrier() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-1.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bullterrier6 = real_tail.addOrReplaceChild("Bullterrier6", CubeListBuilder.create().texOffs(722, 15).addBox(-1.5F, 0.0F, -2.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 2.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition Bullterrier3 = right_hind_leg.addOrReplaceChild("Bullterrier3", CubeListBuilder.create().texOffs(699, 12).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition Bullterrier2 = left_hind_leg.addOrReplaceChild("Bullterrier2", CubeListBuilder.create().texOffs(699, 12).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition Bullterrier5 = right_front_leg.addOrReplaceChild("Bullterrier5", CubeListBuilder.create().texOffs(699, 12).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition Bullterrier4 = left_front_leg.addOrReplaceChild("Bullterrier4", CubeListBuilder.create().texOffs(699, 12).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.7F, 4.1F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bull_terrier_body2 = body.addOrReplaceChild("bull_terrier_body2", CubeListBuilder.create().texOffs(730, 16).addBox(-3.5F, -6.95F, -4.15F, 7.0F, 9.0F, 7.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 2.9F, 0.7F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.7F, -2.8F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bull_terrier_mane2 = upper_body.addOrReplaceChild("bull_terrier_mane2", CubeListBuilder.create().texOffs(715, 0).addBox(-4.0F, -13.0F, -7.55F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 9.8F, 3.7F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.1F, -5.6F));

		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.4F, -1.4F));
		
		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -5.0F, 2.3F));

		PartDefinition bull_terrier_ear_right2 = right_ear.addOrReplaceChild("bull_terrier_ear_right2", CubeListBuilder.create().texOffs(709, 1).addBox(-2.6327F, -11.0449F, -9.5769F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(695, 0).addBox(-2.6181F, -11.058F, -9.8989F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(709, 1).addBox(-2.1893F, -11.6592F, -9.5381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.5F, 7.45F, 8.65F, 0.0F, 0.0873F, -0.1309F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -5.3F, 2.1F));

		PartDefinition bull_terrier_ear_left2 = left_ear.addOrReplaceChild("bull_terrier_ear_left2", CubeListBuilder.create().texOffs(709, 1).addBox(-4.3559F, -10.9144F, -9.5121F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(695, 0).addBox(-4.3705F, -10.9274F, -9.8289F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(709, 1).addBox(-3.7993F, -11.5287F, -9.4733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.5F, 8.25F, 9.2F, 0.0F, -0.0873F, 0.1309F));

		PartDefinition bull_terrier_head_rot = real_head2.addOrReplaceChild("bull_terrier_head_rot", CubeListBuilder.create().texOffs(693, 0).addBox(-3.5F, -4.25F, -2.1F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(710, 29).addBox(-3.61F, -4.05F, -2.365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(710, 29).addBox(0.61F, -4.05F, -2.365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -1.55F, 0.3F));

		PartDefinition bull_terrier_mouth2 = bull_terrier_head_rot.addOrReplaceChild("bull_terrier_mouth2", CubeListBuilder.create().texOffs(694, 23).addBox(-2.0F, -11.4289F, -8.5006F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.03F))
		.texOffs(710, 27).addBox(-1.5F, -8.1061F, -8.1855F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.05F))
		.texOffs(693, 3).addBox(-0.95F, -11.1532F, -8.6976F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-1.0F, 6.85F, 4.45F, 0.2094F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition german_shepherd() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 12.0F, 8.0F, 1.73F, 0.0F, 0.0F));

		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offset(-1.3F, 0.0F, 0.0F));

		PartDefinition germanausshepherd_tail2 = real_tail2.addOrReplaceChild("germanausshepherd_tail2", CubeListBuilder.create().texOffs(359, 2).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(365, 19).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, 0.5F, -0.4712F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition GermansheperdHusky4 = right_hind_leg.addOrReplaceChild("GermansheperdHusky4", CubeListBuilder.create().texOffs(279, 2).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition GermansheperdHusky3 = left_hind_leg.addOrReplaceChild("GermansheperdHusky3", CubeListBuilder.create().texOffs(279, 2).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition GermanAussheperdHusky4 = right_front_leg.addOrReplaceChild("GermanAussheperdHusky4", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition GermanAussheperdHusky3 = left_front_leg.addOrReplaceChild("GermanAussheperdHusky3", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 14.5F, 3.6F));

		PartDefinition germansheperd_body2 = body.addOrReplaceChild("germansheperd_body2", CubeListBuilder.create().texOffs(336, 5).addBox(-3.5F, -4.0F, -0.5F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.2F, -3.55F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition german_shepherd_mane2 = upper_body.addOrReplaceChild("german_shepherd_mane2", CubeListBuilder.create().texOffs(308, 14).addBox(-4.0F, -13.0F, -7.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 3.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5F, -6.3F));

		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);
		
		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -0.7F));

		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -6.1F, 0.5F));

		PartDefinition germanshepherd_ear_right2 = right_ear.addOrReplaceChild("germanshepherd_ear_right2", CubeListBuilder.create().texOffs(330, 0).addBox(-1.1271F, -4.4713F, -0.529F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(316, 2).addBox(-0.1271F, -5.4413F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.865F, -0.75F, -0.0168F, -0.1312F, -0.169F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -6.1F, 0.5F));

		PartDefinition germanshepherd_ear_left2 = left_ear.addOrReplaceChild("germanshepherd_ear_left2", CubeListBuilder.create().texOffs(330, 0).mirror().addBox(-1.8729F, -4.4713F, -0.529F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
		.texOffs(316, 2).mirror().addBox(-0.8729F, -5.4413F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.865F, -0.75F, -0.0168F, 0.1312F, 0.169F));

		PartDefinition germansheperd_head_rot2 = real_head2.addOrReplaceChild("germansheperd_head_rot2", CubeListBuilder.create(), PartPose.offset(4.0F, 3.25F, 2.75F));

		PartDefinition germansheperd_head2 = germansheperd_head_rot2.addOrReplaceChild("germansheperd_head2", CubeListBuilder.create().texOffs(299, 0).addBox(-3.0F, -5.7275F, -4.2487F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(327, 5).addBox(-4.0F, -3.7275F, -3.2487F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(287, 12).addBox(-5.0F, -8.7075F, -2.6987F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(327, 5).addBox(3.0F, -3.7275F, -3.2487F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(338, 0).addBox(-1.95F, -4.0275F, -4.2687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(338, 0).addBox(0.95F, -4.0275F, -4.2687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(342, 0).addBox(1.7F, -4.0275F, -4.2587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(342, 0).addBox(-2.7F, -4.0275F, -4.2587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -4.5225F, -0.2513F));

		PartDefinition mouth2 = germansheperd_head2.addOrReplaceChild("mouth2", CubeListBuilder.create().texOffs(317, 7).addBox(-1.5F, -0.8724F, -1.3784F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7812F, -6.2237F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neus2 = mouth2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(479, 13).addBox(-1.5F, -0.869F, -1.1981F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, -0.9062F, -1.325F, 0.0436F, 0.0F, 0.0F));

		PartDefinition germanshepherd_mouth_rot2 = mouth2.addOrReplaceChild("germanshepherd_mouth_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.448F, 3.3576F, 0.1309F, 0.0F, 0.0F));

		PartDefinition germanshepherd_mouth2 = germanshepherd_mouth_rot2.addOrReplaceChild("germanshepherd_mouth2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition germanshepherd_jaw2 = germanshepherd_mouth2.addOrReplaceChild("germanshepherd_jaw2", CubeListBuilder.create().texOffs(131, 11).addBox(-1.5F, -0.7778F, -3.5075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F))
		.texOffs(221, 25).addBox(-1.5F, -1.0778F, -3.5075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F))
		.texOffs(316, 0).addBox(-1.5F, -0.3944F, -3.4849F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, 0.2881F, -1.0452F));

		PartDefinition germanshepherd_tongue_rot2 = germanshepherd_mouth2.addOrReplaceChild("germanshepherd_tongue_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 1.4792F, -3.7447F, 0.239F, 0.0F, 0.0F));

		PartDefinition germanshepherd_tongue2 = germanshepherd_tongue_rot2.addOrReplaceChild("germanshepherd_tongue2", CubeListBuilder.create().texOffs(294, 22).addBox(-1.6974F, -2.5932F, -2.2246F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition nose_bridge2 = germansheperd_head2.addOrReplaceChild("nose_bridge2", CubeListBuilder.create().texOffs(336, 3).addBox(-1.0F, -0.1768F, -1.2402F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.1825F, -4.7398F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition rottweiler() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 8.25F));

		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.5F, -1.25F, 1.2217F, 0.0F, 0.0F));

		PartDefinition rottweiler7 = real_tail2.addOrReplaceChild("rottweiler7", CubeListBuilder.create().texOffs(1307, 8).addBox(-1.999F, 2.3617F, -0.174F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.5F, -1.0F, 4.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone2 = rottweiler7.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1317, 20).addBox(-0.999F, -1.4F, 1.2439F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.0F, 7.1F, -1.4F, -0.5672F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition rottweiler4 = right_hind_leg.addOrReplaceChild("rottweiler4", CubeListBuilder.create().texOffs(1295, 13).addBox(-3.5F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 8.0F, -7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition rottweiler3 = left_hind_leg.addOrReplaceChild("rottweiler3", CubeListBuilder.create().texOffs(1295, 13).addBox(1.5F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 8.0F, -7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition rottweiler6 = right_front_leg.addOrReplaceChild("rottweiler6", CubeListBuilder.create().texOffs(1295, 13).addBox(-3.5F, -8.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 8.0F, 4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition rottweiler5 = left_front_leg.addOrReplaceChild("rottweiler5", CubeListBuilder.create().texOffs(1295, 13).addBox(1.5F, -8.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 8.0F, 4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.2F, 4.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2F, 0.2F));

		PartDefinition rottweiler2 = body_sub_2.addOrReplaceChild("rottweiler2", CubeListBuilder.create().texOffs(1312, 0).addBox(-3.5F, -3.75F, -1.75F, 7.0F, 7.0F, 9.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -0.15F, -0.35F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.7F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(1.0F, 2.5F, 3.2F));

		PartDefinition rottweiler10 = mane_sub_2.addOrReplaceChild("rottweiler10", CubeListBuilder.create().texOffs(1331, 18).addBox(-8.0F, -6.75F, -1.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 1.25F, -5.8F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.9F, -6.2F));
		
		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);
		
		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.6F, -0.8F));

		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, -5.5F, 0.5F));

		PartDefinition rottweiler_ear_right2 = right_ear.addOrReplaceChild("rottweiler_ear_right2", CubeListBuilder.create().texOffs(1301, 23).addBox(1.75F, -13.4F, -6.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1323, 26).addBox(2.0F, -13.5F, -9.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1295, 23).addBox(2.0271F, -10.494F, -8.4039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.75F, 11.95F, 7.25F, 0.0F, -0.0873F, 0.0873F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.5F, -5.4F, 0.5F));

		PartDefinition rottweiler_ear_left2 = left_ear.addOrReplaceChild("rottweiler_ear_left2", CubeListBuilder.create().texOffs(1301, 23).addBox(2.25F, -13.4F, -6.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1323, 26).addBox(2.0F, -13.5F, -9.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1295, 23).addBox(1.9816F, -10.494F, -8.5035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 12.25F, 7.25F, 0.0F, 0.0873F, -0.0873F));

		PartDefinition rottweiler9 = real_head2.addOrReplaceChild("rottweiler9", CubeListBuilder.create().texOffs(1299, 20).addBox(-4.0F, -3.05F, -3.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(1291, 0).addBox(-1.5F, -0.65F, -6.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(1291, 0).addBox(-1.5F, 0.35F, -6.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.0F, -3.75F, 1.25F));

		PartDefinition rottweiler_mouth2 = rottweiler9.addOrReplaceChild("rottweiler_mouth2", CubeListBuilder.create().texOffs(1293, 0).addBox(-2.0F, -13.9915F, -7.2911F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(1305, 3).addBox(-2.0F, -11.2308F, -7.2876F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 13.4F, 0.35F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rottweiler_eye_left2 = rottweiler9.addOrReplaceChild("rottweiler_eye_left2", CubeListBuilder.create().texOffs(1273, 19).addBox(0.8022F, -11.5999F, -9.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F))
		.texOffs(1291, 0).addBox(0.4522F, -11.5999F, -9.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offset(-0.5F, 9.8F, 5.8F));

		PartDefinition rottweiler_eye_right2 = rottweiler9.addOrReplaceChild("rottweiler_eye_right2", CubeListBuilder.create().texOffs(1291, 0).addBox(1.5417F, -11.578F, -9.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F))
		.texOffs(1311, 0).addBox(1.8418F, -12.83F, -9.39F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1311, 0).addBox(4.0918F, -12.83F, -9.39F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1273, 19).addBox(1.1917F, -11.578F, -9.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F)), PartPose.offset(-4.5F, 9.8F, 5.9F));

		PartDefinition bridge2 = rottweiler9.addOrReplaceChild("bridge2", CubeListBuilder.create().texOffs(1305, 0).addBox(-1.0F, -8.9044F, -7.2387F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 9.2F, -2.5F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition pug() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-1.0F, 13.75F, 7.0F));

		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.75F, 0.0F));

		PartDefinition Pug7 = real_tail2.addOrReplaceChild("Pug7", CubeListBuilder.create().texOffs(447, 0).addBox(0.0F, -2.63F, 0.89F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone2 = Pug7.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(433, 1).addBox(-1.0F, -9.13F, 1.89F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.201F)), PartPose.offset(1.0F, 8.5F, -3.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 19.0F, 4.5F));

		PartDefinition pug5 = right_hind_leg.addOrReplaceChild("pug5", CubeListBuilder.create().texOffs(456, 2).addBox(-2.0F, 1.0F, -3.25F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, 2.5F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 19.0F, 4.5F));

		PartDefinition pug2 = left_hind_leg.addOrReplaceChild("pug2", CubeListBuilder.create().texOffs(456, 2).addBox(-2.0F, 1.0F, -3.25F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, 2.5F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 19.0F, -4.0F));

		PartDefinition pug6 = right_front_leg.addOrReplaceChild("pug6", CubeListBuilder.create().texOffs(456, 2).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 19.0F, -4.0F));

		PartDefinition pug4 = left_front_leg.addOrReplaceChild("pug4", CubeListBuilder.create().texOffs(456, 2).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.55F, 1.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_rotation2 = body.addOrReplaceChild("body_rotation2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4F, 2.55F));

		PartDefinition body_sub_2 = body_rotation2.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Pug9 = body_sub_2.addOrReplaceChild("Pug9", CubeListBuilder.create().texOffs(457, 13).addBox(-3.0F, -2.0F, -5.5F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.45F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 16.6F, -2.7F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(1.0F, 2.2F, 5.1F));

		PartDefinition Pugbasset2 = mane_sub_2.addOrReplaceChild("Pugbasset2", CubeListBuilder.create().texOffs(434, 6).addBox(-3.5F, -5.25F, -8.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, -6.6F));

		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5F, -0.4F));

		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -3.0F, 0.5F));

		PartDefinition pug_ear_right2 = right_ear.addOrReplaceChild("pug_ear_right2", CubeListBuilder.create().texOffs(462, 28).addBox(2.5347F, -8.1303F, -8.3997F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
		.texOffs(462, 28).addBox(2.4695F, -7.6514F, -8.2716F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(471, 28).addBox(3.1674F, -7.6338F, -8.7542F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(8.0F, -2.0F, 1.75F, 1.2654F, 1.7017F, -0.0436F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -3.0F, 0.5F));

		PartDefinition pug_ear_left2 = left_ear.addOrReplaceChild("pug_ear_left2", CubeListBuilder.create().texOffs(462, 28).addBox(1.6933F, -7.5982F, -8.6747F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(462, 28).addBox(1.6281F, -8.0771F, -8.8028F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
		.texOffs(471, 28).addBox(2.4107F, -7.5916F, -9.3494F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-7.5F, -2.0F, -5.5F, 1.2217F, -1.7017F, 0.0436F));

		PartDefinition Pug3 = real_head2.addOrReplaceChild("Pug3", CubeListBuilder.create().texOffs(449, 22).addBox(-1.5F, 1.5F, 3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(449, 22).addBox(-1.5F, 1.75F, 2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(449, 22).addBox(-1.5F, 1.75F, 2.35F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(431, 20).addBox(-3.0F, -1.0F, 3.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(-0.05F))
		.texOffs(433, 24).addBox(-0.5F, 1.25F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(455, 28).addBox(-0.5F, -0.95F, 3.79F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(465, 26).addBox(-0.5F, -0.99F, 4.29F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(458, 28).addBox(-2.0F, 0.75F, 3.7999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(458, 28).addBox(1.0F, 0.75F, 3.7999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(458, 30).addBox(-2.5F, 0.75F, 3.799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(458, 30).addBox(1.5F, 0.75F, 3.799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, -0.5F, -6.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition australian_shepherd() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.75F, 7.75F));
		
		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.25F, -2.25F));

		PartDefinition aus_tail = real_tail2.addOrReplaceChild("aus_tail", CubeListBuilder.create().texOffs(359, 2).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(365, 19).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.05F, 1.75F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 17.0F, 8.0F));

		PartDefinition leg9 = right_hind_leg.addOrReplaceChild("leg9", CubeListBuilder.create(), PartPose.offset(4.0F, -1.0F, -1.0F));

		PartDefinition Nieuwwolfausshepherd6 = leg9.addOrReplaceChild("Nieuwwolfausshepherd6", CubeListBuilder.create().texOffs(864, 10).mirror().addBox(0.0F, -0.2477F, -2.3523F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(852, 9).mirror().addBox(0.0F, -0.1F, -0.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 17.0F, 8.0F));

		PartDefinition leg1 = left_hind_leg.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-4.0F, -1.0F, -1.0F));

		PartDefinition Nieuwwolfausshepherd4 = leg1.addOrReplaceChild("Nieuwwolfausshepherd4", CubeListBuilder.create().texOffs(864, 10).addBox(-2.0F, -0.2477F, -2.3523F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F))
		.texOffs(852, 9).addBox(-2.0F, -0.1F, -0.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, -4.0F));

		PartDefinition leg10 = right_front_leg.addOrReplaceChild("leg10", CubeListBuilder.create(), PartPose.offset(4.0F, -2.0F, 0.0F));

		PartDefinition GermanAussheperdHusky5 = leg10.addOrReplaceChild("GermanAussheperdHusky5", CubeListBuilder.create().texOffs(257, 22).mirror().addBox(0.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, -4.0F));

		PartDefinition leg3 = left_front_leg.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-4.0F, -2.0F, 0.0F));

		PartDefinition GermanAussheperdHusky = leg3.addOrReplaceChild("GermanAussheperdHusky", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 1.0F));

		PartDefinition aus_body = body.addOrReplaceChild("aus_body", CubeListBuilder.create().texOffs(730, 16).addBox(-3.5F, -1.95F, -4.15F, 7.0F, 9.0F, 7.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane2 = upper_body.addOrReplaceChild("mane2", CubeListBuilder.create().texOffs(715, 0).addBox(-4.0F, -5.5F, -2.05F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.5F, -1.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.25F, -3.0F, -0.75F));

		PartDefinition oor15 = right_ear.addOrReplaceChild("oor15", CubeListBuilder.create().texOffs(933, 0).addBox(2.147F, -12.957F, -8.3258F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(933, 0).addBox(2.647F, -9.9672F, -8.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(933, 0).addBox(2.1224F, -12.9566F, -7.7519F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-9.0F, 11.2F, -3.25F, -1.1956F, 0.829F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.25F, -3.0F, -0.75F));

		PartDefinition oor16 = left_ear.addOrReplaceChild("oor16", CubeListBuilder.create().texOffs(933, 0).mirror().addBox(-5.147F, -12.9753F, -8.3723F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(933, 0).mirror().addBox(-4.647F, -9.9855F, -8.3558F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(933, 0).mirror().addBox(-5.1224F, -12.9749F, -7.7984F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(9.0F, 11.25F, -3.25F, -1.1956F, -0.829F, 0.0F));

		PartDefinition australianshepherd_head = real_head.addOrReplaceChild("australianshepherd_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition australianshepherd_head_rot = australianshepherd_head.addOrReplaceChild("australianshepherd_head_rot", CubeListBuilder.create().texOffs(933, 0).addBox(-4.0F, -5.75F, -2.1F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F))
		.texOffs(955, 0).addBox(-6.0F, -6.55F, -0.35F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(628, 0).addBox(-4.9F, 1.45F, -0.34F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(950, 0).addBox(0.0F, -3.85F, -2.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(950, 3).addBox(0.6F, -3.85F, -2.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(950, 3).addBox(-3.5F, -3.85F, -2.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -2.75F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_9 = australianshepherd_head_rot.addOrReplaceChild("mane_sub_9", CubeListBuilder.create().texOffs(950, 0).mirror().addBox(-3.0F, -3.85F, -2.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone165 = australianshepherd_head_rot.addOrReplaceChild("bone165", CubeListBuilder.create().texOffs(628, 0).addBox(-5.9F, -15.5F, -8.99F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -13.05F, 8.65F, 0.0F, 0.0F, -3.1416F));

		PartDefinition bone42 = australianshepherd_head_rot.addOrReplaceChild("bone42", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -7.4F, 12.8F, 1.1781F, 0.0F, 0.0F));

		PartDefinition bone179 = bone42.addOrReplaceChild("bone179", CubeListBuilder.create().texOffs(213, 26).addBox(-1.0F, -0.7828F, -1.9243F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, -12.4163F, -10.3409F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone164 = bone42.addOrReplaceChild("bone164", CubeListBuilder.create().texOffs(239, 28).addBox(1.0F, -12.0808F, -8.7317F, 1.0F, 0.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -4.3692F, 3.6917F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone44 = australianshepherd_head_rot.addOrReplaceChild("bone44", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.7805F, -3.9914F, 0.1833F, 0.0F, 0.0F));

		PartDefinition bone180 = bone44.addOrReplaceChild("bone180", CubeListBuilder.create().texOffs(1156, 26).addBox(-1.5F, -1.2909F, -1.41F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.85F)), PartPose.offsetAndRotation(0.0F, -0.39F, -0.8447F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone140 = bone44.addOrReplaceChild("bone140", CubeListBuilder.create().texOffs(934, 11).addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, 0.2093F, 2.2775F));

		PartDefinition ausshepherd_jaw = bone44.addOrReplaceChild("ausshepherd_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5576F, 2.2055F));

		PartDefinition ausshepherd_jaw_rot = ausshepherd_jaw.addOrReplaceChild("ausshepherd_jaw_rot", CubeListBuilder.create().texOffs(652, 1).addBox(-1.5F, -0.1533F, -3.3171F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(950, 13).addBox(-1.5F, -0.657F, -3.3944F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
		.texOffs(411, 21).addBox(-1.5F, -1.0079F, -3.3594F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition ausshepherd_tongue = bone44.addOrReplaceChild("ausshepherd_tongue", CubeListBuilder.create(), PartPose.offset(0.25F, 3.354F, 1.3792F));

		PartDefinition ausshepherd_tongue_rot = ausshepherd_tongue.addOrReplaceChild("ausshepherd_tongue_rot", CubeListBuilder.create().texOffs(294, 27).addBox(-1.6974F, -2.7991F, -1.6244F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 0.5111F, -0.9342F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition beagle() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.4F, 6.85F));

		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.5F, -0.75F));

		PartDefinition beagle_tail = real_tail2.addOrReplaceChild("beagle_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition Beagle8 = beagle_tail.addOrReplaceChild("Beagle8", CubeListBuilder.create().texOffs(677, 17).addBox(-2.0F, -2.3397F, -1.8808F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 4.0F, -1.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 18.0F, 6.0F));

		PartDefinition leg2 = right_hind_leg.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(2.5F, -2.0F, 1.0F));

		PartDefinition Beagle5 = leg2.addOrReplaceChild("Beagle5", CubeListBuilder.create().texOffs(669, 17).addBox(-2.5F, 0.0F, -2.05F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(669, 17).addBox(-2.5F, 2.0F, -2.85F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 18.0F, 6.0F));

		PartDefinition leg1 = left_hind_leg.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-4.5F, -2.0F, 1.0F));

		PartDefinition Beagle4 = leg1.addOrReplaceChild("Beagle4", CubeListBuilder.create().texOffs(669, 17).addBox(-1.5F, 0.0F, -2.05F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(669, 17).addBox(-1.5F, 2.0F, -2.85F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.25F, 19.5F, -4.0F));

		PartDefinition leg4 = right_front_leg.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(2.75F, -3.5F, 0.0F));

		PartDefinition Beagle7 = leg4.addOrReplaceChild("Beagle7", CubeListBuilder.create().texOffs(686, 22).addBox(-2.5F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 19.5F, -4.0F));

		PartDefinition leg3 = left_front_leg.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-4.5F, -3.5F, 0.0F));

		PartDefinition Beagle6 = leg3.addOrReplaceChild("Beagle6", CubeListBuilder.create().texOffs(686, 22).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 16.5F, 1.5F));

		PartDefinition beagle_body = body.addOrReplaceChild("beagle_body", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, 0.5F));

		PartDefinition body_rotation = beagle_body.addOrReplaceChild("body_rotation", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_1 = body_rotation.addOrReplaceChild("body_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Beagle2 = body_sub_1.addOrReplaceChild("Beagle2", CubeListBuilder.create().texOffs(641, 7).addBox(-4.0F, -2.1F, -5.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(-0.201F)), PartPose.offset(0.0F, 0.0F, 0.2F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.5F, -3.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation = upper_body.addOrReplaceChild("mane_rotation", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition mane_sub_1 = mane_rotation.addOrReplaceChild("mane_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Beagle3 = mane_sub_1.addOrReplaceChild("Beagle3", CubeListBuilder.create().texOffs(669, 4).addBox(-5.0F, -2.65F, -5.75F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.0F, -2.5F, 2.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, -5.5F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, -2.0F, 0.0F));

		PartDefinition oor5 = right_ear.addOrReplaceChild("oor5", CubeListBuilder.create().texOffs(643, 24).addBox(0.9343F, -15.95F, -9.1938F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(591, 28).addBox(0.9375F, -11.95F, -8.9246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(567, 28).addBox(1.498F, -16.95F, -9.2556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3F, 16.25F, 6.25F, -0.0175F, -0.4451F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, -2.0F, 0.0F));

		PartDefinition oor2 = left_ear.addOrReplaceChild("oor2", CubeListBuilder.create().texOffs(643, 24).mirror().addBox(-1.9343F, -15.95F, -9.1938F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(591, 28).mirror().addBox(-1.9375F, -11.95F, -8.9246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(567, 28).mirror().addBox(-2.498F, -16.95F, -9.2556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.3F, 16.25F, 6.25F, -0.0175F, 0.4451F, 0.0F));

		PartDefinition beagle_head = real_head.addOrReplaceChild("beagle_head", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.0F, 2.25F));

		PartDefinition Beagle = beagle_head.addOrReplaceChild("Beagle", CubeListBuilder.create().texOffs(619, 20).addBox(-4.0F, -3.15F, -2.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, -3.0F));

		PartDefinition bone33 = Beagle.addOrReplaceChild("bone33", CubeListBuilder.create().texOffs(654, 24).addBox(-4.9F, -11.25F, -8.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(568, 26).addBox(-3.9F, -11.3F, -8.0517F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 10.3F, 2.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neus2 = bone33.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(577, 6).addBox(0.1F, -7.6828F, -7.9586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0001F))
		.texOffs(581, 28).addBox(0.5F, -7.6846F, -7.9586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(577, 6).addBox(0.9F, -7.6828F, -7.9586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0001F)), PartPose.offsetAndRotation(-3.9F, -5.7748F, 2.6915F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bone34 = bone33.addOrReplaceChild("bone34", CubeListBuilder.create().texOffs(670, 27).addBox(-2.1F, -8.7482F, -7.4F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.11F))
		.texOffs(575, 29).addBox(0.8F, -8.4982F, -6.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.101F))
		.texOffs(575, 29).addBox(-2.0F, -8.4982F, -6.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(-2.8F, -0.107F, -0.3982F, -0.0175F, 0.0F, 0.0F));

		PartDefinition oog = Beagle.addOrReplaceChild("oog", CubeListBuilder.create().texOffs(594, 23).addBox(2.4963F, -11.4694F, -7.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(637, 24).addBox(2.0457F, -11.4707F, -7.02F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.55F, 9.7F, 5.0F));

		PartDefinition oog2 = Beagle.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(594, 23).addBox(0.5455F, -11.4457F, -7.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(637, 24).addBox(1.146F, -11.4457F, -7.02F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 9.7F, 5.0F));

		PartDefinition bone32 = Beagle.addOrReplaceChild("bone32", CubeListBuilder.create().texOffs(557, 30).addBox(0.501F, -9.773F, -5.0722F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.001F))
		.texOffs(653, 22).addBox(0.1F, -9.7093F, -5.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(653, 22).addBox(0.9F, -9.7093F, -5.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.0F, 7.55F, 0.55F, -0.2443F, 0.0F, 0.0F));

		PartDefinition bone36 = Beagle.addOrReplaceChild("bone36", CubeListBuilder.create().texOffs(582, 29).addBox(0.5F, -7.6852F, -7.1994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 4.5252F, 5.1914F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition bernese_dog() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.55F, 8.75F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition asca = real_tail.addOrReplaceChild("asca", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.25F, -0.75F));

		PartDefinition stbernard8 = asca.addOrReplaceChild("stbernard8", CubeListBuilder.create().texOffs(1545, 18).addBox(-2.5F, -3.9022F, 0.3997F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1557, 20).addBox(-2.5F, -3.9022F, -2.6003F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 1.0F, -1.35F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 17.25F, 7.0F));

		PartDefinition bernese2 = right_hind_leg.addOrReplaceChild("bernese2", CubeListBuilder.create().texOffs(709, 15).mirror().addBox(-0.5F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offset(-0.5F, -1.25F, 0.0F));

		PartDefinition bone11 = bernese2.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(542, 9).mirror().addBox(2.5F, -7.9F, 2.95F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 7.65F, 1.35F, 0.0F, -3.1416F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 17.25F, 7.0F));

		PartDefinition bernese3 = left_hind_leg.addOrReplaceChild("bernese3", CubeListBuilder.create().texOffs(709, 15).addBox(-1.5F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(0.5F, -1.25F, 0.0F));

		PartDefinition bone10 = bernese3.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(542, 9).addBox(-2.5F, -7.9F, 2.95F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 7.65F, 1.35F, 0.0F, 3.1416F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.25F, 17.0F, -4.5F));

		PartDefinition stbernardbernese5 = right_front_leg.addOrReplaceChild("stbernardbernese5", CubeListBuilder.create().texOffs(1504, 8).mirror().addBox(-0.5F, -0.35F, -1.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false)
		.texOffs(550, 9).mirror().addBox(-0.5F, -0.65F, 1.05F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.25F, -1.0F, 0.5F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.25F, 17.0F, -4.5F));

		PartDefinition stbernardbernese7 = left_front_leg.addOrReplaceChild("stbernardbernese7", CubeListBuilder.create().texOffs(1504, 8).addBox(-1.5F, -0.35F, -1.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F))
		.texOffs(550, 9).addBox(0.5F, -0.65F, 1.05F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -1.0F, 0.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stbernardbernese3 = body_sub_2.addOrReplaceChild("stbernardbernese3", CubeListBuilder.create().texOffs(1528, 2).addBox(-3.5F, -3.4F, -0.15F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.4F))
		.texOffs(1534, 8).addBox(-3.5F, -3.4F, -2.95F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.25F, 1.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5F, 2.5F));

		PartDefinition stbernardbernese6 = mane_sub_2.addOrReplaceChild("stbernardbernese6", CubeListBuilder.create().texOffs(1503, 9).addBox(-8.0F, -7.75F, -2.1F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.2F)), PartPose.offset(4.0F, 1.25F, -4.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 8.5F, -6.5F));

		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, -2.0F, 0.0F));

		PartDefinition oor2 = right_ear.addOrReplaceChild("oor2", CubeListBuilder.create().texOffs(1569, 23).addBox(1.0342F, -19.3969F, -12.3696F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1539, 28).addBox(1.057F, -14.4153F, -12.0191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1494, 15).addBox(1.2265F, -13.4298F, -12.0137F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.75F, 17.6F, 9.05F, -0.0436F, -0.2182F, 0.1745F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, -2.0F, 0.0F));

		PartDefinition oor3 = left_ear.addOrReplaceChild("oor3", CubeListBuilder.create().texOffs(1569, 23).mirror().addBox(-2.0342F, -19.3969F, -12.3696F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1539, 28).mirror().addBox(-2.057F, -14.4153F, -12.0191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1494, 15).mirror().addBox(-2.2265F, -13.4298F, -12.0137F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.75F, 17.6F, 9.05F, -0.0436F, 0.2182F, -0.1745F));

		PartDefinition asccsa2 = real_head2.addOrReplaceChild("asccsa2", CubeListBuilder.create(), PartPose.offset(-1.0F, 5.0F, 1.5F));

		PartDefinition bernesemountaindog2 = asccsa2.addOrReplaceChild("bernesemountaindog2", CubeListBuilder.create().texOffs(1638, 18).addBox(-3.5F, -20.05F, -11.85F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(1456, 30).addBox(-2.3F, -18.0F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1467, 29).addBox(-0.5F, -20.01F, -11.81F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F))
		.texOffs(1467, 29).addBox(-0.5F, -18.91F, -11.81F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F))
		.texOffs(1460, 30).addBox(-2.85F, -18.0F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.08F))
		.texOffs(1456, 30).addBox(1.25F, -18.0F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1460, 30).addBox(1.8F, -18.0F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.08F)), PartPose.offset(1.0F, 11.55F, 7.5F));

		PartDefinition bone2 = bernesemountaindog2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.75F, 5.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone3 = bernesemountaindog2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1478, 0).addBox(3.9525F, -11.8972F, -7.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.25F, -6.9F, -3.95F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone4 = bernesemountaindog2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1478, 0).addBox(2.5775F, -11.8799F, -7.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -7.9F, -3.95F, 0.0F, 0.0F, 0.1309F));

		PartDefinition mond2 = bernesemountaindog2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1667, 25).addBox(-1.5F, -10.8275F, -8.4093F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.13F))
		.texOffs(553, 30).addBox(0.0F, -9.9246F, -8.3149F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.4F, -6.65F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone5 = mond2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(1452, 30).addBox(2.0F, -12.7397F, -8.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offset(-2.0F, 2.25F, 0.25F));

		PartDefinition bone6 = mond2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(1631, 11).addBox(-1.5F, -8.5093F, -9.2932F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.23F))
		.texOffs(966, 9).addBox(-1.5F, -8.0393F, -9.2932F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
		.texOffs(1659, 18).addBox(-1.0F, -8.0993F, -9.1672F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.28F)), PartPose.offsetAndRotation(0.0F, 0.5893F, 0.3898F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head_sub_2 = bone6.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(965, 8).mirror().addBox(0.5F, -8.0393F, -9.2932F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neus2 = mond2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(1446, 29).addBox(0.0F, -13.2162F, -4.9212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.056F)), PartPose.offsetAndRotation(0.0F, -10.415F, 9.0455F, 1.1694F, 0.0F, 0.0F));

		PartDefinition bone7 = neus2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(1430, 29).addBox(-0.5F, -16.1343F, -6.5443F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(1438, 29).addBox(-0.5F, -16.1343F, -4.9444F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3555F, -13.9238F, -0.829F, 0.0F, 0.0F));

		PartDefinition bone8 = bernesemountaindog2.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, -7.5F, 0.35F, 0.0436F, 0.0F, -1.1781F));

		PartDefinition oor4 = bernesemountaindog2.addOrReplaceChild("oor4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, -10.5F, 0.75F, 0.0F, -0.1745F, 0.0F));

		PartDefinition oor5 = bernesemountaindog2.addOrReplaceChild("oor5", CubeListBuilder.create(), PartPose.offsetAndRotation(6.15F, -10.5F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone9 = oor5.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4924F, 3.0F, -0.3132F, 0.0436F, 0.0F, 1.1781F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition dachshund() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.5F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition dachshund_tail = tail.addOrReplaceChild("dachshund_tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3064F, 0.2981F, 1.5708F, 0.0F, 0.0F));

		PartDefinition dachshund_tail_rotation = dachshund_tail.addOrReplaceChild("dachshund_tail_rotation", CubeListBuilder.create().texOffs(860, 11).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.75F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, 7.0F));

		PartDefinition Dachshundjackrusselleg1_rotation3 = right_hind_leg.addOrReplaceChild("Dachshundjackrusselleg1_rotation3", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -11.5F));

		PartDefinition mane_sub_4 = Dachshundjackrusselleg1_rotation3.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(925, 2).addBox(-1.0F, -4.0F, 9.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, 7.0F));

		PartDefinition Dachshundjackrusselleg1_rotation2 = left_hind_leg.addOrReplaceChild("Dachshundjackrusselleg1_rotation2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -11.5F));

		PartDefinition mane_sub_87 = Dachshundjackrusselleg1_rotation2.addOrReplaceChild("mane_sub_87", CubeListBuilder.create().texOffs(925, 2).mirror().addBox(-1.0F, -4.0F, 9.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 19.0F, -3.5F));

		PartDefinition Dachshundjackrusselleg3_rotation3 = right_front_leg.addOrReplaceChild("Dachshundjackrusselleg3_rotation3", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, -3.0F));

		PartDefinition mane_sub_3 = Dachshundjackrusselleg3_rotation3.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(925, 0).addBox(-1.0F, 0.5F, 2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 19.0F, -3.5F));

		PartDefinition Dachshundjackrusselleg3_rotation2 = left_front_leg.addOrReplaceChild("Dachshundjackrusselleg3_rotation2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, -3.0F));

		PartDefinition mane_sub_2 = Dachshundjackrusselleg3_rotation2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(925, 0).mirror().addBox(-1.0F, 0.5F, 2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.5F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Dachshund_body2 = body.addOrReplaceChild("Dachshund_body2", CubeListBuilder.create().texOffs(909, 18).addBox(-2.5F, -5.75F, -6.7F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 4.0F, 4.1F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.25F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition dachshundmane2 = upper_body.addOrReplaceChild("dachshundmane2", CubeListBuilder.create().texOffs(1741, 0).addBox(-3.0F, -12.75F, -10.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 7.25F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -6.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -1.5F, 0.25F));

		PartDefinition dachshund_ear_left2 = left_ear.addOrReplaceChild("dachshund_ear_left2", CubeListBuilder.create().texOffs(902, 10).addBox(6.0406F, -10.6247F, -9.3223F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(914, 1).addBox(5.8624F, -7.9415F, -8.5785F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3371F, 11.7042F, 8.7746F, -0.1554F, 0.6055F, -0.0722F));

		PartDefinition bone27_r1 = dachshund_ear_left2.addOrReplaceChild("bone27_r1", CubeListBuilder.create().texOffs(904, 18).addBox(0.9364F, -5.3589F, 6.6052F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4995F, -6.3938F, -15.4367F, 0.0F, -0.3927F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.5F, 0.25F));

		PartDefinition dachshund_ear_right2 = right_ear.addOrReplaceChild("dachshund_ear_right2", CubeListBuilder.create().texOffs(902, 10).mirror().addBox(-7.0406F, -10.6247F, -9.3223F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(914, 1).mirror().addBox(-6.8624F, -7.9415F, -8.5785F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3371F, 11.7042F, 8.7746F, -0.1554F, -0.6055F, 0.0722F));

		PartDefinition bone28_r1 = dachshund_ear_right2.addOrReplaceChild("bone28_r1", CubeListBuilder.create().texOffs(904, 18).mirror().addBox(-1.9364F, -5.3589F, 6.6052F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4995F, -6.3938F, -15.4367F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Dachshund_head3 = real_head.addOrReplaceChild("Dachshund_head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, 10.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Dachshund_rotation3 = Dachshund_head3.addOrReplaceChild("Dachshund_rotation3", CubeListBuilder.create().texOffs(882, 0).addBox(-2.5F, 7.4F, 0.75F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F))
		.texOffs(869, 1).addBox(-1.8F, 8.7829F, 0.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(869, 1).addBox(0.8F, 8.7829F, 0.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.5F, 4.4F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mond3 = Dachshund_rotation3.addOrReplaceChild("mond3", CubeListBuilder.create().texOffs(902, 0).addBox(-1.5F, 1.4358F, -11.2038F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F))
		.texOffs(962, 14).addBox(-1.5F, 2.8311F, -11.2038F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.305F))
		.texOffs(1124, 8).addBox(-1.5F, 0.755F, -11.9853F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F))
		.texOffs(869, 1).addBox(-0.5F, 2.4419F, -11.154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.35F, 7.9F, 0.1134F, 0.0F, 0.0F));

		PartDefinition bone4 = mond3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1062, 11).addBox(-1.5F, 10.7145F, 1.2287F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.307F)), PartPose.offsetAndRotation(0.0F, -7.7035F, -11.941F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = mond3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(909, 8).addBox(-1.0F, -0.5522F, -15.7482F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.84F, 5.1581F, 0.3927F, 0.0F, 0.0F));

		PartDefinition dachshund_neck3 = Dachshund_head3.addOrReplaceChild("dachshund_neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.2293F, 0.1298F, 0.3927F, 0.0F, 0.0F));

		PartDefinition dachshund_neck_rotation3 = dachshund_neck3.addOrReplaceChild("dachshund_neck_rotation3", CubeListBuilder.create().texOffs(887, 22).addBox(-1.95F, 7.8853F, -2.3062F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 0.0164F, 1.3462F, -1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition english_bulldog() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, 6.5F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wgwegew = real_tail.addOrReplaceChild("wgwegew", CubeListBuilder.create(), PartPose.offset(0.0F, 13.75F, -8.75F));

		PartDefinition englishbulldog4 = wgwegew.addOrReplaceChild("englishbulldog4", CubeListBuilder.create().texOffs(1108, 21).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.0F, -12.0F, 10.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 18.5F, 4.75F));

		PartDefinition englishbulldog6 = right_hind_leg.addOrReplaceChild("englishbulldog6", CubeListBuilder.create().texOffs(1116, 11).mirror().addBox(-0.5F, 0.0F, -3.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.5F, -2.5F, 2.25F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 18.5F, 4.75F));

		PartDefinition englishbulldog5 = left_hind_leg.addOrReplaceChild("englishbulldog5", CubeListBuilder.create().texOffs(1116, 11).addBox(-1.5F, 0.0F, -3.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -2.5F, 2.25F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 19.0F, -4.0F));

		PartDefinition ewg3 = right_front_leg.addOrReplaceChild("ewg3", CubeListBuilder.create(), PartPose.offset(4.5F, -3.0F, 0.0F));

		PartDefinition englishbulldog3 = ewg3.addOrReplaceChild("englishbulldog3", CubeListBuilder.create().texOffs(1102, 12).mirror().addBox(-0.5F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 19.0F, -4.0F));

		PartDefinition ewg2 = left_front_leg.addOrReplaceChild("ewg2", CubeListBuilder.create(), PartPose.offset(-4.5F, -3.0F, 0.0F));

		PartDefinition englishbulldog2 = ewg2.addOrReplaceChild("englishbulldog2", CubeListBuilder.create().texOffs(1102, 12).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition englishbulldog11 = body_sub_2.addOrReplaceChild("englishbulldog11", CubeListBuilder.create().texOffs(1101, 0).addBox(-3.0F, 0.0F, -5.2F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.4F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 4.5F));

		PartDefinition englishbulldog10 = mane_sub_2.addOrReplaceChild("englishbulldog10", CubeListBuilder.create().texOffs(1073, 0).addBox(-3.5F, -5.25F, -8.0F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 15.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -3.0F, 0.5F));

		PartDefinition ear_left3 = left_ear.addOrReplaceChild("ear_left3", CubeListBuilder.create().texOffs(1102, 24).addBox(2.4384F, -9.0665F, -5.0365F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(7.35F, 1.6F, -7.2F, 0.3054F, -2.9234F, -1.0908F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -3.0F, 0.5F));

		PartDefinition ear_right3 = right_ear.addOrReplaceChild("ear_right3", CubeListBuilder.create().texOffs(1102, 24).mirror().addBox(-3.4384F, -9.0665F, -5.0365F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-7.35F, 1.6F, -7.2F, 0.3054F, 2.9234F, 1.0908F));

		PartDefinition ehheht2 = real_head.addOrReplaceChild("ehheht2", CubeListBuilder.create(), PartPose.offset(-1.0F, -2.0F, 0.0F));

		PartDefinition Englishbulldog9 = ehheht2.addOrReplaceChild("Englishbulldog9", CubeListBuilder.create().texOffs(1066, 20).addBox(-4.0F, -1.5F, -2.25F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1105, 29).addBox(-2.5F, 3.05F, -3.65F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F))
		.texOffs(1037, 0).addBox(-3.15F, -0.3261F, -2.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1072, 0).addBox(-3.55F, -0.3244F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1072, 0).addBox(0.45F, -0.3244F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1037, 0).addBox(0.1F, -0.3261F, -2.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.25F, 0.0F));

		PartDefinition mond2 = Englishbulldog9.addOrReplaceChild("mond2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1F, 0.1F));

		PartDefinition bone2 = mond2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1090, 25).addBox(0.0F, -10.2056F, -3.8644F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(-2.0F, 11.9F, -0.85F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone3 = mond2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1090, 27).addBox(-2.5F, -11.209F, -4.7871F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.2F, 0.95F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1084, 21).addBox(0.6011F, -9.4651F, -4.2296F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-2.9F, -0.5F, -1.2F, 0.0F, 0.0F, 0.0436F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(1084, 21).addBox(1.3945F, -9.3652F, -4.2296F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-0.1F, -0.5F, -1.2F, 0.0F, 0.0F, -0.0436F));

		PartDefinition bone6 = mond2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(1091, 22).addBox(-1.5F, -9.6462F, -5.2409F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 11.5F, 1.05F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone7 = mond2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(1062, 22).addBox(-1.5F, -8.8258F, -5.1722F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, 8.8F, 2.45F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone8 = mond2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(1037, 2).addBox(-0.5F, -8.4002F, -4.9808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-1.0F, 9.5F, 1.05F, -0.0175F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition king_charles() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 15.35F, 6.7F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition kingcharles_tail_rotation2 = real_tail.addOrReplaceChild("kingcharles_tail_rotation2", CubeListBuilder.create().texOffs(1219, 2).addBox(-1.0F, -4.0F, -2.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F))
		.texOffs(1215, 22).addBox(-1.0F, -4.0F, 0.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 3.3969F, -1.7509F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.4F, 18.5F, 5.6F));

		PartDefinition KingCharlesleg4 = right_hind_leg.addOrReplaceChild("KingCharlesleg4", CubeListBuilder.create(), PartPose.offset(-0.2F, 3.2F, -10.6F));

		PartDefinition bone7 = KingCharlesleg4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(405, 26).mirror().addBox(-1.1F, -0.45F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(0.1F, -1.0F, 9.65F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.4F, 18.5F, 5.6F));

		PartDefinition KingCharlesleg5 = left_hind_leg.addOrReplaceChild("KingCharlesleg5", CubeListBuilder.create(), PartPose.offset(0.2F, 3.2F, -10.6F));

		PartDefinition bone6 = KingCharlesleg5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(405, 26).addBox(-0.9F, -0.45F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(-0.1F, -1.0F, 9.65F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.85F, 20.15F, -3.9F));

		PartDefinition KingCharlesleg3 = right_front_leg.addOrReplaceChild("KingCharlesleg3", CubeListBuilder.create(), PartPose.offset(0.1F, -7.0F, 0.3F));

		PartDefinition bone9 = KingCharlesleg3.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(405, 25).mirror().addBox(-2.5F, -5.0F, 3.4F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(1.5F, 11.05F, -4.55F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.85F, 20.15F, -3.9F));

		PartDefinition KingCharlesleg2 = left_front_leg.addOrReplaceChild("KingCharlesleg2", CubeListBuilder.create(), PartPose.offset(-0.1F, -7.0F, 0.3F));

		PartDefinition bone8 = KingCharlesleg2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(405, 25).addBox(0.5F, -5.0F, 3.4F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(-1.5F, 11.05F, -4.55F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.9F, 2.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition kingcharles_body2 = body.addOrReplaceChild("kingcharles_body2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, 2.25F));

		PartDefinition kingcharlesbody2 = kingcharles_body2.addOrReplaceChild("kingcharlesbody2", CubeListBuilder.create().texOffs(1191, 14).addBox(-3.0F, -5.95F, -5.1F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1213, 0).addBox(2.3F, -5.8F, -6.9F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1213, 0).addBox(-2.2F, -5.8F, -6.9F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 18.2F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition king_charles_mane2 = upper_body.addOrReplaceChild("king_charles_mane2", CubeListBuilder.create().texOffs(1189, 0).addBox(-3.0F, -12.75F, -9.75F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.1F))
		.texOffs(1223, 25).addBox(2.3F, -10.8F, -11.75F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1223, 25).addBox(-2.2F, -10.8F, -11.75F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 9.0F, 7.2F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -5.4F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -3.0F, -1.1F));

		PartDefinition ear_right2 = right_ear.addOrReplaceChild("ear_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 17.1F, 8.6F, 0.0F, -0.1745F, 0.0F));

		PartDefinition head_sub_2 = ear_right2.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(1179, 0).mirror().addBox(-3.4204F, -16.5F, -9.3922F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.05F)).mirror(false)
		.texOffs(1179, 0).mirror().addBox(-4.1272F, -16.3F, -9.3692F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(1179, 11).mirror().addBox(-3.4204F, -12.8F, -8.8922F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(1196, 27).mirror().addBox(-2.8987F, -10.8F, -8.8768F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -3.0F, -1.1F));

		PartDefinition ear_left2 = left_ear.addOrReplaceChild("ear_left2", CubeListBuilder.create().texOffs(1179, 0).addBox(2.4204F, -16.5F, -9.3922F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.05F))
		.texOffs(1179, 0).addBox(3.1272F, -16.3F, -9.3692F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(1179, 11).addBox(2.4204F, -12.8F, -8.8922F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F))
		.texOffs(1196, 27).addBox(2.8987F, -10.8F, -8.8768F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 17.1F, 8.6F, 0.0F, 0.1745F, 0.0F));

		PartDefinition head3 = real_head.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.25F, -0.55F));

		PartDefinition kingcharles2 = head3.addOrReplaceChild("kingcharles2", CubeListBuilder.create().texOffs(1176, 22).addBox(-2.5F, -12.4F, -9.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(1138, 22).addBox(-1.95F, -11.15F, -9.215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1138, 22).addBox(0.9F, -11.15F, -9.215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 9.75F, 7.05F));

		PartDefinition bone2 = kingcharles2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1176, 22).addBox(-2.0F, -7.95F, -8.849F, 5.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(-0.5F, -0.6F, -0.25F));

		PartDefinition bone3 = kingcharles2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1676, 12).addBox(-1.0F, -10.9805F, -5.6244F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F))
		.texOffs(1150, 21).addBox(0.0F, -8.797F, -4.3628F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1174, 16).addBox(-1.0F, -10.0873F, -4.6621F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(543, 28).addBox(-0.91F, -8.6927F, -4.4591F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(-0.5F, -0.15F, -6.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(580, 23).addBox(-0.5F, -10.6471F, -3.8299F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 2.4824F, -1.1583F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(543, 28).addBox(1.3153F, -9.16F, -4.4957F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(-7.25F, -10.0079F, 0.0366F, 0.0F, 0.0F, 1.5708F));

		PartDefinition neus2 = kingcharles2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(1153, 6).addBox(0.0F, -8.5046F, -0.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.5F, -5.95F, -2.15F, 1.0036F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition west_cairn_terrier() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.9F, 5.3F, 1.789F, 0.0F, 0.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.4F, 1.4F));

		PartDefinition west_staart2 = real_tail.addOrReplaceChild("west_staart2", CubeListBuilder.create(), PartPose.offset(1.0F, 8.3233F, -6.7675F));

		PartDefinition west_staart_rot2 = west_staart2.addOrReplaceChild("west_staart_rot2", CubeListBuilder.create().texOffs(1464, 0).addBox(-1.0F, -5.8584F, -0.7796F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -7.75F, 4.85F, 0.0F, 0.0F, -3.1416F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition west_shihtzu_leg2_rot2 = right_hind_leg.addOrReplaceChild("west_shihtzu_leg2_rot2", CubeListBuilder.create().texOffs(1455, 22).addBox(-2.0F, 2.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.75F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(1455, 22).mirror().addBox(0.25F, 2.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition west_shihtzu_leg4_rot2 = right_front_leg.addOrReplaceChild("west_shihtzu_leg4_rot2", CubeListBuilder.create(), PartPose.offset(-0.25F, 0.0F, 2.5F));

		PartDefinition mane_sub_6 = west_shihtzu_leg4_rot2.addOrReplaceChild("mane_sub_6", CubeListBuilder.create().texOffs(1455, 22).mirror().addBox(0.0F, 2.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition west_shihtzu_leg3_rot2 = left_front_leg.addOrReplaceChild("west_shihtzu_leg3_rot2", CubeListBuilder.create().texOffs(1455, 22).addBox(-2.0F, 2.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 0.0F, 2.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.7F, 2.1F, 1.5708F, 0.0F, 0.0F));

		PartDefinition west_shihtzu_body2 = body.addOrReplaceChild("west_shihtzu_body2", CubeListBuilder.create().texOffs(1833, 0).addBox(-3.5F, -5.475F, -6.05F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.15F))
		.texOffs(1427, 13).addBox(-3.5F, -5.025F, -3.45F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.09F)), PartPose.offset(0.0F, 3.125F, 0.05F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.5F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition west_shihtzu_mane2 = upper_body.addOrReplaceChild("west_shihtzu_mane2", CubeListBuilder.create().texOffs(1424, 0).addBox(-3.5F, -6.0F, -8.35F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 3.25F, 4.85F));

		PartDefinition west_shihtzu_mane_hair2 = west_shihtzu_mane2.addOrReplaceChild("west_shihtzu_mane_hair2", CubeListBuilder.create().texOffs(1813, 0).addBox(-3.5F, -3.0F, -7.75F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -3.0F, -3.4F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -4.9F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -3.0F, -1.6F));

		PartDefinition bone2 = right_ear.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1457, 1).addBox(-1.521F, -0.9837F, -2.1F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.35F, -1.05F, 2.2F, 0.0F, 0.0F, -0.3927F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -3.0F, -1.6F));

		PartDefinition bone3 = left_ear.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.35F, -1.05F, 2.2F, 0.0F, 0.0F, 0.3927F));

		PartDefinition mane_sub_2 = bone3.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(1457, 1).mirror().addBox(-1.479F, -0.9837F, -2.1F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition west_shihtzu_head_rot2 = real_head.addOrReplaceChild("west_shihtzu_head_rot2", CubeListBuilder.create().texOffs(1402, 0).addBox(-3.0F, -0.4F, 3.75F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -2.55F, -6.4F));

		PartDefinition shihtzu2 = west_shihtzu_head_rot2.addOrReplaceChild("shihtzu2", CubeListBuilder.create(), PartPose.offset(0.0F, 11.3F, 13.0F));

		PartDefinition shihtzu_tong2 = shihtzu2.addOrReplaceChild("shihtzu_tong2", CubeListBuilder.create(), PartPose.offset(0.0F, -6.25F, -9.85F));

		PartDefinition shihtzu_tong_rot2 = shihtzu_tong2.addOrReplaceChild("shihtzu_tong_rot2", CubeListBuilder.create().texOffs(1495, 20).addBox(-1.0F, -1.8381F, -0.9441F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.25F, 0.5672F, 0.0F, 0.0F));

		PartDefinition shihtzu_neusbrug2 = shihtzu2.addOrReplaceChild("shihtzu_neusbrug2", CubeListBuilder.create().texOffs(1463, 27).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -9.05F, -9.55F));

		PartDefinition shihtzu_longhair2 = shihtzu2.addOrReplaceChild("shihtzu_longhair2", CubeListBuilder.create().texOffs(1685, 1).addBox(-2.0F, -5.9F, -10.05F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(1783, 17).addBox(2.55F, -7.0F, -8.75F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane_sub_3 = shihtzu_longhair2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(1783, 17).mirror().addBox(-4.55F, -7.0F, -8.75F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_baard2 = shihtzu_longhair2.addOrReplaceChild("shihtzu_baard2", CubeListBuilder.create().texOffs(1621, 11).addBox(-3.0F, -0.15F, -0.05F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offset(0.0F, -5.75F, -9.2F));

		PartDefinition shihtzu_hair2 = shihtzu_longhair2.addOrReplaceChild("shihtzu_hair2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, -8.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition shihtzu_hair_rot2 = shihtzu_hair2.addOrReplaceChild("shihtzu_hair_rot2", CubeListBuilder.create().texOffs(1627, 0).addBox(-1.5F, -2.25F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition shihtzu_mond2 = shihtzu2.addOrReplaceChild("shihtzu_mond2", CubeListBuilder.create().texOffs(1474, 3).addBox(-1.5F, -10.3F, -10.251F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.95F))
		.texOffs(1503, 4).addBox(-1.0F, -7.5F, -10.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1538, 18).addBox(-2.0F, -8.7F, -10.05F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1537, 29).addBox(-2.0F, -6.7F, -10.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1537, 29).addBox(1.0F, -6.7F, -10.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1571, 1).addBox(-2.0F, -8.3F, -10.55F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_ear_left2 = shihtzu2.addOrReplaceChild("shihtzu_ear_left2", CubeListBuilder.create().texOffs(1468, 11).addBox(2.55F, -10.8F, -8.75F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_ear_right2 = shihtzu2.addOrReplaceChild("shihtzu_ear_right2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane_sub_4 = shihtzu_ear_right2.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(1468, 11).mirror().addBox(-4.55F, -10.8F, -8.75F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition westie2 = west_shihtzu_head_rot2.addOrReplaceChild("westie2", CubeListBuilder.create().texOffs(1873, 22).addBox(-5.0F, -13.6F, -8.4F, 10.0F, 9.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offset(0.0F, 11.3F, 13.0F));

		PartDefinition west_eye3 = westie2.addOrReplaceChild("west_eye3", CubeListBuilder.create().texOffs(1445, 3).addBox(-1.1F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offset(1.4F, -9.7F, -8.801F));

		PartDefinition west_eye4 = westie2.addOrReplaceChild("west_eye4", CubeListBuilder.create(), PartPose.offset(-1.4F, -9.7F, -8.801F));

		PartDefinition mane_sub_5 = west_eye4.addOrReplaceChild("mane_sub_5", CubeListBuilder.create().texOffs(1445, 3).mirror().addBox(-0.9F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_sub_2 = westie2.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(1452, 8).mirror().addBox(-3.55F, -0.8F, 5.65F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, -11.3F, -13.0F));

		PartDefinition bone4 = westie2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1380, 20).addBox(1.5F, 8.0811F, -10.6643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -21.2494F, -13.2151F, 1.1781F, 0.0F, 0.0F));

		PartDefinition snor5 = westie2.addOrReplaceChild("snor5", CubeListBuilder.create().texOffs(1402, 11).addBox(-1.0F, -10.0466F, -6.4956F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0961F, -5.9803F, -0.3054F, 0.0F, 0.0F));

		PartDefinition west_mond2 = westie2.addOrReplaceChild("west_mond2", CubeListBuilder.create().texOffs(1418, 26).addBox(-2.0F, -1.2163F, -2.5603F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1409, 21).addBox(-1.5F, 0.3895F, -2.4955F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1419, 3).addBox(-1.0F, -0.0807F, -3.019F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(1424, 5).addBox(-0.5F, -0.3591F, -2.7287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.5746F, -8.7216F, 0.2182F, 0.0F, 0.0F));

		PartDefinition west_neus2 = west_mond2.addOrReplaceChild("west_neus2", CubeListBuilder.create().texOffs(1445, 3).addBox(-1.0F, -1.0084F, -0.3634F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.6451F, -2.8488F, 0.0873F, 0.0F, 0.0F));

		PartDefinition snor6 = west_mond2.addOrReplaceChild("snor6", CubeListBuilder.create().texOffs(1419, 0).addBox(0.0F, -9.8763F, -5.2821F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 9.1129F, 1.8258F, -0.0873F, 0.0F, 0.0F));

		PartDefinition snor7 = west_mond2.addOrReplaceChild("snor7", CubeListBuilder.create().texOffs(1370, 0).addBox(-2.453F, -9.6684F, -5.1333F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 8.6439F, 2.5469F, 0.0F, 0.0F, 0.0873F));

		PartDefinition snor8 = west_mond2.addOrReplaceChild("snor8", CubeListBuilder.create().texOffs(1370, 0).addBox(-1.567F, -9.6185F, -5.1333F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 8.2443F, 2.5644F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone5 = west_mond2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(1370, 0).addBox(-1.8659F, -8.9686F, -4.8964F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 9.2439F, 2.5469F));

		PartDefinition west_tong2 = westie2.addOrReplaceChild("west_tong2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.75F, -10.45F));

		PartDefinition west_rot2 = west_tong2.addOrReplaceChild("west_rot2", CubeListBuilder.create().texOffs(1489, 14).addBox(-1.0F, -1.3F, -0.4135F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.75F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition labrador_golden_retriever() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.55F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Labrador3 = real_tail.addOrReplaceChild("Labrador3", CubeListBuilder.create().texOffs(184, 0).addBox(-1.0F, -12.0F, 9.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(207, 1).addBox(-1.0F, -12.0F, 7.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.85F, -10.25F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.75F, 16.0F, 7.0F));

		PartDefinition Labradorpoedel_leg2_rot2 = right_hind_leg.addOrReplaceChild("Labradorpoedel_leg2_rot2", CubeListBuilder.create().texOffs(199, 0).addBox(0.6F, -8.2F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.5F, 8.0F, -7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.75F, 16.0F, 7.0F));

		PartDefinition Labradorpoedel_leg1_rot2 = left_hind_leg.addOrReplaceChild("Labradorpoedel_leg1_rot2", CubeListBuilder.create(), PartPose.offset(-1.65F, 8.0F, -7.0F));

		PartDefinition mane_sub_3 = Labradorpoedel_leg1_rot2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(199, 0).mirror().addBox(0.6F, -8.2F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 16.0F, -4.0F));

		PartDefinition labrador4_rot2 = right_front_leg.addOrReplaceChild("labrador4_rot2", CubeListBuilder.create().texOffs(199, 0).addBox(-2.25F, -8.2F, -4.8F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F))
		.texOffs(210, 20).addBox(-1.5F, -8.0F, -2.8F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.25F, 7.95F, 3.25F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 16.0F, -4.0F));

		PartDefinition labrador3_rot2 = left_front_leg.addOrReplaceChild("labrador3_rot2", CubeListBuilder.create().texOffs(210, 20).addBox(1.5F, -8.0F, -2.8F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 8.0F, 3.4F));

		PartDefinition mane_sub_2 = labrador3_rot2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(199, 0).mirror().addBox(1.0F, -8.2F, -5.05F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5F, 3.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Labrador_body_main2 = body.addOrReplaceChild("Labrador_body_main2", CubeListBuilder.create().texOffs(169, 9).addBox(-3.5F, -5.5F, -3.505F, 7.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(199, 18).addBox(-3.5F, -5.5F, -5.495F, 7.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.75F, -0.495F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Labrador_mane2 = upper_body.addOrReplaceChild("Labrador_mane2", CubeListBuilder.create().texOffs(199, 10).addBox(-4.0F, -6.0F, -11.7F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.2F))
		.texOffs(137, 11).addBox(-4.0F, -6.0F, -9.3F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 3.0F, 5.8F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.4F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, -1.7F, -0.9F));

		PartDefinition oor3 = right_ear.addOrReplaceChild("oor3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0068F, 2.4354F, 0.1975F, -0.1018F, -0.5655F, 0.0395F));

		PartDefinition head_sub_2 = oor3.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(196, 0).mirror().addBox(-0.1883F, 1.1763F, -0.5502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(192, 0).mirror().addBox(-0.3333F, 0.3858F, -1.0381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(178, 6).mirror().addBox(-0.58F, -0.4538F, -1.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(172, 2).mirror().addBox(-0.58F, -3.4535F, -1.5662F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(166, 0).mirror().addBox(-1.13F, -2.7035F, -0.5662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, -1.6F, -0.9F));

		PartDefinition oor2 = left_ear.addOrReplaceChild("oor2", CubeListBuilder.create().texOffs(196, 0).addBox(-0.8117F, 1.1763F, -0.5502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(192, 0).addBox(-0.6667F, 0.3858F, -1.0381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(178, 6).addBox(-0.42F, -0.4538F, -1.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(172, 2).addBox(-0.42F, -3.4535F, -1.5662F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(166, 0).addBox(0.13F, -2.7035F, -0.5662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0068F, 2.3354F, 0.1975F, -0.1018F, 0.5655F, -0.0395F));

		PartDefinition labrador_head2 = real_head.addOrReplaceChild("labrador_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.1F, 9.75F));

		PartDefinition Labrador_head_rot2 = labrador_head2.addOrReplaceChild("Labrador_head_rot2", CubeListBuilder.create().texOffs(132, 0).addBox(-3.0F, -4.3333F, -4.4167F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.1F))
		.texOffs(132, 0).addBox(-3.0F, -1.6333F, -4.4167F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.09F))
		.texOffs(160, 25).addBox(0.0F, 0.4667F, -4.1667F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.6667F, -7.7833F));

		PartDefinition neus2 = Labrador_head_rot2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(354, 1).addBox(-1.0F, -0.7202F, -0.95F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.6831F, -7.0058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = neus2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(109, 21).addBox(-0.55F, -0.3151F, -0.5654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(118, 22).addBox(-0.5F, -0.5249F, -0.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, 0.8249F, 0.0995F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = Labrador_head_rot2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(112, 15).addBox(1.45F, -9.656F, -8.4217F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(-3.0F, 10.0667F, 1.4833F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(109, 26).addBox(-0.4652F, -0.6018F, -2.014F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.045F)), PartPose.offsetAndRotation(1.95F, -10.6558F, -6.6147F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(109, 26).addBox(-0.6348F, -0.6018F, -2.014F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.045F)), PartPose.offsetAndRotation(4.05F, -10.6558F, -6.6147F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(121, 26).addBox(-2.05F, -12.3083F, -11.6392F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(93, 17).addBox(-1.9F, -11.7997F, -9.4847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.09F))
		.texOffs(93, 17).addBox(-0.2F, -11.7997F, -9.4847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(3.5F, 2.041F, 2.4827F, -0.0611F, 0.0F, 0.0F));

		PartDefinition bone7 = bone3.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(129, 25).addBox(-1.0F, -0.9134F, -1.5751F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(3.0F, -10.8666F, -6.5459F, 0.3316F, 0.0F, 0.0F));

		PartDefinition bone9 = Labrador_head_rot2.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(169, 2).addBox(3.5F, -11.263F, -9.5176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-4.0F, 10.9667F, 0.4333F, -0.3665F, 0.0F, 0.0F));

		PartDefinition oog2 = Labrador_head_rot2.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(121, 24).addBox(3.513F, -8.55F, -6.4154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 25).addBox(2.9456F, -8.6F, -6.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-5.35F, 5.9167F, 1.9833F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone10 = Labrador_head_rot2.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(121, 24).addBox(0.4F, -8.55F, -6.4402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 25).addBox(1.0044F, -8.6F, -6.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.45F, 5.9167F, 1.7833F, 0.0F, -0.0436F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition dalmatian() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Dalmatier7 = real_tail.addOrReplaceChild("Dalmatier7", CubeListBuilder.create().texOffs(525, 7).addBox(-1.5F, 0.0F, -2.25F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -0.3F, 1.6F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition Dalmatier2 = right_hind_leg.addOrReplaceChild("Dalmatier2", CubeListBuilder.create().texOffs(517, 6).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(517, 6).addBox(-2.0F, 0.25F, -2.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition Dalmatier3 = left_hind_leg.addOrReplaceChild("Dalmatier3", CubeListBuilder.create().texOffs(517, 6).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition bone8 = Dalmatier3.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(517, 6).addBox(0.5F, -7.75F, 6.75F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offset(-2.5F, 8.0F, -9.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition Dalmatier6 = right_front_leg.addOrReplaceChild("Dalmatier6", CubeListBuilder.create().texOffs(507, 5).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition Dalmatier5 = left_front_leg.addOrReplaceChild("Dalmatier5", CubeListBuilder.create().texOffs(507, 5).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5F, 2.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -0.5F));

		PartDefinition Dalmatierboxer2 = body_sub_2.addOrReplaceChild("Dalmatierboxer2", CubeListBuilder.create().texOffs(515, 16).addBox(-3.5F, -2.25F, -3.0F, 7.0F, 9.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.8F, -2.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.1F, 2.3F));

		PartDefinition Dalmatier9 = mane_sub_2.addOrReplaceChild("Dalmatier9", CubeListBuilder.create().texOffs(483, 11).addBox(-4.0F, -5.5F, -6.25F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.2F, -6.5F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.7F, -1.7F, -1.0F));

		PartDefinition ear_right2 = right_ear.addOrReplaceChild("ear_right2", CubeListBuilder.create().texOffs(478, 25).addBox(0.6141F, -12.1009F, -9.9394F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.1F))
		.texOffs(466, 0).addBox(0.7992F, -8.1992F, -9.2945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.55F, 11.25F, 7.25F, -0.0873F, -0.2182F, 0.1309F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.7F, -1.7F, -1.0F));

		PartDefinition ear_left2 = left_ear.addOrReplaceChild("ear_left2", CubeListBuilder.create().texOffs(478, 25).addBox(3.4479F, -11.4766F, -9.7708F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.1F))
		.texOffs(494, 28).addBox(3.2342F, -7.5836F, -9.1917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.05F, 11.0F, 8.5F, -0.0873F, 0.3927F, -0.1309F));

		PartDefinition Dalmatier4 = real_head.addOrReplaceChild("Dalmatier4", CubeListBuilder.create().texOffs(466, 0).addBox(-4.0F, -5.5F, -2.25F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 2.3F, -0.5F));

		PartDefinition mond2 = Dalmatier4.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(490, 0).addBox(-0.5F, -11.8515F, -7.18F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(512, 0).addBox(-0.5F, -11.8515F, -7.43F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-2.0F, 8.45F, 2.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = mond2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(492, 1).addBox(0.55F, -10.2047F, -6.1214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -3.2622F, 1.7302F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone3 = mond2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(520, 0).addBox(1.0F, -10.4544F, -7.6512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.45F, -1.1364F, -0.2333F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = mond2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(486, 27).addBox(0.0F, -8.9583F, -6.5677F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.4F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = Dalmatier4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(490, 2).addBox(1.7998F, -10.5F, -7.78F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(490, 0).addBox(1.1998F, -10.5F, -7.78F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(-4.35F, 6.3F, 5.6F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone6 = Dalmatier4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(490, 2).addBox(0.2957F, -10.5F, -7.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(490, 0).addBox(0.8957F, -10.5F, -7.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(-0.65F, 6.3F, 5.4F, 0.0F, -0.0436F, 0.0F));

		PartDefinition bone7 = Dalmatier4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(500, 0).addBox(-0.45F, -9.2862F, -0.9526F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 6.25F, 1.309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition great_dane() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 8.75F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition erhehe = real_tail.addOrReplaceChild("erhehe", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5F, -10.9F));

		PartDefinition erhej = erhehe.addOrReplaceChild("erhej", CubeListBuilder.create(), PartPose.offset(-1.0F, -2.0F, 8.0F));

		PartDefinition greatdane8 = erhej.addOrReplaceChild("greatdane8", CubeListBuilder.create().texOffs(1291, 18).addBox(-2.0F, -1.5436F, 2.0511F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(2.5F, -1.0F, 0.0F));

		PartDefinition bone118 = greatdane8.addOrReplaceChild("bone118", CubeListBuilder.create().texOffs(1265, 20).addBox(-0.999F, -4.1654F, 2.1673F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.202F)), PartPose.offsetAndRotation(-1.0F, 7.1F, -1.4F, -0.5672F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-0.5F, 16.0F, 7.0F));

		PartDefinition wegewg2 = right_hind_leg.addOrReplaceChild("wegewg2", CubeListBuilder.create(), PartPose.offset(3.0F, 0.0F, 0.0F));

		PartDefinition greatdane2 = wegewg2.addOrReplaceChild("greatdane2", CubeListBuilder.create().texOffs(1285, 0).mirror().addBox(0.0F, -0.25F, -0.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-5.75F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition wegewg = left_hind_leg.addOrReplaceChild("wegewg", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.0F, 0.0F));

		PartDefinition greatdane4 = wegewg.addOrReplaceChild("greatdane4", CubeListBuilder.create().texOffs(1285, 0).addBox(-2.0F, -0.25F, -0.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(5.75F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition htjr3 = right_front_leg.addOrReplaceChild("htjr3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition greatdanebasset2 = htjr3.addOrReplaceChild("greatdanebasset2", CubeListBuilder.create().texOffs(668, 0).mirror().addBox(0.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-0.75F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 16.0F, -4.0F));

		PartDefinition htjr2 = left_front_leg.addOrReplaceChild("htjr2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition greatdanebasset3 = htjr2.addOrReplaceChild("greatdanebasset3", CubeListBuilder.create().texOffs(668, 0).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(0.75F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.0F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_1 = body.addOrReplaceChild("body_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition greatdane3 = body_sub_1.addOrReplaceChild("greatdane3", CubeListBuilder.create().texOffs(1269, 18).addBox(-3.5F, -4.6F, -0.75F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.4F))
		.texOffs(1234, 14).addBox(1.3F, 2.2F, 4.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.4F))
		.texOffs(1234, 14).addBox(-3.3F, 2.2F, 4.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.25F, 1.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.5F, -3.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -4.0F));

		PartDefinition greatdane7 = mane_sub_2.addOrReplaceChild("greatdane7", CubeListBuilder.create().texOffs(1260, 1).addBox(-8.0F, -7.75F, 2.9F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.2F)), PartPose.offset(4.0F, 1.25F, -3.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 7.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.75F, -4.75F, -1.5F));

		PartDefinition oor3 = left_ear.addOrReplaceChild("oor3", CubeListBuilder.create().texOffs(1252, 23).addBox(2.0653F, -19.4291F, -12.8019F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1257, 21).addBox(2.1602F, -19.4155F, -12.3189F, 1.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F))
		.texOffs(1228, 3).addBox(2.0979F, -13.629F, -11.942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.45F, 18.75F, 10.65F, -0.0436F, 0.2182F, -0.1745F));

		PartDefinition oor5 = left_ear.addOrReplaceChild("oor5", CubeListBuilder.create().texOffs(1255, 10).addBox(-2.4902F, -15.05F, -10.0117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.3F))
		.texOffs(1250, 14).addBox(-2.5887F, -12.55F, -10.429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(3.4F, 8.75F, 9.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone4 = oor5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4924F, 3.0F, -0.3132F, 0.0436F, 0.0F, 1.1781F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.75F, -4.75F, -1.5F));

		PartDefinition oor2 = right_ear.addOrReplaceChild("oor2", CubeListBuilder.create().texOffs(1252, 23).mirror().addBox(-3.0653F, -19.4291F, -12.8019F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(1257, 21).mirror().addBox(-3.1602F, -19.4155F, -12.3189F, 1.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(1228, 3).mirror().addBox(-3.0979F, -13.629F, -11.942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.45F, 18.75F, 10.65F, -0.0436F, -0.2182F, 0.1745F));

		PartDefinition oor4 = right_ear.addOrReplaceChild("oor4", CubeListBuilder.create().texOffs(1255, 10).mirror().addBox(1.4902F, -15.05F, -10.0117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false)
		.texOffs(1250, 14).mirror().addBox(1.5887F, -12.55F, -10.429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 8.75F, 9.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone5 = oor4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4924F, 3.0F, -0.3132F, 0.0436F, 0.0F, -1.1781F));

		PartDefinition wgwgw2 = real_head.addOrReplaceChild("wgwgw2", CubeListBuilder.create(), PartPose.offset(-1.0F, 6.0F, 0.0F));

		PartDefinition greatdane6 = wgwgw2.addOrReplaceChild("greatdane6", CubeListBuilder.create().texOffs(1229, 0).addBox(-3.0F, -20.25F, -11.75F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(1211, 27).addBox(-0.5F, -17.55F, -16.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(1211, 27).addBox(-1.85F, -18.95F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.09F))
		.texOffs(1249, 0).addBox(-2.3F, -18.95F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.08F))
		.texOffs(1211, 27).addBox(0.8F, -18.95F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.09F))
		.texOffs(1249, 0).addBox(1.25F, -18.95F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.08F)), PartPose.offset(1.0F, 8.5F, 7.5F));

		PartDefinition bone2 = greatdane6.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1285, 26).addBox(-2.0F, -14.4097F, -9.1813F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, -2.75F, 5.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition mond2 = greatdane6.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1229, 22).addBox(-1.75F, -12.033F, -9.62F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1222, 14).addBox(0.0F, -12.033F, -9.62F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.01F))
		.texOffs(1243, 22).addBox(0.75F, -12.033F, -9.62F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1248, 0).addBox(-0.5F, -8.724F, -9.5079F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F))
		.texOffs(1203, 27).addBox(-1.75F, -7.1672F, -9.4895F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F))
		.texOffs(1229, 14).addBox(-1.75F, -7.1581F, -6.5894F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.06F))
		.texOffs(1226, 24).addBox(-1.75F, -6.3854F, -7.924F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(1185, 14).addBox(0.75F, -7.1672F, -9.4895F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F))
		.texOffs(1229, 14).addBox(0.75F, -7.1581F, -6.5894F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.06F))
		.texOffs(1226, 24).addBox(0.75F, -6.3854F, -7.924F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -6.0F, -6.25F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neus2 = mond2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(1238, 23).addBox(0.0F, -14.3019F, -4.9991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.5976F, 4.6741F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone3 = greatdane6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, -7.5F, 0.35F, 0.0436F, 0.0F, -1.1781F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
}
