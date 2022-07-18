package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class Aem
extends ipD
implements wjF {
    private NMq[] field_8360c375_Dne = new NMq[5];
    private String field_569fcf45_Dne;
    private int field_2092ae_Dne = -1;

    private static boolean method_4b22f9b_Dne(MqS mqS, NMq nMq, int n, int n2) {
        return !mqS.method_6e3a6b6a_Dne(n, nMq) ? false : !(mqS instanceof FMb) || ((FMb)mqS).method_59137461_Dne(n, nMq, n2);
    }

    public static boolean method_993033f_Dne(MqS mqS, JiM jiM) {
        boolean bl = false;
        if (jiM == null) {
            return false;
        }
        NMq nMq = jiM.method_23040479_Dne().method_23040479_Dne();
        NMq nMq2 = Aem.method_46ffc3cb_Dne(mqS, nMq, -1);
        if (nMq2 != null && nMq2.field_2092ae_Dne != 0) {
            jiM.method_7c61cf15_Dne(nMq2);
        } else {
            bl = true;
            jiM.method_5d73f9d_g_();
        }
        return bl;
    }

    @Override
    public double method_7c6f6027_FWm() {
        return this.field_2d29f4_aFZ;
    }

    private static boolean method_a981fd7e_Dne(NMq nMq, NMq nMq2) {
        return nMq.field_2e5f1b_bzF != nMq2.field_2e5f1b_bzF ? false : (nMq.method_907a9d14_Qnq() != nMq2.method_907a9d14_Qnq() ? false : (nMq.field_2092ae_Dne > nMq.method_7c6f602c_FWm() ? false : NMq.method_a981fd7e_Dne(nMq, nMq2)));
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_8360c375_Dne.length;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092ae_Dne > 0;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public boolean method_5acf91e_d_() {
        return this.field_569fcf45_Dne != null && this.field_569fcf45_Dne.length() > 0;
    }

    @Override
    public void method_5f36e9f_i_() {
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        mbZ mbZ2 = wkD.method_285baa50_Dne("Items");
        this.field_8360c375_Dne = new NMq[this.method_907a9d14_Qnq()];
        if (wkD.method_8f501fe8_Dne("CustomName")) {
            this.field_569fcf45_Dne = wkD.method_39193c_Dne("CustomName");
        }
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("TransferCooldown");
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(i);
            byte by = wkD2.method_8f501fd0_Dne("Slot");
            if (by < 0 || by >= this.field_8360c375_Dne.length) continue;
            this.field_8360c375_Dne[by] = NMq.method_7da70e76_Dne(wkD2);
        }
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp) != this ? false : fiG.method_2be42992_Dne((double)this.field_267cf5_Qnq + 0.5, (double)this.field_2d29f4_aFZ + 0.5, (double)this.field_388da6_zGp + 0.5) <= 64.0;
    }

    @Override
    public void method_582b297_a_() {
        super.method_582b297_a_();
    }

    public static NMq method_46ffc3cb_Dne(MqS mqS, NMq nMq, int n) {
        if (mqS instanceof FMb && n > -1) {
            FMb fMb = (FMb)mqS;
            int[] nArray = fMb.method_16c585b_Dne(n);
            for (int i = 0; i < nArray.length && nMq != null && nMq.field_2092ae_Dne > 0; ++i) {
                nMq = Aem.method_f9ea44f6_Dne(mqS, nMq, nArray[i], n);
            }
        } else {
            int n2 = mqS.method_907a9d14_Qnq();
            for (int i = 0; i < n2 && nMq != null && nMq.field_2092ae_Dne > 0; ++i) {
                nMq = Aem.method_f9ea44f6_Dne(mqS, nMq, i, n);
            }
        }
        if (nMq != null && nMq.field_2092ae_Dne == 0) {
            nMq = null;
        }
        return nMq;
    }

    public boolean method_7c6f603d_FWm() {
        if (this.field_36c4f18_Dne != null && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            boolean bl;
            if (!this.method_ae128dcb_bzF() && SrC.method_ce7f5dad_Dne(this.method_d44b4585_zGp()) && (bl = this.method_d44b4596_zGp() | Aem.method_c3dd9e38_Dne(this))) {
                this.method_ce7f5da9_Dne(8);
                this.method_582b297_a_();
                return true;
            }
            return false;
        }
        return false;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
    }

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        if (this.field_8360c375_Dne[n] != null) {
            NMq nMq = this.field_8360c375_Dne[n];
            this.field_8360c375_Dne[n] = null;
            return nMq;
        }
        return null;
    }

    private static NMq method_f9ea44f6_Dne(MqS mqS, NMq nMq, int n, int n2) {
        NMq nMq2 = mqS.method_9e6e1a08_Dne(n);
        if (Aem.method_4b22f9b_Dne(mqS, nMq, n, n2)) {
            boolean bl = false;
            if (nMq2 == null) {
                mqS.method_6e3a6b66_Dne(n, nMq);
                nMq = null;
                bl = true;
            } else if (Aem.method_a981fd7e_Dne(nMq2, nMq)) {
                int n3 = nMq.method_7c6f602c_FWm() - nMq2.field_2092ae_Dne;
                int n4 = Math.min(nMq.field_2092ae_Dne, n3);
                nMq.field_2092ae_Dne -= n4;
                nMq2.field_2092ae_Dne += n4;
                boolean bl2 = bl = n4 > 0;
            }
            if (bl) {
                if (mqS instanceof Aem) {
                    ((Aem)mqS).method_ce7f5da9_Dne(8);
                }
                mqS.method_582b297_a_();
            }
        }
        return nMq;
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_36c4f18_Dne != null && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            --this.field_2092ae_Dne;
            if (!this.method_ae128dcb_bzF()) {
                this.method_ce7f5da9_Dne(0);
                this.method_7c6f603d_FWm();
            }
        }
    }

    public static MqS method_13840d8d_Dne(Qnq qnq, double d, double d2, double d3) {
        List list;
        int n;
        zKP zKP2;
        int n2;
        int n3;
        MqS mqS = null;
        int n4 = geR.method_117d0718_FWm(d);
        ipD ipD2 = qnq.method_d98e681d_Dne(n4, n3 = geR.method_117d0718_FWm(d2), n2 = geR.method_117d0718_FWm(d3));
        if (ipD2 != null && ipD2 instanceof MqS && (mqS = (MqS)((Object)ipD2)) instanceof gon_0 && (zKP2 = zKP.field_8374b848_Dne[n = qnq.method_2c2cf7bc_Dne(n4, n3, n2)]) instanceof gHK) {
            mqS = ((gHK)zKP2).method_8bf4132_Dne(qnq, n4, n3, n2);
        }
        if (mqS == null && (list = qnq.method_b6681b68_Dne(null, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0), pUe.field_2033d32b_FWm)) != null && list.size() > 0) {
            mqS = (MqS)list.get(qnq.field_7331eae7_Dne.nextInt(list.size()));
        }
        return mqS;
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public double method_ae128db5_bzF() {
        return this.field_388da6_zGp;
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        this.field_8360c375_Dne[n] = nMq;
        if (nMq != null && nMq.field_2092ae_Dne > this.method_a98a0653_aFZ()) {
            nMq.field_2092ae_Dne = this.method_a98a0653_aFZ();
        }
    }

    public static boolean method_c3dd9e38_Dne(wjF wjF2) {
        MqS mqS = Aem.method_42532c36_Dne(wjF2);
        if (mqS != null) {
            int n = 0;
            if (mqS instanceof FMb && n > -1) {
                FMb fMb = (FMb)mqS;
                int[] nArray = fMb.method_16c585b_Dne(n);
                for (int i = 0; i < nArray.length; ++i) {
                    if (!Aem.method_36066d02_Dne(wjF2, mqS, nArray[i], n)) continue;
                    return true;
                }
            } else {
                int n2 = mqS.method_907a9d14_Qnq();
                for (int i = 0; i < n2; ++i) {
                    if (!Aem.method_36066d02_Dne(wjF2, mqS, i, n)) continue;
                    return true;
                }
            }
        } else {
            JiM jiM = Aem.method_138291ae_Dne(wjF2.method_2305dd77_Dne(), wjF2.method_7a462888_Dne(), wjF2.method_7c6f6027_FWm() + 1.0, wjF2.method_ae128db5_bzF());
            if (jiM != null) {
                return Aem.method_993033f_Dne(wjF2, jiM);
            }
        }
        return false;
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (this.field_8360c375_Dne[n] != null) {
            if (this.field_8360c375_Dne[n].field_2092ae_Dne <= n2) {
                NMq nMq = this.field_8360c375_Dne[n];
                this.field_8360c375_Dne[n] = null;
                return nMq;
            }
            NMq nMq = this.field_8360c375_Dne[n].method_9e6e1a08_Dne(n2);
            if (this.field_8360c375_Dne[n].field_2092ae_Dne == 0) {
                this.field_8360c375_Dne[n] = null;
            }
            return nMq;
        }
        return null;
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return this.field_8360c375_Dne[n];
    }

    @Override
    public double method_7a462888_Dne() {
        return this.field_267cf5_Qnq;
    }

    @Override
    public String method_9fc39d88_b_() {
        return this.method_5acf91e_d_() ? this.field_569fcf45_Dne : "container.hopper";
    }

    private static boolean method_36066d02_Dne(wjF wjF2, MqS mqS, int n, int n2) {
        NMq nMq = mqS.method_9e6e1a08_Dne(n);
        if (nMq != null && Aem.method_5b21f0ba_FWm(mqS, nMq, n, n2)) {
            NMq nMq2 = nMq.method_23040479_Dne();
            NMq nMq3 = Aem.method_46ffc3cb_Dne(wjF2, mqS.method_9046b659_Dne(n, 1), -1);
            if (nMq3 == null || nMq3.field_2092ae_Dne == 0) {
                mqS.method_582b297_a_();
                return true;
            }
            mqS.method_6e3a6b66_Dne(n, nMq2);
        }
        return false;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        mbZ mbZ2 = new mbZ();
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            if (this.field_8360c375_Dne[i] == null) continue;
            WkD wkD2 = new WkD();
            wkD2.method_5ab43558_Dne("Slot", (byte)i);
            this.field_8360c375_Dne[i].method_7dab90f8_Dne(wkD2);
            mbZ2.method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("Items", mbZ2);
        wkD.method_5ab44f9f_Dne("TransferCooldown", this.field_2092ae_Dne);
        if (this.method_5acf91e_d_()) {
            wkD.method_abaa98ae_Dne("CustomName", this.field_569fcf45_Dne);
        }
    }

    private static boolean method_5b21f0ba_FWm(MqS mqS, NMq nMq, int n, int n2) {
        return !(mqS instanceof FMb) || ((FMb)mqS).method_2c493be2_FWm(n, nMq, n2);
    }

    private MqS method_2304139c_Dne() {
        int n = SrC.method_143f9e0f_bzF(this.method_d44b4585_zGp());
        return Aem.method_13840d8d_Dne(this.method_2305dd77_Dne(), this.field_267cf5_Qnq + rrP.field_4039e0a_FWm[n], this.field_2d29f4_aFZ + rrP.field_59d86bc_bzF[n], this.field_388da6_zGp + rrP.field_4a92422_Qnq[n]);
    }

    public static JiM method_138291ae_Dne(Qnq qnq, double d, double d2, double d3) {
        List list = qnq.method_e7d4af05_Dne(JiM.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0), pUe.field_37a074c_Dne);
        return list.size() > 0 ? (JiM)list.get(0) : null;
    }

    public static MqS method_42532c36_Dne(wjF wjF2) {
        return Aem.method_13840d8d_Dne(wjF2.method_2305dd77_Dne(), wjF2.method_7a462888_Dne(), wjF2.method_7c6f6027_FWm() + 1.0, wjF2.method_ae128db5_bzF());
    }

    private boolean method_d44b4596_zGp() {
        MqS mqS = this.method_2304139c_Dne();
        if (mqS == null) {
            return false;
        }
        for (int i = 0; i < this.method_907a9d14_Qnq(); ++i) {
            if (this.method_9e6e1a08_Dne(i) == null) continue;
            NMq nMq = this.method_9e6e1a08_Dne(i).method_23040479_Dne();
            NMq nMq2 = Aem.method_46ffc3cb_Dne(mqS, this.method_9046b659_Dne(i, 1), rrP.field_3f1c589_Dne[SrC.method_143f9e0f_bzF(this.method_d44b4585_zGp())]);
            if (nMq2 == null || nMq2.field_2092ae_Dne == 0) {
                mqS.method_582b297_a_();
                return true;
            }
            this.method_6e3a6b66_Dne(i, nMq);
        }
        return false;
    }
}

