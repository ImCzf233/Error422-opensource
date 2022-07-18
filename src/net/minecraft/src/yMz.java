package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class yMz
extends tgc {
    private float field_2092ab_Dne;
    private float field_21260a_FWm;
    private OdI field_36b3bf8_Dne;

    @Override
    public float[] method_1851b0dd_FWm(float[] fArray, int n, int n2, int n3, int n4) {
        if (fArray == null || fArray.length < n3 * n4) {
            fArray = new float[n3 * n4];
        }
        Arrays.fill(fArray, 0, n3 * n4, this.field_2092ab_Dne);
        return fArray;
    }

    @Override
    public OdI[] method_c825dc8c_Dne(OdI[] odIArray, int n, int n2, int n3, int n4, boolean bl) {
        return this.method_f1decbbd_FWm(odIArray, n, n2, n3, n4);
    }

    @Override
    public EyB method_962b7b29_Dne(int n, int n2, int n3, List list, Random random) {
        return list.contains(this.field_36b3bf8_Dne) ? new EyB(n - n3 + random.nextInt(n3 * 2 + 1), 0, n2 - n3 + random.nextInt(n3 * 2 + 1)) : null;
    }

    @Override
    public boolean method_39acd2be_Dne(int n, int n2, int n3, List list) {
        return list.contains(this.field_36b3bf8_Dne);
    }

    @Override
    public OdI[] method_f1decbbd_FWm(OdI[] odIArray, int n, int n2, int n3, int n4) {
        if (odIArray == null || odIArray.length < n3 * n4) {
            odIArray = new OdI[n3 * n4];
        }
        Arrays.fill(odIArray, 0, n3 * n4, this.field_36b3bf8_Dne);
        return odIArray;
    }

    public yMz(OdI odI, float f, float f2) {
        this.field_36b3bf8_Dne = odI;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
    }

    @Override
    public float[] method_451be95c_Dne(float[] fArray, int n, int n2, int n3, int n4) {
        if (fArray == null || fArray.length < n3 * n4) {
            fArray = new float[n3 * n4];
        }
        Arrays.fill(fArray, 0, n3 * n4, this.field_21260a_FWm);
        return fArray;
    }

    @Override
    public OdI[] method_3ae4153c_Dne(OdI[] odIArray, int n, int n2, int n3, int n4) {
        if (odIArray == null || odIArray.length < n3 * n4) {
            odIArray = new OdI[n3 * n4];
        }
        Arrays.fill(odIArray, 0, n3 * n4, this.field_36b3bf8_Dne);
        return odIArray;
    }

    @Override
    public OdI method_90477c37_Dne(int n, int n2) {
        return this.field_36b3bf8_Dne;
    }
}

