package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OKo {
    private final Bkx field_365731d_Dne;
    private int field_21260d_FWm = 3;
    private List<lvo> field_f27c122c_Dne = new ArrayList();
    private List<lvo> field_6a0474ed_FWm = new ArrayList();
    private int field_2092ae_Dne = 0;

    public void method_a039d9fb_Dne(cMv cMv2) {
        Iterator iterator = this.field_f27c122c_Dne.iterator();
        while (iterator.hasNext()) {
            lvo lvo2 = (lvo)iterator.next();
            cMv cMv3 = lvo2.field_3740280_Dne;
            if (cMv3 != cMv2) continue;
            if (this.field_6a0474ed_FWm.contains(lvo2)) {
                cMv3.method_7c6f6039_FWm();
                this.field_6a0474ed_FWm.remove(lvo2);
            }
            iterator.remove();
        }
    }

    private boolean method_8b27c067_FWm(lvo lvo2) {
        this.field_365731d_Dne.method_8f501fe4_Dne("canUse");
        for (lvo lvo3 : this.field_f27c122c_Dne) {
            if (lvo3 == lvo2) continue;
            if (lvo2.field_2092ae_Dne >= lvo3.field_2092ae_Dne) {
                if (!this.field_6a0474ed_FWm.contains(lvo3) || this.method_48fb6d9e_Dne(lvo2, lvo3)) continue;
                this.field_365731d_Dne.method_7c6f6039_FWm();
                return false;
            }
            if (!this.field_6a0474ed_FWm.contains(lvo3) || lvo3.field_3740280_Dne.method_a98a0664_aFZ()) continue;
            this.field_365731d_Dne.method_7c6f6039_FWm();
            return false;
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
        return true;
    }

    public void method_9212764c_Dne(int n, cMv cMv2) {
        this.field_f27c122c_Dne.add(new lvo(this, n, cMv2));
    }

    public void method_7a46289a_Dne() {
        ArrayList<lvo> arrayList = new ArrayList<lvo>();
        if (this.field_2092ae_Dne++ % this.field_21260d_FWm == 0) {
            for (lvo lvo2 : this.field_f27c122c_Dne) {
                boolean bl = this.field_6a0474ed_FWm.contains(lvo2);
                if (bl) {
                    if (this.method_8b27c067_FWm(lvo2) && this.method_b1d40ca6_Dne(lvo2)) continue;
                    lvo2.field_3740280_Dne.method_7c6f6039_FWm();
                    this.field_6a0474ed_FWm.remove(lvo2);
                }
                if (!this.method_8b27c067_FWm(lvo2) || !lvo2.field_3740280_Dne.method_7a46289e_Dne()) continue;
                arrayList.add(lvo2);
                this.field_6a0474ed_FWm.add(lvo2);
            }
        } else {
            Iterator iterator = this.field_6a0474ed_FWm.iterator();
            while (iterator.hasNext()) {
                lvo lvo2;
                lvo2 = (lvo)iterator.next();
                if (lvo2.field_3740280_Dne.method_7c6f603d_FWm()) continue;
                lvo2.field_3740280_Dne.method_7c6f6039_FWm();
                iterator.remove();
            }
        }
        this.field_365731d_Dne.method_8f501fe4_Dne("goalStart");
        for (lvo lvo2 : arrayList) {
            this.field_365731d_Dne.method_8f501fe4_Dne(lvo2.field_3740280_Dne.getClass().getSimpleName());
            lvo2.field_3740280_Dne.method_7a46289a_Dne();
            this.field_365731d_Dne.method_7c6f6039_FWm();
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_365731d_Dne.method_8f501fe4_Dne("goalTick");
        for (lvo lvo2 : this.field_6a0474ed_FWm) {
            lvo2.field_3740280_Dne.method_ae128dc7_bzF();
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
    }

    public OKo(Bkx bkx) {
        this.field_365731d_Dne = bkx;
    }

    private boolean method_48fb6d9e_Dne(lvo lvo2, lvo lvo3) {
        return (lvo2.field_3740280_Dne.method_7c6f602c_FWm() & lvo3.field_3740280_Dne.method_7c6f602c_FWm()) == 0;
    }

    private boolean method_b1d40ca6_Dne(lvo lvo2) {
        this.field_365731d_Dne.method_8f501fe4_Dne("canContinue");
        boolean bl = lvo2.field_3740280_Dne.method_7c6f603d_FWm();
        this.field_365731d_Dne.method_7c6f6039_FWm();
        return bl;
    }
}

