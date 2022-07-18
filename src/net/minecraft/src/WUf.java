package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class WUf
extends YGc {
    public WUf(String string, File file, Gax gax) {
        super(string, file, file.getName(), gax);
    }

    @Override
    public boolean method_8f501fe8_Dne(String string) {
        File file = new File(this.field_d102ba32_Dne, string);
        return file.exists() && file.isFile();
    }

    @Override
    protected InputStream method_4040946_FWm(String string) throws FileNotFoundException {
        File file = new File(this.field_d102ba32_Dne, string.substring(1));
        if (!file.exists()) {
            throw new FileNotFoundException(string);
        }
        return new BufferedInputStream(new FileInputStream(file));
    }

    @Override
    public boolean method_7a46289e_Dne() {
        File file = new File(this.field_d102ba32_Dne, "textures/");
        boolean bl = file.exists() && file.isDirectory();
        boolean bl2 = this.method_8f501fe8_Dne("terrain.png") || this.method_8f501fe8_Dne("gui/items.png");
        return bl || !bl2;
    }
}

