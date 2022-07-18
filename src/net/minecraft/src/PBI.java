package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class PBI
extends dEr {
    private int field_2e5f1b_bzF;
    private final boolean field_2e5f2c_bzF;
    private int field_20b857_DyG;
    private int field_388da6_zGp;
    private boolean field_267d06_Qnq;
    private final int field_21260d_FWm;
    private float field_21260a_FWm;
    public final int field_2092ae_Dne;
    private final float field_2092ab_Dne;

    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }

    public PBI(int n, int n2, boolean bl) {
        this(n, n2, 0.6f, bl);
    }

    @Override
    public int method_e4cfb2b_a_(NMq nMq) {
        return 32;
    }

    public PBI method_18f27911_Dne(int n, int n2, int n3, float f) {
        this.field_2e5f1b_bzF = n;
        this.field_388da6_zGp = n2;
        this.field_20b857_DyG = n3;
        this.field_21260a_FWm = f;
        return this;
    }

    public boolean method_a98a0664_aFZ() {
        return this.field_2e5f2c_bzF;
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    @Override
    public NMq method_89e9a565_FWm(NMq nMq, Qnq qnq, FiG fiG) {
        --nMq.field_2092ae_Dne;
        fiG.method_230621e2_Dne().method_7f1e4ef0_Dne(this);
        qnq.method_a36f5f6a_Dne(fiG, "random.burp", 0.5f, qnq.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f);
        this.method_b9e6905_Dne(nMq, qnq, fiG);
        return nMq;
    }

    public PBI(int n, int n2, float f, boolean bl) {
        super(n);
        this.field_2092ae_Dne = 32;
        this.field_21260d_FWm = n2;
        this.field_2e5f2c_bzF = bl;
        this.field_2092ab_Dne = f;
        this.method_829e7ad2_Dne(JcN.field_161c1c20_DyG);
    }

    public PBI method_2304bf14_Dne() {
        this.field_267d06_Qnq = true;
        return this;
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        if (fiG.method_ce7f9d7e_Dne(this.field_267d06_Qnq)) {
            fiG.method_fd8868e_Dne(nMq, this.method_e4cfb2b_a_(nMq));
        }
        return nMq;
    }

    protected void method_b9e6905_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        if (!qnq.field_2d2a05_aFZ && this.field_2e5f1b_bzF > 0 && qnq.field_7331eae7_Dne.nextFloat() < this.field_21260a_FWm) {
            fiG.method_fe8e2b7b_Qnq(new NAx(this.field_2e5f1b_bzF, this.field_388da6_zGp * 20, this.field_20b857_DyG));
        }
    }

    @Override
    public een method_c9acc3b8_Dne(NMq nMq) {
        return een.field_202f103d_FWm;
    }
}

