package pers.liangxuyuan.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import pers.liangxuyuan.language.SimpleLanguage;

public class SimpleTokenType extends IElementType {
    public SimpleTokenType(@NonNls @NotNull String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SimpleTokenType." + super.toString();
    }
}
