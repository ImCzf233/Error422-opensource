package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class lSM {
    private float field_21260a_FWm;
    private float field_2092ab_Dne;
    private float field_2e5f18_bzF;

    public float method_16b620a_Dne(float f, float f2) {
        this.field_2092ab_Dne += f;
        f = (this.field_2092ab_Dne - this.field_21260a_FWm) * f2;
        this.field_2e5f18_bzF += (f - this.field_2e5f18_bzF) * 0.5f;
        if (f > 0.0f && f > this.field_2e5f18_bzF || f < 0.0f && f < this.field_2e5f18_bzF) {
            f = this.field_2e5f18_bzF;
        }
        this.field_21260a_FWm += f;
        return f;
    }
}

