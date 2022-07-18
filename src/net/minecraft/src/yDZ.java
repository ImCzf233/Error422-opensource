package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class yDZ {
    public static final String field_71b21c1d_Zpi;
    public static final String field_8b8e234d_zGp;
    private static final HashMap field_3b2f1a8b_bzF;
    public static final String field_309c90bc_DyG;
    public static final String field_9e60dbde_Qnq;
    public static final String field_bc57ecbf_aFZ;
    public static final String field_569fcf45_Dne;
    private static final HashMap field_154cc8fd_FWm;
    public static final String field_90a75527_mrb;
    public static final String field_d9a85c6_FWm;
    public static final String field_dae99f66_XHL;
    public static final String field_c480ca78_bzF;
    private static final HashMap field_ecf0af5e_Dne;
    public static final String field_be5cd5b_div;
    public static final String field_aac82e71_IjH;
    private static final String[] field_f5e54dca_Dne;

    static {
        field_c480ca78_bzF = "+0-1-2-3&4-4+13";
        field_569fcf45_Dne = null;
        field_ecf0af5e_Dne = new HashMap();
        field_154cc8fd_FWm = new HashMap();
        field_ecf0af5e_Dne.put(SXd.field_1c2e71ec_XHL.method_7a46288d_Dne(), "0 & !1 & !2 & !3 & 0+6");
        field_d9a85c6_FWm = "-0+1-2-3&4-4+13";
        field_ecf0af5e_Dne.put(SXd.field_2026af8c_FWm.method_7a46288d_Dne(), "!0 & 1 & !2 & !3 & 1+6");
        field_be5cd5b_div = "+0+1-2-3&4-4+13";
        field_ecf0af5e_Dne.put(SXd.field_a21d1515_kGO.method_7a46288d_Dne(), "0 & 1 & !2 & !3 & 0+6");
        field_8b8e234d_zGp = "+0-1+2-3&4-4+13";
        field_ecf0af5e_Dne.put(SXd.field_16200cd6_DyG.method_7a46288d_Dne(), "0 & !1 & 2 & !3");
        field_9e60dbde_Qnq = "-0-1+2-3&4-4+13";
        field_ecf0af5e_Dne.put(SXd.field_84fe2985_ceE.method_7a46288d_Dne(), "!0 & !1 & 2 & !3 & 2+6");
        field_bc57ecbf_aFZ = "-0+3-4+13";
        field_ecf0af5e_Dne.put(SXd.field_719bf97c_Vxn.method_7a46288d_Dne(), "!0 & !1 & !2 & 3 & 3+6");
        field_ecf0af5e_Dne.put(SXd.field_1415b9d7_div.method_7a46288d_Dne(), "!0 & !1 & 2 & 3");
        field_ecf0af5e_Dne.put(SXd.field_75b4b19a_bzF.method_7a46288d_Dne(), "!0 & 1 & !2 & 3 & 3+6");
        field_309c90bc_DyG = "+0-1-2+3&4-4+13";
        field_ecf0af5e_Dne.put(SXd.field_f09ea2a5_zGp.method_7a46288d_Dne(), "0 & !1 & !2 & 3 & 3+6");
        field_71b21c1d_Zpi = "-0+1+2-3+13&4-4";
        field_ecf0af5e_Dne.put(SXd.field_1f01d471_qLR.method_7a46288d_Dne(), "!0 & 1 & 2 & !3 & 2+6");
        field_ecf0af5e_Dne.put(SXd.field_ab25a863_ooe.method_7a46288d_Dne(), "!0 & 1 & 2 & 3 & 2+6");
        field_90a75527_mrb = "+5-6-7";
        field_154cc8fd_FWm.put(SXd.field_2026af8c_FWm.method_7a46288d_Dne(), "5");
        field_154cc8fd_FWm.put(SXd.field_5e565274_Qnq.method_7a46288d_Dne(), "5");
        field_154cc8fd_FWm.put(SXd.field_f09ea2a5_zGp.method_7a46288d_Dne(), "5");
        field_154cc8fd_FWm.put(SXd.field_1c2e71ec_XHL.method_7a46288d_Dne(), "5");
        field_154cc8fd_FWm.put(SXd.field_1415b9d7_div.method_7a46288d_Dne(), "5");
        field_154cc8fd_FWm.put(SXd.field_16200cd6_DyG.method_7a46288d_Dne(), "5");
        field_154cc8fd_FWm.put(SXd.field_616697d5_Zpi.method_7a46288d_Dne(), "5");
        field_154cc8fd_FWm.put(SXd.field_84fe2985_ceE.method_7a46288d_Dne(), "5");
        field_aac82e71_IjH = "-5+6-7";
        field_dae99f66_XHL = "+14&13-13";
        field_3b2f1a8b_bzF = new HashMap();
        field_f5e54dca_Dne = new String[]{"potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky"};
    }

    private static int method_16cca6d_Dne(int n, int n2) {
        return yDZ.method_16cca7e_Dne(n, n2) ? 1 : 0;
    }

    public static int method_fa81cf26_Dne(int n, String string) {
        int n2 = 0;
        int n3 = string.length();
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        int n4 = 0;
        for (int i = n2; i < n3; ++i) {
            char c = string.charAt(i);
            if (c >= '0' && c <= '9') {
                n4 *= 10;
                n4 += c - 48;
                bl = true;
                continue;
            }
            if (c == '!') {
                if (bl) {
                    n = yDZ.method_d5d4138d_Dne(n, n4, bl3, bl2, bl4);
                    bl4 = false;
                    bl2 = false;
                    bl3 = false;
                    bl = false;
                    n4 = 0;
                }
                bl2 = true;
                continue;
            }
            if (c == '-') {
                if (bl) {
                    n = yDZ.method_d5d4138d_Dne(n, n4, bl3, bl2, bl4);
                    bl4 = false;
                    bl2 = false;
                    bl3 = false;
                    bl = false;
                    n4 = 0;
                }
                bl3 = true;
                continue;
            }
            if (c == '+') {
                if (!bl) continue;
                n = yDZ.method_d5d4138d_Dne(n, n4, bl3, bl2, bl4);
                bl4 = false;
                bl2 = false;
                bl3 = false;
                bl = false;
                n4 = 0;
                continue;
            }
            if (c != '&') continue;
            if (bl) {
                n = yDZ.method_d5d4138d_Dne(n, n4, bl3, bl2, bl4);
                bl4 = false;
                bl2 = false;
                bl3 = false;
                bl = false;
                n4 = 0;
            }
            bl4 = true;
        }
        if (bl) {
            n = yDZ.method_d5d4138d_Dne(n, n4, bl3, bl2, bl4);
        }
        return n & Short.MAX_VALUE;
    }

    public static String method_2c0e7e17_Dne(int n) {
        int n2 = yDZ.method_ce7f5d9c_Dne(n);
        return field_f5e54dca_Dne[n2];
    }

    public static int method_ce7f5d9c_Dne(int n) {
        return yDZ.method_c6b5262d_Dne(n, 5, 4, 3, 2, 1);
    }

    public static int method_16d0a3e_Dne(int n, boolean bl) {
        if (!bl) {
            if (field_3b2f1a8b_bzF.containsKey(n)) {
                return (Integer)field_3b2f1a8b_bzF.get(n);
            }
            int n2 = yDZ.method_18d926be_Dne(yDZ.method_5fdf889c_Dne(n, false));
            field_3b2f1a8b_bzF.put(n, n2);
            return n2;
        }
        return yDZ.method_18d926be_Dne(yDZ.method_5fdf889c_Dne(n, bl));
    }

    public static boolean method_18d926cf_Dne(Collection collection) {
        NAx nAx;
        Iterator iterator = collection.iterator();
        do {
            if (iterator.hasNext()) continue;
            return true;
        } while ((nAx = (NAx)iterator.next()).method_7c6f603d_FWm());
        return false;
    }

    public static List method_5fdf889c_Dne(int n, boolean bl) {
        ArrayList<NAx> arrayList = null;
        for (SXd sXd : SXd.field_83633108_Dne) {
            int n2;
            String string;
            if (sXd == null || sXd.method_907a9d25_Qnq() && !bl || (string = (String)field_ecf0af5e_Dne.get(sXd.method_7a46288d_Dne())) == null || (n2 = yDZ.method_7eed4432_Dne(string, 0, string.length(), n)) <= 0) continue;
            int n3 = 0;
            String string2 = (String)field_154cc8fd_FWm.get(sXd.method_7a46288d_Dne());
            if (string2 != null && (n3 = yDZ.method_7eed4432_Dne(string2, 0, string2.length(), n)) < 0) {
                n3 = 0;
            }
            if (sXd.method_7a46289e_Dne()) {
                n2 = 1;
            } else {
                n2 = 1200 * (n2 * 3 + (n2 - 1) * 2);
                n2 >>= n3;
                n2 = (int)Math.round((double)n2 * sXd.method_7a462888_Dne());
                if ((n & 0x4000) != 0) {
                    n2 = (int)Math.round((double)n2 * 0.75 + 0.5);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList<NAx>();
            }
            NAx nAx = new NAx(sXd.method_7a46288d_Dne(), n2, n3);
            if ((n & 0x4000) != 0) {
                nAx.method_ce7f9d7a_Dne(true);
            }
            arrayList.add(nAx);
        }
        return arrayList;
    }

    public static int method_18d926be_Dne(Collection<NAx> collection) {
        int n = 3694022;
        if (collection != null && !collection.isEmpty()) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (NAx nAx : collection) {
                int n2 = SXd.field_83633108_Dne[nAx.method_7a46288d_Dne()].method_ae128dba_bzF();
                for (int i = 0; i <= nAx.method_ae128dba_bzF(); ++i) {
                    f += (float)(n2 >> 16 & 0xFF) / 255.0f;
                    f2 += (float)(n2 >> 8 & 0xFF) / 255.0f;
                    f3 += (float)(n2 >> 0 & 0xFF) / 255.0f;
                    f4 += 1.0f;
                }
            }
            f = f / f4 * 255.0f;
            f2 = f2 / f4 * 255.0f;
            f3 = f3 / f4 * 255.0f;
            return (int)f << 16 | (int)f2 << 8 | (int)f3;
        }
        return n;
    }

    private static int method_51b95d2d_Dne(boolean bl, boolean bl2, boolean bl3, int n, int n2, int n3, int n4) {
        int n5 = 0;
        if (bl) {
            n5 = yDZ.method_1e26964c_FWm(n4, n2);
        } else if (n != -1) {
            if (n == 0 && yDZ.method_117d19dd_FWm(n4) == n2) {
                n5 = 1;
            } else if (n == 1 && yDZ.method_117d19dd_FWm(n4) > n2) {
                n5 = 1;
            } else if (n == 2 && yDZ.method_117d19dd_FWm(n4) < n2) {
                n5 = 1;
            }
        } else {
            n5 = yDZ.method_16cca6d_Dne(n4, n2);
        }
        if (bl2) {
            n5 *= n3;
        }
        if (bl3) {
            n5 *= -1;
        }
        return n5;
    }

    private static int method_117d19dd_FWm(int n) {
        int n2 = 0;
        while (n > 0) {
            n &= n - 1;
            ++n2;
        }
        return n2;
    }

    private static int method_7eed4432_Dne(String string, int n, int n2, int n3) {
        if (n < string.length() && n2 >= 0 && n < n2) {
            int n4 = string.indexOf(124, n);
            if (n4 >= 0 && n4 < n2) {
                int n5 = yDZ.method_7eed4432_Dne(string, n, n4 - 1, n3);
                if (n5 > 0) {
                    return n5;
                }
                int n6 = yDZ.method_7eed4432_Dne(string, n4 + 1, n2, n3);
                return n6 > 0 ? n6 : 0;
            }
            int n7 = string.indexOf(38, n);
            if (n7 >= 0 && n7 < n2) {
                int n8 = yDZ.method_7eed4432_Dne(string, n, n7 - 1, n3);
                if (n8 <= 0) {
                    return 0;
                }
                int n9 = yDZ.method_7eed4432_Dne(string, n7 + 1, n2, n3);
                return n9 <= 0 ? 0 : (n8 > n9 ? n8 : n9);
            }
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            boolean bl5 = false;
            int n10 = -1;
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            for (int i = n; i < n2; ++i) {
                char c = string.charAt(i);
                if (c >= '0' && c <= '9') {
                    if (bl) {
                        n12 = c - 48;
                        bl2 = true;
                        continue;
                    }
                    n11 *= 10;
                    n11 += c - 48;
                    bl3 = true;
                    continue;
                }
                if (c == '*') {
                    bl = true;
                    continue;
                }
                if (c == '!') {
                    if (bl3) {
                        n13 += yDZ.method_51b95d2d_Dne(bl4, bl2, bl5, n10, n11, n12, n3);
                        bl4 = false;
                        bl5 = false;
                        bl = false;
                        bl2 = false;
                        bl3 = false;
                        n12 = 0;
                        n11 = 0;
                        n10 = -1;
                    }
                    bl4 = true;
                    continue;
                }
                if (c == '-') {
                    if (bl3) {
                        n13 += yDZ.method_51b95d2d_Dne(bl4, bl2, bl5, n10, n11, n12, n3);
                        bl4 = false;
                        bl5 = false;
                        bl = false;
                        bl2 = false;
                        bl3 = false;
                        n12 = 0;
                        n11 = 0;
                        n10 = -1;
                    }
                    bl5 = true;
                    continue;
                }
                if (c != '=' && c != '<' && c != '>') {
                    if (c != '+' || !bl3) continue;
                    n13 += yDZ.method_51b95d2d_Dne(bl4, bl2, bl5, n10, n11, n12, n3);
                    bl4 = false;
                    bl5 = false;
                    bl = false;
                    bl2 = false;
                    bl3 = false;
                    n12 = 0;
                    n11 = 0;
                    n10 = -1;
                    continue;
                }
                if (bl3) {
                    n13 += yDZ.method_51b95d2d_Dne(bl4, bl2, bl5, n10, n11, n12, n3);
                    bl4 = false;
                    bl5 = false;
                    bl = false;
                    bl2 = false;
                    bl3 = false;
                    n12 = 0;
                    n11 = 0;
                    n10 = -1;
                }
                if (c == '=') {
                    n10 = 0;
                    continue;
                }
                if (c == '<') {
                    n10 = 2;
                    continue;
                }
                if (c != '>') continue;
                n10 = 1;
            }
            if (bl3) {
                n13 += yDZ.method_51b95d2d_Dne(bl4, bl2, bl5, n10, n11, n12, n3);
            }
            return n13;
        }
        return 0;
    }

    private static int method_d5d4138d_Dne(int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        if (bl3) {
            if (!yDZ.method_16cca7e_Dne(n, n2)) {
                return 0;
            }
        } else {
            n = bl ? (n &= ~(1 << n2)) : (bl2 ? ((n & 1 << n2) == 0 ? (n |= 1 << n2) : (n &= ~(1 << n2))) : (n |= 1 << n2));
        }
        return n;
    }

    public static int method_c6b5262d_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        return (yDZ.method_16cca7e_Dne(n, n2) ? 16 : 0) | (yDZ.method_16cca7e_Dne(n, n3) ? 8 : 0) | (yDZ.method_16cca7e_Dne(n, n4) ? 4 : 0) | (yDZ.method_16cca7e_Dne(n, n5) ? 2 : 0) | (yDZ.method_16cca7e_Dne(n, n6) ? 1 : 0);
    }

    private static int method_1e26964c_FWm(int n, int n2) {
        return yDZ.method_16cca7e_Dne(n, n2) ? 0 : 1;
    }

    public static boolean method_16cca7e_Dne(int n, int n2) {
        return (n & 1 << n2) != 0;
    }
}

