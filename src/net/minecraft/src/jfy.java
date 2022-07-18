package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

class jfy
extends Canvas {
    private BufferedImage field_92a31c00_Dne;

    public jfy() {
        try {
            this.field_92a31c00_Dne = ImageIO.read(cbQ.class.getResource("/gui/crash_logo.png"));
        }
        catch (IOException iOException) {
            // empty catch block
        }
        int n = 100;
        this.setPreferredSize(new Dimension(n, n));
        this.setMinimumSize(new Dimension(n, n));
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawImage(this.field_92a31c00_Dne, this.getWidth() / 2 - this.field_92a31c00_Dne.getWidth() / 2, 32, null);
    }
}

