package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLEncoder;

class VkM
extends Thread {
    final dnH field_374ed2e_Dne;

    VkM(dnH dnH2) {
        this.field_374ed2e_Dne = dnH2;
    }

    @Override
    public void run() {
        try {
            String string = new BigInteger(Mjb.method_685dbf5f_Dne(dnH.method_c3c87a97_Dne(this.field_374ed2e_Dne), dnH.method_41b2989f_Dne(this.field_374ed2e_Dne).method_7af00974_Dne().getPublic(), dnH.method_37a8c382_Dne(this.field_374ed2e_Dne))).toString(16);
            URL uRL = new URL("http://session.minecraft.net/game/checkserver.jsp?user=" + URLEncoder.encode(dnH.method_8deca0f6_FWm(this.field_374ed2e_Dne), "UTF-8") + "&serverId=" + URLEncoder.encode(string, "UTF-8"));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
            String string2 = bufferedReader.readLine();
            bufferedReader.close();
            if (!"YES".equals(string2)) {
                this.field_374ed2e_Dne.method_8f501fe4_Dne("Failed to verify username!");
                return;
            }
            dnH.method_d1b006cf_Dne(this.field_374ed2e_Dne, true);
        }
        catch (Exception exception) {
            this.field_374ed2e_Dne.method_8f501fe4_Dne("Failed to verify username! [internal error " + exception + "]");
            exception.printStackTrace();
        }
    }
}

