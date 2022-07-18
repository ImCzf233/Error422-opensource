package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Pdb {
    private Set field_da244c89_FWm;
    public int field_2092ae_Dne = 0;
    public List field_6a0474ed_FWm = new ArrayList();
    private final Set<onZ> field_83b48b6a_Dne;
    private int field_2e5f1b_bzF = 0;
    private short field_2092b8_Dne = 0;
    private int field_21260d_FWm = -1;
    public List<onZ> field_7eb83e1f_bzF = new ArrayList();
    protected List field_2c197105_Qnq;

    public boolean method_b6784eb0_Dne(onZ onZ2) {
        return true;
    }

    public void method_961ec291_Dne(FiG fiG, boolean bl) {
        if (bl) {
            this.field_da244c89_FWm.remove(fiG);
        } else {
            this.field_da244c89_FWm.add(fiG);
        }
    }

    public void method_7c9aa178_Dne(MqS mqS) {
        this.method_7a46289a_Dne();
    }

    public onZ method_9e7d935f_Dne(int n) {
        return (onZ)this.field_7eb83e1f_bzF.get(n);
    }

    public static void method_28993b2_Dne(Set set, int n, NMq nMq, int n2) {
        switch (n) {
            case 0: {
                nMq.field_2092ae_Dne = geR.method_ce7f5259_Dne((float)nMq.field_2092ae_Dne / (float)set.size());
                break;
            }
            case 1: {
                nMq.field_2092ae_Dne = 1;
            }
        }
        nMq.field_2092ae_Dne += n2;
    }

    public void method_8b2b635b_FWm(mXX mXX2) {
        this.field_2c197105_Qnq.remove(mXX2);
    }

    public boolean method_961e82c4_Dne(FiG fiG, int n) {
        return false;
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return n == 0 || n == 1;
    }

    public static boolean method_c38696f5_Dne(onZ onZ2, NMq nMq, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = onZ2 == null || !onZ2.method_7a46289e_Dne();
        if (onZ2 != null && onZ2.method_7a46289e_Dne() && nMq != null && nMq.method_7c61cf19_Dne(onZ2.method_23040479_Dne()) && NMq.method_a981fd7e_Dne(onZ2.method_23040479_Dne(), nMq)) {
            int n = bl ? 0 : nMq.field_2092ae_Dne;
            bl2 |= onZ2.method_23040479_Dne().field_2092ae_Dne + n <= nMq.method_7c6f602c_FWm();
        }
        return bl2;
    }

    protected void method_6f5cd5a3_Dne(int n, int n2, boolean bl, FiG fiG) {
        this.method_a0af09b3_Dne(n, n2, 1, fiG);
    }

    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        return onZ2 != null ? onZ2.method_23040479_Dne() : null;
    }

    protected boolean method_7bdfbb43_Dne(NMq nMq, int n, int n2, boolean bl) {
        NMq nMq2;
        onZ onZ2;
        boolean bl2 = false;
        int n3 = n;
        if (bl) {
            n3 = n2 - 1;
        }
        if (nMq.method_7a46289e_Dne()) {
            while (nMq.field_2092ae_Dne > 0 && (!bl && n3 < n2 || bl && n3 >= n)) {
                onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n3);
                nMq2 = onZ2.method_23040479_Dne();
                if (nMq2 != null && nMq2.field_2e5f1b_bzF == nMq.field_2e5f1b_bzF && (!nMq.method_ae128dcb_bzF() || nMq.method_907a9d14_Qnq() == nMq2.method_907a9d14_Qnq()) && NMq.method_a981fd7e_Dne(nMq, nMq2)) {
                    int n4 = nMq2.field_2092ae_Dne + nMq.field_2092ae_Dne;
                    if (n4 <= nMq.method_7c6f602c_FWm()) {
                        nMq.field_2092ae_Dne = 0;
                        nMq2.field_2092ae_Dne = n4;
                        onZ2.method_7a46289a_Dne();
                        bl2 = true;
                    } else if (nMq2.field_2092ae_Dne < nMq.method_7c6f602c_FWm()) {
                        nMq.field_2092ae_Dne -= nMq.method_7c6f602c_FWm() - nMq2.field_2092ae_Dne;
                        nMq2.field_2092ae_Dne = nMq.method_7c6f602c_FWm();
                        onZ2.method_7a46289a_Dne();
                        bl2 = true;
                    }
                }
                if (bl) {
                    --n3;
                    continue;
                }
                ++n3;
            }
        }
        if (nMq.field_2092ae_Dne > 0) {
            n3 = bl ? n2 - 1 : n;
            while (!bl && n3 < n2 || bl && n3 >= n) {
                onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n3);
                nMq2 = onZ2.method_23040479_Dne();
                if (nMq2 == null) {
                    onZ2.method_7c61cf15_Dne(nMq.method_23040479_Dne());
                    onZ2.method_7a46289a_Dne();
                    nMq.field_2092ae_Dne = 0;
                    bl2 = true;
                    break;
                }
                if (bl) {
                    --n3;
                    continue;
                }
                ++n3;
            }
        }
        return bl2;
    }

    public Pdb() {
        this.field_83b48b6a_Dne = new HashSet();
        this.field_2c197105_Qnq = new ArrayList();
        this.field_da244c89_FWm = new HashSet();
    }

    public void method_bc0f9314_Dne(NMq[] nMqArray) {
        for (int i = 0; i < nMqArray.length; ++i) {
            this.method_9e7d935f_Dne(i).method_7c61cf15_Dne(nMqArray[i]);
        }
    }

    public abstract boolean method_703284a7_Dne(FiG var1);

    public boolean method_49863868_FWm(FiG fiG) {
        return !this.field_da244c89_FWm.contains(fiG);
    }

    public boolean method_e3987d15_Dne(NMq nMq, onZ onZ2) {
        return true;
    }

    public static int method_ce7f5d9c_Dne(int n) {
        return n >> 2 & 3;
    }

    public short method_7abb8253_Dne(MOS mOS) {
        this.field_2092b8_Dne = (short)(this.field_2092b8_Dne + 1);
        return this.field_2092b8_Dne;
    }

    public List method_adea226d_Dne() {
        ArrayList<NMq> arrayList = new ArrayList<NMq>();
        for (int i = 0; i < this.field_7eb83e1f_bzF.size(); ++i) {
            arrayList.add(((onZ)this.field_7eb83e1f_bzF.get(i)).method_23040479_Dne());
        }
        return arrayList;
    }

    public static int method_7c9aa16b_Dne(MqS mqS) {
        if (mqS == null) {
            return 0;
        }
        int n = 0;
        float f = 0.0f;
        for (int i = 0; i < mqS.method_907a9d14_Qnq(); ++i) {
            NMq nMq = mqS.method_9e6e1a08_Dne(i);
            if (nMq == null) continue;
            f += (float)nMq.field_2092ae_Dne / (float)Math.min(mqS.method_a98a0653_aFZ(), nMq.method_7c6f602c_FWm());
            ++n;
        }
        return geR.method_ce7f5259_Dne((f /= (float)mqS.method_907a9d14_Qnq()) * 14.0f) + (n > 0 ? 1 : 0);
    }

    public void method_703284a3_Dne(FiG fiG) {
        MOS mOS = fiG.field_36a059b_Dne;
        if (mOS.method_f87a5498_FWm() != null) {
            fiG.method_c9a088b8_Dne(mOS.method_f87a5498_FWm());
            mOS.method_7c61cf15_Dne(null);
        }
    }

    public void method_b1d7af9a_Dne(mXX mXX2) {
        if (this.field_2c197105_Qnq.contains(mXX2)) {
            throw new IllegalArgumentException("Listener already listening");
        }
        this.field_2c197105_Qnq.add(mXX2);
        mXX2.method_da0f864a_Dne(this, this.method_adea226d_Dne());
        this.method_7a46289a_Dne();
    }

    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        this.method_9e7d935f_Dne(n).method_7c61cf15_Dne(nMq);
    }

    public void method_16cca7a_Dne(int n, int n2) {
    }

    public NMq method_a0af09b3_Dne(int n, int n2, int n3, FiG fiG) {
        NMq nMq = null;
        MOS mOS = fiG.field_36a059b_Dne;
        if (n3 == 5) {
            int n4 = this.field_2e5f1b_bzF;
            this.field_2e5f1b_bzF = Pdb.method_117d19dd_FWm(n2);
            if ((n4 != 1 || this.field_2e5f1b_bzF != 2) && n4 != this.field_2e5f1b_bzF) {
                this.method_7c6f6039_FWm();
            } else if (mOS.method_f87a5498_FWm() == null) {
                this.method_7c6f6039_FWm();
            } else if (this.field_2e5f1b_bzF == 0) {
                this.field_21260d_FWm = Pdb.method_ce7f5d9c_Dne(n2);
                if (Pdb.method_ce7f5dad_Dne(this.field_21260d_FWm)) {
                    this.field_2e5f1b_bzF = 1;
                    this.field_83b48b6a_Dne.clear();
                } else {
                    this.method_7c6f6039_FWm();
                }
            } else if (this.field_2e5f1b_bzF == 1) {
                onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
                if (onZ2 != null && Pdb.method_c38696f5_Dne(onZ2, mOS.method_f87a5498_FWm(), true) && onZ2.method_7c61cf19_Dne(mOS.method_f87a5498_FWm()) && mOS.method_f87a5498_FWm().field_2092ae_Dne > this.field_83b48b6a_Dne.size() && this.method_b6784eb0_Dne(onZ2)) {
                    this.field_83b48b6a_Dne.add(onZ2);
                }
            } else if (this.field_2e5f1b_bzF == 2) {
                if (!this.field_83b48b6a_Dne.isEmpty()) {
                    NMq nMq2 = mOS.method_f87a5498_FWm().method_23040479_Dne();
                    int n5 = mOS.method_f87a5498_FWm().field_2092ae_Dne;
                    for (onZ onZ3 : this.field_83b48b6a_Dne) {
                        if (onZ3 == null || !Pdb.method_c38696f5_Dne(onZ3, mOS.method_f87a5498_FWm(), true) || !onZ3.method_7c61cf19_Dne(mOS.method_f87a5498_FWm()) || mOS.method_f87a5498_FWm().field_2092ae_Dne < this.field_83b48b6a_Dne.size() || !this.method_b6784eb0_Dne(onZ3)) continue;
                        NMq nMq3 = nMq2.method_23040479_Dne();
                        int n6 = onZ3.method_7a46289e_Dne() ? onZ3.method_23040479_Dne().field_2092ae_Dne : 0;
                        Pdb.method_28993b2_Dne(this.field_83b48b6a_Dne, this.field_21260d_FWm, nMq3, n6);
                        if (nMq3.field_2092ae_Dne > nMq3.method_7c6f602c_FWm()) {
                            nMq3.field_2092ae_Dne = nMq3.method_7c6f602c_FWm();
                        }
                        if (nMq3.field_2092ae_Dne > onZ3.method_7a46288d_Dne()) {
                            nMq3.field_2092ae_Dne = onZ3.method_7a46288d_Dne();
                        }
                        n5 -= nMq3.field_2092ae_Dne - n6;
                        onZ3.method_7c61cf15_Dne(nMq3);
                    }
                    nMq2.field_2092ae_Dne = n5;
                    if (nMq2.field_2092ae_Dne <= 0) {
                        nMq2 = null;
                    }
                    mOS.method_7c61cf15_Dne(nMq2);
                }
                this.method_7c6f6039_FWm();
            } else {
                this.method_7c6f6039_FWm();
            }
        } else if (this.field_2e5f1b_bzF != 0) {
            this.method_7c6f6039_FWm();
        } else if (!(n3 != 0 && n3 != 1 || n2 != 0 && n2 != 1)) {
            if (n == -999) {
                if (mOS.method_f87a5498_FWm() != null && n == -999) {
                    if (n2 == 0) {
                        fiG.method_c9a088b8_Dne(mOS.method_f87a5498_FWm());
                        mOS.method_7c61cf15_Dne(null);
                    }
                    if (n2 == 1) {
                        fiG.method_c9a088b8_Dne(mOS.method_f87a5498_FWm().method_9e6e1a08_Dne(1));
                        if (mOS.method_f87a5498_FWm().field_2092ae_Dne == 0) {
                            mOS.method_7c61cf15_Dne(null);
                        }
                    }
                }
            } else if (n3 == 1) {
                NMq nMq4;
                if (n < 0) {
                    return null;
                }
                onZ onZ4 = (onZ)this.field_7eb83e1f_bzF.get(n);
                if (onZ4 != null && onZ4.method_703284a7_Dne(fiG) && (nMq4 = this.method_8936db9f_Dne(fiG, n)) != null) {
                    int n7 = nMq4.field_2e5f1b_bzF;
                    nMq = nMq4.method_23040479_Dne();
                    if (onZ4 != null && onZ4.method_23040479_Dne() != null && onZ4.method_23040479_Dne().field_2e5f1b_bzF == n7) {
                        this.method_6f5cd5a3_Dne(n, n2, true, fiG);
                    }
                }
            } else {
                if (n < 0) {
                    return null;
                }
                onZ onZ5 = (onZ)this.field_7eb83e1f_bzF.get(n);
                if (onZ5 != null) {
                    NMq nMq5 = onZ5.method_23040479_Dne();
                    NMq nMq6 = mOS.method_f87a5498_FWm();
                    if (nMq5 != null) {
                        nMq = nMq5.method_23040479_Dne();
                    }
                    if (nMq5 == null) {
                        if (nMq6 != null && onZ5.method_7c61cf19_Dne(nMq6)) {
                            int n8;
                            int n9 = n8 = n2 == 0 ? nMq6.field_2092ae_Dne : 1;
                            if (n8 > onZ5.method_7a46288d_Dne()) {
                                n8 = onZ5.method_7a46288d_Dne();
                            }
                            onZ5.method_7c61cf15_Dne(nMq6.method_9e6e1a08_Dne(n8));
                            if (nMq6.field_2092ae_Dne == 0) {
                                mOS.method_7c61cf15_Dne(null);
                            }
                        }
                    } else if (onZ5.method_703284a7_Dne(fiG)) {
                        int n10;
                        if (nMq6 == null) {
                            int n11 = n2 == 0 ? nMq5.field_2092ae_Dne : (nMq5.field_2092ae_Dne + 1) / 2;
                            NMq nMq7 = onZ5.method_9e6e1a08_Dne(n11);
                            mOS.method_7c61cf15_Dne(nMq7);
                            if (nMq5.field_2092ae_Dne == 0) {
                                onZ5.method_7c61cf15_Dne(null);
                            }
                            onZ5.method_672a90ac_Dne(fiG, mOS.method_f87a5498_FWm());
                        } else if (onZ5.method_7c61cf19_Dne(nMq6)) {
                            if (nMq5.field_2e5f1b_bzF == nMq6.field_2e5f1b_bzF && nMq5.method_907a9d14_Qnq() == nMq6.method_907a9d14_Qnq() && NMq.method_a981fd7e_Dne(nMq5, nMq6)) {
                                int n12;
                                int n13 = n12 = n2 == 0 ? nMq6.field_2092ae_Dne : 1;
                                if (n12 > onZ5.method_7a46288d_Dne() - nMq5.field_2092ae_Dne) {
                                    n12 = onZ5.method_7a46288d_Dne() - nMq5.field_2092ae_Dne;
                                }
                                if (n12 > nMq6.method_7c6f602c_FWm() - nMq5.field_2092ae_Dne) {
                                    n12 = nMq6.method_7c6f602c_FWm() - nMq5.field_2092ae_Dne;
                                }
                                nMq6.method_9e6e1a08_Dne(n12);
                                if (nMq6.field_2092ae_Dne == 0) {
                                    mOS.method_7c61cf15_Dne(null);
                                }
                                nMq5.field_2092ae_Dne += n12;
                            } else if (nMq6.field_2092ae_Dne <= onZ5.method_7a46288d_Dne()) {
                                onZ5.method_7c61cf15_Dne(nMq6);
                                mOS.method_7c61cf15_Dne(nMq5);
                            }
                        } else if (nMq5.field_2e5f1b_bzF == nMq6.field_2e5f1b_bzF && nMq6.method_7c6f602c_FWm() > 1 && (!nMq5.method_ae128dcb_bzF() || nMq5.method_907a9d14_Qnq() == nMq6.method_907a9d14_Qnq()) && NMq.method_a981fd7e_Dne(nMq5, nMq6) && (n10 = nMq5.field_2092ae_Dne) > 0 && n10 + nMq6.field_2092ae_Dne <= nMq6.method_7c6f602c_FWm()) {
                            nMq6.field_2092ae_Dne += n10;
                            nMq5 = onZ5.method_9e6e1a08_Dne(n10);
                            if (nMq5.field_2092ae_Dne == 0) {
                                onZ5.method_7c61cf15_Dne(null);
                            }
                            onZ5.method_672a90ac_Dne(fiG, mOS.method_f87a5498_FWm());
                        }
                    }
                    onZ5.method_7a46289a_Dne();
                }
            }
        } else if (n3 == 2 && n2 >= 0 && n2 < 9) {
            onZ onZ6 = (onZ)this.field_7eb83e1f_bzF.get(n);
            if (onZ6.method_703284a7_Dne(fiG)) {
                NMq nMq8 = mOS.method_9e6e1a08_Dne(n2);
                boolean bl = nMq8 == null || onZ6.field_36a853d_Dne == mOS && onZ6.method_7c61cf19_Dne(nMq8);
                int n14 = -1;
                if (!bl) {
                    n14 = mOS.method_7c6f602c_FWm();
                    bl |= n14 > -1;
                }
                if (onZ6.method_7a46289e_Dne() && bl) {
                    NMq nMq9 = onZ6.method_23040479_Dne();
                    mOS.method_6e3a6b66_Dne(n2, nMq9.method_23040479_Dne());
                    if (!(onZ6.field_36a853d_Dne == mOS && onZ6.method_7c61cf19_Dne(nMq8) || nMq8 == null)) {
                        if (n14 > -1) {
                            mOS.method_7c61cf19_Dne(nMq8);
                            onZ6.method_9e6e1a08_Dne(nMq9.field_2092ae_Dne);
                            onZ6.method_7c61cf15_Dne(null);
                            onZ6.method_672a90ac_Dne(fiG, nMq9);
                        }
                    } else {
                        onZ6.method_9e6e1a08_Dne(nMq9.field_2092ae_Dne);
                        onZ6.method_7c61cf15_Dne(nMq8);
                        onZ6.method_672a90ac_Dne(fiG, nMq9);
                    }
                } else if (!onZ6.method_7a46289e_Dne() && nMq8 != null && onZ6.method_7c61cf19_Dne(nMq8)) {
                    mOS.method_6e3a6b66_Dne(n2, null);
                    onZ6.method_7c61cf15_Dne(nMq8);
                }
            }
        } else if (n3 == 3 && fiG.field_37cb681_Dne.field_267d06_Qnq && mOS.method_f87a5498_FWm() == null && n >= 0) {
            onZ onZ7 = (onZ)this.field_7eb83e1f_bzF.get(n);
            if (onZ7 != null && onZ7.method_7a46289e_Dne()) {
                NMq nMq10 = onZ7.method_23040479_Dne().method_23040479_Dne();
                nMq10.field_2092ae_Dne = nMq10.method_7c6f602c_FWm();
                mOS.method_7c61cf15_Dne(nMq10);
            }
        } else if (n3 == 4 && mOS.method_f87a5498_FWm() == null && n >= 0) {
            onZ onZ8 = (onZ)this.field_7eb83e1f_bzF.get(n);
            if (onZ8 != null && onZ8.method_7a46289e_Dne() && onZ8.method_703284a7_Dne(fiG)) {
                NMq nMq11 = onZ8.method_9e6e1a08_Dne(n2 == 0 ? 1 : onZ8.method_23040479_Dne().field_2092ae_Dne);
                onZ8.method_672a90ac_Dne(fiG, nMq11);
                fiG.method_c9a088b8_Dne(nMq11);
            }
        } else if (n3 == 6 && n >= 0) {
            onZ onZ9 = (onZ)this.field_7eb83e1f_bzF.get(n);
            NMq nMq12 = mOS.method_f87a5498_FWm();
            if (!(nMq12 == null || onZ9 != null && onZ9.method_7a46289e_Dne() && onZ9.method_703284a7_Dne(fiG))) {
                int n15 = n2 == 0 ? 0 : this.field_7eb83e1f_bzF.size() - 1;
                int n16 = n2 == 0 ? 1 : -1;
                for (int i = 0; i < 2; ++i) {
                    for (int j = n15; j >= 0 && j < this.field_7eb83e1f_bzF.size() && nMq12.field_2092ae_Dne < nMq12.method_7c6f602c_FWm(); j += n16) {
                        onZ onZ10 = (onZ)this.field_7eb83e1f_bzF.get(j);
                        if (!onZ10.method_7a46289e_Dne() || !Pdb.method_c38696f5_Dne(onZ10, nMq12, true) || !onZ10.method_703284a7_Dne(fiG) || !this.method_e3987d15_Dne(nMq12, onZ10) || i == 0 && onZ10.method_23040479_Dne().field_2092ae_Dne == onZ10.method_23040479_Dne().method_7c6f602c_FWm()) continue;
                        int n17 = Math.min(nMq12.method_7c6f602c_FWm() - nMq12.field_2092ae_Dne, onZ10.method_23040479_Dne().field_2092ae_Dne);
                        NMq nMq13 = onZ10.method_9e6e1a08_Dne(n17);
                        nMq12.field_2092ae_Dne += n17;
                        if (nMq13.field_2092ae_Dne <= 0) {
                            onZ10.method_7c61cf15_Dne(null);
                        }
                        onZ10.method_672a90ac_Dne(fiG, nMq13);
                    }
                }
            }
            this.method_7a46289a_Dne();
        }
        return nMq;
    }

    public void method_7a46289a_Dne() {
        for (int i = 0; i < this.field_7eb83e1f_bzF.size(); ++i) {
            NMq nMq = ((onZ)this.field_7eb83e1f_bzF.get(i)).method_23040479_Dne();
            NMq nMq2 = (NMq)this.field_6a0474ed_FWm.get(i);
            if (NMq.method_68dd7a5d_FWm(nMq2, nMq)) continue;
            nMq2 = nMq == null ? null : nMq.method_23040479_Dne();
            this.field_6a0474ed_FWm.set(i, nMq2);
            for (int j = 0; j < this.field_2c197105_Qnq.size(); ++j) {
                ((mXX)this.field_2c197105_Qnq.get(j)).method_4c1c2e5_Dne(this, i, nMq2);
            }
        }
    }

    public onZ method_3107f541_Dne(MqS mqS, int n) {
        for (int i = 0; i < this.field_7eb83e1f_bzF.size(); ++i) {
            onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(i);
            if (!onZ2.method_16ba008f_Dne(mqS, n)) continue;
            return onZ2;
        }
        return null;
    }

    public static int method_16cca6d_Dne(int n, int n2) {
        return n & 3 | (n2 & 3) << 2;
    }

    protected onZ method_ec04ae2_Dne(onZ onZ2) {
        onZ2.field_267cf5_Qnq = this.field_7eb83e1f_bzF.size();
        this.field_7eb83e1f_bzF.add(onZ2);
        this.field_6a0474ed_FWm.add(null);
        return onZ2;
    }

    protected void method_7c6f6039_FWm() {
        this.field_2e5f1b_bzF = 0;
        this.field_83b48b6a_Dne.clear();
    }

    public static int method_117d19dd_FWm(int n) {
        return n & 3;
    }
}

