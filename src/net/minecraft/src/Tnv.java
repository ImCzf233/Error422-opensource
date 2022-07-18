package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Tnv
extends pPV {
    private long field_2092af_Dne;
    public PJQ field_36b4fb5_Dne;
    private ZGT field_36fd085_Dne = new ZGT();
    private int field_267cf5_Qnq = 0;
    private int field_2092ae_Dne;
    private int field_21260d_FWm;
    private int field_2d29f4_aFZ = 0;
    private double field_2092a9_Dne;
    private final jwh_0 field_3694131_Dne;
    private boolean field_21261e_FWm;
    public final RXf field_36c6f8c_Dne;
    private int field_2e5f1b_bzF;
    private boolean field_2e5f2c_bzF = true;
    public boolean field_2092bf_Dne = false;
    private long field_21260e_FWm;
    private double field_2e5f16_bzF;
    private double field_212608_FWm;
    private static Random field_7331eae7_Dne = new Random();

    @Override
    public void method_a50279b5_Dne(efs efs2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object obj : this.field_3694131_Dne.method_b6370c78_Dne(this.field_36b4fb5_Dne, efs2.method_eecad346_Dne())) {String string = (String) obj;
            if (stringBuilder.length() > 0) {
                stringBuilder.append("\u0000");
            }
            stringBuilder.append(string);
        }
        this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new efs(stringBuilder.toString()));
    }

    @Override
    public void method_6dd7ca7f_bzF(NER nER) {
        this.field_3694131_Dne.method_230e0120_Dne().method_110c4dc3_FWm(this.getClass() + " wasn't prepared to deal with a " + nER.getClass());
        this.method_8f501fe4_Dne("Protocol error, unexpected packet");
    }

    public void method_7be2fb8c_Dne(NER nER) {
        if (nER instanceof rXx) {
            rXx rXx2 = (rXx)nER;
            int n = this.field_36b4fb5_Dne.method_ae128dba_bzF();
            if (n == 2) {
                return;
            }
            if (n == 1 && !rXx2.method_ae128dcb_bzF()) {
                return;
            }
        }
        try {
            this.field_36c6f8c_Dne.method_7be2fb8c_Dne(nER);
        }
        catch (Throwable throwable) {
            McM mcM = McM.method_948e60df_Dne(throwable, "Sending packet");
            Noo noo = mcM.method_284dc627_Dne("Packet being sent");
            noo.method_2aeeb7ad_Dne("Packet ID", new sdo(this, nER));
            noo.method_2aeeb7ad_Dne("Packet class", new Lzp(this, nER));
            throw new kaJ(mcM);
        }
    }

    @Override
    public void method_a7033c4d_Dne(fmA fmA2) {
    }

    @Override
    public void method_b1fec784_Dne(mZp mZp2) {
        if (this.field_36b4fb5_Dne.field_20257f3d_FWm.field_2092ae_Dne == mZp2.field_2092ae_Dne && this.field_36b4fb5_Dne.field_20257f3d_FWm.method_49863868_FWm(this.field_36b4fb5_Dne)) {
            NMq nMq = this.field_36b4fb5_Dne.field_20257f3d_FWm.method_a0af09b3_Dne(mZp2.field_21260d_FWm, mZp2.field_2e5f1b_bzF, mZp2.field_267cf5_Qnq, this.field_36b4fb5_Dne);
            if (NMq.method_68dd7a5d_FWm(mZp2.field_36a761a_Dne, nMq)) {
                this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new pDZ(mZp2.field_2092ae_Dne, mZp2.field_2092b8_Dne, true));
                this.field_36b4fb5_Dne.field_2092bf_Dne = true;
                this.field_36b4fb5_Dne.field_20257f3d_FWm.method_7a46289a_Dne();
                this.field_36b4fb5_Dne.method_baa39402_kGO();
                this.field_36b4fb5_Dne.field_2092bf_Dne = false;
            } else {
                this.field_36fd085_Dne.method_ad009545_Dne(this.field_36b4fb5_Dne.field_20257f3d_FWm.field_2092ae_Dne, mZp2.field_2092b8_Dne);
                this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new pDZ(mZp2.field_2092ae_Dne, mZp2.field_2092b8_Dne, false));
                this.field_36b4fb5_Dne.field_20257f3d_FWm.method_961ec291_Dne(this.field_36b4fb5_Dne, false);
                ArrayList<NMq> arrayList = new ArrayList<NMq>();
                for (int i = 0; i < this.field_36b4fb5_Dne.field_20257f3d_FWm.field_7eb83e1f_bzF.size(); ++i) {
                    arrayList.add(((onZ)this.field_36b4fb5_Dne.field_20257f3d_FWm.field_7eb83e1f_bzF.get(i)).method_23040479_Dne());
                }
                this.field_36b4fb5_Dne.method_da0f864a_Dne(this.field_36b4fb5_Dne.field_20257f3d_FWm, arrayList);
            }
        }
    }

    @Override
    public void method_814a40c9_Dne(Phv phv) {
        if (phv.field_2092ae_Dne == this.field_2e5f1b_bzF) {
            int n = (int)(System.nanoTime() / 1000000L - this.field_2092af_Dne);
            this.field_36b4fb5_Dne.field_2092ae_Dne = (this.field_36b4fb5_Dne.field_2092ae_Dne * 3 + n) / 4;
        }
    }

    @Override
    public void method_b6b5acc5_Dne(pSe pSe2) {
        this.field_36b4fb5_Dne.field_37cb681_Dne.field_21261e_FWm = pSe2.method_907a9d25_Qnq() && this.field_36b4fb5_Dne.field_37cb681_Dne.field_2e5f2c_bzF;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public void method_88cbbd66_Dne(UVb uVb) {
        if (uVb.field_21260d_FWm == 1) {
            this.field_36b4fb5_Dne.method_ae128dc7_bzF();
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    @Override
    public void method_a32e437b_Dne(eFM eFM2) {
        RAN rAN = this.field_3694131_Dne.method_9e6fba3b_Dne(this.field_36b4fb5_Dne.field_348572_qLR);
        if (rAN.method_2dee780_bzF(eFM2.field_2092ae_Dne, eFM2.field_21260d_FWm, eFM2.field_2e5f1b_bzF)) {
            int n;
            int n2;
            AjG ajG;
            ipD ipD2 = rAN.method_d98e681d_Dne(eFM2.field_2092ae_Dne, eFM2.field_21260d_FWm, eFM2.field_2e5f1b_bzF);
            if (ipD2 instanceof AjG && !(ajG = (AjG)ipD2).method_7a46289e_Dne()) {
                this.field_3694131_Dne.method_110c4dc3_FWm("Player " + this.field_36b4fb5_Dne.field_bc57ecbf_aFZ + " just tried to change non-editable sign");
                return;
            }
            for (n2 = 0; n2 < 4; ++n2) {
                n = 1;
                if (eFM2.field_f5e54dca_Dne[n2].length() > 15) {
                    n = 0;
                } else {
                    for (int i = 0; i < eFM2.field_f5e54dca_Dne[n2].length(); ++i) {
                        if (BAQ.field_569fcf45_Dne.indexOf(eFM2.field_f5e54dca_Dne[n2].charAt(i)) >= 0) continue;
                        n = 0;
                    }
                }
                if (n != 0) continue;
            }
            if (ipD2 instanceof AjG) {
                n2 = eFM2.field_2092ae_Dne;
                n = eFM2.field_21260d_FWm;
                int n3 = eFM2.field_2e5f1b_bzF;
                AjG ajG2 = (AjG)ipD2;
                System.arraycopy(eFM2.field_f5e54dca_Dne, 0, ajG2.field_f5e54dca_Dne, 0, 4);
                ajG2.method_582b297_a_();
                rAN.method_2c2cf7c9_Dne(n2, n, n3);
            }
        }
    }

    public void method_c38d48a4_Dne(double d, double d2, double d3, float f, float f2) {
        this.field_2e5f2c_bzF = false;
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        this.field_36b4fb5_Dne.method_c38d48a4_Dne(d, d2, d3, f, f2);
        this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new eMn(d, d2 + (double)1.62f, d2, d3, f, f2, false));
    }

    @Override
    public void method_c66d1d52_Dne(yZV yZV2) {
        this.field_36c6f8c_Dne.method_feb678cd_Dne("disconnect.quitting", new Object[0]);
    }

    @Override
    public void method_6cc03058_Dne(EHr eHr) {
        RAN rAN = this.field_3694131_Dne.method_9e6fba3b_Dne(this.field_36b4fb5_Dne.field_348572_qLR);
        sMa sMa2 = rAN.method_9e7ee9d3_Dne(eHr.field_21260d_FWm);
        if (sMa2 != null) {
            boolean bl = this.field_36b4fb5_Dne.method_3e501ffd_Qnq(sMa2);
            double d = 36.0;
            if (!bl) {
                d = 9.0;
            }
            if (this.field_36b4fb5_Dne.method_bb7dd80e_Dne(sMa2) < d) {
                if (eHr.field_2e5f1b_bzF == 0) {
                    this.field_36b4fb5_Dne.method_efba61e_aFZ(sMa2);
                } else if (eHr.field_2e5f1b_bzF == 1) {
                    this.field_36b4fb5_Dne.method_70efe4c_IjH(sMa2);
                }
            }
        }
    }

    public int method_7a46288d_Dne() {
        return this.field_36c6f8c_Dne.method_7a46288d_Dne();
    }

    @Override
    public void method_ba6e7695_Dne(rXx rXx2) {
        if (rXx2.field_569fcf45_Dne.startsWith("~")) {
            sRv.method_8f501fe4_Dne(rXx2.field_569fcf45_Dne);
        }
        if (this.field_36b4fb5_Dne.method_ae128dba_bzF() == 2) {
            this.method_7be2fb8c_Dne(new rXx("Cannot send chat message."));
        } else {
            String string = rXx2.field_569fcf45_Dne;
            if (string.length() > 100) {
                this.method_8f501fe4_Dne("Chat message too long");
            } else {
                string = string.trim();
                for (int i = 0; i < string.length(); ++i) {
                    if (BAQ.method_ce7f4727_Dne(string.charAt(i))) continue;
                    this.method_8f501fe4_Dne("Illegal characters in chat");
                    return;
                }
                if (string.startsWith("/")) {
                    this.method_110c4dc3_FWm(string);
                } else {
                    if (this.field_36b4fb5_Dne.method_ae128dba_bzF() == 1) {
                        this.method_7be2fb8c_Dne(new rXx("Cannot send chat message."));
                        return;
                    }
                    string = "<" + this.field_36b4fb5_Dne.method_c6f17a40_aFZ() + "> " + string;
                    this.field_3694131_Dne.method_230e0120_Dne().method_8f501fe4_Dne(string);
                    this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new rXx(string, false));
                }
                this.field_267cf5_Qnq += 20;
                if (this.field_267cf5_Qnq > 200 && !this.field_3694131_Dne.method_230ea953_Dne().method_110c4dc7_FWm(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ)) {
                    this.method_8f501fe4_Dne("disconnect.spam");
                }
            }
        }
    }

    @Override
    public void method_6ee1ada8_Dne(FQJ fQJ) {
        RAN rAN = this.field_3694131_Dne.method_9e6fba3b_Dne(this.field_36b4fb5_Dne.field_348572_qLR);
        this.field_21261e_FWm = true;
        if (!this.field_36b4fb5_Dne.field_21261e_FWm) {
            double d;
            if (!this.field_2e5f2c_bzF) {
                d = fQJ.field_212608_FWm - this.field_212608_FWm;
                if (fQJ.field_2092a9_Dne == this.field_2092a9_Dne && d * d < 0.01 && fQJ.field_2e5f16_bzF == this.field_2e5f16_bzF) {
                    this.field_2e5f2c_bzF = true;
                }
            }
            if (this.field_2e5f2c_bzF) {
                double d2;
                double d3;
                double d4;
                if (this.field_36b4fb5_Dne.field_203511c4_FWm != null) {
                    float f = this.field_36b4fb5_Dne.field_334489_mrb;
                    float f2 = this.field_36b4fb5_Dne.field_29186a_XHL;
                    this.field_36b4fb5_Dne.field_203511c4_FWm.method_908be33b_RPx();
                    double d5 = this.field_36b4fb5_Dne.field_2f0dd3_div;
                    double d6 = this.field_36b4fb5_Dne.field_22c5fd_IjH;
                    double d7 = this.field_36b4fb5_Dne.field_334487_mrb;
                    double d8 = 0.0;
                    double d9 = 0.0;
                    if (fQJ.field_2e5f2c_bzF) {
                        f = fQJ.field_2092ab_Dne;
                        f2 = fQJ.field_21260a_FWm;
                    }
                    if (fQJ.field_21261e_FWm && fQJ.field_212608_FWm == -999.0 && fQJ.field_267cf0_Qnq == -999.0) {
                        if (Math.abs(fQJ.field_2092a9_Dne) > 1.0 || Math.abs(fQJ.field_2e5f16_bzF) > 1.0) {
                            System.err.println(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ + " was caught trying to crash the server with an invalid position.");
                            this.method_8f501fe4_Dne("Nope!");
                            return;
                        }
                        d8 = fQJ.field_2092a9_Dne;
                        d9 = fQJ.field_2e5f16_bzF;
                    }
                    this.field_36b4fb5_Dne.field_2d2a05_aFZ = fQJ.field_2092bf_Dne;
                    this.field_36b4fb5_Dne.method_9feec6c2_Zpi();
                    this.field_36b4fb5_Dne.method_2be429a4_Dne(d8, 0.0, d9);
                    this.field_36b4fb5_Dne.method_c38d48a4_Dne(d5, d6, d7, f, f2);
                    this.field_36b4fb5_Dne.field_291868_XHL = d8;
                    this.field_36b4fb5_Dne.field_31b811_kGO = d9;
                    if (this.field_36b4fb5_Dne.field_203511c4_FWm != null) {
                        rAN.method_560a313_FWm(this.field_36b4fb5_Dne.field_203511c4_FWm, true);
                    }
                    if (this.field_36b4fb5_Dne.field_203511c4_FWm != null) {
                        this.field_36b4fb5_Dne.field_203511c4_FWm.method_908be33b_RPx();
                    }
                    this.field_3694131_Dne.method_230ea953_Dne().method_71877ce3_bzF(this.field_36b4fb5_Dne);
                    this.field_2092a9_Dne = this.field_36b4fb5_Dne.field_2f0dd3_div;
                    this.field_212608_FWm = this.field_36b4fb5_Dne.field_22c5fd_IjH;
                    this.field_2e5f16_bzF = this.field_36b4fb5_Dne.field_334487_mrb;
                    rAN.method_efba61a_aFZ(this.field_36b4fb5_Dne);
                    return;
                }
                if (this.field_36b4fb5_Dne.method_9b310ff4_Wwe()) {
                    this.field_36b4fb5_Dne.method_9feec6c2_Zpi();
                    this.field_36b4fb5_Dne.method_c38d48a4_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, this.field_36b4fb5_Dne.field_334489_mrb, this.field_36b4fb5_Dne.field_29186a_XHL);
                    rAN.method_efba61a_aFZ(this.field_36b4fb5_Dne);
                    return;
                }
                d = this.field_36b4fb5_Dne.field_22c5fd_IjH;
                this.field_2092a9_Dne = this.field_36b4fb5_Dne.field_2f0dd3_div;
                this.field_212608_FWm = this.field_36b4fb5_Dne.field_22c5fd_IjH;
                this.field_2e5f16_bzF = this.field_36b4fb5_Dne.field_334487_mrb;
                double d10 = this.field_36b4fb5_Dne.field_2f0dd3_div;
                double d11 = this.field_36b4fb5_Dne.field_22c5fd_IjH;
                double d12 = this.field_36b4fb5_Dne.field_334487_mrb;
                float f = this.field_36b4fb5_Dne.field_334489_mrb;
                float f3 = this.field_36b4fb5_Dne.field_29186a_XHL;
                if (fQJ.field_21261e_FWm && fQJ.field_212608_FWm == -999.0 && fQJ.field_267cf0_Qnq == -999.0) {
                    fQJ.field_21261e_FWm = false;
                }
                if (fQJ.field_21261e_FWm) {
                    d10 = fQJ.field_2092a9_Dne;
                    d11 = fQJ.field_212608_FWm;
                    d12 = fQJ.field_2e5f16_bzF;
                    d4 = fQJ.field_267cf0_Qnq - fQJ.field_212608_FWm;
                    if (!this.field_36b4fb5_Dne.method_9b310ff4_Wwe() && (d4 > 1.65 || d4 < 0.1)) {
                        this.method_8f501fe4_Dne("Illegal stance");
                        this.field_3694131_Dne.method_230e0120_Dne().method_110c4dc3_FWm(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ + " had an illegal stance: " + d4);
                        return;
                    }
                    if (Math.abs(fQJ.field_2092a9_Dne) > 3.2E7 || Math.abs(fQJ.field_2e5f16_bzF) > 3.2E7) {
                        this.method_8f501fe4_Dne("Illegal position");
                        return;
                    }
                }
                if (fQJ.field_2e5f2c_bzF) {
                    f = fQJ.field_2092ab_Dne;
                    f3 = fQJ.field_21260a_FWm;
                }
                this.field_36b4fb5_Dne.method_9feec6c2_Zpi();
                this.field_36b4fb5_Dne.field_212c18_EyB = 0.0f;
                this.field_36b4fb5_Dne.method_c38d48a4_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, f, f3);
                if (!this.field_2e5f2c_bzF) {
                    return;
                }
                d4 = d10 - this.field_36b4fb5_Dne.field_2f0dd3_div;
                double d13 = d11 - this.field_36b4fb5_Dne.field_22c5fd_IjH;
                double d14 = d12 - this.field_36b4fb5_Dne.field_334487_mrb;
                double d15 = Math.min(Math.abs(d4), Math.abs(this.field_36b4fb5_Dne.field_291868_XHL));
                double d16 = d15 * d15 + (d3 = Math.min(Math.abs(d13), Math.abs(this.field_36b4fb5_Dne.field_2a9ad1_Zpi))) * d3 + (d2 = Math.min(Math.abs(d14), Math.abs(this.field_36b4fb5_Dne.field_31b811_kGO))) * d2;
                if (!(!(d16 > 100.0) || this.field_3694131_Dne.method_9feec6c6_Zpi() && this.field_3694131_Dne.method_c50868a8_mrb().equals(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ))) {
                    this.field_3694131_Dne.method_230e0120_Dne().method_110c4dc3_FWm(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ + " moved too quickly! " + d4 + "," + d13 + "," + d14 + " (" + d15 + ", " + d3 + ", " + d2 + ")");
                    this.method_c38d48a4_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, this.field_36b4fb5_Dne.field_334489_mrb, this.field_36b4fb5_Dne.field_29186a_XHL);
                    return;
                }
                float f4 = 0.0625f;
                boolean bl = rAN.method_d11d9a5_Dne(this.field_36b4fb5_Dne, this.field_36b4fb5_Dne.field_373a3ed_Dne.method_230d324c_Dne().method_4f91d5d0_aFZ(f4, f4, f4)).isEmpty();
                if (this.field_36b4fb5_Dne.field_2d2a05_aFZ && !fQJ.field_2092bf_Dne && d13 > 0.0) {
                    this.field_36b4fb5_Dne.method_87b72d60_aFZ(0.2f);
                }
                this.field_36b4fb5_Dne.method_2be429a4_Dne(d4, d13, d14);
                this.field_36b4fb5_Dne.field_2d2a05_aFZ = fQJ.field_2092bf_Dne;
                this.field_36b4fb5_Dne.method_e4ea49ac_zGp(d4, d13, d14);
                double d17 = d13;
                d4 = d10 - this.field_36b4fb5_Dne.field_2f0dd3_div;
                d13 = d11 - this.field_36b4fb5_Dne.field_22c5fd_IjH;
                if (d13 > -0.5 || d13 < 0.5) {
                    d13 = 0.0;
                }
                d14 = d12 - this.field_36b4fb5_Dne.field_334487_mrb;
                d16 = d4 * d4 + d13 * d13 + d14 * d14;
                boolean bl2 = false;
                if (d16 > 0.0625 && !this.field_36b4fb5_Dne.method_9b310ff4_Wwe() && !this.field_36b4fb5_Dne.field_37515de_Dne.method_7a46289e_Dne()) {
                    bl2 = true;
                    this.field_3694131_Dne.method_230e0120_Dne().method_110c4dc3_FWm(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ + " moved wrongly!");
                }
                this.field_36b4fb5_Dne.method_c38d48a4_Dne(d10, d11, d12, f, f3);
                boolean bl3 = rAN.method_d11d9a5_Dne(this.field_36b4fb5_Dne, this.field_36b4fb5_Dne.field_373a3ed_Dne.method_230d324c_Dne().method_4f91d5d0_aFZ(f4, f4, f4)).isEmpty();
                if (bl && (bl2 || !bl3) && !this.field_36b4fb5_Dne.method_9b310ff4_Wwe()) {
                    this.method_c38d48a4_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, f, f3);
                    return;
                }
                bSp bSp2 = this.field_36b4fb5_Dne.field_373a3ed_Dne.method_230d324c_Dne().method_b78565d7_FWm(f4, f4, f4).method_e44f9e56_Dne(0.0, -0.55, 0.0);
                if (!(this.field_3694131_Dne.method_73aaafc7_ATE() || this.field_36b4fb5_Dne.field_37515de_Dne.method_7a46289e_Dne() || rAN.method_782a87ed_FWm(bSp2))) {
                    if (d17 >= -0.03125) {
                        ++this.field_21260d_FWm;
                        if (this.field_21260d_FWm > 80) {
                            this.field_3694131_Dne.method_230e0120_Dne().method_110c4dc3_FWm(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ + " was kicked for floating too long!");
                            this.method_8f501fe4_Dne("Flying is not enabled on this server");
                            return;
                        }
                    }
                } else {
                    this.field_21260d_FWm = 0;
                }
                this.field_36b4fb5_Dne.field_2d2a05_aFZ = fQJ.field_2092bf_Dne;
                this.field_3694131_Dne.method_230ea953_Dne().method_71877ce3_bzF(this.field_36b4fb5_Dne);
                this.field_36b4fb5_Dne.method_1e24904f_FWm(this.field_36b4fb5_Dne.field_22c5fd_IjH - d, fQJ.field_2092bf_Dne);
            }
        }
    }

    @Override
    public void method_721f46e7_Dne(Gle gle) {
        if (gle.field_2092ae_Dne == 1) {
            if (this.field_36b4fb5_Dne.field_21261e_FWm) {
                this.field_36b4fb5_Dne = this.field_3694131_Dne.method_230ea953_Dne().method_51fe2c1b_Dne(this.field_36b4fb5_Dne, 0, true);
            } else if (this.field_36b4fb5_Dne.method_2305a4ac_Dne().method_231798c9_Dne().method_907a9d25_Qnq()) {
                if (this.field_3694131_Dne.method_9feec6c6_Zpi() && this.field_36b4fb5_Dne.field_bc57ecbf_aFZ.equals(this.field_3694131_Dne.method_c50868a8_mrb())) {
                    this.field_36b4fb5_Dne.field_36dacd0_Dne.method_8f501fe4_Dne("You have died. Game over, man, it's game over!");
                    this.field_3694131_Dne.method_c073daf8_mrb();
                } else {
                    eHI eHI2 = new eHI(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ);
                    eHI2.method_110c4dc3_FWm("Death in Hardcore");
                    this.field_3694131_Dne.method_230ea953_Dne().method_230d8827_Dne().method_a348a101_Dne(eHI2);
                    this.field_36b4fb5_Dne.field_36dacd0_Dne.method_8f501fe4_Dne("You have died. Game over, man, it's game over!");
                }
            } else {
                if (this.field_36b4fb5_Dne.method_9a443a8c_XHL() > 0) {
                    return;
                }
                this.field_36b4fb5_Dne = this.field_3694131_Dne.method_230ea953_Dne().method_51fe2c1b_Dne(this.field_36b4fb5_Dne, 0, false);
            }
        }
    }

    @Override
    public void method_c62461f2_Dne(yUQ yUQ2) {
        this.field_36b4fb5_Dne.method_c62461f2_Dne(yUQ2);
    }

    @Override
    public void method_a793ca4f_Dne(fwI fwI2) {
        if (this.field_36b4fb5_Dne.field_20257f3d_FWm.field_2092ae_Dne == fwI2.field_2092ae_Dne && this.field_36b4fb5_Dne.field_20257f3d_FWm.method_49863868_FWm(this.field_36b4fb5_Dne)) {
            this.field_36b4fb5_Dne.field_20257f3d_FWm.method_961e82c4_Dne(this.field_36b4fb5_Dne, fwI2.field_21260d_FWm);
            this.field_36b4fb5_Dne.field_20257f3d_FWm.method_7a46289a_Dne();
        }
    }

    @Override
    public void method_b5dd4c21_Dne(pDZ pDZ2) {
        Short s = (Short)this.field_36fd085_Dne.method_394ba0a9_Dne(this.field_36b4fb5_Dne.field_20257f3d_FWm.field_2092ae_Dne);
        if (s != null && pDZ2.field_2092b8_Dne == s && this.field_36b4fb5_Dne.field_20257f3d_FWm.field_2092ae_Dne == pDZ2.field_2092ae_Dne && !this.field_36b4fb5_Dne.field_20257f3d_FWm.method_49863868_FWm(this.field_36b4fb5_Dne)) {
            this.field_36b4fb5_Dne.field_20257f3d_FWm.method_961ec291_Dne(this.field_36b4fb5_Dne, true);
        }
    }

    @Override
    public void method_9e53e948_Dne(aig aig2) {
        if (aig2.field_2092ae_Dne >= 0 && aig2.field_2092ae_Dne < MOS.method_7a46288d_Dne()) {
            this.field_36b4fb5_Dne.field_36a059b_Dne.field_2092ae_Dne = aig2.field_2092ae_Dne;
        } else {
            this.field_3694131_Dne.method_230e0120_Dne().method_110c4dc3_FWm(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ + " tried to set an invalid carried item");
        }
    }

    private void method_110c4dc3_FWm(String string) {
        this.field_3694131_Dne.method_2300868f_Dne().method_d491c9e2_Dne(this.field_36b4fb5_Dne, string);
    }

    public void method_7a46289a_Dne() {
        this.field_21261e_FWm = false;
        ++this.field_2092ae_Dne;
        this.field_3694131_Dne.field_365731d_Dne.method_8f501fe4_Dne("packetflow");
        this.field_36c6f8c_Dne.method_7c6f6039_FWm();
        this.field_3694131_Dne.field_365731d_Dne.method_110c4dc3_FWm("keepAlive");
        if ((long)this.field_2092ae_Dne - this.field_21260e_FWm > 20L) {
            this.field_21260e_FWm = this.field_2092ae_Dne;
            this.field_2092af_Dne = System.nanoTime() / 1000000L;
            this.field_2e5f1b_bzF = field_7331eae7_Dne.nextInt();
            this.method_7be2fb8c_Dne(new Phv(this.field_2e5f1b_bzF));
        }
        if (this.field_267cf5_Qnq > 0) {
            --this.field_267cf5_Qnq;
        }
        if (this.field_2d29f4_aFZ > 0) {
            --this.field_2d29f4_aFZ;
        }
        this.field_3694131_Dne.field_365731d_Dne.method_110c4dc3_FWm("playerTick");
        this.field_3694131_Dne.field_365731d_Dne.method_7c6f6039_FWm();
    }

    public void method_8f501fe4_Dne(String string) {
        if (!this.field_2092bf_Dne) {
            this.field_36b4fb5_Dne.method_c3b4a2d0_ooe();
            this.method_7be2fb8c_Dne(new yZV(string));
            this.field_36c6f8c_Dne.method_ae128dc7_bzF();
            this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new rXx((Object)((Object)Dne.field_ab1f2987_ooe) + this.field_36b4fb5_Dne.field_bc57ecbf_aFZ + " left the game."));
            this.field_3694131_Dne.method_230ea953_Dne().method_264f5c9_Qnq(this.field_36b4fb5_Dne);
            this.field_2092bf_Dne = true;
        }
    }

    @Override
    public void method_6d65330d_Dne(dtj_0 dtj_02) {
        RAN rAN = this.field_3694131_Dne.method_9e6fba3b_Dne(this.field_36b4fb5_Dne.field_348572_qLR);
        NMq nMq = this.field_36b4fb5_Dne.field_36a059b_Dne.method_23040479_Dne();
        if (eCD.method_ce7f5d9c_Dne(100) == 0 && this.field_36b4fb5_Dne.field_36a059b_Dne.method_23040479_Dne() != null) {
            for (zKP zKP2 : qxi_0.field_8f85f8f4_FWm) {
                if (zKP2.field_21260d_FWm != this.field_36b4fb5_Dne.field_36a059b_Dne.method_23040479_Dne().field_2e5f1b_bzF) continue;
                nMq = new NMq(qxi_0.method_2317f94c_Dne(), 1);
                break;
            }
        }
        boolean bl = false;
        int n = dtj_02.method_7c6f602c_FWm();
        int n2 = dtj_02.method_ae128dba_bzF();
        int n3 = dtj_02.method_907a9d14_Qnq();
        int n4 = dtj_02.method_d44b4585_zGp();
        if (dtj_02.method_d44b4585_zGp() == 255) {
            if (nMq == null) {
                return;
            }
            this.field_36b4fb5_Dne.field_37515de_Dne.method_d0db4f89_Dne(this.field_36b4fb5_Dne, rAN, nMq);
        } else if (dtj_02.method_ae128dba_bzF() >= this.field_3694131_Dne.method_b0a28137_div() - 1 && (dtj_02.method_d44b4585_zGp() == 1 || dtj_02.method_ae128dba_bzF() >= this.field_3694131_Dne.method_b0a28137_div())) {
            this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new rXx("" + (Object)((Object)Dne.field_140f3afb_div) + "Height limit for building is " + this.field_3694131_Dne.method_b0a28137_div()));
            bl = true;
        } else {
            if (this.field_2e5f2c_bzF && this.field_36b4fb5_Dne.method_2be42992_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5) < 64.0 && !this.field_3694131_Dne.method_41dd09d1_Dne(rAN, n, n2, n3, this.field_36b4fb5_Dne)) {
                this.field_36b4fb5_Dne.field_37515de_Dne.method_dfecafdf_Dne(this.field_36b4fb5_Dne, rAN, nMq, n, n2, n3, n4, dtj_02.method_7a46288a_Dne(), dtj_02.method_7c6f6029_FWm(), dtj_02.method_ae128db7_bzF());
            }
            bl = true;
        }
        if (bl) {
            this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new cSs(n, n2, n3, rAN));
            if (n4 == 0) {
                --n2;
            }
            if (n4 == 1) {
                ++n2;
            }
            if (n4 == 2) {
                --n3;
            }
            if (n4 == 3) {
                ++n3;
            }
            if (n4 == 4) {
                --n;
            }
            if (n4 == 5) {
                ++n;
            }
            this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new cSs(n, n2, n3, rAN));
        }
        if ((nMq = this.field_36b4fb5_Dne.field_36a059b_Dne.method_23040479_Dne()) != null && nMq.field_2092ae_Dne == 0) {
            this.field_36b4fb5_Dne.field_36a059b_Dne.field_8360c375_Dne[this.field_36b4fb5_Dne.field_36a059b_Dne.field_2092ae_Dne] = null;
            nMq = null;
        }
        if (nMq == null || nMq.method_d44b4585_zGp() == 0) {
            this.field_36b4fb5_Dne.field_2092bf_Dne = true;
            this.field_36b4fb5_Dne.field_36a059b_Dne.field_8360c375_Dne[this.field_36b4fb5_Dne.field_36a059b_Dne.field_2092ae_Dne] = NMq.method_c9a1f574_Dne(this.field_36b4fb5_Dne.field_36a059b_Dne.field_8360c375_Dne[this.field_36b4fb5_Dne.field_36a059b_Dne.field_2092ae_Dne]);
            onZ onZ2 = this.field_36b4fb5_Dne.field_20257f3d_FWm.method_3107f541_Dne(this.field_36b4fb5_Dne.field_36a059b_Dne, this.field_36b4fb5_Dne.field_36a059b_Dne.field_2092ae_Dne);
            this.field_36b4fb5_Dne.field_20257f3d_FWm.method_7a46289a_Dne();
            this.field_36b4fb5_Dne.field_2092bf_Dne = false;
            if (!NMq.method_68dd7a5d_FWm(this.field_36b4fb5_Dne.field_36a059b_Dne.method_23040479_Dne(), dtj_02.method_23040479_Dne())) {
                this.method_7be2fb8c_Dne(new RZL(this.field_36b4fb5_Dne.field_20257f3d_FWm.field_2092ae_Dne, onZ2.field_267cf5_Qnq, this.field_36b4fb5_Dne.field_36a059b_Dne.method_23040479_Dne()));
            }
        }
    }

    public Tnv(jwh_0 jwh_02, RXf rXf, PJQ pJQ) {
        this.field_3694131_Dne = jwh_02;
        this.field_36c6f8c_Dne = rXf;
        rXf.method_b68494b1_Dne(this);
        this.field_36b4fb5_Dne = pJQ;
        pJQ.field_36dacd0_Dne = this;
    }

    @Override
    public void method_794d1f3c_Dne(Krr krr) {
        this.field_36b4fb5_Dne.method_cd4cb3d5_udO();
    }

    @Override
    public void method_8174fbab_Dne(Pkw pkw) {
        if (pkw.field_21260d_FWm == 1) {
            this.field_36b4fb5_Dne.method_143fdded_bzF(true);
        } else if (pkw.field_21260d_FWm == 2) {
            this.field_36b4fb5_Dne.method_143fdded_bzF(false);
        } else if (pkw.field_21260d_FWm == 4) {
            this.field_36b4fb5_Dne.method_aad4531d_a_(true);
        } else if (pkw.field_21260d_FWm == 5) {
            this.field_36b4fb5_Dne.method_aad4531d_a_(false);
        } else if (pkw.field_21260d_FWm == 3) {
            this.field_36b4fb5_Dne.method_2d24817a_Dne(false, true, true);
            this.field_2e5f2c_bzF = false;
        }
    }

    @Override
    public void method_feb678cd_Dne(String string, Object[] objectArray) {
        this.field_3694131_Dne.method_230e0120_Dne().method_8f501fe4_Dne(this.field_36b4fb5_Dne.field_bc57ecbf_aFZ + " lost connection: " + string);
        this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new rXx((Object)((Object)Dne.field_ab1f2987_ooe) + this.field_36b4fb5_Dne.method_c6f17a40_aFZ() + " left the game."));
        this.field_3694131_Dne.method_230ea953_Dne().method_264f5c9_Qnq(this.field_36b4fb5_Dne);
        this.field_2092bf_Dne = true;
        if (this.field_3694131_Dne.method_9feec6c6_Zpi() && this.field_36b4fb5_Dne.field_bc57ecbf_aFZ.equals(this.field_3694131_Dne.method_c50868a8_mrb())) {
            this.field_3694131_Dne.method_230e0120_Dne().method_8f501fe4_Dne("Stopping singleplayer server as player logged out");
            this.field_3694131_Dne.method_ae128dc7_bzF();
        }
    }

    @Override
    public void method_6fbf82c0_Dne(FaB faB) {
        if ("MC|BEdit".equals(faB.field_569fcf45_Dne)) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(faB.field_3f1c582_Dne));
                NMq nMq = NER.method_69d02a62_Dne(dataInputStream);
                if (!Iny.method_8d4fb91b_Dne(nMq.method_230886fb_Dne())) {
                    throw new IOException("Invalid book tag!");
                }
                NMq nMq2 = this.field_36b4fb5_Dne.field_36a059b_Dne.method_23040479_Dne();
                if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_9a03eeb4_Jjb.field_267cf5_Qnq && nMq.field_2e5f1b_bzF == nMq2.field_2e5f1b_bzF) {
                    nMq2.method_58996597_Dne("pages", nMq.method_230886fb_Dne().method_285baa50_Dne("pages"));
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if ("MC|BSign".equals(faB.field_569fcf45_Dne)) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(faB.field_3f1c582_Dne));
                NMq nMq = NER.method_69d02a62_Dne(dataInputStream);
                if (!EAx.method_8d4fb91b_Dne(nMq.method_230886fb_Dne())) {
                    throw new IOException("Invalid book tag!");
                }
                NMq nMq3 = this.field_36b4fb5_Dne.field_36a059b_Dne.method_23040479_Dne();
                if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_68a14cb4_CLK.field_267cf5_Qnq && nMq3.field_2e5f1b_bzF == dEr.field_9a03eeb4_Jjb.field_267cf5_Qnq) {
                    if (eCD.method_ce7f5d9c_Dne(8) == 0) {
                        mbZ mbZ2 = nMq.method_230886fb_Dne().method_285baa50_Dne("pages");
                        for (int i = 0; i < mbZ2.field_f27c122c_Dne.size(); ++i) {
                            ((QNx)mbZ2.method_77d0d055_FWm((int)i)).field_569fcf45_Dne = nVa.method_eecad346_Dne();
                        }
                        nMq3.method_58996597_Dne("author", new QNx("author", System.getProperty("user.name")));
                        nMq3.method_58996597_Dne("title", new QNx("title", nVa.method_eecad346_Dne()));
                    } else {
                        nMq3.method_58996597_Dne("author", new QNx("author", this.field_36b4fb5_Dne.field_bc57ecbf_aFZ));
                        nMq3.method_58996597_Dne("title", new QNx("title", nMq.method_230886fb_Dne().method_39193c_Dne("title")));
                    }
                    nMq3.method_58996597_Dne("pages", nMq.method_230886fb_Dne().method_285baa50_Dne("pages"));
                    nMq3.field_2e5f1b_bzF = dEr.field_68a14cb4_CLK.field_267cf5_Qnq;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if ("MC|TrSel".equals(faB.field_569fcf45_Dne)) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(faB.field_3f1c582_Dne));
                int n = dataInputStream.readInt();
                Pdb pdb = this.field_36b4fb5_Dne.field_20257f3d_FWm;
                if (pdb instanceof ema) {
                    ((ema)pdb).method_ce7f5da9_Dne(n);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if ("MC|AdvCdm".equals(faB.field_569fcf45_Dne)) {
            if (!this.field_3694131_Dne.method_7ad38807_DyG()) {
                this.field_36b4fb5_Dne.method_8f501fe4_Dne(this.field_36b4fb5_Dne.method_98148f73_Dne("advMode.notEnabled", new Object[0]));
            } else if (this.field_36b4fb5_Dne.method_fa81cf37_Dne(2, "") && this.field_36b4fb5_Dne.field_37cb681_Dne.field_267d06_Qnq) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(faB.field_3f1c582_Dne));
                    int n = dataInputStream.readInt();
                    int n2 = dataInputStream.readInt();
                    int n3 = dataInputStream.readInt();
                    String string = NER.method_1ce99840_Dne(dataInputStream, 256);
                    ipD ipD2 = this.field_36b4fb5_Dne.field_36c4f18_Dne.method_d98e681d_Dne(n, n2, n3);
                    if (ipD2 != null && ipD2 instanceof FgE) {
                        ((FgE)ipD2).method_110c4dc3_FWm(string);
                        this.field_36b4fb5_Dne.field_36c4f18_Dne.method_2c2cf7c9_Dne(n, n2, n3);
                        this.field_36b4fb5_Dne.method_8f501fe4_Dne("Command set: " + string);
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            } else {
                this.field_36b4fb5_Dne.method_8f501fe4_Dne(this.field_36b4fb5_Dne.method_98148f73_Dne("advMode.notAllowed", new Object[0]));
            }
        } else if ("MC|Beacon".equals(faB.field_569fcf45_Dne)) {
            if (this.field_36b4fb5_Dne.field_20257f3d_FWm instanceof eSp) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(faB.field_3f1c582_Dne));
                    int n = dataInputStream.readInt();
                    int n4 = dataInputStream.readInt();
                    eSp eSp2 = (eSp)this.field_36b4fb5_Dne.field_20257f3d_FWm;
                    onZ onZ2 = eSp2.method_9e7d935f_Dne(0);
                    if (onZ2.method_7a46289e_Dne()) {
                        onZ2.method_9e6e1a08_Dne(1);
                        TpA tpA = eSp2.method_23073c46_Dne();
                        tpA.method_117d19ea_FWm(n);
                        tpA.method_143f9e1c_bzF(n4);
                        tpA.method_582b297_a_();
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        } else if ("MC|ItemName".equals(faB.field_569fcf45_Dne) && this.field_36b4fb5_Dne.field_20257f3d_FWm instanceof sZS) {
            sZS sZS2 = (sZS)this.field_36b4fb5_Dne.field_20257f3d_FWm;
            if (faB.field_3f1c582_Dne != null && faB.field_3f1c582_Dne.length >= 1) {
                String string = BAQ.method_39193c_Dne(new String(faB.field_3f1c582_Dne));
                if (string.length() <= 30) {
                    sZS2.method_8f501fe4_Dne(string);
                }
            } else {
                sZS2.method_8f501fe4_Dne("");
            }
        }
    }

    @Override
    public void method_8cdefd0f_Dne(Wbc wbc) {
        RAN rAN = this.field_3694131_Dne.method_9e6fba3b_Dne(this.field_36b4fb5_Dne.field_348572_qLR);
        if (wbc.field_2d29f4_aFZ == 4) {
            this.field_36b4fb5_Dne.method_21b69c9d_Dne(false);
        } else if (wbc.field_2d29f4_aFZ == 3) {
            this.field_36b4fb5_Dne.method_21b69c9d_Dne(true);
        } else if (wbc.field_2d29f4_aFZ == 5) {
            this.field_36b4fb5_Dne.method_9f50959e_ZfC();
        } else {
            boolean bl = false;
            if (wbc.field_2d29f4_aFZ == 0) {
                bl = true;
            }
            if (wbc.field_2d29f4_aFZ == 1) {
                bl = true;
            }
            if (wbc.field_2d29f4_aFZ == 2) {
                bl = true;
            }
            int n = wbc.field_2092ae_Dne;
            int n2 = wbc.field_21260d_FWm;
            int n3 = wbc.field_2e5f1b_bzF;
            if (bl) {
                double d = this.field_36b4fb5_Dne.field_2f0dd3_div - ((double)n + 0.5);
                double d2 = this.field_36b4fb5_Dne.field_22c5fd_IjH - ((double)n2 + 0.5) + 1.5;
                double d3 = this.field_36b4fb5_Dne.field_334487_mrb - ((double)n3 + 0.5);
                double d4 = d * d + d2 * d2 + d3 * d3;
                if (d4 > 36.0) {
                    return;
                }
                if (n2 >= this.field_3694131_Dne.method_b0a28137_div()) {
                    return;
                }
            }
            if (wbc.field_2d29f4_aFZ == 0) {
                if (!this.field_3694131_Dne.method_41dd09d1_Dne(rAN, n, n2, n3, this.field_36b4fb5_Dne)) {
                    this.field_36b4fb5_Dne.field_37515de_Dne.method_5972745a_Dne(n, n2, n3, wbc.field_267cf5_Qnq);
                } else {
                    this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new cSs(n, n2, n3, rAN));
                }
            } else if (wbc.field_2d29f4_aFZ == 2) {
                this.field_36b4fb5_Dne.field_37515de_Dne.method_2c2cf7c9_Dne(n, n2, n3);
                if (rAN.method_2c2cf7bc_Dne(n, n2, n3) != 0) {
                    this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new cSs(n, n2, n3, rAN));
                }
            } else if (wbc.field_2d29f4_aFZ == 1) {
                this.field_36b4fb5_Dne.field_37515de_Dne.method_a6aca7ca_FWm(n, n2, n3);
                if (rAN.method_2c2cf7bc_Dne(n, n2, n3) != 0) {
                    this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new cSs(n, n2, n3, rAN));
                }
            }
        }
    }

    @Override
    public void method_b6ac9559_Dne(pRp pRp2) {
        if (this.field_36b4fb5_Dne.field_37515de_Dne.method_7a46289e_Dne()) {
            boolean bl;
            boolean bl2 = pRp2.field_2092ae_Dne < 0;
            NMq nMq = pRp2.field_36a761a_Dne;
            boolean bl3 = pRp2.field_2092ae_Dne >= 1 && pRp2.field_2092ae_Dne < 36 + MOS.method_7a46288d_Dne();
            boolean bl4 = nMq == null || nMq.field_2e5f1b_bzF < dEr.field_836aa5b6_Dne.length && nMq.field_2e5f1b_bzF >= 0 && dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF] != null;
            boolean bl5 = bl = nMq == null || nMq.method_907a9d14_Qnq() >= 0 && nMq.method_907a9d14_Qnq() >= 0 && nMq.field_2092ae_Dne <= erC.field_2092ae_Dne && nMq.field_2092ae_Dne > 0;
            if (bl3 && bl4 && bl) {
                if (nMq == null) {
                    this.field_36b4fb5_Dne.field_36bb35e_Dne.method_6e3a6b66_Dne(pRp2.field_2092ae_Dne, null);
                } else {
                    this.field_36b4fb5_Dne.field_36bb35e_Dne.method_6e3a6b66_Dne(pRp2.field_2092ae_Dne, nMq);
                }
                this.field_36b4fb5_Dne.field_36bb35e_Dne.method_961ec291_Dne(this.field_36b4fb5_Dne, true);
            } else if (bl2 && bl4 && bl && this.field_2d29f4_aFZ < 200) {
                this.field_2d29f4_aFZ += 20;
                JiM jiM = this.field_36b4fb5_Dne.method_c9a088b8_Dne(nMq);
                if (jiM != null) {
                    jiM.method_ae128dc7_bzF();
                }
            }
        }
    }
}

