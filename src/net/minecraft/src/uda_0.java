package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/*
 * Renamed from udA
 */
class uda_0
extends Formatter {
    private SimpleDateFormat field_ce40933e_Dne;
    final WQU field_36e9911_Dne;

    uda_0(WQU wQU, UHl uHl) {
        this(wQU);
    }

    @Override
    public String format(LogRecord logRecord) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.field_ce40933e_Dne.format(logRecord.getMillis()));
        if (WQU.method_65e205d4_Dne(this.field_36e9911_Dne) != null) {
            stringBuilder.append(WQU.method_65e205d4_Dne(this.field_36e9911_Dne));
        }
        stringBuilder.append(" [").append(logRecord.getLevel().getName()).append("] ");
        stringBuilder.append(this.formatMessage(logRecord));
        stringBuilder.append('\n');
        Throwable throwable = logRecord.getThrown();
        if (throwable != null) {
            StringWriter stringWriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(stringWriter));
            stringBuilder.append(stringWriter.toString());
        }
        return stringBuilder.toString();
    }

    private uda_0(WQU wQU) {
        this.field_36e9911_Dne = wQU;
        this.field_ce40933e_Dne = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}

