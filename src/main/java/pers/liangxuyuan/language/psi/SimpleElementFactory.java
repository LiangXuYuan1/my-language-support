package pers.liangxuyuan.language.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import pers.liangxuyuan.language.SimpleFileType;

public class SimpleElementFactory {
    public static SimpleProperty createProperty(Project project, String name) {
        final SimpleFile file = createFile(project, name);
        return (SimpleProperty) file.getFirstChild();
    }

    public static SimpleFile createFile(Project project, String text) {
        String name = "dummy.simple";
        return (SimpleFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, SimpleFileType.INSTANCE, text);
    }
}
