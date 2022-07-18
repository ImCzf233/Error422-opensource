package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from XWr
 */
public class xwr_0 {
    public float field_21260a_FWm;
    public FUH field_366ec33_Dne;
    public static xwr_0 field_36f2779_Dne = new xwr_0();
    public double field_2d29ef_aFZ;
    public double field_267cf0_Qnq;
    private Map<Object, jte_0> field_83b1c1b0_Dne = new HashMap();
    public Snh field_36d36bf_Dne;
    public Qnq field_36c4f18_Dne;
    public static double field_2e5f16_bzF;
    public double field_388da1_zGp;
    public static double field_212608_FWm;
    private msA field_3791671_Dne;
    public static double field_2092a9_Dne;
    public float field_2092ab_Dne;

    private xwr_0() {
        this.field_83b1c1b0_Dne.put(AjG.class, new leL());
        this.field_83b1c1b0_Dne.put(ySb.class, new FYH());
        this.field_83b1c1b0_Dne.put(SoB.class, new Gal());
        this.field_83b1c1b0_Dne.put(gon_0.class, new pEE());
        this.field_83b1c1b0_Dne.put(RPI.class, new zpc());
        this.field_83b1c1b0_Dne.put(llR.class, new wIp());
        this.field_83b1c1b0_Dne.put(CmX.class, new AQe());
        this.field_83b1c1b0_Dne.put(TpA.class, new mVN());
        this.field_83b1c1b0_Dne.put(CUf.class, new rzA());
        for (jte_0 jte_02 : this.field_83b1c1b0_Dne.values()) {
            jte_02.method_8dffa4b4_Dne(this);
        }
    }

    public void method_83516093_Dne(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
        for (jte_0 jte_02 : this.field_83b1c1b0_Dne.values()) {
            if (jte_02 == null) continue;
            jte_02.method_83516093_Dne(qnq);
        }
    }

    public void method_bdc49bcc_Dne(ipD ipD2, double d, double d2, double d3, float f) {
        jte_0 jte_02 = this.method_9025ed20_Dne(ipD2);
        if (jte_02 != null) {
            try {
                jte_02.method_bdc49bcc_Dne(ipD2, d, d2, d3, f);
            }
            catch (Throwable throwable) {
                McM mcM = McM.method_948e60df_Dne(throwable, "Rendering Tile Entity");
                Noo noo = mcM.method_284dc627_Dne("Tile Entity Details");
                ipD2.method_7e400579_Dne(noo);
                throw new kaJ(mcM);
            }
        }
    }

    public jte_0 method_9025ed20_Dne(ipD ipD2) {
        return ipD2 == null ? null : this.method_bfc104b9_Dne(ipD2.getClass());
    }

    public jte_0 method_bfc104b9_Dne(Class clazz) {
        jte_0 jte_02 = (jte_0)this.field_83b1c1b0_Dne.get(clazz);
        if (jte_02 == null && clazz != ipD.class) {
            jte_02 = this.method_bfc104b9_Dne(clazz.getSuperclass());
            this.field_83b1c1b0_Dne.put(clazz, jte_02);
        }
        return jte_02;
    }

    public msA method_2312a4d0_Dne() {
        return this.field_3791671_Dne;
    }

    public void method_3d9b023d_Dne(Qnq qnq, Snh snh, msA msA2, FUH fUH, float f) {
        if (this.field_36c4f18_Dne != qnq) {
            this.method_83516093_Dne(qnq);
        }
        this.field_36d36bf_Dne = snh;
        this.field_366ec33_Dne = fUH;
        this.field_3791671_Dne = msA2;
        this.field_2092ab_Dne = fUH.field_2a9ad3_Zpi + (fUH.field_334489_mrb - fUH.field_2a9ad3_Zpi) * f;
        this.field_21260a_FWm = fUH.field_31b813_kGO + (fUH.field_29186a_XHL - fUH.field_31b813_kGO) * f;
        this.field_267cf0_Qnq = fUH.field_36b0a4_udO + (fUH.field_2f0dd3_div - fUH.field_36b0a4_udO) * (double)f;
        this.field_2d29ef_aFZ = fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * (double)f;
        this.field_388da1_zGp = fUH.field_36714f_trS + (fUH.field_334487_mrb - fUH.field_36714f_trS) * (double)f;
    }

    public void method_dd603736_Dne(ipD ipD2, float f) {
        if (ipD2.method_2be42992_Dne(this.field_267cf0_Qnq, this.field_2d29ef_aFZ, this.field_388da1_zGp) < ipD2.method_582b285_a_()) {
            int n = this.field_36c4f18_Dne.method_5972744d_Dne(ipD2.field_267cf5_Qnq, ipD2.field_2d29f4_aFZ, ipD2.field_388da6_zGp, 0);
            int n2 = n % 65536;
            int n3 = n / 65536;
            oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n2 / 1.0f, (float)n3 / 1.0f);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.method_bdc49bcc_Dne(ipD2, (double)ipD2.field_267cf5_Qnq - field_2092a9_Dne, (double)ipD2.field_2d29f4_aFZ - field_212608_FWm, (double)ipD2.field_388da6_zGp - field_2e5f16_bzF, f);
        }
    }

    public boolean method_ac4d69ce_Dne(ipD ipD2) {
        return this.method_9025ed20_Dne(ipD2) != null;
    }
}

