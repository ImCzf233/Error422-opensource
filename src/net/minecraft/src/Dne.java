package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum Dne {
    field_36664d1_Dne('0'),
    field_202030b0_FWm('1'),
    field_75ae32be_bzF('2'),
    field_5e4fd398_Qnq('3'),
    field_7129e917_aFZ('4'),
    field_f09823c9_zGp('5'),
    field_16198dfa_DyG('6'),
    field_140f3afb_div('7'),
    field_5b6ce25_IjH('8'),
    field_74f0f7af_mrb('9'),
    field_1c27f310_XHL('a'),
    field_616018f9_Zpi('b'),
    field_a2169639_kGO('c'),
    field_aef70d4c_udO('d'),
    field_ab1f2987_ooe('e'),
    field_32808077_trS('f'),
    field_1efb5595_qLR('k', true),
    field_35c5c5ba_ATE('l', true),
    field_71957aa0_Vxn('m', true),
    field_84f7aaa9_ceE('n', true),
    field_75727fbe_EyB('o', true),
    field_d3fa959_FfS('r');

    private final boolean field_2092bf_Dne;
    private final char field_2092a8_Dne;
    private static final Map field_da2182cf_FWm;
    private final String field_569fcf45_Dne;
    private static final Map field_83b1c1b0_Dne;
    private static final Pattern field_b2ec7984_Dne;

    public static Dne method_2849357a_Dne(String string) {
        return string == null ? null : (Dne)((Object)field_da2182cf_FWm.get(string.toLowerCase()));
    }

    public String method_eecad346_Dne() {
        return this.name().toLowerCase();
    }

    public static Collection method_9daa3c6d_Dne(boolean bl, boolean bl2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Dne dne : Dne.values()) {
            if (dne.method_7c6f603d_FWm() && !bl || dne.method_7a46289e_Dne() && !bl2) continue;
            arrayList.add(dne.method_eecad346_Dne());
        }
        return arrayList;
    }

    private Dne(char var3, boolean var4) {
        this.field_2092a8_Dne = var3;
        this.field_2092bf_Dne = var4;
        this.field_569fcf45_Dne = "§" + var3;
    }

    static {
        field_83b1c1b0_Dne = new HashMap();
        field_da2182cf_FWm = new HashMap();
        field_b2ec7984_Dne = Pattern.compile("(?i)" + String.valueOf('\u00a7') + "[0-9A-FK-OR]");
        for (Dne dne : Dne.values()) {
            field_83b1c1b0_Dne.put(Character.valueOf(dne.method_7a462887_Dne()), dne);
            field_da2182cf_FWm.put(dne.method_eecad346_Dne(), dne);
        }
    }

    public String toString() {
        return this.field_569fcf45_Dne;
    }

    public boolean method_7c6f603d_FWm() {
        return !this.field_2092bf_Dne && this != field_d3fa959_FfS;
    }

    public char method_7a462887_Dne() {
        return this.field_2092a8_Dne;
    }

    private Dne(char var3) {
        this(var3, false);
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }
}

