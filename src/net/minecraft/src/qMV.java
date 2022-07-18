package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class qMV {
    private int field_267cf5_Qnq = 4096;
    public static boolean field_2092bf_Dne;
    public int[] field_4039e0a_FWm;
    public boolean field_2d2a05_aFZ = false;
    public int[] field_3f1c589_Dne;
    public final int field_2092ae_Dne;
    public final int field_21260d_FWm;
    public List[] field_27a96df1_Dne;
    public Qnq field_36c4f18_Dne;
    private byte[] field_3f1c582_Dne;
    private boolean field_2f0de9_div = false;
    public boolean[] field_3f1c59a_Dne;
    public Map field_83b1c1b0_Dne;
    public boolean field_267d06_Qnq = false;
    public boolean field_388db7_zGp = false;
    public int field_2e5f1b_bzF = 0;
    public boolean field_21261e_FWm;
    private cHy[] field_836a3d73_Dne = new cHy[16];
    boolean field_20b868_DyG = false;
    public boolean field_2e5f2c_bzF = false;
    public long field_2092af_Dne = 0L;

    public Random method_30427018_Dne(long l) {
        return new Random(this.field_36c4f18_Dne.method_7a46288e_Dne() + (long)(this.field_2092ae_Dne * this.field_2092ae_Dne * 4987142) + (long)(this.field_2092ae_Dne * 5947611) + (long)(this.field_21260d_FWm * this.field_21260d_FWm) * 4392871L + (long)(this.field_21260d_FWm * 389711) ^ l);
    }

    private void method_a6aca7ca_FWm(int n, int n2, int n3) {
        int n4 = this.field_36c4f18_Dne.method_1e26964c_FWm(n, n2);
        if (n4 > n3) {
            this.method_5972745a_Dne(n, n2, n3, n4 + 1);
        } else if (n4 < n3) {
            this.method_5972745a_Dne(n, n2, n4, n3 + 1);
        }
    }

    public qMV(Qnq qnq, int n, int n2) {
        this.field_3f1c582_Dne = new byte[256];
        this.field_3f1c589_Dne = new int[256];
        this.field_3f1c59a_Dne = new boolean[256];
        this.field_83b1c1b0_Dne = new HashMap();
        this.field_27a96df1_Dne = new List[16];
        this.field_36c4f18_Dne = qnq;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_4039e0a_FWm = new int[256];
        for (int i = 0; i < this.field_27a96df1_Dne.length; ++i) {
            this.field_27a96df1_Dne[i] = new ArrayList();
        }
        Arrays.fill(this.field_3f1c589_Dne, -999);
        Arrays.fill(this.field_3f1c582_Dne, (byte)-1);
    }

    public void method_7a46289a_Dne() {
        int n = this.method_7a46288d_Dne();
        for (int i = 0; i < 16; ++i) {
            block1: for (int j = 0; j < 16; ++j) {
                this.field_3f1c589_Dne[i + (j << 4)] = -999;
                for (int k = n + 16 - 1; k > 0; --k) {
                    int n2 = this.method_2c2cf7bc_Dne(i, k - 1, j);
                    if (zKP.field_4039e0a_FWm[n2] == 0) {
                        continue;
                    }
                    this.field_4039e0a_FWm[j << 4 | i] = k;
                    continue block1;
                }
            }
        }
        this.field_267d06_Qnq = true;
    }

    public void method_d3f21eae_Dne(sMa sMa2, bSp bSp2, List list, pUe pUe2) {
        int n = geR.method_117d0718_FWm((bSp2.field_212608_FWm - 2.0) / 16.0);
        int n2 = geR.method_117d0718_FWm((bSp2.field_2d29ef_aFZ + 2.0) / 16.0);
        if (n < 0) {
            n = 0;
            n2 = Math.max(n, n2);
        }
        if (n2 >= this.field_27a96df1_Dne.length) {
            n2 = this.field_27a96df1_Dne.length - 1;
            n = Math.min(n, n2);
        }
        for (int i = n; i <= n2; ++i) {
            List list2 = this.field_27a96df1_Dne[i];
            for (int j = 0; j < list2.size(); ++j) {
                sMa sMa3 = (sMa)list2.get(j);
                if (sMa3 == sMa2 || !sMa3.field_373a3ed_Dne.method_9ed6d42c_Dne(bSp2) || pUe2 != null && !pUe2.method_bb7dd824_Dne(sMa3)) continue;
                list.add(sMa3);
                sMa[] sMaArray = sMa3.method_5709d0c1_Dne();
                if (sMaArray == null) continue;
                for (int k = 0; k < sMaArray.length; ++k) {
                    sMa3 = sMaArray[k];
                    if (sMa3 == sMa2 || !sMa3.field_373a3ed_Dne.method_9ed6d42c_Dne(bSp2) || pUe2 != null && !pUe2.method_bb7dd824_Dne(sMa3)) continue;
                    list.add(sMa3);
                }
            }
        }
    }

    public void method_b43d9ee3_Dne(sMa sMa2, int n) {
        if (n < 0) {
            n = 0;
        }
        if (n >= this.field_27a96df1_Dne.length) {
            n = this.field_27a96df1_Dne.length - 1;
        }
        this.field_27a96df1_Dne[n].remove(sMa2);
    }

    private void method_16cca7a_Dne(int n, int n2) {
        this.field_3f1c59a_Dne[n + n2 * 16] = true;
        this.field_2f0de9_div = true;
    }

    public boolean method_d4dc89ed_Dne(int n, int n2, int n3, int n4, int n5) {
        ipD ipD2;
        int n6 = n3 << 4 | n;
        if (n2 >= this.field_3f1c589_Dne[n6] - 1) {
            this.field_3f1c589_Dne[n6] = -999;
        }
        int n7 = this.field_4039e0a_FWm[n6];
        int n8 = this.method_2c2cf7bc_Dne(n, n2, n3);
        int n9 = this.method_2dee76f_bzF(n, n2, n3);
        if (n8 == n4 && n9 == n5) {
            return false;
        }
        cHy cHy2 = this.field_836a3d73_Dne[n2 >> 4];
        boolean bl = false;
        if (cHy2 == null) {
            if (n4 == 0) {
                return false;
            }
            cHy cHy3 = new cHy(n2 >> 4 << 4, !this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm);
            this.field_836a3d73_Dne[n2 >> 4] = cHy3;
            cHy2 = cHy3;
            bl = n2 >= n7;
        }
        int n10 = this.field_2092ae_Dne * 16 + n;
        int n11 = this.field_21260d_FWm * 16 + n3;
        if (n8 != 0 && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            zKP.field_8374b848_Dne[n8].method_c4df01db_zGp(this.field_36c4f18_Dne, n10, n2, n11, n9);
        }
        cHy2.method_5972745a_Dne(n, n2 & 0xF, n3, n4);
        if (n8 != 0) {
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                zKP.field_8374b848_Dne[n8].method_3e226590_Dne(this.field_36c4f18_Dne, n10, n2, n11, n8, n9);
            } else if (zKP.field_8374b848_Dne[n8] instanceof sCQ && n8 != n4) {
                this.field_36c4f18_Dne.method_2dee77c_bzF(n10, n2, n11);
            }
        }
        if (cHy2.method_2c2cf7bc_Dne(n, n2 & 0xF, n3) != n4) {
            return false;
        }
        cHy2.method_2ee8c479_FWm(n, n2 & 0xF, n3, n5);
        if (bl) {
            this.method_7c6f6039_FWm();
        } else {
            if (zKP.field_4039e0a_FWm[n4 & 0xFFF] > 0) {
                if (n2 >= n7) {
                    this.method_2dee77c_bzF(n, n2 + 1, n3);
                }
            } else if (n2 == n7 - 1) {
                this.method_2dee77c_bzF(n, n2, n3);
            }
            this.method_16cca7a_Dne(n, n3);
        }
        if (n4 != 0) {
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                zKP.field_8374b848_Dne[n4].method_9cb39130_Dne(this.field_36c4f18_Dne, n10, n2, n11);
            }
            if (zKP.field_8374b848_Dne[n4] instanceof sCQ) {
                ipD ipD3 = this.method_d98e681d_Dne(n, n2, n3);
                if (ipD3 == null) {
                    ipD3 = ((sCQ)((Object)zKP.field_8374b848_Dne[n4])).method_c35d5be7_Dne(this.field_36c4f18_Dne);
                    this.field_36c4f18_Dne.method_c583bffb_Dne(n10, n2, n11, ipD3);
                }
                if (ipD3 != null) {
                    ipD3.method_907a9d21_Qnq();
                }
            }
        } else if (n8 > 0 && zKP.field_8374b848_Dne[n8] instanceof sCQ && (ipD2 = this.method_d98e681d_Dne(n, n2, n3)) != null) {
            ipD2.method_907a9d21_Qnq();
        }
        this.field_267d06_Qnq = true;
        return true;
    }

    public void method_ae128dc7_bzF() {
        this.field_21261e_FWm = true;
        this.field_36c4f18_Dne.method_18d926cb_Dne(this.field_83b1c1b0_Dne.values());
        for (int i = 0; i < this.field_27a96df1_Dne.length; ++i) {
            this.field_36c4f18_Dne.method_ea14418b_Dne(this.field_27a96df1_Dne[i]);
        }
    }

    public OdI method_812dd1f4_Dne(int n, int n2, tgc tgc2) {
        int n3 = this.field_3f1c582_Dne[n2 << 4 | n] & 0xFF;
        if (n3 == 255) {
            OdI odI = tgc2.method_90477c37_Dne((this.field_2092ae_Dne << 4) + n, (this.field_21260d_FWm << 4) + n2);
            n3 = odI.field_267cf5_Qnq;
            this.field_3f1c582_Dne[n2 << 4 | n] = (byte)(n3 & 0xFF);
        }
        return OdI.field_83618953_Dne[n3] == null ? OdI.field_202507d7_FWm : OdI.field_83618953_Dne[n3];
    }

    public int method_60f38def_Dne(udO udO2, int n, int n2, int n3) {
        cHy cHy2 = this.field_836a3d73_Dne[n2 >> 4];
        return cHy2 == null ? (this.method_2c2cf7cd_Dne(n, n2, n3) ? udO2.field_2092ae_Dne : 0) : (udO2 == udO.field_37c82cc_Dne ? (this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm ? 0 : cHy2.method_2dee76f_bzF(n, n2 & 0xF, n3)) : (udO2 == udO.field_20364eab_FWm ? cHy2.method_2e7161d5_Qnq(n, n2 & 0xF, n3) : udO2.field_2092ae_Dne));
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        ipD ipD2;
        EyB eyB = new EyB(n, n2, n3);
        if (this.field_21261e_FWm && (ipD2 = (ipD)this.field_83b1c1b0_Dne.remove(eyB)) != null) {
            ipD2.method_d44b4592_zGp();
        }
    }

    public void method_174dee1_Dne(byte[] byArray) {
        this.field_3f1c582_Dne = byArray;
    }

    public cHy[] method_57027af4_Dne() {
        return this.field_836a3d73_Dne;
    }

    public qMV(Qnq qnq, byte[] byArray, int n, int n2) {
        this(qnq, n, n2);
        int n3 = byArray.length / 256;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < n3; ++k) {
                    byte by = byArray[i << 11 | j << 7 | k];
                    if (by == 0) continue;
                    int n4 = k >> 4;
                    if (this.field_836a3d73_Dne[n4] == null) {
                        this.field_836a3d73_Dne[n4] = new cHy(n4 << 4, !qnq.field_3690d00_Dne.field_21261e_FWm);
                    }
                    this.field_836a3d73_Dne[n4].method_5972745a_Dne(i, k & 0xF, j, by);
                }
            }
        }
    }

    public void method_94d18be1_FWm(sMa sMa2) {
        this.method_b43d9ee3_Dne(sMa2, sMa2.field_33448c_mrb);
    }

    public int method_a6aca7bd_FWm(int n, int n2, int n3) {
        return zKP.field_4039e0a_FWm[this.method_2c2cf7bc_Dne(n, n2, n3)];
    }

    public int method_1e26964c_FWm(int n, int n2) {
        int n3 = n | n2 << 4;
        int n4 = this.field_3f1c589_Dne[n3];
        if (n4 == -999) {
            int n5 = this.method_7a46288d_Dne() + 15;
            n4 = -1;
            while (n5 > 0 && n4 == -1) {
                KFd kFd;
                int n6 = this.method_2c2cf7bc_Dne(n, n5, n2);
                KFd kFd2 = kFd = n6 == 0 ? KFd.field_368fd23_Dne : zKP.field_8374b848_Dne[n6].field_368fd23_Dne;
                if (!kFd.method_ae128dcb_bzF() && !kFd.method_907a9d25_Qnq()) {
                    --n5;
                    continue;
                }
                n4 = n5 + 1;
            }
            this.field_3f1c589_Dne[n3] = n4;
        }
        return n4;
    }

    public void method_c583bffb_Dne(int n, int n2, int n3, ipD ipD2) {
        EyB eyB = new EyB(n, n2, n3);
        ipD2.method_83516093_Dne(this.field_36c4f18_Dne);
        ipD2.field_267cf5_Qnq = this.field_2092ae_Dne * 16 + n;
        ipD2.field_2d29f4_aFZ = n2;
        ipD2.field_388da6_zGp = this.field_21260d_FWm * 16 + n3;
        if (this.method_2c2cf7bc_Dne(n, n2, n3) != 0 && zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(n, n2, n3)] instanceof sCQ) {
            if (this.field_83b1c1b0_Dne.containsKey(eyB)) {
                ((ipD)this.field_83b1c1b0_Dne.get(eyB)).method_d44b4592_zGp();
            }
            ipD2.method_7ad38803_DyG();
            this.field_83b1c1b0_Dne.put(eyB, ipD2);
        }
    }

    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        return n2 >= this.field_4039e0a_FWm[n3 << 4 | n];
    }

    public byte[] method_ce7eeb83_Dne() {
        return this.field_3f1c582_Dne;
    }

    public int method_7a46288d_Dne() {
        for (int i = this.field_836a3d73_Dne.length - 1; i >= 0; --i) {
            if (this.field_836a3d73_Dne[i] == null) continue;
            return this.field_836a3d73_Dne[i].method_7a46288d_Dne();
        }
        return 0;
    }

    public int method_2dee76f_bzF(int n, int n2, int n3) {
        if (n2 >> 4 >= this.field_836a3d73_Dne.length) {
            return 0;
        }
        cHy cHy2 = this.field_836a3d73_Dne[n2 >> 4];
        return cHy2 != null ? cHy2.method_a6aca7bd_FWm(n, n2 & 0xF, n3) : 0;
    }

    public Sxs method_2306ebfd_Dne() {
        return new Sxs(this.field_2092ae_Dne, this.field_21260d_FWm);
    }

    public boolean method_16cca7e_Dne(int n, int n2) {
        return n == this.field_2092ae_Dne && n2 == this.field_21260d_FWm;
    }

    public int method_2c2cf7bc_Dne(int n, int n2, int n3) {
        if (n2 >> 4 >= this.field_836a3d73_Dne.length) {
            return 0;
        }
        cHy cHy2 = this.field_836a3d73_Dne[n2 >> 4];
        return cHy2 != null ? cHy2.method_2c2cf7bc_Dne(n, n2 & 0xF, n3) : 0;
    }

    public boolean method_5972745e_Dne(int n, int n2, int n3, int n4) {
        ipD ipD2;
        cHy cHy2 = this.field_836a3d73_Dne[n2 >> 4];
        if (cHy2 == null) {
            return false;
        }
        int n5 = cHy2.method_a6aca7bd_FWm(n, n2 & 0xF, n3);
        if (n5 == n4) {
            return false;
        }
        this.field_267d06_Qnq = true;
        cHy2.method_2ee8c479_FWm(n, n2 & 0xF, n3, n4);
        int n6 = cHy2.method_2c2cf7bc_Dne(n, n2 & 0xF, n3);
        if (n6 > 0 && zKP.field_8374b848_Dne[n6] instanceof sCQ && (ipD2 = this.method_d98e681d_Dne(n, n2, n3)) != null) {
            ipD2.method_907a9d21_Qnq();
            ipD2.field_20b857_DyG = n4;
        }
        return true;
    }

    public ipD method_d98e681d_Dne(int n, int n2, int n3) {
        EyB eyB = new EyB(n, n2, n3);
        ipD ipD2 = (ipD)this.field_83b1c1b0_Dne.get(eyB);
        if (ipD2 == null) {
            int n4 = this.method_2c2cf7bc_Dne(n, n2, n3);
            if (n4 <= 0 || !zKP.field_8374b848_Dne[n4].method_c073dafc_mrb()) {
                return null;
            }
            if (ipD2 == null) {
                ipD2 = ((sCQ)((Object)zKP.field_8374b848_Dne[n4])).method_c35d5be7_Dne(this.field_36c4f18_Dne);
                this.field_36c4f18_Dne.method_c583bffb_Dne(this.field_2092ae_Dne * 16 + n, n2, this.field_21260d_FWm * 16 + n3, ipD2);
            }
            ipD2 = (ipD)this.field_83b1c1b0_Dne.get(eyB);
        }
        if (ipD2 != null && ipD2.method_a98a0664_aFZ()) {
            this.field_83b1c1b0_Dne.remove(eyB);
            return null;
        }
        return ipD2;
    }

    private void method_2dee77c_bzF(int n, int n2, int n3) {
        int n4;
        int n5 = n4 = this.field_4039e0a_FWm[n3 << 4 | n] & 0xFF;
        if (n2 > n4) {
            n5 = n2;
        }
        while (n5 > 0 && this.method_a6aca7bd_FWm(n, n5 - 1, n3) == 0) {
            --n5;
        }
        if (n5 != n4) {
            int n6;
            int n7;
            this.field_36c4f18_Dne.method_2ee8c479_FWm(n + this.field_2092ae_Dne * 16, n3 + this.field_21260d_FWm * 16, n5, n4);
            this.field_4039e0a_FWm[n3 << 4 | n] = n5;
            int n8 = this.field_2092ae_Dne * 16 + n;
            int n9 = this.field_21260d_FWm * 16 + n3;
            if (!this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm) {
                cHy cHy2;
                if (n5 < n4) {
                    for (n7 = n5; n7 < n4; ++n7) {
                        cHy2 = this.field_836a3d73_Dne[n7 >> 4];
                        if (cHy2 == null) continue;
                        cHy2.method_58fe7b07_bzF(n, n7 & 0xF, n3, 15);
                        this.field_36c4f18_Dne.method_a6aca7ca_FWm((this.field_2092ae_Dne << 4) + n, n7, (this.field_21260d_FWm << 4) + n3);
                    }
                } else {
                    for (n7 = n4; n7 < n5; ++n7) {
                        cHy2 = this.field_836a3d73_Dne[n7 >> 4];
                        if (cHy2 == null) continue;
                        cHy2.method_58fe7b07_bzF(n, n7 & 0xF, n3, 0);
                        this.field_36c4f18_Dne.method_a6aca7ca_FWm((this.field_2092ae_Dne << 4) + n, n7, (this.field_21260d_FWm << 4) + n3);
                    }
                }
                n7 = 15;
                while (n5 > 0 && n7 > 0) {
                    cHy cHy3;
                    if ((n6 = this.method_a6aca7bd_FWm(n, --n5, n3)) == 0) {
                        n6 = 1;
                    }
                    if ((n7 -= n6) < 0) {
                        n7 = 0;
                    }
                    if ((cHy3 = this.field_836a3d73_Dne[n5 >> 4]) == null) continue;
                    cHy3.method_58fe7b07_bzF(n, n5 & 0xF, n3, n7);
                }
            }
            n7 = this.field_4039e0a_FWm[n3 << 4 | n];
            n6 = n4;
            int n10 = n7;
            if (n7 < n4) {
                n6 = n7;
                n10 = n4;
            }
            if (n7 < this.field_2e5f1b_bzF) {
                this.field_2e5f1b_bzF = n7;
            }
            if (!this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm) {
                this.method_5972745a_Dne(n8 - 1, n9, n6, n10);
                this.method_5972745a_Dne(n8 + 1, n9, n6, n10);
                this.method_5972745a_Dne(n8, n9 - 1, n6, n10);
                this.method_5972745a_Dne(n8, n9 + 1, n6, n10);
                this.method_5972745a_Dne(n8, n9, n6, n10);
            }
            this.field_267d06_Qnq = true;
        }
    }

    public void method_7ad38803_DyG() {
        this.field_267cf5_Qnq = 0;
    }

    public int method_16cca6d_Dne(int n, int n2) {
        return this.field_4039e0a_FWm[n2 << 4 | n];
    }

    public int method_5972744d_Dne(int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        cHy cHy2 = this.field_836a3d73_Dne[n2 >> 4];
        if (cHy2 == null) {
            return !this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm && n4 < udO.field_37c82cc_Dne.field_2092ae_Dne ? udO.field_37c82cc_Dne.field_2092ae_Dne - n4 : 0;
        }
        int n7 = n6 = this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm ? 0 : cHy2.method_2dee76f_bzF(n, n2 & 0xF, n3);
        if (n6 > 0) {
            field_2092bf_Dne = true;
        }
        if ((n5 = cHy2.method_2e7161d5_Qnq(n, n2 & 0xF, n3)) > (n6 -= n4)) {
            n6 = n5;
        }
        return n6;
    }

    public void method_7c6f6039_FWm() {
        int n;
        int n2;
        int n3 = this.method_7a46288d_Dne();
        this.field_2e5f1b_bzF = Integer.MAX_VALUE;
        for (n2 = 0; n2 < 16; ++n2) {
            for (n = 0; n < 16; ++n) {
                int n4;
                this.field_3f1c589_Dne[n2 + (n << 4)] = -999;
                for (n4 = n3 + 16 - 1; n4 > 0; --n4) {
                    if (this.method_a6aca7bd_FWm(n2, n4 - 1, n) == 0) {
                        continue;
                    }
                    this.field_4039e0a_FWm[n << 4 | n2] = n4;
                    if (n4 >= this.field_2e5f1b_bzF) break;
                    this.field_2e5f1b_bzF = n4;
                    break;
                }
                if (this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm) continue;
                n4 = 15;
                int n5 = n3 + 16 - 1;
                do {
                    cHy cHy2;
                    if ((n4 -= this.method_a6aca7bd_FWm(n2, n5, n)) <= 0 || (cHy2 = this.field_836a3d73_Dne[n5 >> 4]) == null) continue;
                    cHy2.method_58fe7b07_bzF(n2, n5 & 0xF, n, n4);
                    this.field_36c4f18_Dne.method_a6aca7ca_FWm((this.field_2092ae_Dne << 4) + n2, n5, (this.field_21260d_FWm << 4) + n);
                } while (--n5 > 0 && n4 > 0);
            }
        }
        this.field_267d06_Qnq = true;
        for (n2 = 0; n2 < 16; ++n2) {
            for (n = 0; n < 16; ++n) {
                this.method_16cca7a_Dne(n2, n);
            }
        }
    }

    public void method_b0a28144_div() {
        for (int i = 0; i < 8; ++i) {
            if (this.field_267cf5_Qnq >= 4096) {
                return;
            }
            int n = this.field_267cf5_Qnq % 16;
            int n2 = this.field_267cf5_Qnq / 16 % 16;
            int n3 = this.field_267cf5_Qnq / 256;
            ++this.field_267cf5_Qnq;
            int n4 = (this.field_2092ae_Dne << 4) + n2;
            int n5 = (this.field_21260d_FWm << 4) + n3;
            for (int j = 0; j < 16; ++j) {
                int n6 = (n << 4) + j;
                if ((this.field_836a3d73_Dne[n] != null || j != 0 && j != 15 && n2 != 0 && n2 != 15 && n3 != 0 && n3 != 15) && (this.field_836a3d73_Dne[n] == null || this.field_836a3d73_Dne[n].method_2c2cf7bc_Dne(n2, j, n3) != 0)) continue;
                if (zKP.field_59d86bc_bzF[this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n6 - 1, n5)] > 0) {
                    this.field_36c4f18_Dne.method_2e7161e2_Qnq(n4, n6 - 1, n5);
                }
                if (zKP.field_59d86bc_bzF[this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n6 + 1, n5)] > 0) {
                    this.field_36c4f18_Dne.method_2e7161e2_Qnq(n4, n6 + 1, n5);
                }
                if (zKP.field_59d86bc_bzF[this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4 - 1, n6, n5)] > 0) {
                    this.field_36c4f18_Dne.method_2e7161e2_Qnq(n4 - 1, n6, n5);
                }
                if (zKP.field_59d86bc_bzF[this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4 + 1, n6, n5)] > 0) {
                    this.field_36c4f18_Dne.method_2e7161e2_Qnq(n4 + 1, n6, n5);
                }
                if (zKP.field_59d86bc_bzF[this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n6, n5 - 1)] > 0) {
                    this.field_36c4f18_Dne.method_2e7161e2_Qnq(n4, n6, n5 - 1);
                }
                if (zKP.field_59d86bc_bzF[this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n6, n5 + 1)] > 0) {
                    this.field_36c4f18_Dne.method_2e7161e2_Qnq(n4, n6, n5 + 1);
                }
                this.field_36c4f18_Dne.method_2e7161e2_Qnq(n4, n6, n5);
            }
        }
    }

    public void method_38f7343a_Dne(ZfC zfC, ZfC zfC2, int n, int n2) {
        if (!this.field_2e5f2c_bzF && zfC.method_16cca7e_Dne(n + 1, n2 + 1) && zfC.method_16cca7e_Dne(n, n2 + 1) && zfC.method_16cca7e_Dne(n + 1, n2)) {
            zfC.method_a5c3b570_Dne(zfC2, n, n2);
        }
        if (zfC.method_16cca7e_Dne(n - 1, n2) && !zfC.method_90569c11_Dne((int)(n - 1), (int)n2).field_2e5f2c_bzF && zfC.method_16cca7e_Dne(n - 1, n2 + 1) && zfC.method_16cca7e_Dne(n, n2 + 1) && zfC.method_16cca7e_Dne(n - 1, n2 + 1)) {
            zfC.method_a5c3b570_Dne(zfC2, n - 1, n2);
        }
        if (zfC.method_16cca7e_Dne(n, n2 - 1) && !zfC.method_90569c11_Dne((int)n, (int)(n2 - 1)).field_2e5f2c_bzF && zfC.method_16cca7e_Dne(n + 1, n2 - 1) && zfC.method_16cca7e_Dne(n + 1, n2 - 1) && zfC.method_16cca7e_Dne(n + 1, n2)) {
            zfC.method_a5c3b570_Dne(zfC2, n, n2 - 1);
        }
        if (zfC.method_16cca7e_Dne(n - 1, n2 - 1) && !zfC.method_90569c11_Dne((int)(n - 1), (int)(n2 - 1)).field_2e5f2c_bzF && zfC.method_16cca7e_Dne(n, n2 - 1) && zfC.method_16cca7e_Dne(n - 1, n2)) {
            zfC.method_a5c3b570_Dne(zfC2, n - 1, n2 - 1);
        }
    }

    public boolean method_7a46289e_Dne() {
        return false;
    }

    public void method_d017feb1_Dne(Class clazz, bSp bSp2, List list, pUe pUe2) {
        int n = geR.method_117d0718_FWm((bSp2.field_212608_FWm - 2.0) / 16.0);
        int n2 = geR.method_117d0718_FWm((bSp2.field_2d29ef_aFZ + 2.0) / 16.0);
        if (n < 0) {
            n = 0;
        } else if (n >= this.field_27a96df1_Dne.length) {
            n = this.field_27a96df1_Dne.length - 1;
        }
        if (n2 >= this.field_27a96df1_Dne.length) {
            n2 = this.field_27a96df1_Dne.length - 1;
        } else if (n2 < 0) {
            n2 = 0;
        }
        for (int i = n; i <= n2; ++i) {
            List list2 = this.field_27a96df1_Dne[i];
            for (int j = 0; j < list2.size(); ++j) {
                sMa sMa2 = (sMa)list2.get(j);
                if (!clazz.isAssignableFrom(sMa2.getClass()) || !sMa2.field_373a3ed_Dne.method_9ed6d42c_Dne(bSp2) || pUe2 != null && !pUe2.method_bb7dd824_Dne(sMa2)) continue;
                list.add(sMa2);
            }
        }
    }

    public boolean method_ce7f9d7e_Dne(boolean bl) {
        if (bl ? this.field_2d2a05_aFZ && this.field_36c4f18_Dne.method_7c6f602d_FWm() != this.field_2092af_Dne || this.field_267d06_Qnq : this.field_2d2a05_aFZ && this.field_36c4f18_Dne.method_7c6f602d_FWm() >= this.field_2092af_Dne + 600L) {
            return true;
        }
        return this.field_267d06_Qnq;
    }

    public void method_d44b4592_zGp() {
        if (this.field_2f0de9_div && !this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm) {
            this.method_8288d6ee_IjH();
        }
    }

    public void method_907a9d21_Qnq() {
        this.field_21261e_FWm = false;
        Iterator var1 = this.field_83b1c1b0_Dne.values().iterator();

        while(var1.hasNext()) {
            ipD var2 = (ipD)var1.next();
            this.field_36c4f18_Dne.method_ac4d69ca_Dne(var2);
        }

        for(int var3 = 0; var3 < this.field_27a96df1_Dne.length; ++var3) {
            this.field_36c4f18_Dne.method_12705b2a_FWm(this.field_27a96df1_Dne[var3]);
        }

    }

    public void method_a98a0660_aFZ() {
        this.field_267d06_Qnq = true;
    }

    public void method_dfa28592_Dne(cHy[] cHyArray) {
        this.field_836a3d73_Dne = cHyArray;
    }

    private void method_8288d6ee_IjH() {
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("recheckGaps");
        if (this.field_36c4f18_Dne.method_5972745e_Dne(this.field_2092ae_Dne * 16 + 8, 0, this.field_21260d_FWm * 16 + 8, 16)) {
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    if (!this.field_3f1c59a_Dne[i + j * 16]) continue;
                    this.field_3f1c59a_Dne[i + j * 16] = false;
                    int n = this.method_16cca6d_Dne(i, j);
                    int n2 = this.field_2092ae_Dne * 16 + i;
                    int n3 = this.field_21260d_FWm * 16 + j;
                    int n4 = this.field_36c4f18_Dne.method_73b4985a_bzF(n2 - 1, n3);
                    int n5 = this.field_36c4f18_Dne.method_73b4985a_bzF(n2 + 1, n3);
                    int n6 = this.field_36c4f18_Dne.method_73b4985a_bzF(n2, n3 - 1);
                    int n7 = this.field_36c4f18_Dne.method_73b4985a_bzF(n2, n3 + 1);
                    if (n5 < n4) {
                        n4 = n5;
                    }
                    if (n6 < n4) {
                        n4 = n6;
                    }
                    if (n7 < n4) {
                        n4 = n7;
                    }
                    this.method_a6aca7ca_FWm(n2, n3, n4);
                    this.method_a6aca7ca_FWm(n2 - 1, n3, n);
                    this.method_a6aca7ca_FWm(n2 + 1, n3, n);
                    this.method_a6aca7ca_FWm(n2, n3 - 1, n);
                    this.method_a6aca7ca_FWm(n2, n3 + 1, n);
                }
            }
            this.field_2f0de9_div = false;
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
    }

    public void method_bd7ea487_Dne(udO udO2, int n, int n2, int n3, int n4) {
        cHy cHy2 = this.field_836a3d73_Dne[n2 >> 4];
        if (cHy2 == null) {
            cHy cHy3 = new cHy(n2 >> 4 << 4, !this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm);
            this.field_836a3d73_Dne[n2 >> 4] = cHy3;
            cHy2 = cHy3;
            this.method_7c6f6039_FWm();
        }
        this.field_267d06_Qnq = true;
        if (udO2 == udO.field_37c82cc_Dne) {
            if (!this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm) {
                cHy2.method_58fe7b07_bzF(n, n2 & 0xF, n3, n4);
            }
        } else if (udO2 == udO.field_20364eab_FWm) {
            cHy2.method_9fbb4d61_Qnq(n, n2 & 0xF, n3, n4);
        }
    }

    public boolean method_1e26965d_FWm(int n, int n2) {
        if (n < 0) {
            n = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        for (int i = n; i <= n2; i += 16) {
            cHy cHy2 = this.field_836a3d73_Dne[i >> 4];
            if (cHy2 == null || cHy2.method_7a46289e_Dne()) continue;
            return false;
        }
        return true;
    }

    public void method_ac4d69ca_Dne(ipD ipD2) {
        int n = ipD2.field_267cf5_Qnq - this.field_2092ae_Dne * 16;
        int n2 = ipD2.field_2d29f4_aFZ;
        int n3 = ipD2.field_388da6_zGp - this.field_21260d_FWm * 16;
        this.method_c583bffb_Dne(n, n2, n3, ipD2);
        if (this.field_21261e_FWm) {
            this.field_36c4f18_Dne.field_7eb83e1f_bzF.add(ipD2);
        }
    }

    public void method_811b07f3_Dne(byte[] var1, int var2, int var3, boolean var4) {
        int var5 = 0;
        boolean var6 = !this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm;

        int var7;
        for(var7 = 0; var7 < this.field_836a3d73_Dne.length; ++var7) {
            if ((var2 & 1 << var7) != 0) {
                if (this.field_836a3d73_Dne[var7] == null) {
                    this.field_836a3d73_Dne[var7] = new cHy(var7 << 4, var6);
                }

                byte[] var8 = this.field_836a3d73_Dne[var7].method_ce7eeb83_Dne();
                System.arraycopy(var1, var5, var8, 0, var8.length);
                var5 += var8.length;
            } else if (var4 && this.field_836a3d73_Dne[var7] != null) {
                this.field_836a3d73_Dne[var7] = null;
            }
        }

        FYZ var11;
        for(var7 = 0; var7 < this.field_836a3d73_Dne.length; ++var7) {
            if ((var2 & 1 << var7) != 0 && this.field_836a3d73_Dne[var7] != null) {
                var11 = this.field_836a3d73_Dne[var7].method_f876dbe3_FWm();
                System.arraycopy(var1, var5, var11.field_3f1c582_Dne, 0, var11.field_3f1c582_Dne.length);
                var5 += var11.field_3f1c582_Dne.length;
            }
        }

        for(var7 = 0; var7 < this.field_836a3d73_Dne.length; ++var7) {
            if ((var2 & 1 << var7) != 0 && this.field_836a3d73_Dne[var7] != null) {
                var11 = this.field_836a3d73_Dne[var7].method_228c9271_bzF();
                System.arraycopy(var1, var5, var11.field_3f1c582_Dne, 0, var11.field_3f1c582_Dne.length);
                var5 += var11.field_3f1c582_Dne.length;
            }
        }

        if (var6) {
            for(var7 = 0; var7 < this.field_836a3d73_Dne.length; ++var7) {
                if ((var2 & 1 << var7) != 0 && this.field_836a3d73_Dne[var7] != null) {
                    var11 = this.field_836a3d73_Dne[var7].method_694964cb_Qnq();
                    System.arraycopy(var1, var5, var11.field_3f1c582_Dne, 0, var11.field_3f1c582_Dne.length);
                    var5 += var11.field_3f1c582_Dne.length;
                }
            }
        }

        for(var7 = 0; var7 < this.field_836a3d73_Dne.length; ++var7) {
            if ((var3 & 1 << var7) != 0) {
                if (this.field_836a3d73_Dne[var7] == null) {
                    var5 += 2048;
                } else {
                    var11 = this.field_836a3d73_Dne[var7].method_23008bc4_Dne();
                    if (var11 == null) {
                        var11 = this.field_836a3d73_Dne[var7].method_2df4168a_aFZ();
                    }

                    System.arraycopy(var1, var5, var11.field_3f1c582_Dne, 0, var11.field_3f1c582_Dne.length);
                    var5 += var11.field_3f1c582_Dne.length;
                }
            } else if (var4 && this.field_836a3d73_Dne[var7] != null && this.field_836a3d73_Dne[var7].method_23008bc4_Dne() != null) {
                this.field_836a3d73_Dne[var7].method_7c6f6039_FWm();
            }
        }

        if (var4) {
            System.arraycopy(var1, var5, this.field_3f1c582_Dne, 0, this.field_3f1c582_Dne.length);
            int var10000 = var5 + this.field_3f1c582_Dne.length;
        }

        for(var7 = 0; var7 < this.field_836a3d73_Dne.length; ++var7) {
            if (this.field_836a3d73_Dne[var7] != null && (var2 & 1 << var7) != 0) {
                this.field_836a3d73_Dne[var7].method_7a46289a_Dne();
            }
        }

        this.method_7a46289a_Dne();
        Iterator var9 = this.field_83b1c1b0_Dne.values().iterator();

        while(var9.hasNext()) {
            ipD var10 = (ipD)var9.next();
            var10.method_907a9d21_Qnq();
        }

    }

    public void method_bb7dd820_Dne(sMa sMa2) {
        int n;
        this.field_2d2a05_aFZ = true;
        int n2 = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div / 16.0);
        int n3 = geR.method_117d0718_FWm(sMa2.field_334487_mrb / 16.0);
        if (n2 != this.field_2092ae_Dne || n3 != this.field_21260d_FWm) {
            this.field_36c4f18_Dne.method_230e0120_Dne().method_47a073d1_bzF("Wrong location! " + sMa2);
            Thread.dumpStack();
        }
        if ((n = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH / 16.0)) < 0) {
            n = 0;
        }
        if (n >= this.field_27a96df1_Dne.length) {
            n = this.field_27a96df1_Dne.length - 1;
        }
        sMa2.field_367165_trS = true;
        sMa2.field_22c602_IjH = this.field_2092ae_Dne;
        sMa2.field_33448c_mrb = n;
        sMa2.field_29186d_XHL = this.field_21260d_FWm;
        this.field_27a96df1_Dne[n].add(sMa2);
    }

    private void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        if (n4 > n3 && this.field_36c4f18_Dne.method_5972745e_Dne(n, 0, n2, 16)) {
            for (int i = n3; i < n4; ++i) {
                this.field_36c4f18_Dne.method_60f38dfc_Dne(udO.field_37c82cc_Dne, n, i, n2);
            }
            this.field_267d06_Qnq = true;
        }
    }
}

