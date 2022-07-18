package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class OdI {
    protected List field_7eb83e1f_bzF;
    protected tIz field_37bae47_Dne;
    public int field_2092ae_Dne;
    public static final OdI field_712ec03e_aFZ;
    protected edi field_3754002_Dne;
    public static final OdI field_14141222_div;
    public static final OdI field_74f5ced6_mrb;
    protected Woy field_36f0e0b_Dne;
    private boolean field_21261e_FWm;
    public static final OdI field_3952279f_OdI;
    public static final OdI field_35ca9ce1_ATE;
    protected List field_2c197105_Qnq;
    public byte field_212606_FWm;
    public int field_21260d_FWm;
    public static final OdI field_1f002cbc_qLR;
    public static final OdI field_1c2cca37_XHL;
    public static final OdI field_84fc81d0_ceE;
    public float field_21260a_FWm;
    public float field_267cf2_Qnq;
    public float field_2e5f18_bzF;
    public static final OdI field_a21b6d60_kGO;
    public static final OdI field_75b309e5_bzF;
    public Fnk field_3674e49_Dne;
    public static final OdI field_36b3bf8_Dne;
    public float field_2092ab_Dne;
    protected ghu field_3763938_Dne;
    public static final OdI field_d448080_FfS;
    public static final OdI field_719a51c7_Vxn;
    public static final OdI field_161e6521_DyG;
    public static final OdI field_6164f020_Zpi;
    public String field_569fcf45_Dne;
    public static final OdI field_3285579e_trS;
    public byte field_2092a7_Dne;
    public static final OdI field_ab2400ae_ooe;
    public int field_2e5f1b_bzF;
    protected List field_6a0474ed_FWm;
    public static final OdI field_202507d7_FWm;
    public static final OdI field_aefbe473_udO;
    public static final OdI[] field_83618953_Dne;
    public final int field_267cf5_Qnq;
    protected List field_f27c122c_Dne;
    public static final OdI field_f09cfaf0_zGp;
    public static final OdI field_5bba54c_IjH;
    public static final OdI field_757756e5_EyB;
    public static final OdI field_5e54aabf_Qnq;
    private boolean field_2092bf_Dne;

    protected OdI method_9e6edfe6_Dne(int n) {
        this.field_21260d_FWm = n;
        return this;
    }

    public int method_907a9d14_Qnq() {
        double d = geR.method_2c0148d6_Dne(this.method_ae128db7_bzF(), 0.0f, 1.0f);
        double d2 = geR.method_2c0148d6_Dne(this.method_7c6f6029_FWm(), 0.0f, 1.0f);
        return QFY.method_16a71cd_Dne(d, d2);
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_267cf2_Qnq > 0.85f;
    }

    private OdI method_f87b1a76_FWm() {
        this.field_21261e_FWm = false;
        return this;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public void method_37de135f_Dne(Qnq qnq, Random random, int n, int n2) {
        this.field_3674e49_Dne.method_37de135f_Dne(qnq, random, n, n2);
    }

    public int method_ae128dba_bzF() {
        double d = geR.method_2c0148d6_Dne(this.method_ae128db7_bzF(), 0.0f, 1.0f);
        double d2 = geR.method_2c0148d6_Dne(this.method_7c6f6029_FWm(), 0.0f, 1.0f);
        return bzF.method_16a71cd_Dne(d, d2);
    }

    static {
        field_83618953_Dne = new OdI[256];
        field_36b3bf8_Dne = new eHV(0).method_77c293a7_FWm(112).method_284e0ca1_Dne("Ocean").method_b140836_FWm(-1.0f, 0.4f);
        field_202507d7_FWm = new mlD(1).method_77c293a7_FWm(9286496).method_284e0ca1_Dne("Plains").method_b9f143d7_Dne(0.8f, 0.4f);
        field_75b309e5_bzF = new qXo(2).method_77c293a7_FWm(16421912).method_284e0ca1_Dne("Desert").method_f87b1a76_FWm().method_b9f143d7_Dne(2.0f, 0.0f).method_b140836_FWm(0.1f, 0.2f);
        field_5e54aabf_Qnq = new AgF(3).method_77c293a7_FWm(0x606060).method_284e0ca1_Dne("Extreme Hills").method_b140836_FWm(0.3f, 1.5f).method_b9f143d7_Dne(0.2f, 0.3f);
        field_712ec03e_aFZ = new cot(4).method_77c293a7_FWm(353825).method_284e0ca1_Dne("Forest").method_9e6edfe6_Dne(5159473).method_b9f143d7_Dne(0.7f, 0.8f);
        field_f09cfaf0_zGp = new haP(5).method_77c293a7_FWm(747097).method_284e0ca1_Dne("Taiga").method_9e6edfe6_Dne(5159473).method_2304ca57_Dne().method_b9f143d7_Dne(0.05f, 0.8f).method_b140836_FWm(0.1f, 0.4f);
        field_161e6521_DyG = new rPc(6).method_77c293a7_FWm(522674).method_284e0ca1_Dne("Swampland").method_9e6edfe6_Dne(9154376).method_b140836_FWm(-0.2f, 0.1f).method_b9f143d7_Dne(0.8f, 0.9f);
        field_14141222_div = new EWz(7).method_77c293a7_FWm(255).method_284e0ca1_Dne("River").method_b140836_FWm(-0.5f, 0.0f);
        field_5bba54c_IjH = new Wwe(8).method_77c293a7_FWm(0xFF0000).method_284e0ca1_Dne("Hell").method_f87b1a76_FWm().method_b9f143d7_Dne(2.0f, 0.0f);
        field_74f5ced6_mrb = new qrB(9).method_77c293a7_FWm(0x8080FF).method_284e0ca1_Dne("Sky").method_f87b1a76_FWm();
        field_1c2cca37_XHL = new eHV(10).method_77c293a7_FWm(0x9090A0).method_284e0ca1_Dne("FrozenOcean").method_2304ca57_Dne().method_b140836_FWm(-1.0f, 0.5f).method_b9f143d7_Dne(0.0f, 0.5f);
        field_6164f020_Zpi = new EWz(11).method_77c293a7_FWm(0xA0A0FF).method_284e0ca1_Dne("FrozenRiver").method_2304ca57_Dne().method_b140836_FWm(-0.5f, 0.0f).method_b9f143d7_Dne(0.0f, 0.5f);
        field_a21b6d60_kGO = new eJi(12).method_77c293a7_FWm(0xFFFFFF).method_284e0ca1_Dne("Ice Plains").method_2304ca57_Dne().method_b9f143d7_Dne(0.0f, 0.5f);
        field_aefbe473_udO = new eJi(13).method_77c293a7_FWm(0xA0A0A0).method_284e0ca1_Dne("Ice Mountains").method_2304ca57_Dne().method_b140836_FWm(0.3f, 1.3f).method_b9f143d7_Dne(0.0f, 0.5f);
        field_ab2400ae_ooe = new ZgS(14).method_77c293a7_FWm(0xFF00FF).method_284e0ca1_Dne("MushroomIsland").method_b9f143d7_Dne(0.9f, 1.0f).method_b140836_FWm(0.2f, 1.0f);
        field_3285579e_trS = new ZgS(15).method_77c293a7_FWm(0xA000FF).method_284e0ca1_Dne("MushroomIslandShore").method_b9f143d7_Dne(0.9f, 1.0f).method_b140836_FWm(-1.0f, 0.1f);
        field_1f002cbc_qLR = new FfS(16).method_77c293a7_FWm(16440917).method_284e0ca1_Dne("Beach").method_b9f143d7_Dne(0.8f, 0.4f).method_b140836_FWm(0.0f, 0.1f);
        field_35ca9ce1_ATE = new qXo(17).method_77c293a7_FWm(13786898).method_284e0ca1_Dne("DesertHills").method_f87b1a76_FWm().method_b9f143d7_Dne(2.0f, 0.0f).method_b140836_FWm(0.3f, 0.8f);
        field_719a51c7_Vxn = new cot(18).method_77c293a7_FWm(2250012).method_284e0ca1_Dne("ForestHills").method_9e6edfe6_Dne(5159473).method_b9f143d7_Dne(0.7f, 0.8f).method_b140836_FWm(0.3f, 0.7f);
        field_84fc81d0_ceE = new haP(19).method_77c293a7_FWm(1456435).method_284e0ca1_Dne("TaigaHills").method_2304ca57_Dne().method_9e6edfe6_Dne(5159473).method_b9f143d7_Dne(0.05f, 0.8f).method_b140836_FWm(0.3f, 0.8f);
        field_757756e5_EyB = new AgF(20).method_77c293a7_FWm(7501978).method_284e0ca1_Dne("Extreme Hills Edge").method_b140836_FWm(0.2f, 0.8f).method_b9f143d7_Dne(0.2f, 0.3f);
        field_d448080_FfS = new one_0(21).method_77c293a7_FWm(5470985).method_284e0ca1_Dne("Jungle").method_9e6edfe6_Dne(5470985).method_b9f143d7_Dne(1.2f, 0.9f).method_b140836_FWm(0.2f, 0.4f);
        field_3952279f_OdI = new one_0(22).method_77c293a7_FWm(2900485).method_284e0ca1_Dne("JungleHills").method_9e6edfe6_Dne(5470985).method_b9f143d7_Dne(1.2f, 0.9f).method_b140836_FWm(1.8f, 0.5f);
    }

    public final float method_7c6f6029_FWm() {
        return this.field_267cf2_Qnq;
    }

    public final float method_ae128db7_bzF() {
        return this.field_2e5f18_bzF;
    }

    public int method_ce7f5259_Dne(float f) {
        if ((f /= 3.0f) < -1.0f) {
            f = -1.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.getHSBColor(0.62222224f - f * 0.05f, 0.5f + f * 0.1f, 1.0f).getRGB();
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2092bf_Dne ? false : this.field_21261e_FWm;
    }

    public float method_7a46288a_Dne() {
        return 0.1f;
    }

    public final int method_7c6f602c_FWm() {
        return (int)(this.field_2e5f18_bzF * 65536.0f);
    }

    public gwq method_d15c9bd6_Dne(Random random) {
        return random.nextInt(10) == 0 ? this.field_3754002_Dne : this.field_3763938_Dne;
    }

    public gwq method_9b80c235_FWm(Random random) {
        return new Wnd(zKP.field_36dc147_Dne.field_21260d_FWm, 1);
    }

    public final int method_7a46288d_Dne() {
        return (int)(this.field_267cf2_Qnq * 65536.0f);
    }

    public List method_32fd9ea9_Dne(Icc icc) {
        return icc == Icc.field_3688123_Dne ? this.field_f27c122c_Dne : (icc == Icc.field_20224d02_FWm ? this.field_6a0474ed_FWm : (icc == Icc.field_5e51efea_Qnq ? this.field_7eb83e1f_bzF : (icc == Icc.field_75b04f10_bzF ? this.field_2c197105_Qnq : null)));
    }

    protected OdI method_2304ca57_Dne() {
        this.field_2092bf_Dne = true;
        return this;
    }

    private OdI method_b140836_FWm(float f, float f2) {
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        return this;
    }

    private OdI method_b9f143d7_Dne(float f, float f2) {
        if (f > 0.1f && f < 0.2f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.field_2e5f18_bzF = f;
        this.field_267cf2_Qnq = f2;
        return this;
    }

    protected OdI method_77c293a7_FWm(int n) {
        this.field_2092ae_Dne = n;
        return this;
    }

    protected Fnk method_2300dca8_Dne() {
        return new Fnk(this);
    }

    protected OdI method_284e0ca1_Dne(String string) {
        this.field_569fcf45_Dne = string;
        return this;
    }

    protected OdI(int n) {
        this.field_2092a7_Dne = (byte)zKP.field_36ff555_Dne.field_21260d_FWm;
        this.field_212606_FWm = (byte)zKP.field_203836cc_FWm.field_21260d_FWm;
        this.field_21260d_FWm = 5169201;
        this.field_2092ab_Dne = 0.1f;
        this.field_21260a_FWm = 0.3f;
        this.field_2e5f18_bzF = 0.5f;
        this.field_267cf2_Qnq = 0.5f;
        this.field_2e5f1b_bzF = 0xFFFFFF;
        this.field_f27c122c_Dne = new ArrayList();
        this.field_6a0474ed_FWm = new ArrayList();
        this.field_7eb83e1f_bzF = new ArrayList();
        this.field_2c197105_Qnq = new ArrayList();
        this.field_21261e_FWm = true;
        this.field_3763938_Dne = new ghu(false);
        this.field_3754002_Dne = new edi(false);
        this.field_37bae47_Dne = new tIz(false);
        this.field_36f0e0b_Dne = new Woy();
        this.field_267cf5_Qnq = n;
        OdI.field_83618953_Dne[n] = this;
        this.field_3674e49_Dne = this.method_2300dca8_Dne();
        this.field_6a0474ed_FWm.add(new oIf(Pvd.class, 12, 4, 4));
        this.field_6a0474ed_FWm.add(new oIf(fNv.class, 10, 4, 4));
        this.field_6a0474ed_FWm.add(new oIf(GRq.class, 10, 4, 4));
        this.field_6a0474ed_FWm.add(new oIf(wBN.class, 8, 4, 4));
        this.field_f27c122c_Dne.add(new oIf(osi.class, 10, 4, 4));
        this.field_f27c122c_Dne.add(new oIf(zxd.class, 10, 4, 4));
        this.field_f27c122c_Dne.add(new oIf(yxx_0.class, 10, 4, 4));
        this.field_f27c122c_Dne.add(new oIf(gls.class, 10, 4, 4));
        this.field_f27c122c_Dne.add(new oIf(Tgj.class, 10, 4, 4));
        this.field_f27c122c_Dne.add(new oIf(iGp.class, 1, 1, 4));
        this.field_7eb83e1f_bzF.add(new oIf(Xxe.class, 10, 4, 4));
        this.field_2c197105_Qnq.add(new oIf(oaw.class, 10, 8, 8));
    }
}

