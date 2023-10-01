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

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -5.6429F, 1.7223F));

		PartDefinition corgi_tail3 = real_tail.addOrReplaceChild("corgi_tail3", CubeListBuilder.create(), PartPose.offset(1.0F, 4.8F, -2.2F));

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

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5F, -2.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition corgi_ear_right2 = right_ear.addOrReplaceChild("corgi_ear_right2", CubeListBuilder.create().texOffs(422, 27).mirror().addBox(-1.1826F, -4.3668F, -0.7878F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1087F, -1.5863F, 1.0947F, 0.0F, 0.3491F, -0.3927F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition corgi_ear_left2 = left_ear.addOrReplaceChild("corgi_ear_left2", CubeListBuilder.create().texOffs(422, 27).addBox(-1.8174F, -4.3668F, -0.7878F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1087F, -1.5863F, 1.0947F, 0.0F, -0.3491F, 0.3927F));

		PartDefinition corgi_head_full2 = real_head.addOrReplaceChild("corgi_head_full2", CubeListBuilder.create().texOffs(371, 0).addBox(-3.5F, -2.0F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.0F, 0.25F, 1.5F));

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

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -3.5F, 3.0F));

		PartDefinition shihtzu_staart2 = real_tail.addOrReplaceChild("shihtzu_staart2", CubeListBuilder.create().texOffs(1706, 20).addBox(-1.1044F, -0.6833F, -0.9584F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.09F))
		.texOffs(1755, 17).addBox(2.0756F, -0.6833F, -2.9584F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(0.85F, 3.1F, -2.3F, 0.1085F, 0.1284F, 0.8822F));

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

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 14.5F, -6.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 1.5708F, 0.0F, 0.0F));

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

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 14.3F, 4.5F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(992, 23).addBox(-2.0F, -5.3F, -0.55F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offset(1.0F, 5.0468F, -0.6742F));

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

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-1.0F, 12.5F, 6.5F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, -0.25F, 2.0F));

		PartDefinition bordercollie_tail2 = real_tail.addOrReplaceChild("bordercollie_tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 11.7F, 0.5F, 1.5708F, 0.0F, 0.0F));

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

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -0.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -1.5F, 5.0F, -0.0873F, -0.2182F, 0.0F));

		PartDefinition collie_ear_left_rot_r1 = right_ear.addOrReplaceChild("collie_ear_left_rot_r1", CubeListBuilder.create().texOffs(45, 2).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8156F, -0.2839F, 1.2672F, -1.5708F, -0.0436F, -3.1416F));

		PartDefinition collie_ear_hinge_right_r1 = right_ear.addOrReplaceChild("collie_ear_hinge_right_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8156F, -0.2839F, 3.7672F, -1.5708F, -0.0436F, -3.1416F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -1.5F, 5.0F, -0.0873F, 0.2182F, 0.0F));

		PartDefinition collie_ear_right_rot_r1 = left_ear.addOrReplaceChild("collie_ear_right_rot_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8156F, -0.2839F, 1.2672F, -1.5708F, 0.0436F, 3.1416F));

		PartDefinition collie_ear_hinge_left_r1 = left_ear.addOrReplaceChild("collie_ear_hinge_left_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8156F, -0.2839F, 3.7672F, -1.5708F, 0.0436F, 3.1416F));

		PartDefinition bordercollie_head2 = real_head.addOrReplaceChild("bordercollie_head2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.75F, 11.0F));

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

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition basset_hound() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5F, 8.0F, 2.4871F, 0.0F, 0.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.5F, 0.0F));

		PartDefinition basset_tail2 = real_tail.addOrReplaceChild("basset_tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 12.75F, -5.25F, -1.5708F, 0.0F, 0.0F));

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

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, 1.0F, 2.0F));

		PartDefinition mane_sub_45_r1 = left_ear.addOrReplaceChild("mane_sub_45_r1", CubeListBuilder.create().texOffs(529, 5).mirror().addBox(-3.4F, -4.0F, -2.875F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1705, 5).mirror().addBox(-3.4F, 0.0F, -3.125F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8948F, -0.7183F, -2.7498F, -1.5304F, -0.0705F, -0.3959F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, 1.0F, 2.0F));

		PartDefinition mane_sub_46_r1 = right_ear.addOrReplaceChild("mane_sub_46_r1", CubeListBuilder.create().texOffs(529, 5).addBox(2.4F, -4.0F, -2.875F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1705, 5).addBox(2.4F, 0.0F, -3.125F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8948F, -0.7183F, -2.7498F, -1.5304F, 0.0705F, 0.3959F));

		PartDefinition basset_head2 = real_head.addOrReplaceChild("basset_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.25F, 1.75F));

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

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, -1.25F, -0.75F));

		PartDefinition irishterrier_tail3 = real_tail.addOrReplaceChild("irishterrier_tail3", CubeListBuilder.create(), PartPose.offset(1.5F, 1.7F, -5.0F));

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

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 2.75F, 1.75F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.75F, -6.0F, -3.5F));

		PartDefinition irishterrier_ear_right = right_ear.addOrReplaceChild("irishterrier_ear_right", CubeListBuilder.create().texOffs(715, 4).mirror().addBox(-0.6913F, -2.149F, -1.4808F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9368F, -0.0527F, 1.2733F, 0.3106F, 0.1871F, -0.1555F));

		PartDefinition bone191 = irishterrier_ear_right.addOrReplaceChild("bone191", CubeListBuilder.create().texOffs(771, 4).mirror().addBox(-0.343F, 0.6753F, -0.662F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3483F, -2.0768F, -0.5358F, -0.8727F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.5F, -6.0F, -3.5F));

		PartDefinition irishterrier_ear_left = left_ear.addOrReplaceChild("irishterrier_ear_left", CubeListBuilder.create().texOffs(715, 4).addBox(-2.3087F, -2.149F, -1.4808F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1868F, -0.0527F, 1.2733F, 0.3106F, -0.1871F, 0.1555F));

		PartDefinition bone184 = irishterrier_ear_left.addOrReplaceChild("bone184", CubeListBuilder.create().texOffs(771, 4).addBox(-1.457F, 0.1268F, -0.0712F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8517F, -2.1768F, -1.3358F, -0.8727F, 0.0F, 0.0F));

		PartDefinition irishterrier_head = real_head.addOrReplaceChild("irishterrier_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -0.25F, 1.5708F, 0.0F, 0.0F));

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

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 3.4F, -1.4F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -5.0F, 2.3F));

		PartDefinition bull_terrier_ear_right2 = right_ear.addOrReplaceChild("bull_terrier_ear_right2", CubeListBuilder.create().texOffs(709, 1).addBox(-2.6327F, -11.0449F, -9.5769F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(695, 0).addBox(-2.6181F, -11.058F, -9.8989F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(709, 1).addBox(-2.1893F, -11.6592F, -9.5381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.5F, 7.45F, 8.65F, 0.0F, 0.0873F, -0.1309F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -5.3F, 2.1F));

		PartDefinition bull_terrier_ear_left2 = left_ear.addOrReplaceChild("bull_terrier_ear_left2", CubeListBuilder.create().texOffs(709, 1).addBox(-4.3559F, -10.9144F, -9.5121F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(695, 0).addBox(-4.3705F, -10.9274F, -9.8289F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(709, 1).addBox(-3.7993F, -11.5287F, -9.4733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.5F, 8.25F, 9.2F, 0.0F, -0.0873F, 0.1309F));

		PartDefinition bull_terrier_head_rot = real_head.addOrReplaceChild("bull_terrier_head_rot", CubeListBuilder.create().texOffs(693, 0).addBox(-3.5F, -4.25F, -2.1F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.2F))
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

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5F, -6.3F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -0.7F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -6.1F, 0.5F));

		PartDefinition germanshepherd_ear_right2 = right_ear.addOrReplaceChild("germanshepherd_ear_right2", CubeListBuilder.create().texOffs(330, 0).addBox(-1.1271F, -4.4713F, -0.529F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(316, 2).addBox(-0.1271F, -5.4413F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.865F, -0.75F, -0.0168F, -0.1312F, -0.169F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -6.1F, 0.5F));

		PartDefinition germanshepherd_ear_left2 = left_ear.addOrReplaceChild("germanshepherd_ear_left2", CubeListBuilder.create().texOffs(330, 0).mirror().addBox(-1.8729F, -4.4713F, -0.529F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
		.texOffs(316, 2).mirror().addBox(-0.8729F, -5.4413F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.865F, -0.75F, -0.0168F, 0.1312F, 0.169F));

		PartDefinition germansheperd_head_rot2 = real_head.addOrReplaceChild("germansheperd_head_rot2", CubeListBuilder.create(), PartPose.offset(4.0F, 3.25F, 2.75F));

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

		PartDefinition upper_body = root.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition german_shepherd_mane2 = upper_body.addOrReplaceChild("german_shepherd_mane2", CubeListBuilder.create().texOffs(308, 14).addBox(-4.0F, -13.0F, -7.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 3.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 3.6F));

		PartDefinition germansheperd_body2 = body.addOrReplaceChild("germansheperd_body2", CubeListBuilder.create().texOffs(336, 5).addBox(-3.5F, -4.0F, -0.5F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.2F, -3.55F));

		PartDefinition left_front_leg = root.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 1.0F, -4.0F));

		PartDefinition GermanAussheperdHusky3 = left_front_leg.addOrReplaceChild("GermanAussheperdHusky3", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = root.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 1.0F, -4.0F));

		PartDefinition GermanAussheperdHusky4 = right_front_leg.addOrReplaceChild("GermanAussheperdHusky4", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = root.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 1.0F, 7.0F));

		PartDefinition GermansheperdHusky3 = left_hind_leg.addOrReplaceChild("GermansheperdHusky3", CubeListBuilder.create().texOffs(279, 2).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = root.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 1.0F, 7.0F));

		PartDefinition GermansheperdHusky4 = right_hind_leg.addOrReplaceChild("GermansheperdHusky4", CubeListBuilder.create().texOffs(279, 2).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition tail = root.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.3F, -3.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.3F, 0.0F, 0.0F));

		PartDefinition germanausshepherd_tail2 = real_tail.addOrReplaceChild("germanausshepherd_tail2", CubeListBuilder.create().texOffs(359, 2).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(365, 19).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, 0.5F, -0.4712F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
}
