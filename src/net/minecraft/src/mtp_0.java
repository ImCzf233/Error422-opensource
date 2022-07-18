package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from MTP
 */
public class mtp_0
implements iQt {
    @Override
    public NMq method_23040479_Dne() {
        return null;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 10;
    }

    @Override
    public NMq method_b1bef5f5_Dne(Uqm uqm) {
        int n;
        float f;
        float f2;
        int n2;
        int n3;
        NMq nMq = null;
        int[] nArray = new int[3];
        int n4 = 0;
        int n5 = 0;
        qoi_0 qoi_02 = null;
        for (n3 = 0; n3 < uqm.method_907a9d14_Qnq(); ++n3) {
            NMq nMq2 = uqm.method_9e6e1a08_Dne(n3);
            if (nMq2 == null) continue;
            if (nMq2.method_230de6ba_Dne() instanceof qoi_0) {
                qoi_02 = (qoi_0)nMq2.method_230de6ba_Dne();
                if (qoi_02.method_2306c36c_Dne() != TNy.field_36d350d_Dne || nMq != null) {
                    return null;
                }
                nMq = nMq2.method_23040479_Dne();
                nMq.field_2092ae_Dne = 1;
                if (!qoi_02.method_7c61cf19_Dne(nMq2)) continue;
                n2 = qoi_02.method_7c61cf08_Dne(nMq);
                f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                f = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(n2 & 0xFF) / 255.0f;
                n4 = (int)((float)n4 + Math.max(f2, Math.max(f, f3)) * 255.0f);
                nArray[0] = (int)((float)nArray[0] + f2 * 255.0f);
                nArray[1] = (int)((float)nArray[1] + f * 255.0f);
                nArray[2] = (int)((float)nArray[2] + f3 * 255.0f);
                ++n5;
                continue;
            }
            if (nMq2.field_2e5f1b_bzF != dEr.field_5d50330c_edi.field_267cf5_Qnq) {
                return null;
            }
            float[] fArray = Pvd.field_7a46ee0b_Dne[Imc.method_ac88ebde_b_(nMq2.method_907a9d14_Qnq())];
            int n6 = (int)(fArray[0] * 255.0f);
            int n7 = (int)(fArray[1] * 255.0f);
            n = (int)(fArray[2] * 255.0f);
            n4 += Math.max(n6, Math.max(n7, n));
            nArray[0] = nArray[0] + n6;
            nArray[1] = nArray[1] + n7;
            nArray[2] = nArray[2] + n;
            ++n5;
        }
        if (qoi_02 == null) {
            return null;
        }
        n3 = nArray[0] / n5;
        int n8 = nArray[1] / n5;
        n2 = nArray[2] / n5;
        f2 = (float)n4 / (float)n5;
        f = Math.max(n3, Math.max(n8, n2));
        n3 = (int)((float)n3 * f2 / f);
        n8 = (int)((float)n8 * f2 / f);
        n2 = (int)((float)n2 * f2 / f);
        n = (n3 << 8) + n8;
        n = (n << 8) + n2;
        qoi_02.method_fd8868e_Dne(nMq, n);
        return nMq;
    }

    @Override
    public boolean method_cbf49e9b_Dne(Uqm uqm, Qnq qnq) {
        NMq nMq = null;
        ArrayList<NMq> arrayList = new ArrayList<NMq>();
        for (int i = 0; i < uqm.method_907a9d14_Qnq(); ++i) {
            NMq nMq2 = uqm.method_9e6e1a08_Dne(i);
            if (nMq2 == null) continue;
            if (nMq2.method_230de6ba_Dne() instanceof qoi_0) {
                qoi_0 qoi_02 = (qoi_0)nMq2.method_230de6ba_Dne();
                if (qoi_02.method_2306c36c_Dne() != TNy.field_36d350d_Dne || nMq != null) {
                    return false;
                }
                nMq = nMq2;
                continue;
            }
            if (nMq2.field_2e5f1b_bzF != dEr.field_5d50330c_edi.field_267cf5_Qnq) {
                return false;
            }
            arrayList.add(nMq2);
        }
        return nMq != null && !arrayList.isEmpty();
    }
}

