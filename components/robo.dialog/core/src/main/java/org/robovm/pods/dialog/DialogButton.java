package org.robovm.pods.dialog;

public final class DialogButton implements Comparable<DialogButton> {
    private final String text;
    private final DialogButtonStyle style;
    private final DialogButtonClickListener listener;

    public DialogButton(String text) {
        this(text, DialogButtonStyle.Default, null);
    }

    public DialogButton(String text, DialogButtonStyle style) {
        this(text, style, null);
    }

    public DialogButton(String text, DialogButtonClickListener listener) {
        this(text, DialogButtonStyle.Default, listener);
    }

    public DialogButton(String text, DialogButtonStyle style, DialogButtonClickListener listener) {
        this.text = text;
        this.style = style;
        this.listener = listener;
    }

    public String getTitle() {
        return text;
    }

    public DialogButtonStyle getStyle() {
        return style;
    }

    public DialogButtonClickListener getClickListener() {
        return listener;
    }

    @Override
    public int compareTo(DialogButton o) {
        return style.ordinal() - o.style.ordinal();
    }
}
