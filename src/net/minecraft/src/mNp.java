package net.minecraft.src;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class mNp {
    private static oct_0 field_379512c_Dne = oct_0.method_2313a433_Dne();
    private final String field_569fcf45_Dne;
    private final String field_d9a85c6_FWm;
    private static String field_c480ca78_bzF = "https://mcoapi.minecraft.net/";

    public mNp(vwN vwN2) {
        this.field_569fcf45_Dne = vwN2.field_d9a85c6_FWm;
        this.field_d9a85c6_FWm = vwN2.field_569fcf45_Dne;
    }

    private String method_39193c_Dne(String string) throws UnsupportedEncodingException {
        return URLEncoder.encode(string, "UTF-8");
    }

    private String method_4a4c7cf9_Dne(EKF eKF) throws lUu {
        eKF.method_abaa98ae_Dne("sid", this.field_569fcf45_Dne);
        eKF.method_abaa98ae_Dne("user", this.field_d9a85c6_FWm);
        if (field_379512c_Dne instanceof nXq) {
            Lur lur = (Lur)field_379512c_Dne.method_fc07f5d8_Dne();
            eKF.method_abaa98ae_Dne((String)lur.method_fc07f5d8_Dne(), (String)lur.method_df2f1019_FWm());
        }
        try {
            int n = eKF.method_7a46288d_Dne();
            if (n == 503) {
                throw new Ybw(10);
            }
            if (n >= 200 && n < 300) {
                oct_0 oct_02 = eKF.method_2312df8b_Dne();
                if (oct_02 instanceof nXq) {
                    field_379512c_Dne = oct_02;
                }
                return eKF.method_eecad346_Dne();
            }
            throw new lUu(eKF.method_7a46288d_Dne(), eKF.method_eecad346_Dne());
        }
        catch (HFd hFd) {
            throw new lUu(500, "Server not available!");
        }
    }

    public Boolean method_6eeeac67_Dne(long l) throws lUu, IOException {
        String string = field_c480ca78_bzF + "worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf(l));
        String string2 = this.method_4a4c7cf9_Dne(EKF.method_d3a7131e_FWm(string, ""));
        return Boolean.valueOf(string2);
    }

    public Boolean method_24b83a68_FWm(long l) throws lUu, IOException {
        String string = field_c480ca78_bzF + "worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf(l));
        String string2 = this.method_4a4c7cf9_Dne(EKF.method_d3a7131e_FWm(string, ""));
        return Boolean.valueOf(string2);
    }

    public void method_71ac4b4_Dne(long l, String string) throws lUu {
        String string2 = field_c480ca78_bzF + "worlds" + "/$WORLD_ID/invites/$USER_NAME".replace("$WORLD_ID", String.valueOf(l)).replace("$USER_NAME", string);
        this.method_4a4c7cf9_Dne(EKF.method_f26d4914_FWm(string2));
    }

    public ksB method_2311bc31_Dne() throws lUu, IOException {
        String string = this.method_4a4c7cf9_Dne(EKF.method_284922b5_Dne(field_c480ca78_bzF + "worlds"));
        return ksB.method_285afe7b_Dne(string);
    }

    public muh method_bda7b025_Dne(long l, String string) throws lUu, IOException {
        String string2 = field_c480ca78_bzF + "worlds" + "/$WORLD_ID/invites/$USER_NAME".replace("$WORLD_ID", String.valueOf(l)).replace("$USER_NAME", string);
        String string3 = this.method_4a4c7cf9_Dne(EKF.method_2dc6267f_Dne(string2, ""));
        return muh.method_285bf355_Dne(string3);
    }

    public HMg method_d35199d9_Dne(long l) throws lUu, IOException {
        String string = field_c480ca78_bzF + "worlds" + "/$ID/join".replace("$ID", "" + l);
        String string2 = this.method_4a4c7cf9_Dne(EKF.method_284922b5_Dne(string));
        return HMg.method_284a8b53_Dne(string2);
    }

    public Boolean method_2dd79131_Dne(long l, String string) throws UnsupportedEncodingException, lUu {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(field_c480ca78_bzF).append("worlds").append("/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(l)));
        if (string != null && string.length() > 0) {
            stringBuilder.append("?seed=").append(this.method_39193c_Dne(string));
        }
        String string2 = this.method_4a4c7cf9_Dne(EKF.method_b3e7e43e_FWm(stringBuilder.toString(), "", 30000, 80000));
        return Boolean.valueOf(string2);
    }

    public YGW method_d3593bb2_Dne(long l) throws lUu, IOException {
        String string = this.method_4a4c7cf9_Dne(EKF.method_284922b5_Dne(field_c480ca78_bzF + "subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l))));
        return YGW.method_28522d2c_Dne(string);
    }

    public muh method_d36301db_Dne(long l) throws lUu, IOException {
        String string = this.method_4a4c7cf9_Dne(EKF.method_284922b5_Dne(field_c480ca78_bzF + "worlds" + "/$ID".replace("$ID", String.valueOf(l))));
        return muh.method_285bf355_Dne(string);
    }

    public void method_f0b38ec2_Dne(String string, String string2, String string3, String string4) throws lUu, UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(field_c480ca78_bzF).append("worlds").append("/$NAME/$LOCATION_ID".replace("$NAME", this.method_39193c_Dne(string)).replace("$LOCATION_ID", string3));
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (string2 != null && !string2.trim().equals("")) {
            hashMap.put("motd", string2);
        }
        if (string4 != null && !string4.equals("")) {
            hashMap.put("seed", string4);
        }
        if (!hashMap.isEmpty()) {
            boolean bl = true;
            for (Object obj : hashMap.entrySet()) { Map.Entry entry = (Map.Entry) obj;
                if (bl) {
                    stringBuilder.append("?");
                    bl = false;
                } else {
                    stringBuilder.append("&");
                }
                stringBuilder.append((String)entry.getKey()).append("=").append(this.method_39193c_Dne((String)entry.getValue()));
            }
        }
        this.method_4a4c7cf9_Dne(EKF.method_28fa35f_Dne(stringBuilder.toString(), "", 5000, 30000));
    }

    public void method_53cda25e_Dne(long l, String string, String string2, int n, int n2) throws UnsupportedEncodingException, lUu {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(field_c480ca78_bzF).append("worlds").append("/$WORLD_ID/$NAME".replace("$WORLD_ID", String.valueOf(l)).replace("$NAME", this.method_39193c_Dne(string)));
        if (string2 != null && !string2.trim().equals("")) {
            stringBuilder.append("?motd=").append(this.method_39193c_Dne(string2));
        }
        stringBuilder.append("&difficulty=").append(n).append("&gameMode=").append(n2);
        this.method_4a4c7cf9_Dne(EKF.method_d3a7131e_FWm(stringBuilder.toString(), ""));
    }

    public Boolean method_f7240797_Dne() throws lUu, IOException {
        String string = field_c480ca78_bzF + "mco/available";
        String string2 = this.method_4a4c7cf9_Dne(EKF.method_284922b5_Dne(string));
        return Boolean.valueOf(string2);
    }

    public int method_7a46288d_Dne() throws lUu {
        String string = field_c480ca78_bzF + "payments/unused";
        String string2 = this.method_4a4c7cf9_Dne(EKF.method_284922b5_Dne(string));
        return Integer.valueOf(string2);
    }
}

