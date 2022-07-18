package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public abstract class YGc
implements Gax {
    private int field_2092ae_Dne = -1;
    protected BufferedImage field_92a31c00_Dne;
    private final String field_c480ca78_bzF;
    protected final File field_d102ba32_Dne;
    protected String field_569fcf45_Dne;
    private final Gax field_367936e_Dne;
    private final String field_9e60dbde_Qnq;
    protected String field_d9a85c6_FWm;

    protected abstract InputStream method_4040946_FWm(String var1) throws FileNotFoundException, IOException;

    public abstract boolean method_8f501fe8_Dne(String var1);

    private void method_7c6f6039_FWm() {
        InputStream inputStream = null;
        try {
            inputStream = this.method_435fb273_Dne("/pack.png", false);
            this.field_92a31c00_Dne = ImageIO.read(inputStream);
        }
        catch (IOException iOException) {
        }
        finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            catch (IOException iOException) {}
        }
    }

    protected YGc(String string, File file, String string2, Gax gax) {
        this.field_c480ca78_bzF = string;
        this.field_9e60dbde_Qnq = string2;
        this.field_d102ba32_Dne = file;
        this.field_367936e_Dne = gax;
        this.method_7c6f6039_FWm();
        this.method_7a46289a_Dne();
    }

    @Override
    public void method_600aae3b_FWm(Snh snh) {
        if (this.field_92a31c00_Dne != null) {
            if (this.field_2092ae_Dne == -1) {
                this.field_2092ae_Dne = snh.method_1420ded2_Dne(this.field_92a31c00_Dne);
            }
            GL11.glBindTexture(3553, this.field_2092ae_Dne);
            snh.method_7a46289a_Dne();
        } else {
            snh.method_8f501fe4_Dne("/gui/unknown_pack.png");
        }
    }

    @Override
    public String method_6859cdb9_bzF() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public String method_d1f1ed87_FWm() {
        return this.field_9e60dbde_Qnq;
    }

    @Override
    public boolean method_5ab48f74_Dne(String string, boolean bl) {
        boolean bl2 = this.method_8f501fe8_Dne(string);
        return !bl2 && bl && this.field_367936e_Dne != null ? this.field_367936e_Dne.method_5ab48f74_Dne(string, bl) : bl2;
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_c480ca78_bzF;
    }

    @Override
    public void method_86b6fa7a_Dne(Snh snh) {
        if (this.field_92a31c00_Dne != null && this.field_2092ae_Dne != -1) {
            snh.method_ce7f5da9_Dne(this.field_2092ae_Dne);
        }
    }

    @Override
    public String method_4a7b1d9f_Qnq() {
        return this.field_d9a85c6_FWm;
    }

    private static String method_39193c_Dne(String string) {
        if (string != null && string.length() > 34) {
            string = string.substring(0, 34);
        }
        return string;
    }

    @Override
    public InputStream method_dbe280e7_Dne(String string) throws IOException {
        return this.method_435fb273_Dne(string, true);
    }

    @Override
    public InputStream method_435fb273_Dne(String string, boolean bl) throws IOException {
        try {
            return this.method_4040946_FWm(string);
        }
        catch (IOException iOException) {
            if (this.field_367936e_Dne != null && bl) {
                return this.field_367936e_Dne.method_435fb273_Dne(string, true);
            }
            throw iOException;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void method_7a46289a_Dne() {
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        try {
            inputStream = this.method_4040946_FWm("/pack.txt");
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            this.field_569fcf45_Dne = YGc.method_39193c_Dne(bufferedReader.readLine());
            this.field_d9a85c6_FWm = YGc.method_39193c_Dne(bufferedReader.readLine());
        }
        catch (IOException iOException) {
        }
        finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            catch (IOException iOException) {}
        }
    }
}

