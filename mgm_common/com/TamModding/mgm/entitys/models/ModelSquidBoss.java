package com.TamModding.mgm.entitys.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class ModelSquidBoss extends ModelBase {
    // Renderers for all the different parts
    ModelRenderer Body;
    ModelRenderer Pelvis;
    ModelRenderer Bicep1;
    ModelRenderer Head;
    ModelRenderer Bicep2;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Hand1;
    ModelRenderer Hand2;
    ModelRenderer Tentacle1;
    ModelRenderer Tentacle2;
    ModelRenderer Tentacle3;
    ModelRenderer Tentacle4;
    ModelRenderer Tentacle5;
    ModelRenderer Tentacle6;
    ModelRenderer Tentacle7;
    ModelRenderer Tentacle8;

    public ModelSquidBoss() {
        textureWidth = 256;
        textureHeight = 256;

        Body = new ModelRenderer(this, 70, 100);
        Body.addBox(-11F, 0F, -11F, 22, 22, 22);
        Body.setRotationPoint(0F, -41F, 0F);
        Body.setTextureSize(256, 256);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        Pelvis = new ModelRenderer(this, 82, 150);
        Pelvis.addBox(-8F, 0F, -8F, 16, 16, 16);
        Pelvis.setRotationPoint(0F, -19F, 0F);
        Pelvis.setTextureSize(256, 256);
        Pelvis.mirror = true;
        setRotation(Pelvis, 0F, 0F, 0F);
        Bicep1 = new ModelRenderer(this, 24, 100);
        Bicep1.addBox(-6F, 0F, -5F, 12, 10, 10);
        Bicep1.setRotationPoint(-17F, -38F, 0F);
        Bicep1.setTextureSize(256, 256);
        Bicep1.mirror = true;
        setRotation(Bicep1, 0F, 0F, -0.3490659F);
        Head = new ModelRenderer(this, 87, 68);
        Head.addBox(-7F, -7F, -7F, 14, 14, 14);
        Head.setRotationPoint(0F, -48F, 0F);
        Head.setTextureSize(256, 256);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Bicep2 = new ModelRenderer(this, 160, 100);
        Bicep2.addBox(-5F, 0F, -5F, 12, 10, 10);
        Bicep2.setRotationPoint(16F, -38F, 0F);
        Bicep2.setTextureSize(256, 256);
        Bicep2.mirror = true;
        setRotation(Bicep2, 0F, 0F, 0.3490659F);
        Arm1 = new ModelRenderer(this, 28, 122);
        Arm1.addBox(-2F, 0F, -2F, 10, 18, 10);
        Arm1.setRotationPoint(-22F, -33F, 0F);
        Arm1.setTextureSize(256, 256);
        Arm1.mirror = true;
        setRotation(Arm1, -0.9599311F, 0F, 0F);
        Arm2 = new ModelRenderer(this, 160, 122);
        Arm2.addBox(-8F, 0F, -2F, 10, 18, 10);
        Arm2.setRotationPoint(22F, -33F, 0F);
        Arm2.setTextureSize(256, 256);
        Arm2.mirror = true;
        setRotation(Arm2, -0.9599311F, 0F, 0F);
        Hand1 = new ModelRenderer(this, 29, 152);
        Hand1.addBox(-4F, 0F, -3F, 8, 8, 6);
        Hand1.setRotationPoint(-19F, -26F, -16F);
        Hand1.setTextureSize(256, 256);
        Hand1.mirror = true;
        setRotation(Hand1, 0F, 0F, 0F);
        Hand2 = new ModelRenderer(this, 171, 152);
        Hand2.addBox(-4F, 0F, -3F, 8, 8, 6);
        Hand2.setRotationPoint(19F, -26F, -16F);
        Hand2.setTextureSize(256, 256);
        Hand2.mirror = true;
        setRotation(Hand2, 0F, 0F, 0F);
        Tentacle1 = new ModelRenderer(this, 31, 43);
        Tentacle1.addBox(-4F, 0F, -4F, 8, 32, 8);
        Tentacle1.setRotationPoint(-9F, -8F, -9F);
        Tentacle1.setTextureSize(256, 256);
        Tentacle1.mirror = true;
        setRotation(Tentacle1, -0.3490659F, 0.7853982F, 0F);
        Tentacle2 = new ModelRenderer(this, 31, 43);
        Tentacle2.addBox(-4F, 0F, -4F, 8, 32, 8);
        Tentacle2.setRotationPoint(9F, -8F, -9F);
        Tentacle2.setTextureSize(256, 256);
        Tentacle2.mirror = true;
        setRotation(Tentacle2, -0.3490659F, -0.7853982F, 0F);
        Tentacle3 = new ModelRenderer(this, 31, 43);
        Tentacle3.addBox(-4F, 0F, -4F, 8, 32, 8);
        Tentacle3.setRotationPoint(0F, -8F, -9F);
        Tentacle3.setTextureSize(256, 256);
        Tentacle3.mirror = true;
        setRotation(Tentacle3, -0.3490659F, 0F, 0F);
        Tentacle4 = new ModelRenderer(this, 31, 43);
        Tentacle4.addBox(-4F, 0F, -4F, 8, 32, 8);
        Tentacle4.setRotationPoint(-9F, -8F, 0F);
        Tentacle4.setTextureSize(256, 256);
        Tentacle4.mirror = true;
        setRotation(Tentacle4, -0.3490659F, 1.570796F, 0F);
        Tentacle5 = new ModelRenderer(this, 31, 43);
        Tentacle5.addBox(-4F, 0F, -4F, 8, 32, 8);
        Tentacle5.setRotationPoint(9F, -8F, 0F);
        Tentacle5.setTextureSize(256, 256);
        Tentacle5.mirror = true;
        setRotation(Tentacle5, -0.3490659F, -1.570796F, 0F);
        Tentacle6 = new ModelRenderer(this, 31, 43);
        Tentacle6.addBox(-4F, 0F, -4F, 8, 32, 8);
        Tentacle6.setRotationPoint(0F, -8F, 9F);
        Tentacle6.setTextureSize(256, 256);
        Tentacle6.mirror = true;
        setRotation(Tentacle6, 0.3490659F, 0F, 0F);
        Tentacle7 = new ModelRenderer(this, 31, 43);
        Tentacle7.addBox(-4F, 0F, -4F, 8, 32, 8);
        Tentacle7.setRotationPoint(-9F, -8F, 9F);
        Tentacle7.setTextureSize(256, 256);
        Tentacle7.mirror = true;
        setRotation(Tentacle7, 0.3490659F, -0.7853982F, 0F);
        Tentacle8 = new ModelRenderer(this, 31, 43);
        Tentacle8.addBox(-4F, 0F, -5F, 8, 32, 8);
        Tentacle8.setRotationPoint(9F, -8F, 9F);
        Tentacle8.setTextureSize(256, 256);
        Tentacle8.mirror = true;
        setRotation(Tentacle8, 0.3490659F, 0.7853982F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Body.render(f5);
        Pelvis.render(f5);
        Bicep1.render(f5);
        Head.render(f5);
        Bicep2.render(f5);
        Arm1.render(f5);
        Arm2.render(f5);
        Hand1.render(f5);
        Hand2.render(f5);
        Tentacle1.render(f5);
        Tentacle2.render(f5);
        Tentacle3.render(f5);
        Tentacle4.render(f5);
        Tentacle5.render(f5);
        Tentacle6.render(f5);
        Tentacle7.render(f5);
        Tentacle8.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
