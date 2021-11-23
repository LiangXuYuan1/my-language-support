package pers.liangxuyuan.language;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SimpleElementType extends IElementType {
    public SimpleElementType(@NonNls @NotNull String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }
}
