package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import org.lwjgl.opengl.GL11;

class XIv
extends LSv {
    final SbO field_36d06ac_Dne;

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
        List list = SbO.method_e02f97ae_bzF((SbO)this.field_36d06ac_Dne).field_373a352_Dne.method_adea226d_Dne();
        try {
            SbO.method_6cfc8208_Qnq((SbO)this.field_36d06ac_Dne).field_373a352_Dne.method_718ce76d_Dne((Gax)list.get(n));
            SbO.method_169877c7_aFZ((SbO)this.field_36d06ac_Dne).field_36d36bf_Dne.method_ae128dc7_bzF();
            SbO.method_d8ad85f9_zGp((SbO)this.field_36d06ac_Dne).field_37b59c1_Dne.method_7a46289a_Dne();
        }
        catch (Exception exception) {
            SbO.method_ccd123ea_DyG((SbO)this.field_36d06ac_Dne).field_373a352_Dne.method_718ce76d_Dne((Gax)list.get(0));
            SbO.method_edf450ab_div((SbO)this.field_36d06ac_Dne).field_36d36bf_Dne.method_ae128dc7_bzF();
            SbO.method_b869955_IjH((SbO)this.field_36d06ac_Dne).field_37b59c1_Dne.method_7a46289a_Dne();
        }
    }

    @Override
    protected int method_7a46288d_Dne() {
        return SbO.method_1cc79920_FWm((SbO)this.field_36d06ac_Dne).field_373a352_Dne.method_adea226d_Dne().size();
    }

    @Override
    protected void method_7a46289a_Dne() {
        this.field_36d06ac_Dne.method_a98a0660_aFZ();
    }

    @Override
    protected int method_ae128dba_bzF() {
        return this.method_7a46288d_Dne() * 36;
    }

    public XIv(SbO sbO) {
        super(SbO.method_f7718501_Dne(sbO), sbO.field_21260d_FWm, sbO.field_2e5f1b_bzF, 32, sbO.field_2e5f1b_bzF - 55 + 4, 36);
        this.field_36d06ac_Dne = sbO;
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        Gax gax = (Gax)SbO.method_fdc2f29_Zpi((SbO)this.field_36d06ac_Dne).field_373a352_Dne.method_adea226d_Dne().get(n);
        gax.method_600aae3b_FWm(SbO.method_2ee35c69_kGO((SbO)this.field_36d06ac_Dne).field_36d36bf_Dne);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        wAR.method_7a46289a_Dne();
        wAR.method_143f9e1c_bzF(0xFFFFFF);
        wAR.method_c38c5864_Dne(n2, n3 + n4, 0.0, 0.0, 1.0);
        wAR.method_c38c5864_Dne(n2 + 32, n3 + n4, 0.0, 1.0, 1.0);
        wAR.method_c38c5864_Dne(n2 + 32, n3, 0.0, 1.0, 0.0);
        wAR.method_c38c5864_Dne(n2, n3, 0.0, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        String string = gax.method_d1f1ed87_FWm();
        if (!gax.method_7a46289e_Dne()) {
            string = (Object)((Object)Dne.field_7129e917_aFZ) + KGL.method_39193c_Dne("texturePack.incompatible") + " - " + string;
        }
        if (string.length() > 32) {
            string = string.substring(0, 32).trim() + "...";
        }
        this.field_36d06ac_Dne.method_67d6d54c_FWm(SbO.method_ecd4f0dd_Dne(this.field_36d06ac_Dne), string, n2 + 32 + 2, n3 + 1, 0xFFFFFF);
        this.field_36d06ac_Dne.method_67d6d54c_FWm(SbO.method_c9b6dc1e_FWm(this.field_36d06ac_Dne), gax.method_6859cdb9_bzF(), n2 + 32 + 2, n3 + 12, 0x808080);
        this.field_36d06ac_Dne.method_67d6d54c_FWm(SbO.method_29130e50_bzF(this.field_36d06ac_Dne), gax.method_4a7b1d9f_Qnq(), n2 + 32 + 2, n3 + 12 + 10, 0x808080);
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        List list = SbO.method_53cde05f_mrb((SbO)this.field_36d06ac_Dne).field_373a352_Dne.method_adea226d_Dne();
        return SbO.method_29a6c380_XHL((SbO)this.field_36d06ac_Dne).field_373a352_Dne.method_230121cd_Dne() == list.get(n);
    }
}

