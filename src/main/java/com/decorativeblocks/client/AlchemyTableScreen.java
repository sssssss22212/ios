package com.decorativeblocks.client;

import com.decorativeblocks.menu.AlchemyTableContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class AlchemyTableScreen extends ContainerScreen<AlchemyTableContainer> {
    private static final ResourceLocation BG = new ResourceLocation("decorativeblocks", "textures/gui/alchemy_table.png");

    public AlchemyTableScreen(AlchemyTableContainer container, PlayerInventory inv, ITextComponent title) {
        super(container, inv, title);
        this.imageWidth = 176;
        this.imageHeight = 196;
    }

    @Override
    public void render(MatrixStack stack, int mouseX, int mouseY, float delta) {
        this.renderBackground(stack);
        super.render(stack, mouseX, mouseY, delta);
        this.renderTooltip(stack, mouseX, mouseY);
    }

    @Override
    protected void renderBg(MatrixStack stack, float delta, int mouseX, int mouseY) {
        this.minecraft.getTextureManager().bind(BG);
        int x = (this.width - this.imageWidth) / 2;
        int y = (this.height - this.imageHeight) / 2;
        this.blit(stack, x, y, 0, 0, this.imageWidth, this.imageHeight);
    }

    @Override
    protected void renderLabels(MatrixStack stack, int mouseX, int mouseY) {
        this.font.draw(stack, this.title, 8, 6, 0x404040);
        this.font.draw(stack, this.playerInventoryTitle, 8, this.imageHeight - 96, 0x404040);
    }
}
