package pers.liangxuyuan.language;

import com.intellij.lexer.FlexAdapter;

public class SimpleFlexAdapter extends FlexAdapter {
    public SimpleFlexAdapter() {
        super(new SimpleLexer(null));
    }
}
