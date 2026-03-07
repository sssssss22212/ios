package com.decorativeblocks.client;

import com.decorativeblocks.menu.GemForgeContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class GemForgeScreen extends ContainerScreen<GemForgeContainer> {
    private static final ResourceLocation BG =
        new ResourceLocation("decorativeblocks", "textures/gui/gem_forge.png");

    public GemForgeScreen(GemForgeContainer c, PlayerInventory inv, ITextComponent title) {
        super(c, inv, title);
        this.imageWidth = 176; this.imageHeight = 196;
    }

    @Override
    public void render(MatrixStack ms, int mx, int my, float delta) {
        renderBackground(ms);
        super.render(ms, mx, my, delta);
        renderTooltip(ms, mx, my);
    }

    @Override
    protected void renderBg(MatrixStack ms, float delta, int mx, int my) {
        minecraft.getTextureManager().bind(BG);
        int x = (width - imageWidth) / 2, y = (height - imageHeight) / 2;
        blit(ms, x, y, 0, 0, imageWidth, imageHeight);
    }

    @Override
    protected void renderLabels(MatrixStack ms, int mx, int my) {
        font.draw(ms, title, 8, 6, 0x404040);
        font.draw(ms, inventory.getDisplayName(), 8, imageHeight - 96, 0x404040);
    }
}