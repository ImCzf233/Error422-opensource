package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class zsp
extends QCe {
    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        zsp.method_4b502b56_Dne(sMa2.field_373a3ed_Dne, d - sMa2.field_36b0a4_udO, d2 - sMa2.field_34225f_ooe, d3 - sMa2.field_36714f_trS);
        GL11.glPopMatrix();
    }
}

