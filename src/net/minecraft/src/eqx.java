package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class eqx
extends YGc {
    private ZipFile field_d25a291d_Dne;

    private void method_7c6f6039_FWm() throws ZipException, IOException {
        if (this.field_d25a291d_Dne == null) {
            this.field_d25a291d_Dne = new ZipFile(this.field_d102ba32_Dne);
        }
    }

    @Override
    public void method_86b6fa7a_Dne(Snh snh) {
        super.method_86b6fa7a_Dne(snh);
        try {
            if (this.field_d25a291d_Dne != null) {
                this.field_d25a291d_Dne.close();
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.field_d25a291d_Dne = null;
    }

    @Override
    public boolean method_8f501fe8_Dne(String string) {
        try {
            this.method_7c6f6039_FWm();
            return this.field_d25a291d_Dne.getEntry(string.substring(1)) != null;
        }
        catch (Exception exception) {
            return false;
        }
    }

    @Override
    protected InputStream method_4040946_FWm(String string) throws IOException {
        this.method_7c6f6039_FWm();
        ZipEntry zipEntry = this.field_d25a291d_Dne.getEntry(string.substring(1));
        if (zipEntry == null) {
            throw new FileNotFoundException(string);
        }
        return this.field_d25a291d_Dne.getInputStream(zipEntry);
    }

    public eqx(String string, File file, Gax gax) {
        super(string, file, file.getName(), gax);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        try {
            this.method_7c6f6039_FWm();
            Enumeration<? extends ZipEntry> enumeration = this.field_d25a291d_Dne.entries();
            while (enumeration.hasMoreElements()) {
                ZipEntry zipEntry = enumeration.nextElement();
                if (!zipEntry.getName().startsWith("textures/")) continue;
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        boolean bl = this.method_8f501fe8_Dne("terrain.png") || this.method_8f501fe8_Dne("gui/items.png");
        return !bl;
    }
}

