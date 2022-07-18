/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

public class SoundSystemLogger {
    public void message(String string, int n) {
        String string2 = "";
        for (int i = 0; i < n; ++i) {
            string2 = string2 + "    ";
        }
        String string3 = string2 + string;
        System.out.println(string3);
    }

    public void errorMessage(String string, String string2, int n) {
        String string3 = "";
        for (int i = 0; i < n; ++i) {
            string3 = string3 + "    ";
        }
        String string4 = string3 + "Error in class '" + string + "'";
        String string5 = "    " + string3 + string2;
        System.out.println(string4);
        System.out.println(string5);
    }

    public boolean errorCheck(boolean bl, String string, String string2, int n) {
        if (bl) {
            this.errorMessage(string, string2, n);
        }
        return bl;
    }

    public void printStackTrace(Exception exception, int n) {
        this.printExceptionMessage(exception, n);
        this.importantMessage("STACK TRACE:", n);
        if (exception == null) {
            return;
        }
        StackTraceElement[] stackTraceElementArray = exception.getStackTrace();
        if (stackTraceElementArray == null) {
            return;
        }
        for (int i = 0; i < stackTraceElementArray.length; ++i) {
            StackTraceElement stackTraceElement = stackTraceElementArray[i];
            if (stackTraceElement == null) continue;
            this.message(stackTraceElement.toString(), n + 1);
        }
    }

    public void printExceptionMessage(Exception exception, int n) {
        this.importantMessage("ERROR MESSAGE:", n);
        if (exception.getMessage() == null) {
            this.message("(none)", n + 1);
        } else {
            this.message(exception.getMessage(), n + 1);
        }
    }

    public void importantMessage(String string, int n) {
        String string2 = "";
        for (int i = 0; i < n; ++i) {
            string2 = string2 + "    ";
        }
        String string3 = string2 + string;
        System.out.println(string3);
    }
}

