package dev.qube.ffff_721ef1a;

import net.fabricmc.fabric.api.gametest.v1.FabricGameTest;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.world.level.block.Blocks;

/**
 * GameTests run headless by Qube's gametest tool, which starts the server with
 * -Dfabric-api.gametest. Register test classes under the "fabric-gametest"
 * entrypoint in fabric.mod.json.
 */
public class Ffff721ef1aGameTests implements FabricGameTest {
	@GameTest(template = EMPTY_STRUCTURE)
	public void placesBlock(GameTestHelper helper) {
		BlockPos pos = new BlockPos(1, 2, 1);
		helper.setBlock(pos, Blocks.STONE);
		helper.assertBlockPresent(Blocks.STONE, pos);
		helper.succeed();
	}
}
