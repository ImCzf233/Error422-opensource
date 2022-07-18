package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class tgc {
    private vSL field_37cb6fd_Dne = new vSL(this);
    private List field_f27c122c_Dne = new ArrayList();
    private yBi field_37dd7cc_Dne;
    private yBi field_2037a3ab_FWm;

    public List method_adea226d_Dne() {
        return this.field_f27c122c_Dne;
    }

    public float[] method_1851b0dd_FWm(float[] fArray, int n, int n2, int n3, int n4) {
        Xyv.method_7a46289a_Dne();
        if (fArray == null || fArray.length < n3 * n4) {
            fArray = new float[n3 * n4];
        }
        int[] nArray = this.field_2037a3ab_FWm.method_d4dc17ca_Dne(n, n2, n3, n4);
        for (int i = 0; i < n3 * n4; ++i) {
            float f = (float)OdI.field_83618953_Dne[nArray[i]].method_7c6f602c_FWm() / 65536.0f;
            if (f > 1.0f) {
                f = 1.0f;
            }
            fArray[i] = f;
        }
        return fArray;
    }

    public EyB method_962b7b29_Dne(int n, int n2, int n3, List list, Random random) {
        Xyv.method_7a46289a_Dne();
        int n4 = n - n3 >> 2;
        int n5 = n2 - n3 >> 2;
        int n6 = n + n3 >> 2;
        int n7 = n2 + n3 >> 2;
        int n8 = n6 - n4 + 1;
        int n9 = n7 - n5 + 1;
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n4, n5, n8, n9);
        EyB eyB = null;
        int n10 = 0;
        for (int i = 0; i < n8 * n9; ++i) {
            int n11 = n4 + i % n8 << 2;
            int n12 = n5 + i / n8 << 2;
            OdI odI = OdI.field_83618953_Dne[nArray[i]];
            if (!list.contains(odI) || eyB != null && random.nextInt(n10 + 1) != 0) continue;
            eyB = new EyB(n11, 0, n12);
            ++n10;
        }
        return eyB;
    }

    public boolean method_39acd2be_Dne(int n, int n2, int n3, List list) {
        Xyv.method_7a46289a_Dne();
        int n4 = n - n3 >> 2;
        int n5 = n2 - n3 >> 2;
        int n6 = n + n3 >> 2;
        int n7 = n2 + n3 >> 2;
        int n8 = n6 - n4 + 1;
        int n9 = n7 - n5 + 1;
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n4, n5, n8, n9);
        for (int i = 0; i < n8 * n9; ++i) {
            OdI odI = OdI.field_83618953_Dne[nArray[i]];
            if (list.contains(odI)) continue;
            return false;
        }
        return true;
    }

    public OdI[] method_c825dc8c_Dne(OdI[] odIArray, int n, int n2, int n3, int n4, boolean bl) {
        Xyv.method_7a46289a_Dne();
        if (odIArray == null || odIArray.length < n3 * n4) {
            odIArray = new OdI[n3 * n4];
        }
        if (bl && n3 == 16 && n4 == 16 && (n & 0xF) == 0 && (n2 & 0xF) == 0) {
            OdI[] odIArray2 = this.field_37cb6fd_Dne.method_920d50f4_Dne(n, n2);
            System.arraycopy(odIArray2, 0, odIArray, 0, n3 * n4);
            return odIArray;
        }
        int[] nArray = this.field_2037a3ab_FWm.method_d4dc17ca_Dne(n, n2, n3, n4);
        for (int i = 0; i < n3 * n4; ++i) {
            odIArray[i] = OdI.field_83618953_Dne[nArray[i]];
        }
        return odIArray;
    }

    public OdI[] method_f1decbbd_FWm(OdI[] odIArray, int n, int n2, int n3, int n4) {
        return this.method_c825dc8c_Dne(odIArray, n, n2, n3, n4, true);
    }

    public OdI method_90477c37_Dne(int n, int n2) {
        return this.field_37cb6fd_Dne.method_90477c37_Dne(n, n2);
    }

    public OdI[] method_3ae4153c_Dne(OdI[] odIArray, int n, int n2, int n3, int n4) {
        Xyv.method_7a46289a_Dne();
        if (odIArray == null || odIArray.length < n3 * n4) {
            odIArray = new OdI[n3 * n4];
        }
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n, n2, n3, n4);
        for (int i = 0; i < n3 * n4; ++i) {
            odIArray[i] = OdI.field_83618953_Dne[nArray[i]];
        }
        return odIArray;
    }

    protected tgc() {
        this.field_f27c122c_Dne.add(OdI.field_712ec03e_aFZ);
        this.field_f27c122c_Dne.add(OdI.field_202507d7_FWm);
        this.field_f27c122c_Dne.add(OdI.field_f09cfaf0_zGp);
        this.field_f27c122c_Dne.add(OdI.field_84fc81d0_ceE);
        this.field_f27c122c_Dne.add(OdI.field_719a51c7_Vxn);
        this.field_f27c122c_Dne.add(OdI.field_d448080_FfS);
        this.field_f27c122c_Dne.add(OdI.field_3952279f_OdI);
    }

    public tgc(long l, kGO kGO2) {
        this();
        yBi[] yBiArray = yBi.method_1929e0de_Dne(l, kGO2);
        this.field_37dd7cc_Dne = yBiArray[0];
        this.field_2037a3ab_FWm = yBiArray[1];
    }

    public void method_7a46289a_Dne() {
        this.field_37cb6fd_Dne.method_7a46289a_Dne();
    }

    public tgc(Qnq qnq) {
        this(qnq.method_7a46288e_Dne(), qnq.method_231798c9_Dne().method_23111898_Dne());
    }

    public float method_16b6d4d_Dne(float f, int n) {
        return f;
    }

    public float[] method_451be95c_Dne(float[] fArray, int n, int n2, int n3, int n4) {
        Xyv.method_7a46289a_Dne();
        if (fArray == null || fArray.length < n3 * n4) {
            fArray = new float[n3 * n4];
        }
        int[] nArray = this.field_2037a3ab_FWm.method_d4dc17ca_Dne(n, n2, n3, n4);
        for (int i = 0; i < n3 * n4; ++i) {
            float f = (float)OdI.field_83618953_Dne[nArray[i]].method_7a46288d_Dne() / 65536.0f;
            if (f > 1.0f) {
                f = 1.0f;
            }
            fArray[i] = f;
        }
        return fArray;
    }
}

