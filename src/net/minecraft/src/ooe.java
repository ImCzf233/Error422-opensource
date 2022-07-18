package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public final class ooe {
    private static HashMap<Sxs, Object> field_ecf0af5e_Dne = new HashMap();
    protected static final Class[] field_3ebd6a43_Dne = new Class[]{osi.class, zxd.class, yxx_0.class};

    public static void method_fa919f46_Dne(Qnq qnq, OdI odI, int n, int n2, int n3, int n4, Random random) {
        List list = odI.method_32fd9ea9_Dne(Icc.field_20224d02_FWm);
        if (!list.isEmpty()) {
            while (random.nextFloat() < odI.method_7a46288a_Dne()) {
                oIf oIf2 = (oIf)nGp.method_5a3a1e72_Dne(qnq.field_7331eae7_Dne, list);
                int n5 = oIf2.field_2092ae_Dne + random.nextInt(1 + oIf2.field_21260d_FWm - oIf2.field_2092ae_Dne);
                int n6 = n + random.nextInt(n3);
                int n7 = n2 + random.nextInt(n4);
                int n8 = n6;
                int n9 = n7;
                for (int i = 0; i < n5; ++i) {
                    boolean bl = false;
                    for (int j = 0; !bl && j < 4; ++j) {
                        int n10 = qnq.method_6f304eb3_aFZ(n6, n7);
                        if (ooe.method_9ae12078_Dne(Icc.field_20224d02_FWm, qnq, n6, n10, n7)) {
                            FUH fUH;
                            float f = (float)n6 + 0.5f;
                            float f2 = n10;
                            float f3 = (float)n7 + 0.5f;
                            try {
                                fUH = (FUH)oIf2.field_ce3f4d68_Dne.getConstructor(Qnq.class).newInstance(qnq);
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                                continue;
                            }
                            fUH.method_9ce0fc65_FWm(f, f2, f3, random.nextFloat() * 360.0f, 0.0f);
                            qnq.method_94d18be5_FWm(fUH);
                            ooe.method_1a3548a1_Dne(fUH, qnq, f, f2, f3);
                            bl = true;
                        }
                        n6 += random.nextInt(5) - random.nextInt(5);
                        n7 += random.nextInt(5) - random.nextInt(5);
                        while (n6 < n || n6 >= n + n3 || n7 < n2 || n7 >= n2 + n3) {
                            n6 = n8 + random.nextInt(5) - random.nextInt(5);
                            n7 = n9 + random.nextInt(5) - random.nextInt(5);
                        }
                    }
                }
            }
        }
    }

    private static void method_1a3548a1_Dne(FUH fUH, Qnq qnq, float f, float f2, float f3) {
        fUH.method_80692b1a_ICU();
    }

    public static boolean method_9ae12078_Dne(Icc icc, Qnq qnq, int n, int n2, int n3) {
        if (icc.method_23028b82_Dne() == KFd.field_1411d34d_div) {
            return qnq.method_d9802b31_Dne(n, n2, n3).method_907a9d25_Qnq() && qnq.method_d9802b31_Dne(n, n2 - 1, n3).method_907a9d25_Qnq() && !qnq.method_6fdef3c4_DyG(n, n2 + 1, n3);
        }
        if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3)) {
            return false;
        }
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
        return n4 != zKP.field_f0b029e5_zGp.field_21260d_FWm && !qnq.method_6fdef3c4_DyG(n, n2, n3) && !qnq.method_d9802b31_Dne(n, n2, n3).method_907a9d25_Qnq() && !qnq.method_6fdef3c4_DyG(n, n2 + 1, n3);
    }

    protected static EyB method_4fb8d7b6_Dne(Qnq qnq, int n, int n2) {
        qMV qMV2 = qnq.method_e1796070_FWm(n, n2);
        int n3 = n * 16 + qnq.field_7331eae7_Dne.nextInt(16);
        int n4 = n2 * 16 + qnq.field_7331eae7_Dne.nextInt(16);
        int n5 = qnq.field_7331eae7_Dne.nextInt(qMV2 == null ? qnq.method_ae128dba_bzF() : qMV2.method_7a46288d_Dne() + 16 - 1);
        return new EyB(n3, n5, n4);
    }

    public static final int method_b3e08cbf_Dne(RAN rAN, boolean bl, boolean bl2, boolean bl3) {
        Object object;
        Object object2;
        int n;
        if (!bl && !bl2) {
            return 0;
        }
        field_ecf0af5e_Dne.clear();
        for (n = 0; n < rAN.field_2c197105_Qnq.size(); ++n) {
            object2 = (FiG)rAN.field_2c197105_Qnq.get(n);
            int n2 = geR.method_117d0718_FWm(((FiG)object2).field_2f0dd3_div / 16.0);
            int n3 = geR.method_117d0718_FWm(((FiG)object2).field_334487_mrb / 16.0);
            int n4 = 8;
            for (int i = -n4; i <= n4; ++i) {
                for (int j = -n4; j <= n4; ++j) {
                    boolean bl4 = i == -n4 || i == n4 || j == -n4 || j == n4;
                    object = new Sxs(i + n2, j + n3);
                    if (!bl4) {
                        field_ecf0af5e_Dne.put((Sxs) object, false);
                        continue;
                    }
                    if (field_ecf0af5e_Dne.containsKey(object)) continue;
                    field_ecf0af5e_Dne.put((Sxs) object, true);
                }
            }
        }
        n = 0;
        object2 = rAN.method_23105fed_Dne();
        for (Icc icc : Icc.values()) {
            if (icc.method_7a46289e_Dne() && !bl2 || !icc.method_7a46289e_Dne() && !bl || icc.method_7c6f603d_FWm() && !bl3 || rAN.method_5fce35d6_Dne(icc.method_80934547_Dne()) > icc.method_7a46288d_Dne() * field_ecf0af5e_Dne.size() / 256) continue;
            block6: for (Sxs sxs : field_ecf0af5e_Dne.keySet()) {
                if (((Boolean)field_ecf0af5e_Dne.get(sxs)).booleanValue()) continue;
                object = ooe.method_4fb8d7b6_Dne(rAN, sxs.field_2092ae_Dne, sxs.field_21260d_FWm);
                int n5 = ((EyB)object).field_2092ae_Dne;
                int n6 = ((EyB)object).field_21260d_FWm;
                int n7 = ((EyB)object).field_2e5f1b_bzF;
                if (rAN.method_6fdef3c4_DyG(n5, n6, n7) || rAN.method_d9802b31_Dne(n5, n6, n7) != icc.method_23028b82_Dne()) continue;
                int n8 = 0;
                block7: for (int i = 0; i < 3; ++i) {
                    int n9 = n5;
                    int n10 = n6;
                    int n11 = n7;
                    int n12 = 6;
                    oIf oIf2 = null;
                    for (int j = 0; j < 4; ++j) {
                        FUH fUH;
                        float f;
                        float f2;
                        float f3;
                        float f4;
                        float f5;
                        float f6;
                        float f7;
                        if (!ooe.method_9ae12078_Dne(icc, rAN, n9 += rAN.field_7331eae7_Dne.nextInt(n12) - rAN.field_7331eae7_Dne.nextInt(n12), n10 += rAN.field_7331eae7_Dne.nextInt(1) - rAN.field_7331eae7_Dne.nextInt(1), n11 += rAN.field_7331eae7_Dne.nextInt(n12) - rAN.field_7331eae7_Dne.nextInt(n12)) || rAN.method_fcf6c807_Dne(f7 = (float)n9 + 0.5f, f6 = (float)n10, f5 = (float)n11 + 0.5f, 24.0) != null || !((f4 = (f3 = f7 - (float)((iSh)object2).field_2092ae_Dne) * f3 + (f2 = f6 - (float)((iSh)object2).field_21260d_FWm) * f2 + (f = f5 - (float)((iSh)object2).field_2e5f1b_bzF) * f) >= 576.0f)) continue;
                        if (oIf2 == null && (oIf2 = rAN.method_1b920c4a_Dne(icc, n9, n10, n11)) == null) continue block7;
                        try {
                            fUH = (FUH)oIf2.field_ce3f4d68_Dne.getConstructor(Qnq.class).newInstance(rAN);
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return n;
                        }
                        fUH.method_9ce0fc65_FWm(f7, f6, f5, rAN.field_7331eae7_Dne.nextFloat() * 360.0f, 0.0f);
                        if (fUH.method_af414cf1_cot()) {
                            rAN.method_94d18be5_FWm(fUH);
                            ooe.method_1a3548a1_Dne(fUH, rAN, f7, f6, f5);
                            if (++n8 >= fUH.method_c3b4a2c3_ooe()) continue block6;
                        }
                        n += n8;
                    }
                }
            }
        }
        return n;
    }
}

