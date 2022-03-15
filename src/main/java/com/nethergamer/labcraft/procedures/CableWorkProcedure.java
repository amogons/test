package com.nethergamer.labcraft.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CableWorkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
			int _amount = 200;
			if (_ent != null)
				_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH).ifPresent(capability -> capability.extractEnergy(_amount, false));
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
			int _amount = 200;
			if (_ent != null)
				_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
	}
}
