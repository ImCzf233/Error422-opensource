package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public enum ONk {
    field_36aed80_Dne("options.music", true, false),
    field_2024b95f_FWm("options.sound", true, false),
    field_75b2bb6d_bzF("options.invertMouse", false, true),
    field_5e545c47_Qnq("options.sensitivity", true, false),
    field_712e71c6_aFZ("options.fov", true, false),
    field_f09cac78_zGp("options.gamma", true, false),
    field_161e16a9_DyG("options.renderDistance", false, false),
    field_1413c3aa_div("options.viewBobbing", false, true),
    field_5bb56d4_IjH("options.anaglyph", false, true),
    field_74f5805e_mrb("options.advancedOpengl", false, true),
    field_1c2c7bbf_XHL("options.framerateLimit", false, false),
    field_6164a1a8_Zpi("options.difficulty", false, false),
    field_a21b1ee8_kGO("options.graphics", false, false),
    field_aefb95fb_udO("options.ao", false, false),
    field_ab23b236_ooe("options.guiScale", false, false),
    field_32850926_trS("options.renderClouds", false, true),
    field_1effde44_qLR("options.particles", false, false),
    field_35ca4e69_ATE("options.chat.visibility", false, false),
    field_719a034f_Vxn("options.chat.color", false, true),
    field_84fc3358_ceE("options.chat.links", false, true),
    field_7577086d_EyB("options.chat.opacity", true, false),
    field_d443208_FfS("options.chat.links.prompt", false, true),
    field_3951d927_OdI("options.serverTextures", false, true),
    field_d2abbf2f_oIf("options.snooper", false, true),
    field_8e7449ac_vSL("options.fullscreen", false, true),
    field_9f2c83e1_RPx("options.vsync", false, true),
    field_dd6a5af8_Fnk("options.showCape", false, true),
    field_76c5e99_gnI("options.touchscreen", false, true),
    field_7ee074b_tgc("options.chat.scale", true, false),
    field_cb472f53_qXo("options.chat.width", true, false),
    field_24958cdb_AgF("options.chat.height.focused", true, false),
    field_d7315955_yMz("options.chat.height.unfocused", true, false);

    private final String field_569fcf45_Dne;
    private final boolean field_2092bf_Dne;
    private final boolean field_21261e_FWm;

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public int method_7a46288d_Dne() {
        return this.ordinal();
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    private ONk(String var3, boolean var4, boolean var5) {
        this.field_569fcf45_Dne = var3;
        this.field_2092bf_Dne = var4;
        this.field_21261e_FWm = var5;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public static ONk method_9e6e916e_Dne(int n) {
        for (ONk oNk : ONk.values()) {
            if (oNk.method_7a46288d_Dne() != n) continue;
            return oNk;
        }
        return null;
    }
}

