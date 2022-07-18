package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class zWy
extends QCe {
    private zVu field_20386492_FWm = new zVu();

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_5b6382f7_Dne((CiF)sMa2, d, d2, d3, f, f2);
    }

    public zWy() {
        this.field_2092ab_Dne = 0.5f;
    }

    public void method_5b6382f7_Dne(CiF ciF, double d, double d2, double d3, float f, float f2) {
        Qnq qnq = ciF.method_2305dd77_Dne();
        zKP zKP2 = zKP.field_8374b848_Dne[ciF.field_2092ae_Dne];
        if (qnq.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(ciF.field_2f0dd3_div), geR.method_117d0718_FWm(ciF.field_22c5fd_IjH), geR.method_117d0718_FWm(ciF.field_334487_mrb)) != ciF.field_2092ae_Dne) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)d, (float)d2, (float)d3);
            this.method_8f501fe4_Dne("/terrain.png");
            GL11.glDisable(2896);
            if (zKP2 instanceof qQB && zKP2.method_7a46288d_Dne() == 35) {
                this.field_20386492_FWm.field_3706cf9_Dne = qnq;
                WAR wAR = WAR.field_36e5ca4_Dne;
                wAR.method_7a46289a_Dne();
                wAR.method_a663d9a5_FWm((float)(-geR.method_117d0718_FWm(ciF.field_2f0dd3_div)) - 0.5f, (float)(-geR.method_117d0718_FWm(ciF.field_22c5fd_IjH)) - 0.5f, (float)(-geR.method_117d0718_FWm(ciF.field_334487_mrb)) - 0.5f);
                this.field_20386492_FWm.method_a4d55ba9_Dne((qQB)zKP2, geR.method_117d0718_FWm(ciF.field_2f0dd3_div), geR.method_117d0718_FWm(ciF.field_22c5fd_IjH), geR.method_117d0718_FWm(ciF.field_334487_mrb), ciF.field_21260d_FWm);
                wAR.method_a663d9a5_FWm(0.0, 0.0, 0.0);
                wAR.method_7a46288d_Dne();
            } else if (zKP2.method_7a46288d_Dne() == 27) {
                this.field_20386492_FWm.field_3706cf9_Dne = qnq;
                WAR wAR = WAR.field_36e5ca4_Dne;
                wAR.method_7a46289a_Dne();
                wAR.method_a663d9a5_FWm((float)(-geR.method_117d0718_FWm(ciF.field_2f0dd3_div)) - 0.5f, (float)(-geR.method_117d0718_FWm(ciF.field_22c5fd_IjH)) - 0.5f, (float)(-geR.method_117d0718_FWm(ciF.field_334487_mrb)) - 0.5f);
                this.field_20386492_FWm.method_8ebefff1_Dne((tVs)zKP2, geR.method_117d0718_FWm(ciF.field_2f0dd3_div), geR.method_117d0718_FWm(ciF.field_22c5fd_IjH), geR.method_117d0718_FWm(ciF.field_334487_mrb));
                wAR.method_a663d9a5_FWm(0.0, 0.0, 0.0);
                wAR.method_7a46288d_Dne();
            } else if (zKP2 != null) {
                this.field_20386492_FWm.method_c74bdb28_Dne(zKP2);
                this.field_20386492_FWm.method_13be5505_Dne(zKP2, qnq, geR.method_117d0718_FWm(ciF.field_2f0dd3_div), geR.method_117d0718_FWm(ciF.field_22c5fd_IjH), geR.method_117d0718_FWm(ciF.field_334487_mrb), ciF.field_21260d_FWm);
            }
            GL11.glEnable(2896);
            GL11.glPopMatrix();
        }
    }
}

