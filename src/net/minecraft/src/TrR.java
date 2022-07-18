package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class TrR
extends YAD {
    private XRF field_36f0f60_Dne;

    protected void method_aabcb61e_Dne(wao wao2, float f) {
        super.method_c52e66f1_FWm(wao2, f);
        NMq nMq = new NMq(zKP.field_32158d62_aJO, 1);
        if (nMq != null && nMq.method_230de6ba_Dne().field_267cf5_Qnq < 256) {
            GL11.glPushMatrix();
            this.field_36f0f60_Dne.field_75c33e53_bzF.method_143f92d9_bzF(0.0625f);
            if (zVu.method_ce7f5dad_Dne(zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF].method_7a46288d_Dne())) {
                float f2 = 0.625f;
                GL11.glTranslatef(0.0f, -0.34375f, 0.0f);
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(f2, -f2, f2);
            }
            this.field_37a7828_Dne.field_36fa224_Dne.method_d09371e2_Dne(wao2, nMq, 0);
            GL11.glPopMatrix();
        }
    }

    public TrR() {
        super(new XRF(), 0.5f);
        this.field_36f0f60_Dne = (XRF)this.field_367c742_Dne;
        this.method_724f763d_Dne(this.field_36f0f60_Dne);
    }

    @Override
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        this.method_aabcb61e_Dne((wao)fUH, f);
    }
}

