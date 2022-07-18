package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class phC {
    public int field_22c602_IjH = 0;
    public double field_2e5f16_bzF;
    public int field_388da6_zGp;
    private double field_267cf0_Qnq;
    public int field_2092ae_Dne;
    public Set<PJQ> field_83b48b6a_Dne = new HashSet();
    public boolean field_2092bf_Dne = false;
    public int field_2d29f4_aFZ;
    public int field_2e5f1b_bzF;
    public int field_20b857_DyG;
    private int field_33448c_mrb = 0;
    public double field_212608_FWm;
    public int field_267cf5_Qnq;
    private boolean field_267d06_Qnq = false;
    private boolean field_2e5f2c_bzF;
    public sMa field_37b45e5_Dne;
    public double field_2092a9_Dne;
    public int field_21260d_FWm;
    private boolean field_21261e_FWm = false;
    public int field_2f0dd8_div;
    private double field_2d29ef_aFZ;
    private double field_388da1_zGp;
    private sMa field_203511c4_FWm;

    public phC(sMa sMa2, int n, int n2, boolean bl) {
        this.field_37b45e5_Dne = sMa2;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f2c_bzF = bl;
        this.field_2e5f1b_bzF = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div * 32.0);
        this.field_267cf5_Qnq = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH * 32.0);
        this.field_2d29f4_aFZ = geR.method_117d0718_FWm(sMa2.field_334487_mrb * 32.0);
        this.field_388da6_zGp = geR.method_ce7f5259_Dne(sMa2.field_334489_mrb * 256.0f / 360.0f);
        this.field_20b857_DyG = geR.method_ce7f5259_Dne(sMa2.field_29186a_XHL * 256.0f / 360.0f);
        this.field_2f0dd8_div = geR.method_ce7f5259_Dne(sMa2.method_a98a0650_aFZ() * 256.0f / 360.0f);
    }

    public void method_7f92adf0_Dne(PJQ pJQ) {
        if (this.field_83b48b6a_Dne.contains(pJQ)) {
            pJQ.field_6a0474ed_FWm.add(this.field_37b45e5_Dne.field_2d29f4_aFZ);
            this.field_83b48b6a_Dne.remove(pJQ);
        }
    }

    public void method_5536af4d_FWm(NER nER) {
        this.method_7be2fb8c_Dne(nER);
        if (this.field_37b45e5_Dne instanceof PJQ) {
            ((PJQ)this.field_37b45e5_Dne).field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
        }
    }

    public boolean equals(Object object) {
        return object instanceof phC ? ((phC)object).field_37b45e5_Dne.field_2d29f4_aFZ == this.field_37b45e5_Dne.field_2d29f4_aFZ : false;
    }

    public void method_12705b2a_FWm(List list) {
        for (int i = 0; i < list.size(); ++i) {
            this.method_58e661b1_FWm((PJQ)list.get(i));
        }
    }

    public void method_58e661b1_FWm(PJQ pJQ) {
        if (pJQ != this.field_37b45e5_Dne) {
            double d = pJQ.field_2f0dd3_div - (double)(this.field_2e5f1b_bzF / 32);
            double d2 = pJQ.field_334487_mrb - (double)(this.field_2d29f4_aFZ / 32);
            if (d >= (double)(-this.field_2092ae_Dne) && d <= (double)this.field_2092ae_Dne && d2 >= (double)(-this.field_2092ae_Dne) && d2 <= (double)this.field_2092ae_Dne) {
                if (!this.field_83b48b6a_Dne.contains(pJQ) && (this.method_7f92adf4_Dne(pJQ) || this.field_37b45e5_Dne.field_267d06_Qnq)) {
                    FiG fiG;
                    this.field_83b48b6a_Dne.add(pJQ);
                    NER nER = this.method_2303e2b0_Dne();
                    pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
                    if (!this.field_37b45e5_Dne.method_23123967_Dne().method_7c6f603d_FWm()) {
                        pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new SnO(this.field_37b45e5_Dne.field_2d29f4_aFZ, this.field_37b45e5_Dne.method_23123967_Dne(), true));
                    }
                    this.field_2092a9_Dne = this.field_37b45e5_Dne.field_291868_XHL;
                    this.field_212608_FWm = this.field_37b45e5_Dne.field_2a9ad1_Zpi;
                    this.field_2e5f16_bzF = this.field_37b45e5_Dne.field_31b811_kGO;
                    if (this.field_2e5f2c_bzF && !(nER instanceof QZR)) {
                        pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new wFl(this.field_37b45e5_Dne.field_2d29f4_aFZ, this.field_37b45e5_Dne.field_291868_XHL, this.field_37b45e5_Dne.field_2a9ad1_Zpi, this.field_37b45e5_Dne.field_31b811_kGO));
                    }
                    if (this.field_37b45e5_Dne.field_203511c4_FWm != null) {
                        pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new YVz(this.field_37b45e5_Dne, this.field_37b45e5_Dne.field_203511c4_FWm));
                    }
                    if (this.field_37b45e5_Dne instanceof FUH) {
                        for (int i = 0; i < 5; ++i) {
                            NMq nMq = ((FUH)this.field_37b45e5_Dne).method_9e6e1a08_Dne(i);
                            if (nMq == null) continue;
                            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new qHm(this.field_37b45e5_Dne.field_2d29f4_aFZ, i, nMq));
                        }
                    }
                    if (this.field_37b45e5_Dne instanceof FiG && (fiG = (FiG)this.field_37b45e5_Dne).method_9b310ff4_Wwe()) {
                        pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new kwp(this.field_37b45e5_Dne, 0, geR.method_117d0718_FWm(this.field_37b45e5_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_37b45e5_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_37b45e5_Dne.field_334487_mrb)));
                    }
                    if (this.field_37b45e5_Dne instanceof FUH) {
                        FUH fUH = (FUH)this.field_37b45e5_Dne;
                        for (NAx nAx : fUH.method_be5f586d_Dne()) {
                            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new ziQ(this.field_37b45e5_Dne.field_2d29f4_aFZ, nAx));
                        }
                    }
                }
            } else if (this.field_83b48b6a_Dne.contains(pJQ)) {
                this.field_83b48b6a_Dne.remove(pJQ);
                pJQ.field_6a0474ed_FWm.add(this.field_37b45e5_Dne.field_2d29f4_aFZ);
            }
        }
    }

    private boolean method_7f92adf4_Dne(PJQ pJQ) {
        return pJQ.method_2305a4ac_Dne().method_231732d3_Dne().method_e5ad5254_Dne(pJQ, this.field_37b45e5_Dne.field_22c602_IjH, this.field_37b45e5_Dne.field_29186d_XHL);
    }

    private NER method_2303e2b0_Dne() {
        if (this.field_37b45e5_Dne.field_2a9ae7_Zpi) {
            this.field_37b45e5_Dne.field_36c4f18_Dne.method_230e0120_Dne().method_110c4dc3_FWm("Fetching addPacket for removed entity");
        }
        if (this.field_37b45e5_Dne instanceof JiM) {
            return new wXa(this.field_37b45e5_Dne, 2, 1);
        }
        if (this.field_37b45e5_Dne instanceof PJQ) {
            return new MwE((FiG)this.field_37b45e5_Dne);
        }
        if (this.field_37b45e5_Dne instanceof Ebp) {
            Ebp ebp = (Ebp)this.field_37b45e5_Dne;
            return new wXa(this.field_37b45e5_Dne, 10, ebp.method_9a443a8c_XHL());
        }
        if (this.field_37b45e5_Dne instanceof iMX) {
            return new wXa(this.field_37b45e5_Dne, 1);
        }
        if (!(this.field_37b45e5_Dne instanceof NbA) && !(this.field_37b45e5_Dne instanceof WSC)) {
            if (this.field_37b45e5_Dne instanceof cQz) {
                FiG fiG = ((cQz)this.field_37b45e5_Dne).field_3673728_Dne;
                return new wXa(this.field_37b45e5_Dne, 90, fiG != null ? fiG.field_2d29f4_aFZ : this.field_37b45e5_Dne.field_2d29f4_aFZ);
            }
            if (this.field_37b45e5_Dne instanceof hhc) {
                sMa sMa2 = ((hhc)this.field_37b45e5_Dne).field_75c313d2_bzF;
                return new wXa(this.field_37b45e5_Dne, 60, sMa2 != null ? sMa2.field_2d29f4_aFZ : this.field_37b45e5_Dne.field_2d29f4_aFZ);
            }
            if (this.field_37b45e5_Dne instanceof kxx_0) {
                return new wXa(this.field_37b45e5_Dne, 61);
            }
            if (this.field_37b45e5_Dne instanceof YgL) {
                return new wXa(this.field_37b45e5_Dne, 73, ((YgL)this.field_37b45e5_Dne).method_7a46288d_Dne());
            }
            if (this.field_37b45e5_Dne instanceof AEw) {
                return new wXa(this.field_37b45e5_Dne, 75);
            }
            if (this.field_37b45e5_Dne instanceof Hhj) {
                return new wXa(this.field_37b45e5_Dne, 65);
            }
            if (this.field_37b45e5_Dne instanceof UMP) {
                return new wXa(this.field_37b45e5_Dne, 72);
            }
            if (this.field_37b45e5_Dne instanceof zMx) {
                return new wXa(this.field_37b45e5_Dne, 76);
            }
            if (this.field_37b45e5_Dne instanceof Tdr) {
                Tdr tdr = (Tdr)this.field_37b45e5_Dne;
                wXa wXa2 = null;
                int n = 63;
                if (this.field_37b45e5_Dne instanceof Xzh) {
                    n = 64;
                } else if (this.field_37b45e5_Dne instanceof YCH) {
                    n = 66;
                }
                wXa2 = tdr.field_366ec33_Dne != null ? new wXa(this.field_37b45e5_Dne, n, ((Tdr)this.field_37b45e5_Dne).field_366ec33_Dne.field_2d29f4_aFZ) : new wXa(this.field_37b45e5_Dne, n, 0);
                wXa2.field_2d29f4_aFZ = (int)(tdr.field_2092a9_Dne * 8000.0);
                wXa2.field_388da6_zGp = (int)(tdr.field_212608_FWm * 8000.0);
                wXa2.field_20b857_DyG = (int)(tdr.field_2e5f16_bzF * 8000.0);
                return wXa2;
            }
            if (this.field_37b45e5_Dne instanceof TCA) {
                return new wXa(this.field_37b45e5_Dne, 62);
            }
            if (this.field_37b45e5_Dne instanceof gqg) {
                return new wXa(this.field_37b45e5_Dne, 50);
            }
            if (this.field_37b45e5_Dne instanceof Ndk) {
                return new wXa(this.field_37b45e5_Dne, 51);
            }
            if (this.field_37b45e5_Dne instanceof CiF) {
                CiF ciF = (CiF)this.field_37b45e5_Dne;
                return new wXa(this.field_37b45e5_Dne, 70, ciF.field_2092ae_Dne | ciF.field_21260d_FWm << 16);
            }
            if (this.field_37b45e5_Dne instanceof JCd) {
                return new bia((JCd)this.field_37b45e5_Dne);
            }
            if (this.field_37b45e5_Dne instanceof BPY) {
                BPY bPY = (BPY)this.field_37b45e5_Dne;
                wXa wXa3 = new wXa(this.field_37b45e5_Dne, 71, bPY.field_2092ae_Dne);
                wXa3.field_21260d_FWm = geR.method_ce7f5259_Dne(bPY.field_21260d_FWm * 32);
                wXa3.field_2e5f1b_bzF = geR.method_ce7f5259_Dne(bPY.field_2e5f1b_bzF * 32);
                wXa3.field_267cf5_Qnq = geR.method_ce7f5259_Dne(bPY.field_267cf5_Qnq * 32);
                return wXa3;
            }
            if (this.field_37b45e5_Dne instanceof alg) {
                return new mPe((alg)this.field_37b45e5_Dne);
            }
            throw new IllegalArgumentException("Don't know how to add " + this.field_37b45e5_Dne.getClass() + "!");
        }
        this.field_2f0dd8_div = geR.method_ce7f5259_Dne(this.field_37b45e5_Dne.method_a98a0650_aFZ() * 256.0f / 360.0f);
        return new QZR((FUH)this.field_37b45e5_Dne);
    }

    public void method_ea14418b_Dne(List<FiG> list) {
        this.field_2092bf_Dne = false;
        if (!this.field_21261e_FWm || this.field_37b45e5_Dne.method_2be42992_Dne(this.field_267cf0_Qnq, this.field_2d29ef_aFZ, this.field_388da1_zGp) > 16.0) {
            this.field_267cf0_Qnq = this.field_37b45e5_Dne.field_2f0dd3_div;
            this.field_2d29ef_aFZ = this.field_37b45e5_Dne.field_22c5fd_IjH;
            this.field_388da1_zGp = this.field_37b45e5_Dne.field_334487_mrb;
            this.field_21261e_FWm = true;
            this.field_2092bf_Dne = true;
            this.method_12705b2a_FWm(list);
        }
        if (this.field_203511c4_FWm != this.field_37b45e5_Dne.field_203511c4_FWm || this.field_37b45e5_Dne.field_203511c4_FWm != null && this.field_22c602_IjH % 60 == 0) {
            this.field_203511c4_FWm = this.field_37b45e5_Dne.field_203511c4_FWm;
            this.method_7be2fb8c_Dne(new YVz(this.field_37b45e5_Dne, this.field_37b45e5_Dne.field_203511c4_FWm));
        }
        if (this.field_37b45e5_Dne instanceof BPY && this.field_22c602_IjH % 10 == 0) {
            Object object;
            BPY bPY = (BPY)this.field_37b45e5_Dne;
            NMq nMq = bPY.method_23040479_Dne();
            if (nMq != null && nMq.method_230de6ba_Dne() instanceof mva) {
                object = dEr.field_3792594_Dne.method_ee3739a1_Dne(nMq, this.field_37b45e5_Dne.field_36c4f18_Dne);
                for (FiG fiG : list) {
                    NER nER;
                    PJQ pJQ = (PJQ)fiG;
                    ((Ilk)object).method_672a90ac_Dne(pJQ, nMq);
                    if (pJQ.field_36dacd0_Dne.method_7a46288d_Dne() > 5 || (nER = dEr.field_3792594_Dne.method_d41ff59b_Dne(nMq, this.field_37b45e5_Dne.field_36c4f18_Dne, pJQ)) == null) continue;
                    pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
                }
            }
            if (((luM)(object = this.field_37b45e5_Dne.method_23123967_Dne())).method_7a46289e_Dne()) {
                this.method_5536af4d_FWm(new SnO(this.field_37b45e5_Dne.field_2d29f4_aFZ, (luM)object, false));
            }
        } else if (this.field_22c602_IjH % this.field_21260d_FWm == 0 || this.field_37b45e5_Dne.field_1ed028_ATE || this.field_37b45e5_Dne.method_23123967_Dne().method_7a46289e_Dne()) {
            int n;
            if (this.field_37b45e5_Dne.field_203511c4_FWm == null) {
                luM luM2;
                double d;
                double d2;
                double d3;
                double d4;
                double d5;
                boolean bl;
                ++this.field_33448c_mrb;
                n = this.field_37b45e5_Dne.field_373e877_Dne.method_ce7f4ad7_Dne(this.field_37b45e5_Dne.field_2f0dd3_div);
                int n2 = geR.method_117d0718_FWm(this.field_37b45e5_Dne.field_22c5fd_IjH * 32.0);
                int n3 = this.field_37b45e5_Dne.field_373e877_Dne.method_ce7f4ad7_Dne(this.field_37b45e5_Dne.field_334487_mrb);
                int n4 = geR.method_ce7f5259_Dne(this.field_37b45e5_Dne.field_334489_mrb * 256.0f / 360.0f);
                int n5 = geR.method_ce7f5259_Dne(this.field_37b45e5_Dne.field_29186a_XHL * 256.0f / 360.0f);
                int n6 = n - this.field_2e5f1b_bzF;
                int n7 = n2 - this.field_267cf5_Qnq;
                int n8 = n3 - this.field_2d29f4_aFZ;
                NER nER = null;
                boolean bl2 = Math.abs(n6) >= 4 || Math.abs(n7) >= 4 || Math.abs(n8) >= 4 || this.field_22c602_IjH % 60 == 0;
                boolean bl3 = bl = Math.abs(n4 - this.field_388da6_zGp) >= 4 || Math.abs(n5 - this.field_20b857_DyG) >= 4;
                if (this.field_22c602_IjH > 0 || this.field_37b45e5_Dne instanceof hhc) {
                    if (n6 >= -128 && n6 < 128 && n7 >= -128 && n7 < 128 && n8 >= -128 && n8 < 128 && this.field_33448c_mrb <= 400 && !this.field_267d06_Qnq) {
                        if (bl2 && bl) {
                            nER = new DyR(this.field_37b45e5_Dne.field_2d29f4_aFZ, (byte)n6, (byte)n7, (byte)n8, (byte)n4, (byte)n5);
                        } else if (bl2) {
                            nER = new GKq(this.field_37b45e5_Dne.field_2d29f4_aFZ, (byte)n6, (byte)n7, (byte)n8);
                        } else if (bl) {
                            nER = new wXr(this.field_37b45e5_Dne.field_2d29f4_aFZ, (byte)n4, (byte)n5);
                        }
                    } else {
                        this.field_33448c_mrb = 0;
                        nER = new NVL(this.field_37b45e5_Dne.field_2d29f4_aFZ, n, n2, n3, (byte)n4, (byte)n5);
                    }
                }
                if (this.field_2e5f2c_bzF && ((d5 = (d4 = this.field_37b45e5_Dne.field_291868_XHL - this.field_2092a9_Dne) * d4 + (d3 = this.field_37b45e5_Dne.field_2a9ad1_Zpi - this.field_212608_FWm) * d3 + (d2 = this.field_37b45e5_Dne.field_31b811_kGO - this.field_2e5f16_bzF) * d2) > (d = 0.02) * d || d5 > 0.0 && this.field_37b45e5_Dne.field_291868_XHL == 0.0 && this.field_37b45e5_Dne.field_2a9ad1_Zpi == 0.0 && this.field_37b45e5_Dne.field_31b811_kGO == 0.0)) {
                    this.field_2092a9_Dne = this.field_37b45e5_Dne.field_291868_XHL;
                    this.field_212608_FWm = this.field_37b45e5_Dne.field_2a9ad1_Zpi;
                    this.field_2e5f16_bzF = this.field_37b45e5_Dne.field_31b811_kGO;
                    this.method_7be2fb8c_Dne(new wFl(this.field_37b45e5_Dne.field_2d29f4_aFZ, this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF));
                }
                if (nER != null) {
                    this.method_7be2fb8c_Dne(nER);
                }
                if ((luM2 = this.field_37b45e5_Dne.method_23123967_Dne()).method_7a46289e_Dne()) {
                    this.method_5536af4d_FWm(new SnO(this.field_37b45e5_Dne.field_2d29f4_aFZ, luM2, false));
                }
                if (bl2) {
                    this.field_2e5f1b_bzF = n;
                    this.field_267cf5_Qnq = n2;
                    this.field_2d29f4_aFZ = n3;
                }
                if (bl) {
                    this.field_388da6_zGp = n4;
                    this.field_20b857_DyG = n5;
                }
                this.field_267d06_Qnq = false;
            } else {
                boolean bl;
                n = geR.method_ce7f5259_Dne(this.field_37b45e5_Dne.field_334489_mrb * 256.0f / 360.0f);
                int n9 = geR.method_ce7f5259_Dne(this.field_37b45e5_Dne.field_29186a_XHL * 256.0f / 360.0f);
                boolean bl4 = bl = Math.abs(n - this.field_388da6_zGp) >= 4 || Math.abs(n9 - this.field_20b857_DyG) >= 4;
                if (bl) {
                    this.method_7be2fb8c_Dne(new wXr(this.field_37b45e5_Dne.field_2d29f4_aFZ, (byte)n, (byte)n9));
                    this.field_388da6_zGp = n;
                    this.field_20b857_DyG = n9;
                }
                this.field_2e5f1b_bzF = this.field_37b45e5_Dne.field_373e877_Dne.method_ce7f4ad7_Dne(this.field_37b45e5_Dne.field_2f0dd3_div);
                this.field_267cf5_Qnq = geR.method_117d0718_FWm(this.field_37b45e5_Dne.field_22c5fd_IjH * 32.0);
                this.field_2d29f4_aFZ = this.field_37b45e5_Dne.field_373e877_Dne.method_ce7f4ad7_Dne(this.field_37b45e5_Dne.field_334487_mrb);
                luM luM3 = this.field_37b45e5_Dne.method_23123967_Dne();
                if (luM3.method_7a46289e_Dne()) {
                    this.method_5536af4d_FWm(new SnO(this.field_37b45e5_Dne.field_2d29f4_aFZ, luM3, false));
                }
                this.field_267d06_Qnq = true;
            }
            n = geR.method_ce7f5259_Dne(this.field_37b45e5_Dne.method_a98a0650_aFZ() * 256.0f / 360.0f);
            if (Math.abs(n - this.field_2f0dd8_div) >= 4) {
                this.method_7be2fb8c_Dne(new eNn(this.field_37b45e5_Dne.field_2d29f4_aFZ, (byte)n));
                this.field_2f0dd8_div = n;
            }
            this.field_37b45e5_Dne.field_1ed028_ATE = false;
        }
        ++this.field_22c602_IjH;
        if (this.field_37b45e5_Dne.field_22c613_IjH) {
            this.method_5536af4d_FWm(new wFl(this.field_37b45e5_Dne));
            this.field_37b45e5_Dne.field_22c613_IjH = false;
        }
    }

    public void method_7a46289a_Dne() {
        for (PJQ pJQ : this.field_83b48b6a_Dne) {
            pJQ.field_6a0474ed_FWm.add(this.field_37b45e5_Dne.field_2d29f4_aFZ);
        }
    }

    public void method_71877ce3_bzF(PJQ pJQ) {
        if (this.field_83b48b6a_Dne.contains(pJQ)) {
            this.field_83b48b6a_Dne.remove(pJQ);
            pJQ.field_6a0474ed_FWm.add(this.field_37b45e5_Dne.field_2d29f4_aFZ);
        }
    }

    public int hashCode() {
        return this.field_37b45e5_Dne.field_2d29f4_aFZ;
    }

    public void method_7be2fb8c_Dne(NER nER) {
        for (PJQ pJQ : this.field_83b48b6a_Dne) {
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
        }
    }
}

