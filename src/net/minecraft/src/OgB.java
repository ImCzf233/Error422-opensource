package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class OgB
extends YAD {
    private int field_2092ae_Dne;

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_ca62329e_Dne((WDT)fUH, d, d2, d3, f, f2);
    }

    public void method_ca62329e_Dne(WDT wDT, double d, double d2, double d3, float f, float f2) {
        int n = ((SAO)this.field_367c742_Dne).method_7a46288d_Dne();
        if (n != this.field_2092ae_Dne) {
            this.field_2092ae_Dne = n;
            this.field_367c742_Dne = new SAO();
            Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_8f501fe4_Dne("Loaded new lava slime model");
        }
        super.method_2cdda2d0_Dne(wDT, d, d2, d3, f, f2);
    }

    protected void method_dafc4960_Dne(WDT wDT, float f) {
        int n = wDT.method_73aaafb6_ATE();
        float f2 = (wDT.field_2e5f18_bzF + (wDT.field_21260a_FWm - wDT.field_2e5f18_bzF) * f) / ((float)n * 0.5f + 1.0f);
        float f3 = 1.0f / (f2 + 1.0f);
        float f4 = n;
        GL11.glScalef(f3 * f4, 1.0f / f3 * f4, f3 * f4);
    }

    public OgB() {
        super(new SAO(), 0.25f);
        this.field_2092ae_Dne = ((SAO)this.field_367c742_Dne).method_7a46288d_Dne();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_ca62329e_Dne((WDT)sMa2, d, d2, d3, f, f2);
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_dafc4960_Dne((WDT)fUH, f);
    }
}

