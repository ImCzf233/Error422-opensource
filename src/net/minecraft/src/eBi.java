package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class eBi
extends zxd {
    private int field_21260d_FWm = 0;
    private int field_2592c3_One = 0;

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab47529_Dne("Anger", (short)this.field_21260d_FWm);
    }

    @Override
    public void method_80692b1a_ICU() {
        super.method_80692b1a_ICU();
        this.method_ce92b9a6_IjH(false);
    }

    public eBi(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/pigzombie.png";
        this.field_2e1df2_cHy = 0.5f;
        this.field_342275_ooe = true;
    }

    @Override
    protected boolean method_cbcb3929_tgc() {
        return false;
    }

    private void method_94d18be1_FWm(sMa sMa2) {
        this.field_75c313d2_bzF = sMa2;
        this.field_21260d_FWm = 400 + this.field_7331eae7_Dne.nextInt(400);
        this.field_2592c3_One = this.field_7331eae7_Dne.nextInt(40);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.field_21260d_FWm = wkD.method_8f501fe1_Dne("Anger");
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        return false;
    }

    @Override
    protected sMa method_2314d444_Dne() {
        return this.field_21260d_FWm == 0 ? null : super.method_2314d444_Dne();
    }

    @Override
    protected void method_c738b194_qrB() {
        this.method_19b4c3a3_a_(0, new NMq(dEr.field_dd73c5d3_Fnk));
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_a989199f_gvF.field_267cf5_Qnq;
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2;
        int n3 = this.field_7331eae7_Dne.nextInt(2 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.method_9045499d_Dne(dEr.field_a989199f_gvF.field_267cf5_Qnq, 1);
        }
        n3 = this.field_7331eae7_Dne.nextInt(2 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.method_9045499d_Dne(dEr.field_2653f0f8_uzC.field_267cf5_Qnq, 1);
        }
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        sMa sMa2 = zBn2.method_f88b2463_FWm();
        if (sMa2 instanceof FiG) {
            List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne.method_b78565d7_FWm(32.0, 32.0, 32.0));
            for (int i = 0; i < list.size(); ++i) {
                sMa sMa3 = (sMa)list.get(i);
                if (!(sMa3 instanceof eBi)) continue;
                eBi eBi2 = (eBi)sMa3;
                eBi2.method_94d18be1_FWm(sMa2);
            }
            this.method_94d18be1_FWm(sMa2);
        }
        return super.method_147b2066_Dne(zBn2, n);
    }

    @Override
    public String method_6859cdb9_bzF() {
        return "/mob/pigzombie.png";
    }

    @Override
    public void method_7a46289a_Dne() {
        float f = this.field_2e1df2_cHy = this.field_75c313d2_bzF != null ? 0.95f : 0.5f;
        if (this.field_2592c3_One > 0 && --this.field_2592c3_One == 0) {
            this.method_fbd4aee4_Dne("mob.zombiepig.zpigangry", this.method_b0a28134_div() * 2.0f, ((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f) * 1.8f);
        }
        super.method_7a46289a_Dne();
    }

    @Override
    public boolean method_af414cf1_cot() {
        return this.field_36c4f18_Dne.field_2d29f4_aFZ > 0 && this.field_36c4f18_Dne.method_9ed6d42c_Dne(this.field_373a3ed_Dne) && this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne).isEmpty() && !this.field_36c4f18_Dne.method_90cba31f_bzF(this.field_373a3ed_Dne);
    }

    @Override
    protected void method_ce9279d5_IjH(int n) {
        this.method_9045499d_Dne(dEr.field_74feeb39_mrb.field_267cf5_Qnq, 1);
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.zombiepig.zpighurt";
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        NMq nMq = this.method_23040479_Dne();
        int n = 5;
        if (nMq != null) {
            n += nMq.method_bb7dd813_Dne(this);
        }
        return n;
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.zombiepig.zpig";
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.zombiepig.zpigdeath";
    }
}

