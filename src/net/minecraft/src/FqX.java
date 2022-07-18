package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class FqX {
    private long field_2092af_Dne;
    public Eya field_36701ff_Dne;
    private static FqX field_367573f_Dne = new FqX();
    private boolean field_21261e_FWm;
    private double field_2092a9_Dne;
    public int field_2092ae_Dne;
    private long field_2e5f1c_bzF;
    private long field_21260e_FWm;
    public long[] field_3f1c58a_Dne = new long[7];
    private double field_2e5f16_bzF;
    private double field_212608_FWm;
    private long field_20b858_DyG;
    private long field_388da7_zGp;
    private long field_2d29f5_aFZ;
    private long field_267cf6_Qnq;
    private boolean field_2092bf_Dne;

    public void method_a98a0660_aFZ() {
        this.method_1e269a1a_FWm(3, this.field_267cf6_Qnq);
        if (this.method_ce7f5dad_Dne(3)) {
            if (eCD.method_ce7f5d9c_Dne(2) == 0) {
                qxi_0.field_36b4fb5_Dne.method_fe8e2b7b_Qnq(new NAx(((SXd)qxi_0.field_c61a1f02_bzF.get(eCD.method_ce7f5d9c_Dne(qxi_0.field_c61a1f02_bzF.size()))).method_7a46288d_Dne(), eCD.method_ce7f5d9c_Dne(1000) + 200, eCD.method_ce7f5d9c_Dne(4)));
            }
            this.method_16cce3b_Dne(3, this.field_267cf6_Qnq);
        }
    }

    public void method_d44b4592_zGp() {
        this.method_1e269a1a_FWm(4, this.field_2d29f5_aFZ);
        if (this.method_ce7f5dad_Dne(4)) {
            if (eCD.method_ce7f5d9c_Dne(3) == 0) {
                String[] stringArray = new String[]{"LWJGL", "JINPUT", "JAVA", "UNKNOWN", "CHUNK", "RENDERER", "CHUNK", "SOUNDSYSTEM", "OPENAL", "?????"};
                String string = "";
                int n = eCD.method_ce7f5d9c_Dne(100);
                for (int i = 0; i < n; ++i) {
                    string = string + qxi_0.field_3f1c583_Dne[eCD.method_ce7f5d9c_Dne(qxi_0.field_3f1c583_Dne.length)];
                }
                qxi_0.field_36b4fb5_Dne.method_47a073d1_bzF("\u00a74# " + stringArray[eCD.method_ce7f5d9c_Dne(stringArray.length - 1) + 1] + " ERROR \u00a7e[dump: \u00a7k" + string + "\u00a7r\u00a7e]");
            }
            this.method_16cce3b_Dne(4, this.field_2d29f5_aFZ);
        }
    }

    public void method_16cce3b_Dne(int n, long l) {
        this.field_3f1c58a_Dne[n] = (long)this.field_2092ae_Dne + l;
        ++sRv.field_2092ae_Dne;
    }

    public FqX() {
        this.field_2092af_Dne = eCD.method_16cca6e_Dne(Jcz.method_ce7f5d9c_Dne(10), Jcz.method_ce7f5d9c_Dne(20));
        this.field_21260e_FWm = eCD.method_16cca6e_Dne(Jcz.method_ce7f5d9c_Dne(20), Jcz.method_ce7f5d9c_Dne(30));
        this.field_2e5f1c_bzF = eCD.method_16cca6e_Dne(Jcz.method_ce7f5d9c_Dne(40), Jcz.method_ce7f5d9c_Dne(70));
        this.field_267cf6_Qnq = eCD.method_16cca6e_Dne(Jcz.method_ce7f5d9c_Dne(10), Jcz.method_ce7f5d9c_Dne(15));
        this.field_2d29f5_aFZ = eCD.method_16cca6e_Dne(Jcz.method_ce7f5d9c_Dne(15), Jcz.method_ce7f5d9c_Dne(25));
        this.field_388da7_zGp = Jcz.method_ce7f5d9c_Dne(15);
        this.field_20b858_DyG = eCD.method_16cca6e_Dne(Jcz.method_ce7f5d9c_Dne(15), Jcz.method_ce7f5d9c_Dne(25));
    }

    public void method_1e269a1a_FWm(int n, long l) {
        if (this.field_3f1c58a_Dne[n] == 0L) {
            this.field_3f1c58a_Dne[n] = (long)this.field_2092ae_Dne + l;
            this.field_36701ff_Dne = null;
            sRv.field_2092ae_Dne = 0;
        }
    }

    public void method_7a46289a_Dne() {
        this.method_7c6f6039_FWm();
        this.method_ae128dc7_bzF();
        this.method_907a9d21_Qnq();
        this.method_a98a0660_aFZ();
        this.method_d44b4592_zGp();
        this.method_7ad38803_DyG();
        this.method_b0a28144_div();
    }

    public boolean method_ce7f5dad_Dne(int n) {
        return (long)this.field_2092ae_Dne >= this.field_3f1c58a_Dne[n];
    }

    public void method_b0a28144_div() {
        this.method_1e269a1a_FWm(6, this.field_20b858_DyG);
        if (this.method_ce7f5dad_Dne(6)) {
            this.method_8288d6ee_IjH();
            this.method_16cce3b_Dne(6, this.field_20b858_DyG);
        }
    }

    public static FqX method_2300e59e_Dne() {
        return field_367573f_Dne;
    }

    public void method_8288d6ee_IjH() {
        Szq szq = new Szq(this);
        ((Thread)szq).run();
    }

    public void method_907a9d21_Qnq() {
        Object object;
        this.method_1e269a1a_FWm(2, this.field_2e5f1c_bzF);
        if (this.field_21261e_FWm || qxi_0.field_376997d_Dne == hdK.field_376997d_Dne && qxi_0.field_493682ed_Dne.field_37d0195_Dne != null && this.field_2092a9_Dne != 0.0 && this.field_212608_FWm != 0.0 && this.field_2e5f16_bzF != 0.0) {
            this.field_21261e_FWm = true;
            object = new QEr();
            qxi_0.field_36b4fb5_Dne.field_291868_XHL = 0.0;
            qxi_0.field_36b4fb5_Dne.field_2a9ad1_Zpi = 0.0;
            qxi_0.field_36b4fb5_Dne.field_31b811_kGO = 0.0;
            ((QEr)object).field_2092a9_Dne = this.field_2092a9_Dne;
            ((QEr)object).field_212608_FWm = this.field_212608_FWm;
            ((QEr)object).field_2e5f16_bzF = this.field_2e5f16_bzF;
            qxi_0.field_36b4fb5_Dne.method_47a073d1_bzF("\u00a74\u00a7kError.................................................................................................................................................");
            qxi_0.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne((NER)object);
            qxi_0.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new FTJ(qxi_0.field_2092ab_Dne, qxi_0.field_21260a_FWm, false));
        }
        if (this.method_ce7f5dad_Dne(2)) {
            if (this.field_2092bf_Dne) {
                if (qxi_0.field_376997d_Dne == hdK.field_2030655c_FWm) {
                    object = new fxj_0(qxi_0.field_36c164d_Dne);
                    ((sMa)object).method_9ce0fc65_FWm(qxi_0.field_36b4fb5_Dne.field_2f0dd3_div, qxi_0.field_36b4fb5_Dne.field_22c5fd_IjH, qxi_0.field_36b4fb5_Dne.field_334487_mrb, 0.0f, 0.0f);
                    qxi_0.field_36c164d_Dne.method_94d18be5_FWm((sMa)object);
                    this.method_16cce3b_Dne(2, this.field_2e5f1c_bzF);
                    this.field_2092bf_Dne = false;
                } else if (qxi_0.field_376997d_Dne == hdK.field_376997d_Dne && qxi_0.field_493682ed_Dne.field_37d0195_Dne != null) {
                    object = new fxj_0(qxi_0.field_36c164d_Dne);
                    this.field_2092a9_Dne = qxi_0.field_36b4fb5_Dne.field_2f0dd3_div;
                    this.field_212608_FWm = qxi_0.field_36b4fb5_Dne.field_22c5fd_IjH + 1.7;
                    this.field_2e5f16_bzF = qxi_0.field_36b4fb5_Dne.field_334487_mrb;
                    double d = qxi_0.field_493682ed_Dne.field_37d0195_Dne.field_2092ae_Dne;
                    double d2 = qxi_0.field_493682ed_Dne.field_37d0195_Dne.field_21260d_FWm;
                    double d3 = qxi_0.field_493682ed_Dne.field_37d0195_Dne.field_2e5f1b_bzF;
                    ((sMa)object).method_9ce0fc65_FWm(d, d2, d3, 0.0f, 0.0f);
                    qxi_0.field_36c164d_Dne.method_94d18be5_FWm((sMa)object);
                    this.method_16cce3b_Dne(2, this.field_2e5f1c_bzF);
                    this.field_2092bf_Dne = false;
                }
                return;
            }
            int n = eCD.method_ce7f5d9c_Dne(2);
            if (n == 0) {
                qxi_0.field_376997d_Dne = hdK.field_2030655c_FWm;
                this.field_2092bf_Dne = true;
            } else {
                qxi_0.field_376997d_Dne = hdK.field_376997d_Dne;
                this.field_2092bf_Dne = true;
            }
        }
    }

    public void method_7c6f6039_FWm() {
        this.method_1e269a1a_FWm(0, this.field_2092af_Dne);
        if (this.method_ce7f5dad_Dne(0)) {
            this.field_36701ff_Dne = Eya.values()[eCD.method_ce7f5d9c_Dne(Eya.values().length)];
            if (eCD.method_ce7f5d9c_Dne(2) == 0) {
                switch (this.field_36701ff_Dne) {
                    case field_36701ff_Dne: {
                        qxi_0.field_36c164d_Dne.method_117d1dab_FWm(qxi_0.field_36c164d_Dne.method_ae128dbb_bzF() + (long)eCD.method_ce7f5d9c_Dne(10000) + 10000L);
                        break;
                    }
                    case field_2020cdde_FWm: {
                        int n = eCD.method_ce7f5d9c_Dne(7);
                        int n2 = eCD.method_ce7f5d9c_Dne(7);
                        n = eCD.method_ce7f5d9c_Dne(2) == 0 ? n : -n;
                        n2 = eCD.method_ce7f5d9c_Dne(2) == 0 ? n2 : -n2;
                        qxi_0.field_36c164d_Dne.method_bb7dd824_Dne(new xIh(qxi_0.field_36c164d_Dne, qxi_0.field_36b4fb5_Dne.field_2f0dd3_div + (double)n, qxi_0.field_36b4fb5_Dne.field_22c5fd_IjH - 1.0, qxi_0.field_36b4fb5_Dne.field_334487_mrb + (double)n2));
                    }
                }
                if (sRv.field_2092bf_Dne) {
                    qxi_0.field_36b4fb5_Dne.method_47a073d1_bzF("Event " + (Object)((Object)this.field_36701ff_Dne) + " was executed.");
                }
                this.method_16cce3b_Dne(0, this.field_2092af_Dne);
            }
        }
    }

    public void method_7ad38803_DyG() {
        this.method_1e269a1a_FWm(5, this.field_388da7_zGp);
        if (this.method_ce7f5dad_Dne(5)) {
            if (eCD.method_ce7f5d9c_Dne(2) == 0) {
                int n;
                int n2;
                if (eCD.method_ce7f5d9c_Dne(2) == 0) {
                    n2 = eCD.method_ce7f5d9c_Dne(2) == 0 ? 1 : -1;
                    n = 0;
                } else {
                    n = eCD.method_ce7f5d9c_Dne(2) == 0 ? 1 : -1;
                    n2 = 0;
                }
                qxi_0.field_493682ed_Dne.field_369f6b6_Dne.method_9b5d79e3_Dne(null, 0, n2, n);
            }
            this.method_16cce3b_Dne(5, this.field_388da7_zGp);
        }
    }

    public void method_ae128dc7_bzF() {
        if (qxi_0.field_2092bf_Dne) {
            try {
                mKT cfr_ignored_0 = qxi_0.field_493682ed_Dne.field_3788296_Dne;
                mKT.field_a378b605_Dne.newSource(true, "glitchsrc", "glitch.ogg", false, (float)qxi_0.field_36b4fb5_Dne.field_2f0dd3_div, (float)qxi_0.field_36b4fb5_Dne.field_22c5fd_IjH, (float)qxi_0.field_36b4fb5_Dne.field_334487_mrb, 1, 1.0f);
                mKT cfr_ignored_1 = qxi_0.field_493682ed_Dne.field_3788296_Dne;
                mKT.field_a378b605_Dne.play("glitchsrc");
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            qxi_0.field_493682ed_Dne.field_2e5f2c_bzF = false;
            ArrayList<NMq> arrayList = new ArrayList<NMq>();
            for (NMq nMq : qxi_0.field_36b4fb5_Dne.field_36a059b_Dne.field_8360c375_Dne) {
                arrayList.add(nMq);
            }
            for (int i = 0; i < qxi_0.field_36b4fb5_Dne.field_36a059b_Dne.field_8360c375_Dne.length; ++i) {
                NMq nMq;
                qxi_0.field_36b4fb5_Dne.field_36a059b_Dne.field_8360c375_Dne[i] = nMq = (NMq)arrayList.get(eCD.method_ce7f5d9c_Dne(arrayList.size()));
                arrayList.remove(nMq);
            }
        }
        this.method_1e269a1a_FWm(1, this.field_21260e_FWm);
        if (this.method_ce7f5dad_Dne(1)) {
            if (eCD.method_ce7f5d9c_Dne(2) == 0) {
                qxi_0.field_2092bf_Dne = true;
                if (sRv.field_2092bf_Dne) {
                    qxi_0.field_36b4fb5_Dne.method_47a073d1_bzF("Event Glitch was executed.");
                }
            } else if (sRv.field_2092bf_Dne) {
                qxi_0.field_36b4fb5_Dne.method_47a073d1_bzF("Event Glitch was NOT executed.");
            }
            this.method_16cce3b_Dne(1, this.field_21260e_FWm);
        }
    }
}

