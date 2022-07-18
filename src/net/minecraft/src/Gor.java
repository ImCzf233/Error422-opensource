package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class Gor {
    public boolean field_388db7_zGp = false;
    public List field_f27c122c_Dne = new ArrayList();
    private Map field_83b1c1b0_Dne = new HashMap();
    public int field_2e5f1b_bzF = 64;
    public boolean field_20b868_DyG = true;
    public float field_2092ab_Dne;
    public int field_267cf5_Qnq = 32;

    public EZg method_28495f03_Dne(String string) {
        return (EZg)this.field_83b1c1b0_Dne.get(string);
    }

    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
    }

    protected void method_fbd61744_Dne(String string, int n, int n2) {
        this.field_83b1c1b0_Dne.put(string, new EZg(n, n2));
    }

    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
    }

    public rxL method_d1619b31_Dne(Random random) {
        return (rxL)this.field_f27c122c_Dne.get(random.nextInt(this.field_f27c122c_Dne.size()));
    }
}

