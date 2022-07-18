package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;

import org.lwjgl.LWJGLException;

import net.minecraft.client.FWm;
import net.minecraft.client.Minecraft;

public class KNk
extends Minecraft {
    final FWm field_9144b3de_Dne;

    @Override
    public void method_7a46289a_Dne() throws LWJGLException {
        this.field_d102ba32_Dne = KNk.method_9189e6b3_Dne();
        this.field_3758af7_Dne = new fZI(this, this.field_d102ba32_Dne);
        if (this.field_3758af7_Dne.field_388da6_zGp > 0 && this.field_3758af7_Dne.field_2d29f4_aFZ > 0 && this.field_9144b3de_Dne.getParent() != null && this.field_9144b3de_Dne.getParent().getParent() != null) {
            this.field_9144b3de_Dne.getParent().getParent().setSize(this.field_3758af7_Dne.field_2d29f4_aFZ, this.field_3758af7_Dne.field_388da6_zGp);
        }
        super.method_7a46289a_Dne();
    }

    public KNk(FWm fWm, Canvas canvas, FWm fWm2, int n, int n2, boolean bl) {
        super(canvas, fWm2, n, n2, bl);
        qxi_0.field_9144b3de_Dne = this.field_9144b3de_Dne = fWm;
    }

    @Override
    public void method_7bd29e30_Dne(McM mcM) {
        this.field_9144b3de_Dne.removeAll();
        this.field_9144b3de_Dne.setLayout(new BorderLayout());
        this.field_9144b3de_Dne.add((Component)new cbQ(mcM), "Center");
        this.field_9144b3de_Dne.validate();
    }
}

