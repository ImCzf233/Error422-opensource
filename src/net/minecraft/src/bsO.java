package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class bsO
extends pee_0 {
    public boolean field_267d06_Qnq = false;
    private ONk field_36aed80_Dne = null;
    public float field_2092ab_Dne = 1.0f;

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
        this.field_267d06_Qnq = false;
    }

    @Override
    protected void method_a045bf4b_FWm(Minecraft minecraft, int n, int n2) {
        if (this.field_21261e_FWm) {
            if (this.field_267d06_Qnq) {
                this.field_2092ab_Dne = (float)(n - (this.field_2e5f1b_bzF + 4)) / (float)(this.field_2092ae_Dne - 8);
                if (this.field_2092ab_Dne < 0.0f) {
                    this.field_2092ab_Dne = 0.0f;
                }
                if (this.field_2092ab_Dne > 1.0f) {
                    this.field_2092ab_Dne = 1.0f;
                }
                minecraft.field_3758af7_Dne.method_461f0225_Dne(this.field_36aed80_Dne, this.field_2092ab_Dne);
                this.field_569fcf45_Dne = minecraft.field_3758af7_Dne.method_95e92505_Dne(this.field_36aed80_Dne);
            }
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.method_17d7ea99_FWm(this.field_2e5f1b_bzF + (int)(this.field_2092ab_Dne * (float)(this.field_2092ae_Dne - 8)), this.field_267cf5_Qnq, 0, 66, 4, 20);
            this.method_17d7ea99_FWm(this.field_2e5f1b_bzF + (int)(this.field_2092ab_Dne * (float)(this.field_2092ae_Dne - 8)) + 4, this.field_267cf5_Qnq, 196, 66, 4, 20);
        }
    }

    public bsO(int n, int n2, int n3, ONk oNk, String string, float f) {
        super(n, n2, n3, 150, 20, string);
        this.field_36aed80_Dne = oNk;
        this.field_2092ab_Dne = f;
    }

    @Override
    public boolean method_f68b2f70_Dne(Minecraft minecraft, int n, int n2) {
        if (super.method_f68b2f70_Dne(minecraft, n, n2)) {
            this.field_2092ab_Dne = (float)(n - (this.field_2e5f1b_bzF + 4)) / (float)(this.field_2092ae_Dne - 8);
            if (this.field_2092ab_Dne < 0.0f) {
                this.field_2092ab_Dne = 0.0f;
            }
            if (this.field_2092ab_Dne > 1.0f) {
                this.field_2092ab_Dne = 1.0f;
            }
            minecraft.field_3758af7_Dne.method_461f0225_Dne(this.field_36aed80_Dne, this.field_2092ab_Dne);
            this.field_569fcf45_Dne = minecraft.field_3758af7_Dne.method_95e92505_Dne(this.field_36aed80_Dne);
            this.field_267d06_Qnq = true;
            return true;
        }
        return false;
    }

    @Override
    protected int method_ce7f9d6d_Dne(boolean bl) {
        return 0;
    }
}

