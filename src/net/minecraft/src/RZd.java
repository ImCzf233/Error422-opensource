package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class RZd
extends FrK
implements yzC {
    @Override
    public void method_10bcc7a9_Dne(gnI gnI2, int n, String string, Object ... objectArray) {
        boolean bl = true;
        if (gnI2 instanceof FgE && !jwh_0.method_2302cf90_Dne().field_836263a8_Dne[0].method_230cbc5a_Dne().method_8f501fe8_Dne("commandBlockOutput")) {
            bl = false;
        }
        if (bl) {
            for (PJQ pJQ : jwh_0.method_2302cf90_Dne().method_230ea953_Dne().field_f27c122c_Dne) {
                if (pJQ == gnI2 || !jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_110c4dc7_FWm(pJQ.field_bc57ecbf_aFZ)) continue;
                pJQ.method_8f501fe4_Dne("" + (Object)((Object)Dne.field_140f3afb_div) + "" + (Object)((Object)Dne.field_75727fbe_EyB) + "[" + gnI2.method_193de2e9_a_() + ": " + pJQ.method_98148f73_Dne(string, objectArray) + "]");
            }
        }
        if (gnI2 != jwh_0.method_2302cf90_Dne()) {
            jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_8f501fe4_Dne("[" + gnI2.method_193de2e9_a_() + ": " + jwh_0.method_2302cf90_Dne().method_98148f73_Dne(string, objectArray) + "]");
        }
        if ((n & 1) != 1) {
            gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne(string, objectArray));
        }
    }

    public RZd() {
        this.method_915deb54_Dne(new jXy());
        this.method_915deb54_Dne(new Sxo());
        this.method_915deb54_Dne(new rWl());
        this.method_915deb54_Dne(new kSP());
        this.method_915deb54_Dne(new UBB());
        this.method_915deb54_Dne(new ePu());
        this.method_915deb54_Dne(new twP());
        this.method_915deb54_Dne(new iEq());
        this.method_915deb54_Dne(new CEb());
        this.method_915deb54_Dne(new Wuv());
        this.method_915deb54_Dne(new dny_0());
        this.method_915deb54_Dne(new PpL());
        this.method_915deb54_Dne(new LiD());
        this.method_915deb54_Dne(new IlF());
        this.method_915deb54_Dne(new giz());
        this.method_915deb54_Dne(new UPH());
        this.method_915deb54_Dne(new etD());
        this.method_915deb54_Dne(new fTH());
        this.method_915deb54_Dne(new IYH());
        this.method_915deb54_Dne(new lpz());
        this.method_915deb54_Dne(new duB());
        this.method_915deb54_Dne(new alz());
        this.method_915deb54_Dne(new FwH());
        if (jwh_0.method_2302cf90_Dne().method_907a9d25_Qnq()) {
            this.method_915deb54_Dne(new khp());
            this.method_915deb54_Dne(new GjN());
            this.method_915deb54_Dne(new HJG());
            this.method_915deb54_Dne(new zyt_0());
            this.method_915deb54_Dne(new jNM());
            this.method_915deb54_Dne(new auk());
            this.method_915deb54_Dne(new tqk());
            this.method_915deb54_Dne(new DgO());
            this.method_915deb54_Dne(new lOW());
            this.method_915deb54_Dne(new OCt());
            this.method_915deb54_Dne(new jFR());
            this.method_915deb54_Dne(new FxW());
            this.method_915deb54_Dne(new lzJ());
            this.method_915deb54_Dne(new STA());
        } else {
            this.method_915deb54_Dne(new IWv());
        }
        xZE.method_c8276a65_Dne(this);
    }
}

