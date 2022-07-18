package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class dfe
extends QCe {
    protected final zVu field_20386492_FWm;
    protected Gor field_367c742_Dne;

    protected void method_be7e6a4d_Dne(Ebp ebp, float f, zKP zKP2, int n) {
        float f2 = ebp.method_ce7f5256_Dne(f);
        GL11.glPushMatrix();
        this.field_20386492_FWm.method_23d00645_Dne(zKP2, n, f2);
        GL11.glPopMatrix();
    }

    public dfe() {
        this.field_2092ab_Dne = 0.5f;
        this.field_367c742_Dne = new xTk();
        this.field_20386492_FWm = new zVu();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_2a6506ca_Dne((Ebp)sMa2, d, d2, d3, f, f2);
    }

    public void method_2a6506ca_Dne(Ebp ebp, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        long l = (long)ebp.field_2d29f4_aFZ * 493286711L;
        l = l * l * 4392167121L + l * 98761L;
        float f3 = (((float)(l >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f4 = (((float)(l >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f5 = (((float)(l >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        GL11.glTranslatef(f3, f4, f5);
        double d4 = ebp.field_36b0a4_udO + (ebp.field_2f0dd3_div - ebp.field_36b0a4_udO) * (double)f2;
        double d5 = ebp.field_34225f_ooe + (ebp.field_22c5fd_IjH - ebp.field_34225f_ooe) * (double)f2;
        double d6 = ebp.field_36714f_trS + (ebp.field_334487_mrb - ebp.field_36714f_trS) * (double)f2;
        double d7 = 0.3f;
        chN chN2 = ebp.method_e4505d6c_Dne(d4, d5, d6);
        float f6 = ebp.field_31b813_kGO + (ebp.field_29186a_XHL - ebp.field_31b813_kGO) * f2;
        if (chN2 != null) {
            chN chN3 = ebp.method_fd03f3e2_Dne(d4, d5, d6, d7);
            chN chN4 = ebp.method_fd03f3e2_Dne(d4, d5, d6, -d7);
            if (chN3 == null) {
                chN3 = chN2;
            }
            if (chN4 == null) {
                chN4 = chN2;
            }
            d += chN2.field_2092a9_Dne - d4;
            d2 += (chN3.field_212608_FWm + chN4.field_212608_FWm) / 2.0 - d5;
            d3 += chN2.field_2e5f16_bzF - d6;
            chN chN5 = chN4.method_2c4d3b9f_bzF(-chN3.field_2092a9_Dne, -chN3.field_212608_FWm, -chN3.field_2e5f16_bzF);
            if (chN5.method_7a462888_Dne() != 0.0) {
                chN5 = chN5.method_230df162_Dne();
                f = (float)(Math.atan2(chN5.field_2e5f16_bzF, chN5.field_2092a9_Dne) * 180.0 / Math.PI);
                f6 = (float)(Math.atan(chN5.field_212608_FWm) * 73.0);
            }
        }
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        GL11.glRotatef(180.0f - f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-f6, 0.0f, 0.0f, 1.0f);
        float f7 = (float)ebp.method_ae128dba_bzF() - f2;
        float f8 = (float)ebp.method_7a46288d_Dne() - f2;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f7 > 0.0f) {
            GL11.glRotatef(geR.method_ce7f5256_Dne(f7) * f7 * f8 / 10.0f * (float)ebp.method_c073daeb_mrb(), 1.0f, 0.0f, 0.0f);
        }
        int n = ebp.method_cd4cb3c8_udO();
        zKP zKP2 = ebp.method_2317f94c_Dne();
        int n2 = ebp.method_9feec6b5_Zpi();
        if (zKP2 != null) {
            GL11.glPushMatrix();
            this.method_8f501fe4_Dne("/terrain.png");
            float f9 = 0.75f;
            GL11.glScalef(f9, f9, f9);
            GL11.glTranslatef(0.0f, (float)n / 16.0f, 0.0f);
            this.method_be7e6a4d_Dne(ebp, f2, zKP2, n2);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.method_8f501fe4_Dne("/item/cart.png");
        GL11.glScalef(-1.0f, -1.0f, 1.0f);
        this.field_367c742_Dne.method_3a102820_Dne(ebp, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
}

