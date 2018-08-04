package com.craftediidev.c2.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelMikey extends ModelBase {
    public ModelRenderer SlimeBody;
    public ModelRenderer SlimeMouth;
    public ModelRenderer SlimeRightEye;
    public ModelRenderer SlimeLeftEye;
    public ModelRenderer BlazeHead;

    public ModelMikey() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.BlazeHead = new ModelRenderer(this, 0, 0);
        this.BlazeHead.setRotationPoint(0.0F, 13.4F, 0.0F);
        this.BlazeHead.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F);
        this.SlimeBody = new ModelRenderer(this, 0, 16);
        this.SlimeBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SlimeBody.addBox(-3.0F, 17.0F, -3.0F, 6, 6, 6, 0.0F);
        this.SlimeRightEye = new ModelRenderer(this, 32, 4);
        this.SlimeRightEye.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SlimeRightEye.addBox(1.25F, 18.0F, -3.5F, 2, 2, 2, 0.0F);
        this.SlimeMouth = new ModelRenderer(this, 32, 8);
        this.SlimeMouth.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SlimeMouth.addBox(0.0F, 21.0F, -3.5F, 1, 1, 1, 0.0F);
        this.SlimeLeftEye = new ModelRenderer(this, 32, 0);
        this.SlimeLeftEye.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SlimeLeftEye.addBox(-3.25F, 18.0F, -3.5F, 2, 2, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        this.BlazeHead.render(f5);
        this.SlimeBody.render(f5);
        this.SlimeRightEye.render(f5);
        this.SlimeMouth.render(f5);
        this.SlimeLeftEye.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.BlazeHead.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	
    	this.SlimeBody.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.SlimeBody.rotateAngleX = headPitch * 0.017453292F;
    }
    
    
    
    
    
    
    
}
