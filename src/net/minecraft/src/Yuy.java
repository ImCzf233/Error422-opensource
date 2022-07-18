package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;

public class Yuy {
    private final msA field_3791671_Dne;
    private final int field_21260d_FWm;
    private final String field_d9a85c6_FWm;
    private final String field_569fcf45_Dne;
    public static final Pattern field_b2ec7984_Dne = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,4})(/\\S*)?$");
    private final int field_2092ae_Dne;
    private final WMY field_36e8a89_Dne;

    public Yuy(msA msA2, WMY wMY, int n, int n2) {
        this.field_3791671_Dne = msA2;
        this.field_36e8a89_Dne = wMY;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_569fcf45_Dne = msA2.method_4868f6e1_Dne(wMY.method_eecad346_Dne(), n);
        this.field_d9a85c6_FWm = this.method_d1f1ed87_FWm();
    }

    public URI method_fc62405e_Dne() {
        String string = this.method_eecad346_Dne();
        if (string == null) {
            return null;
        }
        Matcher matcher = field_b2ec7984_Dne.matcher(string);
        if (matcher.matches()) {
            try {
                String string2 = matcher.group(0);
                if (matcher.group(1) == null) {
                    string2 = "http://" + string2;
                }
                return new URI(string2);
            }
            catch (URISyntaxException uRISyntaxException) {
                Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_13eaee12_FWm("Couldn't create URI from chat", uRISyntaxException);
            }
        }
        return null;
    }

    private String method_d1f1ed87_FWm() {
        int n;
        int n2 = this.field_569fcf45_Dne.lastIndexOf(" ", this.field_569fcf45_Dne.length()) + 1;
        if (n2 < 0) {
            n2 = 0;
        }
        if ((n = this.field_36e8a89_Dne.method_eecad346_Dne().indexOf(" ", n2)) < 0) {
            n = this.field_36e8a89_Dne.method_eecad346_Dne().length();
        }
        return vCA.method_39193c_Dne(this.field_36e8a89_Dne.method_eecad346_Dne().substring(n2, n));
    }

    public String method_eecad346_Dne() {
        return this.field_d9a85c6_FWm;
    }
}

