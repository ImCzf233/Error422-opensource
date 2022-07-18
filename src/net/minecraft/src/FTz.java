package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

class FTz
extends Thread {
    final String field_569fcf45_Dne;
    final fwN field_375f86f_Dne;
    final Pfo field_36bbc73_Dne;

    FTz(Pfo pfo, String string, fwN fwN2) {
        this.field_36bbc73_Dne = pfo;
        this.field_569fcf45_Dne = string;
        this.field_375f86f_Dne = fwN2;
    }

    @Override
    public void run() {
        HttpURLConnection httpURLConnection = null;
        try {
            URL uRL = new URL(this.field_569fcf45_Dne);
            httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / 100 == 4) {
                return;
            }
            this.field_36bbc73_Dne.field_92a31c00_Dne = this.field_375f86f_Dne == null ? ImageIO.read(httpURLConnection.getInputStream()) : this.field_375f86f_Dne.method_59de725c_Dne(ImageIO.read(httpURLConnection.getInputStream()));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            httpURLConnection.disconnect();
        }
    }
}

