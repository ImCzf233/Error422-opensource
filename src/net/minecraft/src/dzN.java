package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class dzN {
    private AAC field_3645aa9_Dne;
    private XHL field_36eea90_Dne;
    private final bkM field_202dc5a7_FWm;
    private final bkM field_373f9c8_Dne;
    protected int field_2092ae_Dne;
    private int field_2e5f1b_bzF = 0;
    private Set field_da244c89_FWm;
    private Set field_83b48b6a_Dne;
    private final jwh_0 field_3694131_Dne;
    private boolean field_2092bf_Dne;
    private boolean field_21261e_FWm;
    protected int field_21260d_FWm;
    public final List<PJQ> field_f27c122c_Dne = new ArrayList();
    private static final SimpleDateFormat field_ce40933e_Dne = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

    public int method_ae128dba_bzF() {
        return this.field_2092ae_Dne;
    }

    public void method_907a9d21_Qnq() {
        while (!this.field_f27c122c_Dne.isEmpty()) {
            ((PJQ)this.field_f27c122c_Dne.get((int)0)).field_36dacd0_Dne.method_8f501fe4_Dne("Server closed");
        }
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public void method_47a073d1_bzF(String string) {
        this.field_da244c89_FWm.add(string);
    }

    public void method_7ce8f7_Dne(NER nER, int n) {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            PJQ pJQ = (PJQ)this.field_f27c122c_Dne.get(i);
            if (pJQ.field_348572_qLR != n) continue;
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
        }
    }

    public PJQ method_51fe2c1b_Dne(PJQ pJQ, int n, boolean bl) {
        iSh iSh2;
        pJQ.method_2305a4ac_Dne().method_230e0484_Dne().method_7f92adf0_Dne(pJQ);
        pJQ.method_2305a4ac_Dne().method_230e0484_Dne().method_94d18be1_FWm(pJQ);
        pJQ.method_2305a4ac_Dne().method_231732d3_Dne().method_71877ce3_bzF(pJQ);
        this.field_f27c122c_Dne.remove(pJQ);
        this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR).method_3e501ff9_Qnq(pJQ);
        iSh iSh3 = pJQ.method_229c669a_bzF();
        boolean bl2 = pJQ.method_86921671_LVR();
        pJQ.field_348572_qLR = n;
        dyC dyC2 = this.field_3694131_Dne.method_baa39406_kGO() ? new OzV(this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR)) : new dyC(this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR));
        PJQ pJQ2 = new PJQ(this.field_3694131_Dne, this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR), pJQ.field_bc57ecbf_aFZ, dyC2);
        pJQ2.field_36dacd0_Dne = pJQ.field_36dacd0_Dne;
        pJQ2.method_961ec291_Dne(pJQ, bl);
        pJQ2.field_2d29f4_aFZ = pJQ.field_2d29f4_aFZ;
        RAN rAN = this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR);
        this.method_20cf12d3_Dne(pJQ2, pJQ, rAN);
        if (iSh3 != null) {
            iSh2 = FiG.method_f27881f7_Dne(this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR), iSh3, bl2);
            if (iSh2 != null) {
                pJQ2.method_9ce0fc65_FWm((float)iSh2.field_2092ae_Dne + 0.5f, (float)iSh2.field_21260d_FWm + 0.1f, (float)iSh2.field_2e5f1b_bzF + 0.5f, 0.0f, 0.0f);
                pJQ2.method_addf466b_Dne(iSh3, bl2);
            } else {
                pJQ2.field_36dacd0_Dne.method_7be2fb8c_Dne(new Tnn(0, 0));
            }
        }
        rAN.field_366d5ad_Dne.method_e1796070_FWm((int)pJQ2.field_2f0dd3_div >> 4, (int)pJQ2.field_334487_mrb >> 4);
        while (!rAN.method_d11d9a5_Dne(pJQ2, pJQ2.field_373a3ed_Dne).isEmpty()) {
            pJQ2.method_2961957_bzF(pJQ2.field_2f0dd3_div, pJQ2.field_22c5fd_IjH + 1.0, pJQ2.field_334487_mrb);
        }
        pJQ2.field_36dacd0_Dne.method_7be2fb8c_Dne(new fmA(pJQ2.field_348572_qLR, (byte)pJQ2.field_36c4f18_Dne.field_2d29f4_aFZ, pJQ2.field_36c4f18_Dne.method_231798c9_Dne().method_23111898_Dne(), pJQ2.field_36c4f18_Dne.method_7c6f602c_FWm(), pJQ2.field_37515de_Dne.method_230878ef_Dne()));
        iSh2 = rAN.method_23105fed_Dne();
        pJQ2.field_36dacd0_Dne.method_c38d48a4_Dne(pJQ2.field_2f0dd3_div, pJQ2.field_22c5fd_IjH, pJQ2.field_334487_mrb, pJQ2.field_334489_mrb, pJQ2.field_29186a_XHL);
        pJQ2.field_36dacd0_Dne.method_7be2fb8c_Dne(new ROw(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF));
        pJQ2.field_36dacd0_Dne.method_7be2fb8c_Dne(new WXC(pJQ2.field_30e9da_iNQ, pJQ2.field_332a64_mlD, pJQ2.field_2f0276_eHV));
        this.method_33570bd1_FWm(pJQ2, rAN);
        rAN.method_231732d3_Dne().method_7f92adf0_Dne(pJQ2);
        rAN.method_94d18be5_FWm(pJQ2);
        this.field_f27c122c_Dne.add(pJQ2);
        pJQ2.method_9a443a99_XHL();
        pJQ2.method_143f9e1c_bzF(pJQ2.method_9a443a8c_XHL());
        return pJQ2;
    }

    private void method_20cf12d3_Dne(PJQ pJQ, PJQ pJQ2, Qnq qnq) {
        if (pJQ2 != null) {
            pJQ.field_37515de_Dne.method_8d1afe0b_Dne(pJQ2.field_37515de_Dne.method_230878ef_Dne());
        } else if (this.field_36eea90_Dne != null) {
            pJQ.field_37515de_Dne.method_8d1afe0b_Dne(this.field_36eea90_Dne);
        }
        pJQ.field_37515de_Dne.method_666eb1cc_FWm(qnq.method_231798c9_Dne().method_230878ef_Dne());
    }

    public int method_7a46288d_Dne() {
        return wrs.method_ce7f5d9c_Dne(this.method_907a9d14_Qnq());
    }

    public void method_c229f287_Dne(RAN[] rANArray) {
        this.field_3645aa9_Dne = rANArray[0].method_23102361_Dne().method_22fde908_Dne();
    }

    public void method_72c38313_Dne(PJQ pJQ, int n) {
        int n2 = pJQ.field_348572_qLR;
        RAN rAN = this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR);
        pJQ.field_348572_qLR = n;
        RAN rAN2 = this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR);
        pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new fmA(pJQ.field_348572_qLR, (byte)pJQ.field_36c4f18_Dne.field_2d29f4_aFZ, rAN2.method_231798c9_Dne().method_23111898_Dne(), rAN2.method_7c6f602c_FWm(), pJQ.field_37515de_Dne.method_230878ef_Dne()));
        rAN.method_3e501ff9_Qnq(pJQ);
        pJQ.field_2a9ae7_Zpi = false;
        this.method_9b359c63_Dne(pJQ, n2, rAN, rAN2);
        this.method_73fb8ef2_Dne(pJQ, rAN);
        pJQ.field_36dacd0_Dne.method_c38d48a4_Dne(pJQ.field_2f0dd3_div, pJQ.field_22c5fd_IjH, pJQ.field_334487_mrb, pJQ.field_334489_mrb, pJQ.field_29186a_XHL);
        pJQ.field_37515de_Dne.method_827c2e88_Dne(rAN2);
        this.method_33570bd1_FWm(pJQ, rAN2);
        this.method_d3107bea_aFZ(pJQ);
        for (NAx nAx : pJQ.method_be5f586d_Dne()) {
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new ziQ(pJQ.field_2d29f4_aFZ, nAx));
        }
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_83b48b6a_Dne.add(string.toLowerCase());
    }

    public int method_907a9d14_Qnq() {
        return this.field_21260d_FWm;
    }

    protected void method_7f92adf0_Dne(PJQ pJQ) {
        this.field_3645aa9_Dne.method_703284a3_Dne(pJQ);
    }

    public void method_7c6f6039_FWm() {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            this.method_7f92adf0_Dne((PJQ)this.field_f27c122c_Dne.get(i));
        }
    }

    public bkM method_f883d846_FWm() {
        return this.field_202dc5a7_FWm;
    }

    public boolean method_110c4dc7_FWm(String string) {
        return this.field_83b48b6a_Dne.contains(string.trim().toLowerCase()) || this.field_3694131_Dne.method_9feec6c6_Zpi() && this.field_3694131_Dne.field_836263a8_Dne[0].method_231798c9_Dne().method_a98a0664_aFZ() && this.field_3694131_Dne.method_c50868a8_mrb().equalsIgnoreCase(string) || this.field_21261e_FWm;
    }

    public String[] method_e4d6f7c8_FWm() {
        return this.field_3694131_Dne.field_836263a8_Dne[0].method_23102361_Dne().method_22fde908_Dne().method_631ac9e9_Dne();
    }

    public List method_b6fd6de3_Dne(String string) {
        ArrayList<PJQ> arrayList = new ArrayList<PJQ>();
        for (PJQ pJQ : this.field_f27c122c_Dne) {
            if (!pJQ.method_d1f1ed87_FWm().equals(string)) continue;
            arrayList.add(pJQ);
        }
        return arrayList;
    }

    public List method_a42f18b7_Dne(iSh iSh2, int n, int n2, int n3, int n4, int n5, int n6, Map map, String string, String string2) {
        if (this.field_f27c122c_Dne.isEmpty()) {
            return null;
        }
        List list = new ArrayList();
        boolean bl = n3 < 0;
        int n7 = n * n;
        int n8 = n2 * n2;
        n3 = geR.method_ce7f5d9c_Dne(n3);
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            boolean bl2;
            PJQ pJQ = (PJQ)this.field_f27c122c_Dne.get(i);
            if (string != null) {
                bl2 = string.startsWith("!");
                if (bl2) {
                    string = string.substring(1);
                }
                if (bl2 == string.equalsIgnoreCase(pJQ.method_eecad346_Dne())) continue;
            }
            if (string2 != null) {
                YGE yGE;
                String string3;
                bl2 = string2.startsWith("!");
                if (bl2) {
                    string2 = string2.substring(1);
                }
                String string4 = string3 = (yGE = pJQ.method_2308e8b4_Dne()) == null ? "" : yGE.method_eecad346_Dne();
                if (bl2 == string2.equalsIgnoreCase(string3)) continue;
            }
            if (iSh2 != null && (n > 0 || n2 > 0)) {
                float f = iSh2.method_aac51d79_Dne(pJQ.method_23105fed_Dne());
                if (n > 0 && f < (float)n7 || n2 > 0 && f > (float)n8) continue;
            }
            if (!this.method_f4271c86_Dne(pJQ, map) || n4 != XHL.field_36eea90_Dne.method_7a46288d_Dne() && n4 != pJQ.field_37515de_Dne.method_230878ef_Dne().method_7a46288d_Dne() || n5 > 0 && pJQ.field_2f0276_eHV < n5 || pJQ.field_2f0276_eHV > n6) continue;
            ((List)list).add(pJQ);
        }
        if (iSh2 != null) {
            Collections.sort(list, new dTr(iSh2));
        }
        if (bl) {
            Collections.reverse(list);
        }
        if (n3 > 0) {
            list = ((List)list).subList(0, Math.min(n3, ((List)list).size()));
        }
        return list;
    }

    public Set method_d412ef09_Dne() {
        return this.field_da244c89_FWm;
    }

    public void method_73fb8ef2_Dne(PJQ pJQ, RAN rAN) {
        RAN rAN2 = pJQ.method_2305a4ac_Dne();
        if (rAN != null) {
            rAN.method_231732d3_Dne().method_71877ce3_bzF(pJQ);
        }
        rAN2.method_231732d3_Dne().method_7f92adf0_Dne(pJQ);
        rAN2.field_366d5ad_Dne.method_e1796070_FWm((int)pJQ.field_2f0dd3_div >> 4, (int)pJQ.field_334487_mrb >> 4);
    }

    public void method_33570bd1_FWm(PJQ pJQ, RAN rAN) {
        pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new uYm(rAN.method_7c6f602d_FWm(), rAN.method_ae128dbb_bzF()));
        if (rAN.method_ae128dcb_bzF()) {
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new Tnn(1, 0));
        }
    }

    public void method_a9a920ab_Qnq(String string) {
        this.field_da244c89_FWm.remove(string);
    }

    public void method_7be2fb8c_Dne(NER nER) {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            ((PJQ)this.field_f27c122c_Dne.get((int)i)).field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
        }
    }

    public int method_7c6f602c_FWm() {
        return this.field_f27c122c_Dne.size();
    }

    public String[] method_631ac9e9_Dne() {
        String[] stringArray = new String[this.field_f27c122c_Dne.size()];
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            stringArray[i] = ((PJQ)this.field_f27c122c_Dne.get((int)i)).field_bc57ecbf_aFZ;
        }
        return stringArray;
    }

    public PJQ method_284e205e_Dne(String string) {
        ArrayList<PJQ> arrayList = new ArrayList<PJQ>();
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            PJQ pJQ = (PJQ)this.field_f27c122c_Dne.get(i);
            if (!pJQ.field_bc57ecbf_aFZ.equalsIgnoreCase(string)) continue;
            arrayList.add(pJQ);
        }
        for (PJQ pJQ : arrayList) {
            pJQ.field_36dacd0_Dne.method_8f501fe4_Dne("You logged in from another location");
        }
        dyC dyC2 = this.field_3694131_Dne.method_baa39406_kGO() ? new OzV(this.field_3694131_Dne.method_9e6fba3b_Dne(0)) : new dyC(this.field_3694131_Dne.method_9e6fba3b_Dne(0));
        return new PJQ(this.field_3694131_Dne, this.field_3694131_Dne.method_9e6fba3b_Dne(0), string, dyC2);
    }

    public WkD method_230886fb_Dne() {
        return null;
    }

    public dzN(jwh_0 jwh_02) {
        this.field_373f9c8_Dne = new bkM(new File("banned-players.txt"));
        this.field_202dc5a7_FWm = new bkM(new File("banned-ips.txt"));
        this.field_83b48b6a_Dne = new HashSet();
        this.field_da244c89_FWm = new HashSet();
        this.field_3694131_Dne = jwh_02;
        this.field_373f9c8_Dne.method_ce7f9d7a_Dne(false);
        this.field_202dc5a7_FWm.method_ce7f9d7a_Dne(false);
        this.field_2092ae_Dne = 8;
    }

    public void method_8d6e9f26_Dne(FiG fiG, double d, double d2, double d3, double d4, int n, NER nER) {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            double d5;
            double d6;
            double d7;
            PJQ pJQ = (PJQ)this.field_f27c122c_Dne.get(i);
            if (pJQ == fiG || pJQ.field_348572_qLR != n || !((d7 = d - pJQ.field_2f0dd3_div) * d7 + (d6 = d2 - pJQ.field_22c5fd_IjH) * d6 + (d5 = d3 - pJQ.field_334487_mrb) * d5 < d4 * d4)) continue;
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
        }
    }

    private boolean method_f4271c86_Dne(FiG fiG, Map map) {
        if (map != null && map.size() != 0) {
            boolean bl;
            Map.Entry entry;
            int n;
            Iterator iterator = map.entrySet().iterator();
            do {
                SFA sFA;
                vfE vfE2;
                if (!iterator.hasNext()) {
                    return true;
                }
                entry = (Entry) iterator.next();
                String string = (String)entry.getKey();
                bl = false;
                if (string.endsWith("_min") && string.length() > 4) {
                    bl = true;
                    string = string.substring(0, string.length() - 4);
                }
                if ((vfE2 = (sFA = fiG.method_23062a3d_Dne()).method_285fce20_Dne(string)) == null) {
                    return false;
                }
                OHz oHz = fiG.method_23062a3d_Dne().method_938dc1b8_Dne(fiG.method_eecad346_Dne(), vfE2);
                n = oHz.method_7a46288d_Dne();
                if (n >= (Integer)entry.getValue() || !bl) continue;
                return false;
            } while (n <= (Integer)entry.getValue() || bl);
            return false;
        }
        return true;
    }

    protected void method_8f14216e_Dne(kXX kXX2, PJQ pJQ) {
        HashSet<vfE> hashSet = new HashSet<vfE>();
        for (YGE yGE : kXX2.method_4485f267_aFZ()) {
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new SPR(yGE, 0));
        }
        for (int i = 0; i < 3; ++i) {
            vfE vfE2 = kXX2.method_9e80a165_Dne(i);
            if (vfE2 == null || hashSet.contains(vfE2)) continue;
            List<NER> list = kXX2.method_6ced4d5_Dne(vfE2);
            for (NER nER : list) {
                pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
            }
            hashSet.add(vfE2);
        }
    }

    public bkM method_230d8827_Dne() {
        return this.field_373f9c8_Dne;
    }

    public void method_264f5c9_Qnq(PJQ pJQ) {
        this.method_7f92adf0_Dne(pJQ);
        RAN rAN = pJQ.method_2305a4ac_Dne();
        if (pJQ.field_203511c4_FWm != null) {
            rAN.method_ad72a713_bzF(pJQ.field_203511c4_FWm);
            System.out.println("removing player mount");
        }
        rAN.method_ad72a713_bzF(pJQ);
        rAN.method_231732d3_Dne().method_71877ce3_bzF(pJQ);
        this.field_f27c122c_Dne.remove(pJQ);
        this.method_7be2fb8c_Dne(new fPl(pJQ.field_bc57ecbf_aFZ, false, 9999));
    }

    public void method_9b359c63_Dne(sMa sMa2, int n, RAN rAN, RAN rAN2) {
        double d = sMa2.field_2f0dd3_div;
        double d2 = sMa2.field_334487_mrb;
        double d3 = 8.0;
        double d4 = sMa2.field_2f0dd3_div;
        double d5 = sMa2.field_22c5fd_IjH;
        double d6 = sMa2.field_334487_mrb;
        float f = sMa2.field_334489_mrb;
        rAN.field_365731d_Dne.method_8f501fe4_Dne("moving");
        if (sMa2.field_348572_qLR == -1) {
            sMa2.method_9ce0fc65_FWm(d /= d3, sMa2.field_22c5fd_IjH, d2 /= d3, sMa2.field_334489_mrb, sMa2.field_29186a_XHL);
            if (sMa2.method_cd4cb3d9_udO()) {
                rAN.method_b43ddeb4_Dne(sMa2, false);
            }
        } else if (sMa2.field_348572_qLR == 0) {
            sMa2.method_9ce0fc65_FWm(d *= d3, sMa2.field_22c5fd_IjH, d2 *= d3, sMa2.field_334489_mrb, sMa2.field_29186a_XHL);
            if (sMa2.method_cd4cb3d9_udO()) {
                rAN.method_b43ddeb4_Dne(sMa2, false);
            }
        } else {
            iSh iSh2 = n == 1 ? rAN2.method_23105fed_Dne() : rAN2.method_f886b00c_FWm();
            d = iSh2.field_2092ae_Dne;
            sMa2.field_22c5fd_IjH = iSh2.field_21260d_FWm;
            d2 = iSh2.field_2e5f1b_bzF;
            sMa2.method_9ce0fc65_FWm(d, sMa2.field_22c5fd_IjH, d2, 90.0f, 0.0f);
            if (sMa2.method_cd4cb3d9_udO()) {
                rAN.method_b43ddeb4_Dne(sMa2, false);
            }
        }
        rAN.field_365731d_Dne.method_7c6f6039_FWm();
        if (n != 1) {
            rAN.field_365731d_Dne.method_8f501fe4_Dne("placing");
            d = geR.method_2c2cf7bc_Dne((int)d, -29999872, 29999872);
            d2 = geR.method_2c2cf7bc_Dne((int)d2, -29999872, 29999872);
            if (sMa2.method_cd4cb3d9_udO()) {
                rAN2.method_94d18be5_FWm(sMa2);
                sMa2.method_9ce0fc65_FWm(d, sMa2.field_22c5fd_IjH, d2, sMa2.field_334489_mrb, sMa2.field_29186a_XHL);
                rAN2.method_b43ddeb4_Dne(sMa2, false);
                rAN2.method_2315d1d6_Dne().method_c7c9ef22_Dne(sMa2, d4, d5, d6, f);
            }
            rAN.field_365731d_Dne.method_7c6f6039_FWm();
        }
        sMa2.method_83516093_Dne(rAN2);
    }

    public void method_7a46289a_Dne() {
        if (++this.field_2e5f1b_bzF > 600) {
            this.field_2e5f1b_bzF = 0;
        }
        if (this.field_2e5f1b_bzF < this.field_f27c122c_Dne.size()) {
            PJQ pJQ = (PJQ)this.field_f27c122c_Dne.get(this.field_2e5f1b_bzF);
            this.method_7be2fb8c_Dne(new fPl(pJQ.field_bc57ecbf_aFZ, true, pJQ.field_2092ae_Dne));
        }
    }

    public void method_58e661b1_FWm(PJQ pJQ) {
        this.method_7be2fb8c_Dne(new fPl(pJQ.field_bc57ecbf_aFZ, true, 1000));
        this.field_f27c122c_Dne.add(pJQ);
        RAN rAN = this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR);
        rAN.method_94d18be5_FWm(pJQ);
        this.method_73fb8ef2_Dne(pJQ, null);
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            PJQ pJQ2 = (PJQ)this.field_f27c122c_Dne.get(i);
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new fPl(pJQ2.field_bc57ecbf_aFZ, true, pJQ2.field_2092ae_Dne));
        }
    }

    public void method_110c4dc3_FWm(String string) {
        this.field_83b48b6a_Dne.remove(string.toLowerCase());
    }

    public void method_8d1afe0b_Dne(XHL xHL) {
        this.field_36eea90_Dne = xHL;
    }

    public void method_a23afa5d_Dne(double d, double d2, double d3, double d4, int n, NER nER) {
        this.method_8d6e9f26_Dne(null, d, d2, d3, d4, n, nER);
    }

    public Set method_4d96e468_FWm() {
        return this.field_83b48b6a_Dne;
    }

    public String method_9e765aef_Dne(SocketAddress socketAddress, String string) {
        if (this.field_373f9c8_Dne.method_8f501fe8_Dne(string)) {
            eHI eHI2 = (eHI)this.field_373f9c8_Dne.method_d410254f_Dne().get(string);
            String string2 = "You are banned from this server!\nReason: " + eHI2.method_6859cdb9_bzF();
            if (eHI2.method_64707bde_FWm() != null) {
                string2 = string2 + "\nYour ban will be removed on " + field_ce40933e_Dne.format(eHI2.method_64707bde_FWm());
            }
            return string2;
        }
        if (!this.method_8f501fe8_Dne(string)) {
            return "You are not white-listed on this server!";
        }
        String string3 = socketAddress.toString();
        string3 = string3.substring(string3.indexOf("/") + 1);
        if (this.field_202dc5a7_FWm.method_8f501fe8_Dne(string3 = string3.substring(0, string3.indexOf(":")))) {
            eHI eHI3 = (eHI)this.field_202dc5a7_FWm.method_d410254f_Dne().get(string3);
            String string4 = "Your IP address is banned from this server!\nReason: " + eHI3.method_6859cdb9_bzF();
            if (eHI3.method_64707bde_FWm() != null) {
                string4 = string4 + "\nYour ban will be removed on " + field_ce40933e_Dne.format(eHI3.method_64707bde_FWm());
            }
            return string4;
        }
        return this.field_f27c122c_Dne.size() >= this.field_2092ae_Dne ? "The server is full!" : null;
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_21261e_FWm = bl;
    }

    public void method_ae128dc7_bzF() {
    }

    public void method_71877ce3_bzF(PJQ pJQ) {
        pJQ.method_2305a4ac_Dne().method_231732d3_Dne().method_264f5c9_Qnq(pJQ);
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public PJQ method_f27246bd_FWm(String string) {
        PJQ pJQ;
        Iterator iterator = this.field_f27c122c_Dne.iterator();
        do {
            if (!iterator.hasNext()) {
                return null;
            }
            pJQ = (PJQ)iterator.next();
        } while (!pJQ.field_bc57ecbf_aFZ.equalsIgnoreCase(string));
        return pJQ;
    }

    public void method_bbfe582a_aFZ(String string) {
        this.field_3694131_Dne.method_b33f04a1_a_(string);
        this.method_7be2fb8c_Dne(new rXx(string));
    }

    public String method_eecad346_Dne() {
        String string = "";
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            if (i > 0) {
                string = string + ", ";
            }
            string = string + ((PJQ)this.field_f27c122c_Dne.get((int)i)).field_bc57ecbf_aFZ;
        }
        return string;
    }

    public void method_207cbea3_Dne(RXf rXf, PJQ pJQ) {
        Object object2;
        WkD wkD = this.method_f9467151_Dne(pJQ);
        pJQ.method_83516093_Dne(this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR));
        pJQ.field_37515de_Dne.method_827c2e88_Dne((RAN)pJQ.field_36c4f18_Dne);
        String string = "local";
        if (rXf.method_81c690a9_Dne() != null) {
            string = rXf.method_81c690a9_Dne().toString();
        }
        this.field_3694131_Dne.method_230e0120_Dne().method_8f501fe4_Dne(pJQ.field_bc57ecbf_aFZ + "[" + string + "] logged in with entity id " + pJQ.field_2d29f4_aFZ + " at (" + pJQ.field_2f0dd3_div + ", " + pJQ.field_22c5fd_IjH + ", " + pJQ.field_334487_mrb + ")");
        RAN rAN = this.field_3694131_Dne.method_9e6fba3b_Dne(pJQ.field_348572_qLR);
        iSh iSh2 = rAN.method_23105fed_Dne();
        this.method_20cf12d3_Dne(pJQ, null, rAN);
        Tnv tnv = new Tnv(this.field_3694131_Dne, rXf, pJQ);
        tnv.method_7be2fb8c_Dne(new VPw(pJQ.field_2d29f4_aFZ, rAN.method_231798c9_Dne().method_23111898_Dne(), pJQ.field_37515de_Dne.method_230878ef_Dne(), rAN.method_231798c9_Dne().method_907a9d25_Qnq(), rAN.field_3690d00_Dne.field_2092ae_Dne, rAN.field_2d29f4_aFZ, rAN.method_7c6f602c_FWm(), this.method_ae128dba_bzF()));
        tnv.method_7be2fb8c_Dne(new ROw(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF));
        tnv.method_7be2fb8c_Dne(new pSe(pJQ.field_37cb681_Dne));
        tnv.method_7be2fb8c_Dne(new aig(pJQ.field_36a059b_Dne.field_2092ae_Dne));
        this.method_8f14216e_Dne((kXX)rAN.method_23062a3d_Dne(), pJQ);
        this.method_33570bd1_FWm(pJQ, rAN);
        this.method_7be2fb8c_Dne(new rXx((Object)((Object)Dne.field_ab1f2987_ooe) + pJQ.method_c6f17a40_aFZ() + (Object)((Object)Dne.field_ab1f2987_ooe) + " joined the game."));
        this.method_58e661b1_FWm(pJQ);
        tnv.method_c38d48a4_Dne(pJQ.field_2f0dd3_div, pJQ.field_22c5fd_IjH, pJQ.field_334487_mrb, pJQ.field_334489_mrb, pJQ.field_29186a_XHL);
        this.field_3694131_Dne.method_230496c1_Dne().method_8872304b_Dne(tnv);
        tnv.method_7be2fb8c_Dne(new uYm(rAN.method_7c6f602d_FWm(), rAN.method_ae128dbb_bzF()));
        if (this.field_3694131_Dne.method_8e7d4a1e_Zpi().length() > 0) {
            pJQ.method_5ab44f9f_Dne(this.field_3694131_Dne.method_8e7d4a1e_Zpi(), this.field_3694131_Dne.method_7ad387f6_DyG());
        }
        for (Object object : pJQ.method_be5f586d_Dne()) {
            tnv.method_7be2fb8c_Dne(new ziQ(pJQ.field_2d29f4_aFZ, (NAx)object));
        }
        pJQ.method_9a443a99_XHL();
        if (wkD != null && wkD.method_8f501fe8_Dne("Riding") && (object2 = Klb.method_a1f613e0_Dne(wkD.method_2851c945_Dne("Riding"), rAN)) != null) {
            ((sMa)object2).field_267d06_Qnq = true;
            rAN.method_94d18be5_FWm((sMa)object2);
            pJQ.method_ad72a713_bzF((sMa)object2);
            ((sMa)object2).field_267d06_Qnq = false;
        }
    }

    public void method_d3107bea_aFZ(PJQ pJQ) {
        pJQ.method_8108cb59_Dne(pJQ.field_36bb35e_Dne);
        pJQ.method_cc5ef5c0_trS();
        pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new aig(pJQ.field_36a059b_Dne.field_2092ae_Dne));
    }

    public boolean method_8f501fe8_Dne(String string) {
        string = string.trim().toLowerCase();
        return !this.field_2092bf_Dne || this.field_83b48b6a_Dne.contains(string) || this.field_da244c89_FWm.contains(string);
    }

    public jwh_0 method_2302cf90_Dne() {
        return this.field_3694131_Dne;
    }

    public WkD method_f9467151_Dne(PJQ pJQ) {
        WkD wkD;
        WkD wkD2 = this.field_3694131_Dne.field_836263a8_Dne[0].method_231798c9_Dne().method_f87ed71a_FWm();
        if (pJQ.method_193de2e9_a_().equals(this.field_3694131_Dne.method_c50868a8_mrb()) && wkD2 != null) {
            pJQ.method_102200f0_Qnq(wkD2);
            wkD = wkD2;
            System.out.println("loading single player");
        } else {
            wkD = this.field_3645aa9_Dne.method_53e5b684_Dne(pJQ);
        }
        return wkD;
    }
}

