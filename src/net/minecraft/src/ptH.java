package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class ptH {
    public static double field_2092a9_Dne;
    public double field_267cf0_Qnq;
    public static ptH field_37a7828_Dne;
    public Snh field_36d36bf_Dne;
    public fZI field_3758af7_Dne;
    public XyI field_36fa224_Dne;
    public static double field_2e5f16_bzF;
    public double field_388da1_zGp;
    public static double field_212608_FWm;
    public float field_2092ab_Dne;
    public double field_2d29ef_aFZ;
    public float field_21260a_FWm;
    private Map<Object, QCe> field_83b1c1b0_Dne = new HashMap();
    public Qnq field_36c4f18_Dne;
    public static boolean field_2092bf_Dne;
    public FUH field_2020b812_FWm;
    public FUH field_366ec33_Dne;
    private msA field_3791671_Dne;

    public QCe method_bfc37b61_Dne(Class clazz) {
        QCe qCe = (QCe)this.field_83b1c1b0_Dne.get(clazz);
        if (qCe == null && clazz != sMa.class) {
            qCe = this.method_bfc37b61_Dne(clazz.getSuperclass());
            this.field_83b1c1b0_Dne.put(clazz, qCe);
        }
        return qCe;
    }

    public QCe method_9a2db71e_Dne(sMa sMa2) {
        return this.method_bfc37b61_Dne(sMa2.getClass());
    }

    static {
        field_37a7828_Dne = new ptH();
        field_2092bf_Dne = false;
    }

    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        block9: {
            QCe qCe = null;
            try {
                qCe = this.method_9a2db71e_Dne(sMa2);
                if (qCe == null || this.field_36d36bf_Dne == null) break block9;
                if (field_2092bf_Dne && !sMa2.method_998e662d_Vxn()) {
                    try {
                        this.method_f0cfd9bd_FWm(sMa2, d, d2, d3, f, f2);
                    }
                    catch (Throwable throwable) {
                        throw new kaJ(McM.method_948e60df_Dne(throwable, "Rendering entity hitbox in world"));
                    }
                }
                try {
                    qCe.method_31745cde_Dne(sMa2, d, d2, d3, f, f2);
                }
                catch (Throwable throwable) {
                    throw new kaJ(McM.method_948e60df_Dne(throwable, "Rendering entity in world"));
                }
                try {
                    qCe.method_f0cfd9bd_FWm(sMa2, d, d2, d3, f, f2);
                }
                catch (Throwable throwable) {
                    throw new kaJ(McM.method_948e60df_Dne(throwable, "Post-rendering entity in world"));
                }
            }
            catch (Throwable throwable) {
                McM mcM = McM.method_948e60df_Dne(throwable, "Rendering entity in world");
                Noo noo = mcM.method_284dc627_Dne("Entity being rendered");
                sMa2.method_7e400579_Dne(noo);
                Noo noo2 = mcM.method_284dc627_Dne("Renderer details");
                noo2.method_5e295ec0_Dne("Assigned renderer", qCe);
                noo2.method_5e295ec0_Dne("Location", Noo.method_2c81c77c_Dne(d, d2, d3));
                noo2.method_5e295ec0_Dne("Rotation", Float.valueOf(f));
                noo2.method_5e295ec0_Dne("Delta", Float.valueOf(f2));
                throw new kaJ(mcM);
            }
        }
    }

    private ptH() {
        this.field_83b1c1b0_Dne.put(osi.class, new QUJ());
        this.field_83b1c1b0_Dne.put(PGM.class, new QUJ());
        this.field_83b1c1b0_Dne.put(fNv.class, new MHy(new aTM(), new aTM(0.5f), 0.7f));
        this.field_83b1c1b0_Dne.put(Pvd.class, new UJs(new vea(), new eXl(), 0.7f));
        this.field_83b1c1b0_Dne.put(wBN.class, new dTm(new pPF(), 0.7f));
        this.field_83b1c1b0_Dne.put(Ahh.class, new EyS(new pPF(), 0.7f));
        this.field_83b1c1b0_Dne.put(oEB.class, new Uyd(new cgN(), new cgN(), 0.5f));
        this.field_83b1c1b0_Dne.put(GRq.class, new xhl_1(new Gdb(), 0.3f));
        this.field_83b1c1b0_Dne.put(kQo.class, new pCU(new JgT(), 0.4f));
        this.field_83b1c1b0_Dne.put(zTy.class, new szg());
        this.field_83b1c1b0_Dne.put(gls.class, new WUR());
        this.field_83b1c1b0_Dne.put(iGp.class, new bLW());
        this.field_83b1c1b0_Dne.put(wao.class, new TrR());
        this.field_83b1c1b0_Dne.put(yxx_0.class, new Jvi());
        this.field_83b1c1b0_Dne.put(bVr.class, new Mlu());
        this.field_83b1c1b0_Dne.put(hlo.class, new vGU());
        this.field_83b1c1b0_Dne.put(zxd.class, new iqS());
        this.field_83b1c1b0_Dne.put(Tgj.class, new ENB(new Irw(16), new Irw(0), 0.25f));
        this.field_83b1c1b0_Dne.put(WDT.class, new OgB());
        this.field_83b1c1b0_Dne.put(FiG.class, new CSH());
        this.field_83b1c1b0_Dne.put(ZFJ.class, new KYQ(new fsj(), 0.5f, 6.0f));
        this.field_83b1c1b0_Dne.put(VAd.class, new ydy());
        this.field_83b1c1b0_Dne.put(Xxe.class, new QiJ(new HJR(), 0.7f));
        this.field_83b1c1b0_Dne.put(pjB.class, new olK());
        this.field_83b1c1b0_Dne.put(CDE.class, new vnj());
        this.field_83b1c1b0_Dne.put(FUH.class, new YAD(new Sgm(), 0.5f));
        this.field_83b1c1b0_Dne.put(oaw.class, new hMm());
        this.field_83b1c1b0_Dne.put(WSC.class, new JOY());
        this.field_83b1c1b0_Dne.put(Ndk.class, new wgU());
        this.field_83b1c1b0_Dne.put(DhB.class, new TSA());
        this.field_83b1c1b0_Dne.put(sMa.class, new zsp());
        this.field_83b1c1b0_Dne.put(JCd.class, new iDg());
        this.field_83b1c1b0_Dne.put(BPY.class, new WoI());
        this.field_83b1c1b0_Dne.put(hhc.class, new Non());
        this.field_83b1c1b0_Dne.put(kxx_0.class, new lkB(dEr.field_4817800a_iNQ));
        this.field_83b1c1b0_Dne.put(Hhj.class, new lkB(dEr.field_38bbe273_iNH));
        this.field_83b1c1b0_Dne.put(UMP.class, new lkB(dEr.field_1031d495_Woy));
        this.field_83b1c1b0_Dne.put(TCA.class, new lkB(dEr.field_b39ca005_KLR));
        this.field_83b1c1b0_Dne.put(YgL.class, new lkB(dEr.field_3682442_Dne, 16384));
        this.field_83b1c1b0_Dne.put(AEw.class, new lkB(dEr.field_cd34217a_wns));
        this.field_83b1c1b0_Dne.put(zMx.class, new lkB(dEr.field_f764b325_kQw));
        this.field_83b1c1b0_Dne.put(iis.class, new svf(2.0f));
        this.field_83b1c1b0_Dne.put(Xzh.class, new svf(0.5f));
        this.field_83b1c1b0_Dne.put(YCH.class, new VmQ());
        this.field_83b1c1b0_Dne.put(JiM.class, new eKj());
        this.field_83b1c1b0_Dne.put(alg.class, new cZD());
        this.field_83b1c1b0_Dne.put(gqg.class, new UmO());
        this.field_83b1c1b0_Dne.put(CiF.class, new zWy());
        this.field_83b1c1b0_Dne.put(Art.class, new bga());
        this.field_83b1c1b0_Dne.put(sry.class, new Yck());
        this.field_83b1c1b0_Dne.put(Ebp.class, new dfe());
        this.field_83b1c1b0_Dne.put(iMX.class, new EmE());
        this.field_83b1c1b0_Dne.put(cQz.class, new GLU());
        this.field_83b1c1b0_Dne.put(xIh.class, new ehi_0());
        for (QCe qCe : this.field_83b1c1b0_Dne.values()) {
            qCe.method_b87985a3_Dne(this);
        }
    }

    public msA method_2312a4d0_Dne() {
        return this.field_3791671_Dne;
    }

    public double method_2be42992_Dne(double d, double d2, double d3) {
        double d4 = d - this.field_267cf0_Qnq;
        double d5 = d2 - this.field_2d29ef_aFZ;
        double d6 = d3 - this.field_388da1_zGp;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public void method_83516093_Dne(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
    }

    public void method_c5c357b9_Dne(Qnq qnq, Snh snh, msA msA2, FUH fUH, FUH fUH2, fZI fZI2, float f) {
        this.field_36c4f18_Dne = qnq;
        this.field_36d36bf_Dne = snh;
        this.field_3758af7_Dne = fZI2;
        this.field_366ec33_Dne = fUH;
        this.field_2020b812_FWm = fUH2;
        this.field_3791671_Dne = msA2;
        if (fUH.method_9b310ff4_Wwe()) {
            int n = qnq.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(fUH.field_2f0dd3_div), geR.method_117d0718_FWm(fUH.field_22c5fd_IjH), geR.method_117d0718_FWm(fUH.field_334487_mrb));
            if (n == zKP.field_d57af75_FfS.field_21260d_FWm) {
                int n2 = qnq.method_2dee76f_bzF(geR.method_117d0718_FWm(fUH.field_2f0dd3_div), geR.method_117d0718_FWm(fUH.field_22c5fd_IjH), geR.method_117d0718_FWm(fUH.field_334487_mrb));
                int n3 = n2 & 3;
                this.field_2092ab_Dne = n3 * 90 + 180;
                this.field_21260a_FWm = 0.0f;
            }
        } else {
            this.field_2092ab_Dne = fUH.field_2a9ad3_Zpi + (fUH.field_334489_mrb - fUH.field_2a9ad3_Zpi) * f;
            this.field_21260a_FWm = fUH.field_31b813_kGO + (fUH.field_29186a_XHL - fUH.field_31b813_kGO) * f;
        }
        if (fZI2.field_2f0dd8_div == 2) {
            this.field_2092ab_Dne += 180.0f;
        }
        this.field_267cf0_Qnq = fUH.field_36b0a4_udO + (fUH.field_2f0dd3_div - fUH.field_36b0a4_udO) * (double)f;
        this.field_2d29ef_aFZ = fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * (double)f;
        this.field_388da1_zGp = fUH.field_36714f_trS + (fUH.field_334487_mrb - fUH.field_36714f_trS) * (double)f;
    }

    private void method_f0cfd9bd_FWm(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        GL11.glDepthMask(false);
        GL11.glDisable(3553);
        GL11.glDisable(2896);
        GL11.glDisable(2884);
        GL11.glDisable(3042);
        GL11.glPushMatrix();
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_5972745a_Dne(255, 255, 255, 32);
        double d4 = -sMa2.field_342261_ooe / 2.0f;
        double d5 = -sMa2.field_342261_ooe / 2.0f;
        double d6 = sMa2.field_342261_ooe / 2.0f;
        double d7 = -sMa2.field_342261_ooe / 2.0f;
        double d8 = -sMa2.field_342261_ooe / 2.0f;
        double d9 = sMa2.field_342261_ooe / 2.0f;
        double d10 = sMa2.field_342261_ooe / 2.0f;
        double d11 = sMa2.field_342261_ooe / 2.0f;
        double d12 = sMa2.field_367151_trS;
        wAR.method_2be429a4_Dne(d + d4, d2 + d12, d3 + d5);
        wAR.method_2be429a4_Dne(d + d4, d2, d3 + d5);
        wAR.method_2be429a4_Dne(d + d6, d2, d3 + d7);
        wAR.method_2be429a4_Dne(d + d6, d2 + d12, d3 + d7);
        wAR.method_2be429a4_Dne(d + d10, d2 + d12, d3 + d11);
        wAR.method_2be429a4_Dne(d + d10, d2, d3 + d11);
        wAR.method_2be429a4_Dne(d + d8, d2, d3 + d9);
        wAR.method_2be429a4_Dne(d + d8, d2 + d12, d3 + d9);
        wAR.method_2be429a4_Dne(d + d6, d2 + d12, d3 + d7);
        wAR.method_2be429a4_Dne(d + d6, d2, d3 + d7);
        wAR.method_2be429a4_Dne(d + d10, d2, d3 + d11);
        wAR.method_2be429a4_Dne(d + d10, d2 + d12, d3 + d11);
        wAR.method_2be429a4_Dne(d + d8, d2 + d12, d3 + d9);
        wAR.method_2be429a4_Dne(d + d8, d2, d3 + d9);
        wAR.method_2be429a4_Dne(d + d4, d2, d3 + d5);
        wAR.method_2be429a4_Dne(d + d4, d2 + d12, d3 + d5);
        wAR.method_7a46288d_Dne();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2896);
        GL11.glEnable(2884);
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
    }

    public void method_b43d93a0_Dne(sMa sMa2, float f) {
        if (sMa2.field_388da6_zGp == 0) {
            sMa2.field_36b0a4_udO = sMa2.field_2f0dd3_div;
            sMa2.field_34225f_ooe = sMa2.field_22c5fd_IjH;
            sMa2.field_36714f_trS = sMa2.field_334487_mrb;
        }
        double d = sMa2.field_36b0a4_udO + (sMa2.field_2f0dd3_div - sMa2.field_36b0a4_udO) * (double)f;
        double d2 = sMa2.field_34225f_ooe + (sMa2.field_22c5fd_IjH - sMa2.field_34225f_ooe) * (double)f;
        double d3 = sMa2.field_36714f_trS + (sMa2.field_334487_mrb - sMa2.field_36714f_trS) * (double)f;
        float f2 = sMa2.field_2a9ad3_Zpi + (sMa2.field_334489_mrb - sMa2.field_2a9ad3_Zpi) * f;
        int n = sMa2.method_ce7f5259_Dne(f);
        if (sMa2.method_cc5ef5c4_trS()) {
            n = 0xF000F0;
        }
        int n2 = n % 65536;
        int n3 = n / 65536;
        oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n2 / 1.0f, (float)n3 / 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.method_31745cde_Dne(sMa2, d - field_2092a9_Dne, d2 - field_212608_FWm, d3 - field_2e5f16_bzF, f2, f);
    }

    public void method_845caac7_Dne(Rbp rbp) {
        for (QCe qCe : this.field_83b1c1b0_Dne.values()) {
            qCe.method_845caac7_Dne(rbp);
        }
    }
}

