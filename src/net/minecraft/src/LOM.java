package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

class LOM
extends LSv {
    final TEn field_36d11ef_Dne;
    public int field_2092ae_Dne;

    private void method_73b49867_bzF(int n, int n2) {
        this.method_2ee8c479_FWm(n, n2, 0, 0);
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return n == this.field_2092ae_Dne;
    }

    public LOM(TEn tEn) {
        super(tEn.field_493682ed_Dne, tEn.field_21260d_FWm, tEn.field_2e5f1b_bzF, 80, tEn.field_2e5f1b_bzF - 37, 24);
        this.field_36d11ef_Dne = tEn;
        this.field_2092ae_Dne = -1;
    }

    private void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.method_73b49867_bzF(n + 1, n2 + 1);
        GL11.glEnable(32826);
        Cit.method_ae128dc7_bzF();
        TEn.method_230e70a7_Dne().method_77c09267_Dne(this.field_36d11ef_Dne.field_3791671_Dne, this.field_36d11ef_Dne.field_493682ed_Dne.field_36d36bf_Dne, new NMq(n3, 1, 0), n + 2, n2 + 2);
        Cit.method_7a46289a_Dne();
        GL11.glDisable(32826);
    }

    @Override
    protected void method_7a46289a_Dne() {
    }

    private void method_2ee8c479_FWm(int n, int n2, int n3, int n4) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_36d11ef_Dne.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/slot.png");
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(n + 0, n2 + 18, this.field_36d11ef_Dne.field_21260a_FWm, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        wAR.method_c38c5864_Dne(n + 18, n2 + 18, this.field_36d11ef_Dne.field_21260a_FWm, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        wAR.method_c38c5864_Dne(n + 18, n2 + 0, this.field_36d11ef_Dne.field_21260a_FWm, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        wAR.method_c38c5864_Dne(n + 0, n2 + 0, this.field_36d11ef_Dne.field_21260a_FWm, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        wAR.method_7a46288d_Dne();
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        hZu hZu2 = (hZu)TEn.method_adea226d_Dne().get(n);
        this.method_2c2cf7c9_Dne(n2, n3, hZu2.field_2092ae_Dne);
        this.field_36d11ef_Dne.field_3791671_Dne.method_e88b55f3_FWm(hZu2.field_569fcf45_Dne, n2 + 18 + 5, n3 + 6, 0xFFFFFF);
    }

    @Override
    protected int method_7a46288d_Dne() {
        return TEn.method_adea226d_Dne().size();
    }

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
        this.field_2092ae_Dne = n;
        this.field_36d11ef_Dne.method_d44b4592_zGp();
        TEn.method_a9a19e08_Dne(this.field_36d11ef_Dne).method_8f501fe4_Dne(((hZu)TEn.method_adea226d_Dne().get((int)TEn.method_a992b7f1_Dne((TEn)this.field_36d11ef_Dne).field_2092ae_Dne)).field_d9a85c6_FWm);
    }
}

