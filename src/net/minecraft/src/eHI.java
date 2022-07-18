package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class eHI {
    private String field_d9a85c6_FWm = "(Unknown)";
    public static final SimpleDateFormat field_ce40933e_Dne = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    private Date field_f207b51c_Dne = new Date();
    private Date field_699017dd_FWm = null;
    private final String field_569fcf45_Dne;
    private String field_c480ca78_bzF = "Banned by an operator.";

    public String method_d1f1ed87_FWm() {
        return this.field_d9a85c6_FWm;
    }

    public Date method_64707bde_FWm() {
        return this.field_699017dd_FWm;
    }

    public eHI(String string) {
        this.field_569fcf45_Dne = string;
    }

    public String method_6859cdb9_bzF() {
        return this.field_c480ca78_bzF;
    }

    public void method_5d9f021a_FWm(Date date) {
        this.field_699017dd_FWm = date;
    }

    public void method_3542e87b_Dne(Date date) {
        this.field_f207b51c_Dne = date != null ? date : new Date();
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public static eHI method_2857a3af_Dne(String string) {
        if (string.trim().length() < 2) {
            return null;
        }
        String[] stringArray = string.trim().split(Pattern.quote("|"), 5);
        eHI eHI2 = new eHI(stringArray[0].trim());
        int n = stringArray.length;
        int n2 = 0;
        int n3 = n2 + 1;
        if (n <= n3) {
            return eHI2;
        }
        try {
            eHI2.method_3542e87b_Dne(field_ce40933e_Dne.parse(stringArray[n3].trim()));
        }
        catch (ParseException parseException) {
            jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_37db6a91_Dne("Could not read creation date format for ban entry '" + eHI2.method_eecad346_Dne() + "' (was: '" + stringArray[n3] + "')", parseException);
        }
        n = stringArray.length;
        if (n <= ++n3) {
            return eHI2;
        }
        eHI2.method_8f501fe4_Dne(stringArray[n3].trim());
        n = stringArray.length;
        if (n <= ++n3) {
            return eHI2;
        }
        try {
            String string2 = stringArray[n3].trim();
            if (!string2.equalsIgnoreCase("Forever") && string2.length() > 0) {
                eHI2.method_5d9f021a_FWm(field_ce40933e_Dne.parse(string2));
            }
        }
        catch (ParseException parseException) {
            jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_37db6a91_Dne("Could not read expiry date format for ban entry '" + eHI2.method_eecad346_Dne() + "' (was: '" + stringArray[n3] + "')", parseException);
        }
        n = stringArray.length;
        if (n <= ++n3) {
            return eHI2;
        }
        eHI2.method_110c4dc3_FWm(stringArray[n3].trim());
        return eHI2;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_699017dd_FWm == null ? false : this.field_699017dd_FWm.before(new Date());
    }

    public void method_110c4dc3_FWm(String string) {
        this.field_c480ca78_bzF = string;
    }

    public Date method_ad75c55d_Dne() {
        return this.field_f207b51c_Dne;
    }

    public String method_4a7b1d9f_Qnq() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.method_eecad346_Dne());
        stringBuilder.append("|");
        stringBuilder.append(field_ce40933e_Dne.format(this.method_ad75c55d_Dne()));
        stringBuilder.append("|");
        stringBuilder.append(this.method_d1f1ed87_FWm());
        stringBuilder.append("|");
        stringBuilder.append(this.method_64707bde_FWm() == null ? "Forever" : field_ce40933e_Dne.format(this.method_64707bde_FWm()));
        stringBuilder.append("|");
        stringBuilder.append(this.method_6859cdb9_bzF());
        return stringBuilder.toString();
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_d9a85c6_FWm = string;
    }
}

