package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PJQ
extends FiG
implements mXX {
    private int field_20b341_EWz = -99999999;
    private irb field_3774533_Dne = new irb("en_US");
    public boolean field_2092bf_Dne;
    public int field_2092ae_Dne;
    public double field_212608_FWm;
    private int field_22352e_ICU = 0;
    private boolean field_217c37_Fnk = true;
    public final List field_f27c122c_Dne = new LinkedList();
    public jwh_0 field_3694131_Dne;
    private int field_21260d_FWm = -99999999;
    private int field_23d941_LVR = 0;
    private int field_350ae4_rPc = -99999999;
    private int field_30bcb2_haP = 60;
    public dyC field_37515de_Dne;
    private boolean field_2681a0_RPx = true;
    public Tnv field_36dacd0_Dne;
    public boolean field_21261e_FWm = false;
    public final List field_6a0474ed_FWm = new LinkedList();
    public double field_2092a9_Dne;
    private int field_351228_qrB = 0;

    @Override
    public void method_7c9aa178_Dne(MqS mqS) {
        if (this.field_20257f3d_FWm != this.field_36bb35e_Dne) {
            this.method_a98a0660_aFZ();
        }
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 0, mqS.method_9fc39d88_b_(), mqS.method_907a9d14_Qnq(), mqS.method_5acf91e_d_()));
        this.field_20257f3d_FWm = new ZqW(this.field_36a059b_Dne, mqS);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    public void method_94d18be1_FWm(sMa sMa2) {
        this.method_2305a4ac_Dne().method_230e0484_Dne().method_a9258ca5_FWm(this, new UVb(sMa2, 7));
    }

    @Override
    public void method_7ad38803_DyG() {
        if (this.field_36dacd0_Dne != null) {
            this.field_36dacd0_Dne.method_7be2fb8c_Dne(new pSe(this.field_37cb681_Dne));
        }
    }

    @Override
    protected void method_7bbbe3a2_Dne(NAx nAx) {
        super.method_7bbbe3a2_Dne(nAx);
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new ziQ(this.field_2d29f4_aFZ, nAx));
    }

    @Override
    public void method_961ec291_Dne(FiG fiG, boolean bl) {
        super.method_961ec291_Dne(fiG, bl);
        this.field_350ae4_rPc = -1;
        this.field_21260d_FWm = -1;
        this.field_20b341_EWz = -1;
        this.field_6a0474ed_FWm.addAll(((PJQ)fiG).field_6a0474ed_FWm);
    }

    @Override
    public void method_6211b979_Dne(Pdb pdb, int n, int n2) {
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new QKM(pdb.field_2092ae_Dne, n, n2));
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        boolean bl;
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        boolean bl2 = bl = this.field_3694131_Dne.method_907a9d25_Qnq() && this.field_3694131_Dne.method_c5287a62_qLR() && "fall".equals(zBn2.field_569fcf45_Dne);
        if (!bl && this.field_30bcb2_haP > 0 && zBn2 != zBn.field_5ceb61a_IjH) {
            return false;
        }
        if (zBn2 instanceof Kgw) {
            sMa sMa2 = zBn2.method_f88b2463_FWm();
            if (sMa2 instanceof FiG && !this.method_703284a7_Dne((FiG)sMa2)) {
                return false;
            }
            if (sMa2 instanceof hhc) {
                hhc hhc2 = (hhc)sMa2;
                if (hhc2.field_75c313d2_bzF instanceof FiG && !this.method_703284a7_Dne((FiG)hhc2.field_75c313d2_bzF)) {
                    return false;
                }
            }
        }
        return super.method_147b2066_Dne(zBn2, n);
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return !this.field_3694131_Dne.method_c5287a62_qLR() ? false : super.method_703284a7_Dne(fiG);
    }

    @Override
    public void method_ad72a713_bzF(sMa sMa2) {
        super.method_ad72a713_bzF(sMa2);
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new YVz(this, this.field_203511c4_FWm));
        this.field_36dacd0_Dne.method_c38d48a4_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, this.field_29186a_XHL);
    }

    @Override
    public NSR method_d981b6ed_Dne(int n, int n2, int n3) {
        NSR nSR = super.method_d981b6ed_Dne(n, n2, n3);
        if (nSR == NSR.field_36a88df_Dne) {
            kwp kwp2 = new kwp(this, 0, n, n2, n3);
            this.method_2305a4ac_Dne().method_230e0484_Dne().method_e9ca0fc6_Dne(this, kwp2);
            this.field_36dacd0_Dne.method_c38d48a4_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, this.field_29186a_XHL);
            this.field_36dacd0_Dne.method_7be2fb8c_Dne(kwp2);
        }
        return nSR;
    }

    @Override
    public void method_7ed97a02_Qnq(int n) {
        if (this.field_348572_qLR == 1 && n == 1) {
            this.method_831230fe_Dne(qlg.field_d2a5f464_oIf);
            this.field_36c4f18_Dne.method_ad72a713_bzF(this);
            this.field_21261e_FWm = true;
            this.field_36dacd0_Dne.method_7be2fb8c_Dne(new Tnn(4, 0));
        } else {
            if (this.field_348572_qLR == 1 && n == 0) {
                this.method_831230fe_Dne(qlg.field_394c0e5c_OdI);
                iSh iSh2 = this.field_3694131_Dne.method_9e6fba3b_Dne(n).method_f886b00c_FWm();
                if (iSh2 != null) {
                    this.field_36dacd0_Dne.method_c38d48a4_Dne(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF, 0.0f, 0.0f);
                }
                n = 1;
            } else {
                this.method_831230fe_Dne(qlg.field_71943884_Vxn);
            }
            this.field_3694131_Dne.method_230ea953_Dne().method_72c38313_Dne(this, n);
            this.field_350ae4_rPc = -1;
            this.field_21260d_FWm = -1;
            this.field_20b341_EWz = -1;
        }
    }

    @Override
    public void method_adf18883_Dne(YzO yzO, String string) {
        this.method_c538635b_qMV();
        this.field_20257f3d_FWm = new ema(this.field_36a059b_Dne, yzO, this.field_36c4f18_Dne);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
        Jmn jmn = ((ema)this.field_20257f3d_FWm).method_2302aac0_Dne();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 6, string == null ? "" : string, jmn.method_907a9d14_Qnq(), string != null));
        ybO ybO2 = yzO.method_53f50aae_Dne(this);
        if (ybO2 != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(this.field_22352e_ICU);
                ybO2.method_aca12b82_Dne(dataOutputStream);
                this.field_36dacd0_Dne.method_7be2fb8c_Dne(new FaB("MC|TrList", byteArrayOutputStream.toByteArray()));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public void method_c62461f2_Dne(yUQ yUQ2) {
        int n;
        if (this.field_3774533_Dne.method_a3f0160d_Dne().containsKey(yUQ2.method_eecad346_Dne())) {
            this.field_3774533_Dne.method_5ab48f70_Dne(yUQ2.method_eecad346_Dne(), false);
        }
        if ((n = 256 >> yUQ2.method_7c6f602c_FWm()) > 3 && n < 15) {
            this.field_351228_qrB = n;
        }
        this.field_23d941_LVR = yUQ2.method_ae128dba_bzF();
        this.field_217c37_Fnk = yUQ2.method_ae128dcb_bzF();
        if (this.field_3694131_Dne.method_9feec6c6_Zpi() && this.field_3694131_Dne.method_c50868a8_mrb().equals(this.field_bc57ecbf_aFZ)) {
            this.field_3694131_Dne.method_117d19ea_FWm(yUQ2.method_907a9d14_Qnq());
        }
        this.method_1e26d62a_FWm(1, !yUQ2.method_907a9d25_Qnq());
    }

    @Override
    protected void method_16ac470_Dne(double d, boolean bl) {
    }

    public void method_cd4cb3d5_udO() {
        this.field_20257f3d_FWm.method_703284a3_Dne(this);
        this.field_20257f3d_FWm = this.field_36bb35e_Dne;
    }

    public PJQ(jwh_0 jwh_02, Qnq qnq, String string, dyC dyC2) {
        super(qnq);
        dyC2.field_36b4fb5_Dne = this;
        this.field_37515de_Dne = dyC2;
        this.field_351228_qrB = jwh_02.method_230ea953_Dne().method_907a9d14_Qnq();
        iSh iSh2 = qnq.method_23105fed_Dne();
        int n = iSh2.field_2092ae_Dne;
        int n2 = iSh2.field_2e5f1b_bzF;
        int n3 = iSh2.field_21260d_FWm;
        if (!qnq.field_3690d00_Dne.field_21261e_FWm && qnq.method_231798c9_Dne().method_230878ef_Dne() != XHL.field_5e585957_Qnq) {
            int n4 = Math.max(5, jwh_02.method_a98a0653_aFZ() - 6);
            n3 = qnq.method_6f304eb3_aFZ(n += this.field_7331eae7_Dne.nextInt(n4 * 2) - n4, n2 += this.field_7331eae7_Dne.nextInt(n4 * 2) - n4);
        }
        this.field_3694131_Dne = jwh_02;
        this.field_215b33_FfS = 0.0f;
        this.field_bc57ecbf_aFZ = string;
        this.field_36b0a6_udO = 0.0f;
        this.method_9ce0fc65_FWm((double)n + 0.5, n3, (double)n2 + 0.5, 0.0f, 0.0f);
        while (!qnq.method_d11d9a5_Dne(this, this.field_373a3ed_Dne).isEmpty()) {
            this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH + 1.0, this.field_334487_mrb);
        }
    }

    public void method_5ab44f9f_Dne(String string, int n) {
        String string2 = string + "\u0000" + n;
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new FaB("MC|TPack", string2.getBytes()));
    }

    @Override
    public void method_117d19ea_FWm(int n) {
        super.method_117d19ea_FWm(n);
        this.field_350ae4_rPc = -1;
    }

    public String method_d1f1ed87_FWm() {
        String string = this.field_36dacd0_Dne.field_36c6f8c_Dne.method_81c690a9_Dne().toString();
        string = string.substring(string.indexOf("/") + 1);
        string = string.substring(0, string.indexOf(":"));
        return string;
    }

    public void method_9feec6c2_Zpi() {
        try {
            super.method_7a46289a_Dne();
            for (int i = 0; i < this.field_36a059b_Dne.method_907a9d14_Qnq(); ++i) {
                NER nER;
                NMq nMq = this.field_36a059b_Dne.method_9e6e1a08_Dne(i);
                if (nMq == null || !dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_907a9d25_Qnq() || this.field_36dacd0_Dne.method_7a46288d_Dne() > 5 || (nER = ((wJb)dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF]).method_d41ff59b_Dne(nMq, this.field_36c4f18_Dne, this)) == null) continue;
                this.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
            }
            if (this.method_9a443a8c_XHL() != this.field_21260d_FWm || this.field_20b341_EWz != this.field_36c9383_Dne.method_7a46288d_Dne() || this.field_36c9383_Dne.method_7a46288a_Dne() == 0.0f != this.field_2681a0_RPx) {
                this.field_36dacd0_Dne.method_7be2fb8c_Dne(new zqT(this.method_9a443a8c_XHL(), this.field_36c9383_Dne.method_7a46288d_Dne(), this.field_36c9383_Dne.method_7a46288a_Dne()));
                this.field_21260d_FWm = this.method_9a443a8c_XHL();
                this.field_20b341_EWz = this.field_36c9383_Dne.method_7a46288d_Dne();
                boolean bl = this.field_2681a0_RPx = this.field_36c9383_Dne.method_7a46288a_Dne() == 0.0f;
            }
            if (this.field_332a64_mlD != this.field_350ae4_rPc) {
                this.field_350ae4_rPc = this.field_332a64_mlD;
                this.field_36dacd0_Dne.method_7be2fb8c_Dne(new WXC(this.field_30e9da_iNQ, this.field_332a64_mlD, this.field_2f0276_eHV));
            }
        }
        catch (Throwable throwable) {
            McM mcM = McM.method_948e60df_Dne(throwable, "Ticking player");
            Noo noo = mcM.method_284dc627_Dne("Player being ticked");
            this.method_7e400579_Dne(noo);
            throw new kaJ(mcM);
        }
    }

    @Override
    public void method_143f9e1c_bzF(int n) {
        super.method_143f9e1c_bzF(n);
        Collection<vfE> collection = this.method_23062a3d_Dne().method_b2c709d5_Dne(PAf.field_712eb4bd_aFZ);
        for (vfE vfE2 : collection) {
            this.method_23062a3d_Dne().method_938dc1b8_Dne(this.method_eecad346_Dne(), vfE2).method_ea14418b_Dne(Arrays.asList(this));
        }
    }

    public void method_c3b4a2d0_ooe() {
        if (this.field_37b45e5_Dne != null) {
            this.field_37b45e5_Dne.method_ad72a713_bzF(this);
        }
        if (this.field_36e4eb_vSL) {
            this.method_2d24817a_Dne(true, false, false);
        }
    }

    @Override
    public void method_887647a2_Dne(TpA tpA) {
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 7, tpA.method_9fc39d88_b_(), tpA.method_907a9d14_Qnq(), tpA.method_5acf91e_d_()));
        this.field_20257f3d_FWm = new eSp(this.field_36a059b_Dne, tpA);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    public irb method_2310d392_Dne() {
        return this.field_3774533_Dne;
    }

    public void method_cc5ef5c0_trS() {
        this.field_21260d_FWm = -99999999;
    }

    @Override
    public void method_df3461c5_Dne(RLC rLC, int n) {
        if (rLC != null && !rLC.field_2092bf_Dne) {
            while (n > 100) {
                this.field_36dacd0_Dne.method_7be2fb8c_Dne(new Raa(rLC.field_2e5f1b_bzF, 100));
                n -= 100;
            }
            this.field_36dacd0_Dne.method_7be2fb8c_Dne(new Raa(rLC.field_2e5f1b_bzF, n));
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_37515de_Dne.method_7a46289a_Dne();
        --this.field_30bcb2_haP;
        this.field_20257f3d_FWm.method_7a46289a_Dne();

        while(!this.field_6a0474ed_FWm.isEmpty()) {
            int var1 = Math.min(this.field_6a0474ed_FWm.size(), 127);
            int[] var2 = new int[var1];
            Iterator var3 = this.field_6a0474ed_FWm.iterator();
            int var4 = 0;

            while(var3.hasNext() && var4 < var1) {
                var2[var4++] = (Integer)var3.next();
                var3.remove();
            }

            this.field_36dacd0_Dne.method_7be2fb8c_Dne(new tXK(var2));
        }

        if (!this.field_f27c122c_Dne.isEmpty()) {
            ArrayList var6 = new ArrayList();
            Iterator var7 = this.field_f27c122c_Dne.iterator();
            ArrayList var8 = new ArrayList();

            while(var7.hasNext() && var6.size() < 5) {
                Sxs var9 = (Sxs)var7.next();
                var7.remove();
                if (var9 != null && this.field_36c4f18_Dne.method_2dee780_bzF(var9.field_2092ae_Dne << 4, 0, var9.field_21260d_FWm << 4)) {
                    var6.add(this.field_36c4f18_Dne.method_e1796070_FWm(var9.field_2092ae_Dne, var9.field_21260d_FWm));
                    var8.addAll(((RAN)this.field_36c4f18_Dne).method_5b2c30cd_Dne(var9.field_2092ae_Dne * 16, 0, var9.field_21260d_FWm * 16, var9.field_2092ae_Dne * 16 + 16, 256, var9.field_21260d_FWm * 16 + 16));
                }
            }

            if (!var6.isEmpty()) {
                this.field_36dacd0_Dne.method_7be2fb8c_Dne(new nPC(var6));
                Iterator var10 = var8.iterator();

                while(var10.hasNext()) {
                    ipD var5 = (ipD)var10.next();
                    this.method_85a11d8b_FWm(var5);
                }

                var10 = var6.iterator();

                while(var10.hasNext()) {
                    qMV var11 = (qMV)var10.next();
                    this.method_2305a4ac_Dne().method_230e0484_Dne().method_a98e8737_Dne(this, var11);
                }
            }
        }

    }

    @Override
    public void method_c6daaac1_Dne(zBn zBn2) {
        Object object2;
        this.field_3694131_Dne.method_230ea953_Dne().method_bbfe582a_aFZ(this.field_379ccee_Dne.method_eecad346_Dne());
        if (!this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("keepInventory")) {
            this.field_36a059b_Dne.method_907a9d21_Qnq();
        }
        Collection collection = this.field_36c4f18_Dne.method_23062a3d_Dne().method_b2c709d5_Dne(PAf.field_2024fc56_FWm);
        for (Object object : collection) {
            OHz oHz = this.method_23062a3d_Dne().method_938dc1b8_Dne(this.method_eecad346_Dne(), (vfE)object);
            oHz.method_7a46289a_Dne();
        }
        object2 = this.method_69495399_Qnq();
        if (object2 != null) {
            ((sMa)object2).method_5606342_FWm(this, this.field_267cf5_Qnq);
        }
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new rXx(string));
    }

    public void method_1e24904f_FWm(double d, boolean bl) {
        super.method_16ac470_Dne(d, bl);
    }

    @Override
    public void method_47a073d1_bzF(String string) {
        irb irb2 = irb.method_2310d392_Dne();
        String string2 = irb2.method_39193c_Dne(string);
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new rXx(string2));
    }

    @Override
    protected void method_d44b4592_zGp() {
        this.field_36b0a6_udO = 0.0f;
    }

    @Override
    public iSh method_23105fed_Dne() {
        return new iSh(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH + 0.5), geR.method_117d0718_FWm(this.field_334487_mrb));
    }

    private void method_85a11d8b_FWm(ipD ipD2) {
        NER nER;
        if (ipD2 != null && (nER = ipD2.method_2303e2b0_Dne()) != null) {
            this.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
        }
    }

    @Override
    public void method_b18f6899_Dne(lqs lqs2) {
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 2, lqs2.method_9fc39d88_b_(), lqs2.method_907a9d14_Qnq(), lqs2.method_5acf91e_d_()));
        this.field_20257f3d_FWm = new bhy(this.field_36a059b_Dne, lqs2);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    public void method_fd8868e_Dne(NMq nMq, int n) {
        super.method_fd8868e_Dne(nMq, n);
        if (nMq != null && nMq.method_230de6ba_Dne() != null && nMq.method_230de6ba_Dne().method_c9acc3b8_Dne(nMq) == een.field_202f103d_FWm) {
            this.method_2305a4ac_Dne().method_230e0484_Dne().method_a9258ca5_FWm(this, new UVb(this, 5));
        }
    }

    @Override
    public void method_88b748b3_Dne(UTs uTs) {
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, uTs instanceof BDA ? 10 : 3, uTs.method_9fc39d88_b_(), uTs.method_907a9d14_Qnq(), uTs.method_5acf91e_d_()));
        this.field_20257f3d_FWm = new HnX(this.field_36a059b_Dne, uTs);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    public void method_baa39402_kGO() {
        if (!this.field_2092bf_Dne) {
            this.field_36dacd0_Dne.method_7be2fb8c_Dne(new RZL(-1, -1, this.field_36a059b_Dne.method_f87a5498_FWm()));
        }
    }

    @Override
    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 1, "Crafting", 9, true));
        this.field_20257f3d_FWm = new uxW(this.field_36a059b_Dne, this.field_36c4f18_Dne, n, n2, n3);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    public void method_b43d9ee3_Dne(sMa sMa2, int n) {
        super.method_b43d9ee3_Dne(sMa2, n);
        this.field_20257f3d_FWm.method_7a46289a_Dne();
    }

    private void method_c538635b_qMV() {
        this.field_22352e_ICU = this.field_22352e_ICU % 100 + 1;
    }

    @Override
    public boolean method_fa81cf37_Dne(int n, String string) {
        return "seed".equals(string) && !this.field_3694131_Dne.method_907a9d25_Qnq() ? true : (!"tell".equals(string) && !"help".equals(string) && !"me".equals(string) ? this.field_3694131_Dne.method_230ea953_Dne().method_110c4dc7_FWm(this.field_bc57ecbf_aFZ) : true);
    }

    @Override
    protected void method_c5287a5e_qLR() {
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new JGj(this.field_2d29f4_aFZ, (byte) 9));
        super.method_c5287a5e_qLR();
    }

    @Override
    public void method_a6aca7ca_FWm(int n, int n2, int n3) {
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 8, "Repairing", 9, true));
        this.field_20257f3d_FWm = new sZS(this.field_36a059b_Dne, this.field_36c4f18_Dne, n, n2, n3, this);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    public void method_bb7dd820_Dne(sMa sMa2) {
        this.method_2305a4ac_Dne().method_230e0484_Dne().method_a9258ca5_FWm(this, new UVb(sMa2, 6));
    }

    public void method_8108cb59_Dne(Pdb pdb) {
        this.method_da0f864a_Dne(pdb, pdb.method_adea226d_Dne());
    }

    @Override
    public void method_af9331b7_Dne(klq klq2) {
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 9, klq2.method_9fc39d88_b_(), klq2.method_907a9d14_Qnq(), klq2.method_5acf91e_d_()));
        this.field_20257f3d_FWm = new Fed(this.field_36a059b_Dne, klq2);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    public void method_5b092153_Dne(int n, int n2, int n3, String string) {
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 4, string == null ? "" : string, 9, string != null));
        this.field_20257f3d_FWm = new HhP(this.field_36a059b_Dne, this.field_36c4f18_Dne, n, n2, n3);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    protected void method_6db0b295_bzF(NAx nAx) {
        super.method_6db0b295_bzF(nAx);
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new gzk(this.field_2d29f4_aFZ, nAx));
    }

    @Override
    public void method_8d1afe0b_Dne(XHL xHL) {
        this.field_37515de_Dne.method_8d1afe0b_Dne(xHL);
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new Tnn(3, xHL.method_7a46288d_Dne()));
    }

    @Override
    protected void method_550f9763_FWm(NAx nAx) {
        super.method_550f9763_FWm(nAx);
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new ziQ(this.field_2d29f4_aFZ, nAx));
    }

    public RAN method_2305a4ac_Dne() {
        return (RAN)this.field_36c4f18_Dne;
    }

    @Override
    public void method_c900b3c7_Dne(zio zio2) {
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 5, zio2.method_9fc39d88_b_(), zio2.method_907a9d14_Qnq(), zio2.method_5acf91e_d_()));
        this.field_20257f3d_FWm = new oss(this.field_36a059b_Dne, zio2);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    public void method_da0f864a_Dne(Pdb pdb, List list) {
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new Pwq(pdb.field_2092ae_Dne, list));
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new RZL(-1, -1, this.field_36a059b_Dne.method_f87a5498_FWm()));
    }

    @Override
    public void method_4c1c2e5_Dne(Pdb pdb, int n, NMq nMq) {
        if (!(pdb.method_9e7d935f_Dne(n) instanceof wEm) && !this.field_2092bf_Dne) {
            this.field_36dacd0_Dne.method_7be2fb8c_Dne(new RZL(pdb.field_2092ae_Dne, n, nMq));
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        if (wkD.method_8f501fe8_Dne("playerGameType")) {
            if (jwh_0.method_2302cf90_Dne().method_7c861acb_EyB()) {
                this.field_37515de_Dne.method_8d1afe0b_Dne(jwh_0.method_2302cf90_Dne().method_230878ef_Dne());
            } else {
                this.field_37515de_Dne.method_8d1afe0b_Dne(XHL.method_9e728e7e_Dne(wkD.method_8f501fd7_Dne("playerGameType")));
            }
        }
    }

    public void method_9a443a99_XHL() {
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    public void method_a663d9a5_FWm(double d, double d2, double d3) {
        this.field_36dacd0_Dne.method_c38d48a4_Dne(d, d2, d3, this.field_334489_mrb, this.field_29186a_XHL);
    }

    @Override
    public void method_a98a0660_aFZ() {
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new Krr(this.field_20257f3d_FWm.field_2092ae_Dne));
        this.method_cd4cb3d5_udO();
    }

    public int method_ae128dba_bzF() {
        return this.field_23d941_LVR;
    }

    @Override
    public void method_6783319e_Dne(Aem aem) {
        this.method_c538635b_qMV();
        this.field_36dacd0_Dne.method_7be2fb8c_Dne(new XGq(this.field_22352e_ICU, 9, aem.method_9fc39d88_b_(), aem.method_907a9d14_Qnq(), aem.method_5acf91e_d_()));
        this.field_20257f3d_FWm = new Fed(this.field_36a059b_Dne, aem);
        this.field_20257f3d_FWm.field_2092ae_Dne = this.field_22352e_ICU;
        this.field_20257f3d_FWm.method_b1d7af9a_Dne(this);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("playerGameType", this.field_37515de_Dne.method_230878ef_Dne().method_7a46288d_Dne());
    }

    @Override
    public void method_2d24817a_Dne(boolean bl, boolean bl2, boolean bl3) {
        if (this.method_9b310ff4_Wwe()) {
            this.method_2305a4ac_Dne().method_230e0484_Dne().method_a9258ca5_FWm(this, new UVb(this, 3));
        }
        super.method_2d24817a_Dne(bl, bl2, bl3);
        if (this.field_36dacd0_Dne != null) {
            this.field_36dacd0_Dne.method_c38d48a4_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, this.field_29186a_XHL);
        }
    }

    @Override
    public float method_59ee189_c_() {
        return 1.62f;
    }
}

