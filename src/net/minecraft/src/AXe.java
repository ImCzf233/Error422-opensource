package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class AXe
implements YzO {
    private FiG field_3673728_Dne;
    private ybO field_37e4cc6_Dne;
    private Jmn field_3691c61_Dne;

    @Override
    public void method_703284a3_Dne(FiG fiG) {
    }

    public AXe(FiG fiG) {
        this.field_3673728_Dne = fiG;
        this.field_3691c61_Dne = new Jmn(fiG, this);
    }

    @Override
    public FiG method_2300c587_Dne() {
        return this.field_3673728_Dne;
    }

    @Override
    public ybO method_53f50aae_Dne(FiG fiG) {
        return this.field_37e4cc6_Dne;
    }

    @Override
    public void method_c6daaac1_Dne(ybO ybO2) {
        this.field_37e4cc6_Dne = ybO2;
    }

    @Override
    public void method_8bda100d_Dne(Vnr vnr) {
    }
}

