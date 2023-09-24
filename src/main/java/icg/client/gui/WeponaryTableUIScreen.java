package icg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import icg.world.inventory.WeponaryTableUIMenu;

import icg.network.WeponaryTableUIButtonMessage;

import icg.IvoGunModMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WeponaryTableUIScreen extends AbstractContainerScreen<WeponaryTableUIMenu> {
	private final static HashMap<String, Object> guistate = WeponaryTableUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_upgrade;

	public WeponaryTableUIScreen(WeponaryTableUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 170;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ivo_gun_mod:textures/screens/weponary_table_ui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.ivo_gun_mod.weponary_table_ui.label_weponary_table"), 48, 16, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ivo_gun_mod.weponary_table_ui.label_empty"), 102, 37, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_upgrade = Button.builder(Component.translatable("gui.ivo_gun_mod.weponary_table_ui.button_upgrade"), e -> {
			if (true) {
				IvoGunModMod.PACKET_HANDLER.sendToServer(new WeponaryTableUIButtonMessage(0, x, y, z));
				WeponaryTableUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 57, this.topPos + 61, 61, 20).build();
		guistate.put("button:button_upgrade", button_upgrade);
		this.addRenderableWidget(button_upgrade);
	}
}
