package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Cyb
extends cMv {
    private FUH field_366ec33_Dne;

    @Override
    public boolean method_7a46289e_Dne() {
        return this.field_366ec33_Dne.method_9feec6c6_Zpi() || this.field_366ec33_Dne.method_7ad38807_DyG();
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (this.field_366ec33_Dne.method_b5ceee8_Dne().nextFloat() < 0.8f) {
            this.field_366ec33_Dne.method_23144d3f_Dne().method_7a46289a_Dne();
        }
    }

    public Cyb(FUH fUH) {
        this.field_366ec33_Dne = fUH;
        this.method_ce7f5da9_Dne(4);
        fUH.method_23028a4c_Dne().method_87b77874_aFZ(true);
    }
}

