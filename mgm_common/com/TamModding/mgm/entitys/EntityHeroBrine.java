package com.TamModding.mgm.entitys;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class EntityHeroBrine extends EntityMob
{
	public EntityHeroBrine(World par1World) 
	{
		super(par1World);
		this.texture = "/mods/MGM/textures/mobs/HeroBrine.png";
		this.moveSpeed = 0.27F;
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(2, new EntityAIBreakDoor(this));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
	    this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
	}
	
		public int getTotalArmorValue()
		{
			return 9;
		}
	
	
	protected boolean isAIEnabled()
	{
		return true; 
	}
	@Override
	public int getMaxHealth()
	{	
		return 15000;
	}
	
	public int getAttackStrength(Entity par1Entity)
	{
		return 500;
	}
	
	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEAD;
	}
	
	protected String getLivingSound()
	{
		return "mob.ghast.scream";
	}
	protected String getHurtSound()
    {
		return null;
	}
    protected String getDeathSound()
    {
    	return "mob.ghast.death";
    }
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
    	this.worldObj.playSoundAtEntity(this, null, 0.15F, 2.0F);
    }
    protected int getDropItemId()
    {
    	return Block.blockDiamond.blockID;
    }	
		protected void dropRareDrop(int par1)
    {
  }	
}
					
          