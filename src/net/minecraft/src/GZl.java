package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.TreeSet;

public final class GZl
implements lEc {
    private void method_d8345921_Dne(LIC lIC, Writer writer) throws IOException {
        boolean bl = true;
        switch (csh_0.field_3f1c589_Dne[lIC.method_22fe5f57_Dne().ordinal()]) {
            case 1: {
                writer.append('[');
                for (LIC lIC2 : lIC.method_adea226d_Dne()) {
                    if (!bl) {
                        writer.append(',');
                    }
                    bl = false;
                    this.method_d8345921_Dne(lIC2, writer);
                }
                writer.append(']');
                break;
            }
            case 2: {
                writer.append('{');
                for (QUo qUo : new TreeSet<QUo>(lIC.method_d410254f_Dne().keySet())) {
                    if (!bl) {
                        writer.append(',');
                    }
                    bl = false;
                    this.method_d8345921_Dne(qUo, writer);
                    writer.append(':');
                    this.method_d8345921_Dne((LIC)lIC.method_d410254f_Dne().get(qUo), writer);
                }
                writer.append('}');
                break;
            }
            case 3: {
                writer.append('\"').append(new QCn(lIC.method_eecad346_Dne()).toString()).append('\"');
                break;
            }
            case 4: {
                writer.append(lIC.method_eecad346_Dne());
                break;
            }
            case 5: {
                writer.append("false");
                break;
            }
            case 6: {
                writer.append("true");
                break;
            }
            case 7: {
                writer.append("null");
                break;
            }
            default: {
                throw new RuntimeException("Coding failure in Argo:  Attempt to format a JsonNode of unknown type [" + (Object)((Object)lIC.method_22fe5f57_Dne()) + "];");
            }
        }
    }

    @Override
    public String method_a223bd1c_Dne(bab bab2) {
        StringWriter stringWriter = new StringWriter();
        try {
            this.method_a2a25c64_Dne(bab2, stringWriter);
        }
        catch (IOException iOException) {
            throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", iOException);
        }
        return stringWriter.toString();
    }

    public void method_a2a25c64_Dne(bab bab2, Writer writer) throws IOException {
        this.method_d8345921_Dne(bab2, writer);
    }
}

