package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class TEn
extends qVZ {
    private LOM field_3699082_Dne;
    private final hcj field_376997d_Dne;
    private mHN field_3787699_Dne;
    private String field_569fcf45_Dne;
    private pee_0 field_36bb77c_Dne;
    private static eKj field_374e248_Dne = new eKj();
    private String field_d9a85c6_FWm;
    private String field_c480ca78_bzF;
    private static final List field_6a0474ed_FWm = new ArrayList();

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
        super.method_2c2cf7c9_Dne(n, n2, n3);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.field_3699082_Dne.method_2c2cec86_Dne(n, n2, f);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 8, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_d9a85c6_FWm, 50, 30, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_c480ca78_bzF, 50, 70, 0xA0A0A0);
        this.field_3787699_Dne.method_907a9d21_Qnq();
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3787699_Dne.method_7a46289a_Dne();
        super.method_ae128dc7_bzF();
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        Keyboard.enableRepeatEvents(true);
        this.field_569fcf45_Dne = KGL.method_39193c_Dne("createWorld.customize.presets.title");
        this.field_d9a85c6_FWm = KGL.method_39193c_Dne("createWorld.customize.presets.share");
        this.field_c480ca78_bzF = KGL.method_39193c_Dne("createWorld.customize.presets.list");
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, 50, 40, this.field_21260d_FWm - 100, 20);
        this.field_3699082_Dne = new LOM(this);
        this.field_3787699_Dne.method_87b738a3_aFZ(1230);
        this.field_3787699_Dne.method_8f501fe4_Dne(this.field_376997d_Dne.method_eecad346_Dne());
        this.field_36bb77c_Dne = new pee_0(0, this.field_21260d_FWm / 2 - 155, this.field_2e5f1b_bzF - 28, 150, 20, KGL.method_39193c_Dne("createWorld.customize.presets.select"));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 + 5, this.field_2e5f1b_bzF - 28, 150, 20, KGL.method_39193c_Dne("gui.cancel")));
        this.method_d44b4592_zGp();
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (!this.field_3787699_Dne.method_16a1044_Dne(c, n)) {
            super.method_16a1040_Dne(c, n);
        }
    }

    static mHN method_a9a19e08_Dne(TEn tEn) {
        return tEn.field_3787699_Dne;
    }

    private static void method_cff36298_Dne(String string, int n, OdI odI, Jjb ... jjbArray) {
        TEn.method_15a2dac9_Dne(string, n, odI, null, jjbArray);
    }

    public TEn(hcj hcj2) {
        this.field_376997d_Dne = hcj2;
    }

    static LOM method_a992b7f1_Dne(TEn tEn) {
        return tEn.field_3699082_Dne;
    }

    static eKj method_230e70a7_Dne() {
        return field_374e248_Dne;
    }

    private static void method_15a2dac9_Dne(String string, int n, OdI odI, List list, Jjb ... jjbArray) {
        lDk lDk2 = new lDk();
        for (int i = jjbArray.length - 1; i >= 0; --i) {
            lDk2.method_adea226d_Dne().add(jjbArray[i]);
        }
        lDk2.method_ce7f5da9_Dne(odI.field_267cf5_Qnq);
        lDk2.method_7a46289a_Dne();
        if (list != null) {
            for (Object obj : list) {String string2 = (String) obj;
                lDk2.method_d410254f_Dne().put(string2, new HashMap());
            }
        }
        field_6a0474ed_FWm.add(new hZu(n, string, lDk2.toString()));
    }

    public void method_d44b4592_zGp() {
        boolean bl;
        this.field_36bb77c_Dne.field_2092bf_Dne = bl = this.method_907a9d25_Qnq();
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 0 && this.method_907a9d25_Qnq()) {
            this.field_376997d_Dne.method_8f501fe4_Dne(this.field_3787699_Dne.method_eecad346_Dne());
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_376997d_Dne);
        } else if (pee_02.field_2d29f4_aFZ == 1) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_376997d_Dne);
        }
    }

    private boolean method_907a9d25_Qnq() {
        return this.field_3699082_Dne.field_2092ae_Dne > -1 && this.field_3699082_Dne.field_2092ae_Dne < field_6a0474ed_FWm.size() || this.field_3787699_Dne.method_eecad346_Dne().length() > 1;
    }

    static List method_adea226d_Dne() {
        return field_6a0474ed_FWm;
    }

    static {
        TEn.method_15a2dac9_Dne("Classic Flat", zKP.field_36ff555_Dne.field_21260d_FWm, OdI.field_202507d7_FWm, Arrays.asList("village"), new Jjb(1, zKP.field_36ff555_Dne.field_21260d_FWm), new Jjb(2, zKP.field_203836cc_FWm.field_21260d_FWm), new Jjb(1, zKP.field_f0b029e5_zGp.field_21260d_FWm));
        TEn.method_15a2dac9_Dne("Tunnelers' Dream", zKP.field_37e6aed_Dne.field_21260d_FWm, OdI.field_5e54aabf_Qnq, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new Jjb(1, zKP.field_36ff555_Dne.field_21260d_FWm), new Jjb(5, zKP.field_203836cc_FWm.field_21260d_FWm), new Jjb(230, zKP.field_37e6aed_Dne.field_21260d_FWm), new Jjb(1, zKP.field_f0b029e5_zGp.field_21260d_FWm));
        TEn.method_15a2dac9_Dne("Water World", zKP.field_374330f_Dne.field_21260d_FWm, OdI.field_202507d7_FWm, Arrays.asList("village", "biome_1"), new Jjb(90, zKP.field_16319416_DyG.field_21260d_FWm), new Jjb(5, zKP.field_5ced441_IjH.field_21260d_FWm), new Jjb(5, zKP.field_203836cc_FWm.field_21260d_FWm), new Jjb(5, zKP.field_37e6aed_Dne.field_21260d_FWm), new Jjb(1, zKP.field_f0b029e5_zGp.field_21260d_FWm));
        TEn.method_15a2dac9_Dne("Overworld", zKP.field_36dc147_Dne.field_21260d_FWm, OdI.field_202507d7_FWm, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new Jjb(1, zKP.field_36ff555_Dne.field_21260d_FWm), new Jjb(3, zKP.field_203836cc_FWm.field_21260d_FWm), new Jjb(59, zKP.field_37e6aed_Dne.field_21260d_FWm), new Jjb(1, zKP.field_f0b029e5_zGp.field_21260d_FWm));
        TEn.method_15a2dac9_Dne("Snowy Kingdom", zKP.field_23a1e80a_EwP.field_21260d_FWm, OdI.field_a21b6d60_kGO, Arrays.asList("village", "biome_1"), new Jjb(1, zKP.field_23a1e80a_EwP.field_21260d_FWm), new Jjb(1, zKP.field_36ff555_Dne.field_21260d_FWm), new Jjb(3, zKP.field_203836cc_FWm.field_21260d_FWm), new Jjb(59, zKP.field_37e6aed_Dne.field_21260d_FWm), new Jjb(1, zKP.field_f0b029e5_zGp.field_21260d_FWm));
        TEn.method_15a2dac9_Dne("Bottomless Pit", dEr.field_d73ac430_yMz.field_267cf5_Qnq, OdI.field_202507d7_FWm, Arrays.asList("village", "biome_1"), new Jjb(1, zKP.field_36ff555_Dne.field_21260d_FWm), new Jjb(3, zKP.field_203836cc_FWm.field_21260d_FWm), new Jjb(2, zKP.field_75c638da_bzF.field_21260d_FWm));
        TEn.method_15a2dac9_Dne("Desert", zKP.field_5ced441_IjH.field_21260d_FWm, OdI.field_75b309e5_bzF, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new Jjb(8, zKP.field_5ced441_IjH.field_21260d_FWm), new Jjb(52, zKP.field_850fb0c5_ceE.field_21260d_FWm), new Jjb(3, zKP.field_37e6aed_Dne.field_21260d_FWm), new Jjb(1, zKP.field_f0b029e5_zGp.field_21260d_FWm));
        TEn.method_cff36298_Dne("Redstone Ready", dEr.field_59c23676_exS.field_267cf5_Qnq, OdI.field_75b309e5_bzF, new Jjb(52, zKP.field_850fb0c5_ceE.field_21260d_FWm), new Jjb(3, zKP.field_37e6aed_Dne.field_21260d_FWm), new Jjb(1, zKP.field_f0b029e5_zGp.field_21260d_FWm));
    }
}

