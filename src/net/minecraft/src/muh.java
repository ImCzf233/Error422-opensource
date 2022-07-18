package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class muh
extends uOw {
    public String field_d9a85c6_FWm;
    public long field_2092af_Dne;
    public boolean field_2092bf_Dne;
    public int field_21260d_FWm;
    public String field_c480ca78_bzF;
    public String field_569fcf45_Dne;
    private String field_aac82e71_IjH = null;
    public boolean field_2e5f2c_bzF = false;
    public boolean field_21261e_FWm;
    private String field_be5cd5b_div = null;
    public String field_8b8e234d_zGp = "";
    public String field_309c90bc_DyG = "";
    public String field_bc57ecbf_aFZ;
    public int field_2092ae_Dne;
    public String field_9e60dbde_Qnq;
    public List field_f27c122c_Dne;
    public long field_21260e_FWm;

    public void method_b3779f27_Dne(muh muh2) {
        this.field_309c90bc_DyG = muh2.field_309c90bc_DyG;
        this.field_8b8e234d_zGp = muh2.field_8b8e234d_zGp;
        this.field_21260e_FWm = muh2.field_21260e_FWm;
        this.field_21261e_FWm = muh2.field_21261e_FWm;
        this.field_21260d_FWm = muh2.field_21260d_FWm;
        this.field_2e5f2c_bzF = true;
    }

    private static List method_ef7ae95c_Dne(List<LIC> list) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (LIC lIC : list) {
            arrayList.add(lIC.method_f7f6f529_Dne(new Object[0]));
        }
        return arrayList;
    }

    public static muh method_e595f3b2_Dne(LIC lIC) {
        muh muh2 = new muh();
        try {
            muh2.field_2092af_Dne = Long.parseLong(lIC.method_1d4d0948_FWm("id"));
            muh2.field_569fcf45_Dne = lIC.method_f7f6f529_Dne("name");
            muh2.field_d9a85c6_FWm = lIC.method_f7f6f529_Dne("motd");
            muh2.field_c480ca78_bzF = lIC.method_f7f6f529_Dne("state");
            muh2.field_9e60dbde_Qnq = lIC.method_f7f6f529_Dne("owner");
            muh2.field_f27c122c_Dne = lIC.method_8fc1d85b_Dne("invited") ? muh.method_ef7ae95c_Dne(lIC.method_d26b6110_Dne("invited")) : new ArrayList();
            muh2.field_2092ae_Dne = Integer.parseInt(lIC.method_1d4d0948_FWm("daysLeft"));
            muh2.field_bc57ecbf_aFZ = lIC.method_f7f6f529_Dne("ip");
            muh2.field_2092bf_Dne = lIC.method_137c2214_Dne("expired");
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return muh2;
    }

    public String method_eecad346_Dne() {
        if (this.field_be5cd5b_div == null) {
            try {
                this.field_be5cd5b_div = URLDecoder.decode(this.field_d9a85c6_FWm, "UTF-8");
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                this.field_be5cd5b_div = this.field_d9a85c6_FWm;
            }
        }
        return this.field_be5cd5b_div;
    }

    public static muh method_285bf355_Dne(String string) {
        muh muh2 = new muh();
        try {
            muh2 = muh.method_e595f3b2_Dne(new tjH().method_2856a772_Dne(string));
        }
        catch (pPp pPp2) {
            // empty catch block
        }
        return muh2;
    }

    public String method_d1f1ed87_FWm() {
        if (this.field_aac82e71_IjH == null) {
            try {
                this.field_aac82e71_IjH = URLDecoder.decode(this.field_569fcf45_Dne, "UTF-8");
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                this.field_aac82e71_IjH = this.field_569fcf45_Dne;
            }
        }
        return this.field_aac82e71_IjH;
    }

    public void method_110c4dc3_FWm(String string) {
        this.field_d9a85c6_FWm = string;
        this.field_be5cd5b_div = null;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
        this.field_aac82e71_IjH = null;
    }
}

