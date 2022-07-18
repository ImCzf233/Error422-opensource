package net.minecraft.src;
// Decompiled with: FernFlower
// Class Version: 8
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class xSE implements Runnable {
    final Map field_83b1c1b0_Dne;
    final String field_569fcf45_Dne;
    final TaY field_36d7880_Dne;
    final File field_d102ba32_Dne;
    final int field_2092ae_Dne;
    final Ejs field_366cbde_Dne;

    public void run() {
        URLConnection var1 = null;
        InputStream var2 = null;
        DataOutputStream var3 = null;
        if (this.field_36d7880_Dne != null) {
            this.field_36d7880_Dne.method_8f501fe4_Dne("Downloading Texture Pack");
            this.field_36d7880_Dne.method_a9a920ab_Qnq("Making Request...");
        }

        try {
            byte[] var4 = new byte[4096];
            URL var5 = new URL(this.field_569fcf45_Dne);
            var1 = var5.openConnection();
            float var6 = 0.0F;
            float var7 = (float)this.field_83b1c1b0_Dne.entrySet().size();
            Iterator var8 = this.field_83b1c1b0_Dne.entrySet().iterator();

            while(var8.hasNext()) {
                Entry var9 = (Entry)var8.next();
                var1.setRequestProperty((String)var9.getKey(), (String)var9.getValue());
                if (this.field_36d7880_Dne != null) {
                    this.field_36d7880_Dne.method_ce7f5da9_Dne((int)(++var6 / var7 * 100.0F));
                }
            }

            var2 = var1.getInputStream();
            var7 = (float)var1.getContentLength();
            int var29 = var1.getContentLength();
            if (this.field_36d7880_Dne != null) {
                this.field_36d7880_Dne.method_a9a920ab_Qnq(String.format("Downloading file (%.2f MB)...", var7 / 1000.0F / 1000.0F));
            }

            if (this.field_d102ba32_Dne.exists()) {
                long var10 = this.field_d102ba32_Dne.length();
                if (var10 == (long)var29) {
                    this.field_366cbde_Dne.method_be931c91_Dne(this.field_d102ba32_Dne);
                    if (this.field_36d7880_Dne != null) {
                        this.field_36d7880_Dne.method_5acf91a_d_();
                    }

                    return;
                }

                System.out.println("Deleting " + this.field_d102ba32_Dne + " as it does not match what we currently have (" + var29 + " vs our " + var10 + ").");
                this.field_d102ba32_Dne.delete();
            }

            var3 = new DataOutputStream(new FileOutputStream(this.field_d102ba32_Dne));
            if (this.field_2092ae_Dne > 0 && var7 > (float)this.field_2092ae_Dne) {
                if (this.field_36d7880_Dne != null) {
                    this.field_36d7880_Dne.method_5acf91a_d_();
                }

                throw new IOException("Filesize is bigger than maximum allowed (file is " + var6 + ", limit is " + this.field_2092ae_Dne + ")");
            } else {
                boolean var30 = false;

                int var11;
                while((var11 = var2.read(var4)) >= 0) {
                    var6 += (float)var11;
                    if (this.field_36d7880_Dne != null) {
                        this.field_36d7880_Dne.method_ce7f5da9_Dne((int)(var6 / var7 * 100.0F));
                    }

                    if (this.field_2092ae_Dne > 0 && var6 > (float)this.field_2092ae_Dne) {
                        if (this.field_36d7880_Dne != null) {
                            this.field_36d7880_Dne.method_5acf91a_d_();
                        }

                        throw new IOException("Filesize was bigger than maximum allowed (got >= " + var6 + ", limit was " + this.field_2092ae_Dne + ")");
                    }

                    var3.write(var4, 0, var11);
                }

                this.field_366cbde_Dne.method_be931c91_Dne(this.field_d102ba32_Dne);
                if (this.field_36d7880_Dne != null) {
                    this.field_36d7880_Dne.method_5acf91a_d_();
                }
            }
        } catch (Throwable var27) {
            var27.printStackTrace();
        } finally {
            try {
                if (var2 != null) {
                    var2.close();
                }
            } catch (IOException var26) {
            }

            try {
                if (var3 != null) {
                    var3.close();
                }
            } catch (IOException var25) {
            }

        }
    }

    xSE(TaY var1, String var2, Map var3, File var4, Ejs var5, int var6) {
        this.field_36d7880_Dne = var1;
        this.field_569fcf45_Dne = var2;
        this.field_83b1c1b0_Dne = var3;
        this.field_d102ba32_Dne = var4;
        this.field_366cbde_Dne = var5;
        this.field_2092ae_Dne = var6;
    }
}
 
