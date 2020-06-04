package core.beans;

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * @author ZhangYuanSheng
 * @version 1.0
 */
public enum PropertiesKey {

    /**
     * 扫描service时包括lib
     */
    SCAN_SERVICE_WITH_LIB("SCAN_SERVICE_WITH_LIB");

    private final String value;

    PropertiesKey(String value) {
        this.value = value;
    }

    public static void scanServiceWithLibrary(@NotNull Project project, boolean flag) {
        PropertiesComponent.getInstance(project).setValue(SCAN_SERVICE_WITH_LIB.value, flag);
    }
}
