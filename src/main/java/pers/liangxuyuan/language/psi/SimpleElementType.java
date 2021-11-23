package pers.liangxuyuan.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import pers.liangxuyuan.language.SimpleLanguage;

public class SimpleElementType extends IElementType {
    public SimpleElementType(@NonNls @NotNull String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }
}
