package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class VfL
implements iQt {
    private NMq field_36a761a_Dne;

    @Override
    public NMq method_b1bef5f5_Dne(Uqm uqm) {
        return this.field_36a761a_Dne.method_23040479_Dne();
    }

    @Override
    public int method_7a46288d_Dne() {
        return 10;
    }

    @Override
    public boolean method_cbf49e9b_Dne(Uqm uqm, Qnq qnq) {
        Object object;
        this.field_36a761a_Dne = null;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = 0; i < uqm.method_907a9d14_Qnq(); ++i) {
            object = uqm.method_9e6e1a08_Dne(i);
            if (object == null) continue;
            if (((NMq)object).field_2e5f1b_bzF == dEr.field_e637b3ee_cot.field_267cf5_Qnq) {
                ++n2;
                continue;
            }
            if (((NMq)object).field_2e5f1b_bzF == dEr.field_e3e9eb98_mte.field_267cf5_Qnq) {
                ++n4;
                continue;
            }
            if (((NMq)object).field_2e5f1b_bzF == dEr.field_5d50330c_edi.field_267cf5_Qnq) {
                ++n3;
                continue;
            }
            if (((NMq)object).field_2e5f1b_bzF == dEr.field_90cb7cdd_lMz.field_267cf5_Qnq) {
                ++n;
                continue;
            }
            if (((NMq)object).field_2e5f1b_bzF == dEr.field_dcb7db43_XwR.field_267cf5_Qnq) {
                ++n5;
                continue;
            }
            if (((NMq)object).field_2e5f1b_bzF == dEr.field_141d2e85_div.field_267cf5_Qnq) {
                ++n5;
                continue;
            }
            if (((NMq)object).field_2e5f1b_bzF == dEr.field_9b1ab643_lDk.field_267cf5_Qnq) {
                ++n6;
                continue;
            }
            if (((NMq)object).field_2e5f1b_bzF == dEr.field_d73ac430_yMz.field_267cf5_Qnq) {
                ++n6;
                continue;
            }
            if (((NMq)object).field_2e5f1b_bzF == dEr.field_2653f0f8_uzC.field_267cf5_Qnq) {
                ++n6;
                continue;
            }
            if (((NMq)object).field_2e5f1b_bzF != dEr.field_e405241a_mfU.field_267cf5_Qnq) {
                return false;
            }
            ++n6;
        }
        n5 += n3 + n6;
        if (n2 <= 3 && n <= 1) {
            if (n2 >= 1 && n == 1 && n5 == 0) {
                this.field_36a761a_Dne = new NMq(dEr.field_f764b325_kQw);
                if (n4 > 0) {
                    WkD wkD = new WkD();
                    object = new WkD("Fireworks");
                    mbZ mbZ2 = new mbZ("Explosions");
                    for (int i = 0; i < uqm.method_907a9d14_Qnq(); ++i) {
                        NMq nMq = uqm.method_9e6e1a08_Dne(i);
                        if (nMq == null || nMq.field_2e5f1b_bzF != dEr.field_e3e9eb98_mte.field_267cf5_Qnq || !nMq.method_a98a0664_aFZ() || !nMq.method_230886fb_Dne().method_8f501fe8_Dne("Explosion")) continue;
                        mbZ2.method_b4ba5ea1_Dne(nMq.method_230886fb_Dne().method_2851c945_Dne("Explosion"));
                    }
                    ((WkD)object).method_58996597_Dne("Explosions", mbZ2);
                    ((WkD)object).method_5ab43558_Dne("Flight", (byte)n2);
                    wkD.method_58996597_Dne("Fireworks", (oNe)object);
                    this.field_36a761a_Dne.method_66a36cd8_FWm(wkD);
                }
                return true;
            }
            if (n2 == 1 && n == 0 && n4 == 0 && n3 > 0 && n6 <= 1) {
                this.field_36a761a_Dne = new NMq(dEr.field_e3e9eb98_mte);
                WkD wkD = new WkD();
                object = new WkD("Explosion");
                int n7 = 0;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                for (int i = 0; i < uqm.method_907a9d14_Qnq(); ++i) {
                    NMq nMq = uqm.method_9e6e1a08_Dne(i);
                    if (nMq == null) continue;
                    if (nMq.field_2e5f1b_bzF == dEr.field_5d50330c_edi.field_267cf5_Qnq) {
                        arrayList.add(AvN.field_3f1c589_Dne[nMq.method_907a9d14_Qnq()]);
                        continue;
                    }
                    if (nMq.field_2e5f1b_bzF == dEr.field_dcb7db43_XwR.field_267cf5_Qnq) {
                        ((WkD)object).method_5ab48f70_Dne("Flicker", true);
                        continue;
                    }
                    if (nMq.field_2e5f1b_bzF == dEr.field_141d2e85_div.field_267cf5_Qnq) {
                        ((WkD)object).method_5ab48f70_Dne("Trail", true);
                        continue;
                    }
                    if (nMq.field_2e5f1b_bzF == dEr.field_9b1ab643_lDk.field_267cf5_Qnq) {
                        n7 = 1;
                        continue;
                    }
                    if (nMq.field_2e5f1b_bzF == dEr.field_d73ac430_yMz.field_267cf5_Qnq) {
                        n7 = 4;
                        continue;
                    }
                    if (nMq.field_2e5f1b_bzF == dEr.field_2653f0f8_uzC.field_267cf5_Qnq) {
                        n7 = 2;
                        continue;
                    }
                    if (nMq.field_2e5f1b_bzF != dEr.field_e405241a_mfU.field_267cf5_Qnq) continue;
                    n7 = 3;
                }
                int[] nArray = new int[arrayList.size()];
                for (int i = 0; i < nArray.length; ++i) {
                    nArray[i] = (Integer)arrayList.get(i);
                }
                ((WkD)object).method_fbde45f2_Dne("Colors", nArray);
                ((WkD)object).method_5ab43558_Dne("Type", (byte)n7);
                wkD.method_58996597_Dne("Explosion", (oNe)object);
                this.field_36a761a_Dne.method_66a36cd8_FWm(wkD);
                return true;
            }
            if (n2 == 0 && n == 0 && n4 == 1 && n3 > 0 && n3 == n5) {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                for (int i = 0; i < uqm.method_907a9d14_Qnq(); ++i) {
                    NMq nMq = uqm.method_9e6e1a08_Dne(i);
                    if (nMq == null) continue;
                    if (nMq.field_2e5f1b_bzF == dEr.field_5d50330c_edi.field_267cf5_Qnq) {
                        arrayList.add(AvN.field_3f1c589_Dne[nMq.method_907a9d14_Qnq()]);
                        continue;
                    }
                    if (nMq.field_2e5f1b_bzF != dEr.field_e3e9eb98_mte.field_267cf5_Qnq) continue;
                    this.field_36a761a_Dne = nMq.method_23040479_Dne();
                    this.field_36a761a_Dne.field_2092ae_Dne = 1;
                }
                int[] nArray = new int[arrayList.size()];
                for (int i = 0; i < nArray.length; ++i) {
                    nArray[i] = (Integer)arrayList.get(i);
                }
                if (this.field_36a761a_Dne != null && this.field_36a761a_Dne.method_a98a0664_aFZ()) {
                    WkD wkD = this.field_36a761a_Dne.method_230886fb_Dne().method_2851c945_Dne("Explosion");
                    if (wkD == null) {
                        return false;
                    }
                    wkD.method_fbde45f2_Dne("FadeColors", nArray);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public NMq method_23040479_Dne() {
        return this.field_36a761a_Dne;
    }
}

