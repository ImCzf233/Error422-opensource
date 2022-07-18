package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

class KHk
extends LSv {
    public int field_2092ae_Dne;
    final hcj field_376997d_Dne;

    public KHk(hcj hcj2) {
        super(hcj2.field_493682ed_Dne, hcj2.field_21260d_FWm, hcj2.field_2e5f1b_bzF, 43, hcj2.field_2e5f1b_bzF - 60, 24);
        this.field_376997d_Dne = hcj2;
        this.field_2092ae_Dne = -1;
    }

    private void method_2ee8c479_FWm(int n, int n2, int n3, int n4) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_376997d_Dne.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/slot.png");
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(n + 0, n2 + 18, this.field_376997d_Dne.field_21260a_FWm, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        wAR.method_c38c5864_Dne(n + 18, n2 + 18, this.field_376997d_Dne.field_21260a_FWm, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        wAR.method_c38c5864_Dne(n + 18, n2 + 0, this.field_376997d_Dne.field_21260a_FWm, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        wAR.method_c38c5864_Dne(n + 0, n2 + 0, this.field_376997d_Dne.field_21260a_FWm, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        wAR.method_7a46288d_Dne();
    }

    private void method_73b49867_bzF(int n, int n2) {
        this.method_2ee8c479_FWm(n, n2, 0, 0);
    }

    private void method_b7755935_Dne(int n, int n2, NMq nMq) {
        this.method_73b49867_bzF(n + 1, n2 + 1);
        GL11.glEnable(32826);
        if (nMq != null) {
            Cit.method_ae128dc7_bzF();
            hcj.method_230e70a7_Dne().method_77c09267_Dne(this.field_376997d_Dne.field_3791671_Dne, this.field_376997d_Dne.field_493682ed_Dne.field_36d36bf_Dne, nMq, n + 2, n2 + 2);
            Cit.method_7a46289a_Dne();
        }
        GL11.glDisable(32826);
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        Jjb jjb = (Jjb)hcj.method_7fde4336_Dne(this.field_376997d_Dne).method_adea226d_Dne().get(hcj.method_7fde4336_Dne(this.field_376997d_Dne).method_adea226d_Dne().size() - n - 1);
        NMq nMq = jjb.method_7c6f602c_FWm() == 0 ? null : new NMq(jjb.method_7c6f602c_FWm(), 1, jjb.method_ae128dba_bzF());
        String string = nMq == null ? "Air" : dEr.field_836aa5b6_Dne[jjb.method_7c6f602c_FWm()].method_bfc22798_bzF(nMq);
        this.method_b7755935_Dne(n2, n3, nMq);
        this.field_376997d_Dne.field_3791671_Dne.method_e88b55f3_FWm(string, n2 + 18 + 5, n3 + 3, 0xFFFFFF);
        String string2 = n == 0 ? KGL.method_98148f73_Dne("createWorld.customize.flat.layer.top", jjb.method_7a46288d_Dne()) : (n == hcj.method_7fde4336_Dne(this.field_376997d_Dne).method_adea226d_Dne().size() - 1 ? KGL.method_98148f73_Dne("createWorld.customize.flat.layer.bottom", jjb.method_7a46288d_Dne()) : KGL.method_98148f73_Dne("createWorld.customize.flat.layer", jjb.method_7a46288d_Dne()));
        this.field_376997d_Dne.field_3791671_Dne.method_e88b55f3_FWm(string2, n2 + 2 + 213 - this.field_376997d_Dne.field_3791671_Dne.method_8f501fd7_Dne(string2), n3 + 3, 0xFFFFFF);
    }

    @Override
    protected int method_7c6f602c_FWm() {
        return this.field_376997d_Dne.field_21260d_FWm - 70;
    }

    @Override
    protected int method_7a46288d_Dne() {
        return hcj.method_7fde4336_Dne(this.field_376997d_Dne).method_adea226d_Dne().size();
    }

    @Override
    protected void method_7a46289a_Dne() {
    }

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
        this.field_2092ae_Dne = n;
        this.field_376997d_Dne.method_59ee199_c_();
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return n == this.field_2092ae_Dne;
    }
}

