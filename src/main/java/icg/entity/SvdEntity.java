
package icg.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import icg.init.IvoGunModModItems;
import icg.init.IvoGunModModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class SvdEntity extends AbstractArrow implements ItemSupplier {
	public SvdEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(IvoGunModModEntities.SVD.get(), world);
	}

	public SvdEntity(EntityType<? extends SvdEntity> type, Level world) {
		super(type, world);
	}

	public SvdEntity(EntityType<? extends SvdEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public SvdEntity(EntityType<? extends SvdEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.AIR);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(IvoGunModModItems.B_762.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static SvdEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		SvdEntity entityarrow = new SvdEntity(IvoGunModModEntities.SVD.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ivo_gun_mod:svd")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static SvdEntity shoot(LivingEntity entity, LivingEntity target) {
		SvdEntity entityarrow = new SvdEntity(IvoGunModModEntities.SVD.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 5.5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(4);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ivo_gun_mod:svd")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
